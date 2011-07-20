/*
 * Copyright (C) 2007 Innovations Softwaretechnologie GmbH, Immenstaad, Germany. All rights reserved.
 */

package org.sourcepit.common.mf.internal.parser;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.jar.Attributes;
import java.util.jar.Attributes.Name;

import junit.framework.TestCase;

/**
 * @author Bernd
 */
public class ManifestParserTest extends TestCase
{
   public void testParse() throws Exception
   {
      java.util.jar.Manifest manifest = new java.util.jar.Manifest();
      manifest.getMainAttributes().putValue(Name.MANIFEST_VERSION.toString(), "1.0");
      manifest.getMainAttributes().putValue("Main", "main value");
      manifest.getEntries().put("Section", new Attributes());
      manifest.getEntries().get("Section").putValue("My-Section", "my section value");

      ByteArrayOutputStream out = new ByteArrayOutputStream();
      manifest.write(out);

      // System.out.println(new String(out.toByteArray(), "UTF-8"));

      Map<String, String> mainHeaders = new LinkedHashMap<String, String>();
      Map<String, String> sectionHeaders = new LinkedHashMap<String, String>();

      @SuppressWarnings("unchecked")
      final Map<String, String>[] headers = new Map[] {mainHeaders, sectionHeaders};
      new ManifestParser().parse(new ByteArrayInputStream(out.toByteArray()), new AbstractManifestVisitor()
      {
         int i = -1;

         @Override
         public void visitSection(boolean isMainSection, String name)
         {
            if (isMainSection)
            {
               i++;
               assertEquals(0, i);
            }
            else
            {
               assertEquals("Section", name);
               i++;
               assertEquals(1, i);
            }
         }

         @Override
         public void visitHeader(String name, String value)
         {
            headers[i].put(name, value);
         }
      });

      assertEquals(2, mainHeaders.size());

      Iterator<String> it = mainHeaders.keySet().iterator();
      assertEquals(Name.MANIFEST_VERSION.toString(), it.next());
      assertEquals("Main", it.next());
      assertEquals("1.0", mainHeaders.get(Name.MANIFEST_VERSION.toString()));
      assertEquals("main value", mainHeaders.get("Main"));
      assertEquals(1, sectionHeaders.size());
      assertEquals("my section value", sectionHeaders.get("My-Section"));
   }
}
