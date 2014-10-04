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

package org.sourcepit.common.manifest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;

import org.junit.Test;
import org.sourcepit.common.manifest.merge.BytesByLine;
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
   public void testCRLF() throws Exception
   {
      StringBuilder win = new StringBuilder();
      win.append("Manifest-Version: 1.0\r\n");
      win.append("baed: äßß\r\n");
      win.append("\t\r\n");
      win.append("\t\r\n");
      win.append("\t\r\n");
      win.append("\r\n");
      win.append("\r\n");
      win.append("Name: Foo\r\n");
      win.append("test72: hello hello hello hello hello hello hello hello hello hello he\r\n");
      win.append(" llo hello hello hello hello hello hello hello\r\n");
      win.append("\r\n");

      ByteArrayOutputStream out = new ByteArrayOutputStream();

      final ManifestWriter mw = new ManifestWriter(out, BytesByLine._72, "\r\n");
      mw.startMain("1.0");
      mw.attribute("baed", "äßß\r\n\t\r\n\t\r\n\t\r\n");
      mw.endMain();

      mw.startSection("Foo");
      mw.attribute("test72",
         "hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello");
      mw.endSection();

      String mf = new String(out.toByteArray(), "UTF-8");

      assertEquals(win.toString(), mf);
   }

   @Test
   public void testLF() throws Exception
   {
      StringBuilder unix = new StringBuilder();
      unix.append("Manifest-Version: 1.0\n");
      unix.append("baed: äßß\n");
      unix.append("\t\n");
      unix.append("\t\n");
      unix.append("\t\n");
      unix.append("\n");
      unix.append("\n");
      unix.append("Name: Foo\n");
      // expect line break after 71 bytes. This allows conversion of EOL chars without to break the max bytes per line
      // rule
      unix.append("test72: hello hello hello hello hello hello hello hello hello hello he\n");
      unix.append(" llo hello hello hello hello hello hello hello\n");
      unix.append("\n");

      ByteArrayOutputStream out = new ByteArrayOutputStream();

      final ManifestWriter mw = new ManifestWriter(out, BytesByLine._72, "\n");
      mw.startMain("1.0");
      mw.attribute("baed", "äßß\n\t\n\t\n\t\n");
      mw.endMain();

      mw.startSection("Foo");
      mw.attribute("test72",
         "hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello hello");
      mw.endSection();

      String mf = new String(out.toByteArray(), "UTF-8");

      assertEquals(unix.toString(), mf);
   }
}
