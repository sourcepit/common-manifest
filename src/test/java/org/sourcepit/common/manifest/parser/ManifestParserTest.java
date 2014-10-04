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

package org.sourcepit.common.manifest.parser;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.jar.Attributes;
import java.util.jar.Attributes.Name;

import org.junit.Test;

/**
 * @author Bernd
 */
public class ManifestParserTest
{
   @Test
   public void testParse() throws Exception
   {
      java.util.jar.Manifest manifest = new java.util.jar.Manifest();
      manifest.getMainAttributes().putValue(Name.MANIFEST_VERSION.toString(), "1.0");
      manifest.getMainAttributes().putValue("Main", "main value");
      manifest.getEntries().put("Section", new Attributes());
      manifest.getEntries().get("Section").putValue("My-Section", "my section value");

      ByteArrayOutputStream out = new ByteArrayOutputStream();
      manifest.write(out);

      Map<String, String> mainHeaders = new LinkedHashMap<String, String>();
      Map<String, String> sectionHeaders = new LinkedHashMap<String, String>();

      @SuppressWarnings("unchecked")
      final Map<String, String>[] headers = new Map[] { mainHeaders, sectionHeaders };
      new ManifestParser().parse(new ByteArrayInputStream(out.toByteArray()), new AbstractManifestVisitor()
      {
         private int i = -1;

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
