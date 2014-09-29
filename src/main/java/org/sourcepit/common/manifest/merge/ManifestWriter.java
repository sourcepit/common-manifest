/*
 * Copyright 2014 Bernd Vogt and others.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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

   private final BytesByLine bytesByLine;

   private int main = -1;

   private int section = -1;

   public ManifestWriter(OutputStream outputStream) throws IOException
   {
      this(outputStream, BytesByLine._72);
   }

   public ManifestWriter(OutputStream outputStream, BytesByLine bytesByLine) throws IOException
   {
      this.outputStream = new DataOutputStream(outputStream);
      this.bytesByLine = bytesByLine;
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

      StringBuilder line = new StringBuilder(new Name(name).toString()); // validate name
      line.append(": ");

      if (value == null)
      {
         line.append(value);
         line.append("\r\n");
         return;
      }

      final String[] lines = value.split("\r\n "); // preformated lines
      for (int i = 0; i < lines.length; i++)
      {
         String v = lines[i];
         if (i > 0)
         {
            line.append(" ");
         }
         byte[] vb = v.getBytes("UTF8");
         v = new String(vb, 0, 0, vb.length);
         line.append(v);
         line.append("\r\n");

         switch (bytesByLine)
         {
            case UNLIMITED :
               break;
            case _512 :
               makeSafe(line, 512);
               break;
            case _72 :
               makeSafe(line, 72);
               break;
            default :
               throw new IllegalStateException();
         }

         outputStream.writeBytes(line.toString());

         line = new StringBuilder();
      }
   }

   private static void makeSafe(StringBuilder line, int maxBytes)
   {
      int length = line.length();
      if (length > maxBytes)
      {
         int index = maxBytes - 2;
         while (index < length - 2)
         {
            line.insert(index, "\r\n ");
            index += maxBytes;
            length += 3;
         }
      }
      return;
   }
}
