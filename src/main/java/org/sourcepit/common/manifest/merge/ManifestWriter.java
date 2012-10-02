/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.merge;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.jar.Attributes.Name;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class ManifestWriter
{
   private final DataOutputStream outputStream;

   private final boolean make72Safe;

   private int main = -1;

   private int section = -1;

   public ManifestWriter(OutputStream outputStream) throws IOException
   {
      this(outputStream, true);
   }

   public ManifestWriter(OutputStream outputStream, boolean make72Safe) throws IOException
   {
      this.outputStream = new DataOutputStream(outputStream);
      this.make72Safe = make72Safe;
   }

   public void startMain(String version) throws IOException
   {
      if (main != -1)
      {
         throw new IllegalStateException("Main section already started");
      }
      main = 0;
      attribute(Name.MANIFEST_VERSION.toString(), version);
   }

   public void endMain() throws IOException
   {
      if (main != 0)
      {
         throw new IllegalStateException("Main not started");
      }
      outputStream.writeBytes("\r\n");
      outputStream.flush();
      main = 1;
   }

   public void startSection(String name) throws IOException
   {
      if (main != 1)
      {
         throw new IllegalStateException("Main section not written or closed");
      }

      if (section != -1)
      {
         throw new IllegalStateException("Already started to write a section");
      }

      section = 0;

      attribute("Name", name);
   }

   public void endSection() throws IOException
   {
      if (section != 0)
      {
         throw new IllegalStateException("Section not started");
      }
      outputStream.writeBytes("\r\n");
      outputStream.flush();
      section = -1;
   }

   @SuppressWarnings("deprecation")
   public void attribute(String name, String value) throws IOException
   {
      if (main != 0 && section != 0)
      {
         throw new IllegalStateException("Neither main nor indivisual section started");
      }
      
      final StringBuilder line = new StringBuilder(new Name(name).toString()); // validate name
      line.append(": ");

      if (value != null)
      {
         byte[] vb = value.getBytes("UTF8");
         value = new String(vb, 0, 0, vb.length);
      }
      line.append(value);
      line.append("\r\n");

      if (make72Safe)
      {
         make72Safe(line);
      }

      outputStream.writeBytes(line.toString());
   }

   private static void make72Safe(StringBuilder line)
   {
      int length = line.length();
      if (length > 72)
      {
         int index = 70;
         while (index < length - 2)
         {
            line.insert(index, "\r\n ");
            index += 72;
            length += 3;
         }
      }
      return;
   }
}
