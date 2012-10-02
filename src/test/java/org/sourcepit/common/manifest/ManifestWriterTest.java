/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.junit.Test;
import org.sourcepit.common.manifest.merge.ManifestWriter;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class ManifestWriterTest
{
   @Test
   public void testIllegalStates() throws Exception
   {
      ManifestWriter mw = new ManifestWriter(new ByteArrayOutputStream());

      try
      {
         mw.endMain();
         fail();
      }
      catch (IllegalStateException e)
      {
      }

      try
      {
         mw.startSection("foo");
         fail();
      }
      catch (IllegalStateException e)
      {
      }

      try
      {
         mw.endSection();
         fail();
      }
      catch (IllegalStateException e)
      {
      }

      try
      {
         mw.attribute("name", "value");
         fail();
      }
      catch (IllegalStateException e)
      {
      }

      mw.startMain("1.0");

      try
      {
         mw.startSection("foo");
         fail();
      }
      catch (IllegalStateException e)
      {
      }

      try
      {
         mw.endSection();
         fail();
      }
      catch (IllegalStateException e)
      {
      }

      try
      {
         mw.startMain("1.0");
         fail();
      }
      catch (IllegalStateException e)
      {
      }

      mw.attribute("name", "value");

      mw.endMain();

      try
      {
         mw.startMain("1.0");
         fail();
      }
      catch (IllegalStateException e)
      {
      }

      try
      {
         mw.endMain();
         fail();
      }
      catch (IllegalStateException e)
      {
      }

      try
      {
         mw.attribute("name", "value");
         fail();
      }
      catch (IllegalStateException e)
      {
      }

      mw.startSection("foo");

      try
      {
         mw.startSection("foo");
         fail();
      }
      catch (IllegalStateException e)
      {
      }

      mw.attribute("name", "value");

      try
      {
         mw.endMain();
         fail();
      }
      catch (IllegalStateException e)
      {
      }

      mw.endSection();

      try
      {
         mw.endSection();
         fail();
      }
      catch (IllegalStateException e)
      {
      }
   }

   @Test
   public void testCompatibility() throws Exception
   {
      final Manifest jManifest = new Manifest();
      jManifest.getMainAttributes().putValue("Manifest-Version", "1.0");
      jManifest.getMainAttributes().putValue("baed", "äßß\r\n\t\r\n\t\r\n\t\r\n");
      jManifest.getEntries().put("Foo", new Attributes());
      jManifest.getAttributes("Foo").putValue("test72",
         "hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello");

      ByteArrayOutputStream out = new ByteArrayOutputStream();
      jManifest.write(out);

      String jMF = new String(out.toByteArray(), "UTF-8");

      out = new ByteArrayOutputStream();

      final ManifestWriter mw = new ManifestWriter(out);
      mw.startMain("1.0");
      mw.attribute("baed", "äßß\r\n\t\r\n\t\r\n\t\r\n");
      mw.endMain();

      mw.startSection("Foo");
      mw.attribute("test72",
         "hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello");
      mw.endSection();

      String mf = new String(out.toByteArray(), "UTF-8");

      assertEquals(jMF, mf);
   }
}
