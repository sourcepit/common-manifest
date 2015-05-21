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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.sourcepit.common.manifest.HeaderName.MAIN_CLASS;
import static org.sourcepit.common.manifest.HeaderName.MANIFEST_VERSION;

import org.eclipse.emf.common.util.EMap;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.junit.Test;

/**
 * @author Bernd
 */
public class ManifestTest {

   @Test
   public void testNew() {
      Manifest manifest = ManifestFactory.eINSTANCE.createManifest();
      assertThat(manifest.getHeaderValue(MANIFEST_VERSION), IsEqual.equalTo("1.0"));
   }

   @Test
   public void testHeaderOperations() {
      Manifest manifest = ManifestFactory.eINSTANCE.createManifest();
      assertThat(manifest.getHeader(MAIN_CLASS.getLiteral()), IsNull.nullValue());
      assertThat(manifest.getHeader(MAIN_CLASS), IsNull.nullValue());
      assertThat(manifest.getHeaderValue(MAIN_CLASS.getLiteral()), IsNull.nullValue());
      assertThat(manifest.getHeaderValue(MAIN_CLASS), IsNull.nullValue());
      assertThat(manifest.getParsedHeaderValue(MAIN_CLASS.getLiteral()), IsNull.nullValue());
      assertThat(manifest.getParsedHeaderValue(MAIN_CLASS), IsNull.nullValue());

      manifest.setHeader(MAIN_CLASS, "foo");

      assertThat(manifest.getHeader(MAIN_CLASS.getLiteral()), IsNull.notNullValue());
      assertThat(manifest.getHeader(MAIN_CLASS), IsNull.notNullValue());
      assertThat(manifest.getHeaderValue(MAIN_CLASS.getLiteral()), IsNull.notNullValue());
      assertThat(manifest.getHeaderValue(MAIN_CLASS), IsNull.notNullValue());
      assertThat(manifest.getParsedHeaderValue(MAIN_CLASS.getLiteral()), IsNull.nullValue());
      assertThat(manifest.getParsedHeaderValue(MAIN_CLASS), IsNull.nullValue());

      manifest.setHeader(MAIN_CLASS, null);

      assertThat(manifest.getHeader(MAIN_CLASS.getLiteral()), IsNull.nullValue());
      assertThat(manifest.getHeader(MAIN_CLASS), IsNull.nullValue());
      assertThat(manifest.getHeaderValue(MAIN_CLASS.getLiteral()), IsNull.nullValue());
      assertThat(manifest.getHeaderValue(MAIN_CLASS), IsNull.nullValue());
      assertThat(manifest.getParsedHeaderValue(MAIN_CLASS.getLiteral()), IsNull.nullValue());
      assertThat(manifest.getParsedHeaderValue(MAIN_CLASS), IsNull.nullValue());

      manifest.getHeaders().put(MAIN_CLASS.getLiteral(), "foo");

      assertThat(manifest.getHeader(MAIN_CLASS.getLiteral()), IsNull.notNullValue());
      assertThat(manifest.getHeader(MAIN_CLASS), IsNull.notNullValue());
      assertThat(manifest.getHeaderValue(MAIN_CLASS.getLiteral()), IsNull.notNullValue());
      assertThat(manifest.getHeaderValue(MAIN_CLASS), IsNull.notNullValue());
      assertThat(manifest.getParsedHeaderValue(MAIN_CLASS.getLiteral()), IsNull.nullValue());
      assertThat(manifest.getParsedHeaderValue(MAIN_CLASS), IsNull.nullValue());
   }

   @Test
   public void testNames() throws Exception {
      Manifest manifest = ManifestFactory.eINSTANCE.createManifest();

      manifest.getHeaders().put("good", "name");

      try {
         manifest.getHeaders().put("bäd", "name");
         fail();
      }
      catch (IllegalArgumentException e) {
      }
   }

   @Test
   public void testHeadersCaseInsensitive() throws Exception {
      Manifest manifest = ManifestFactory.eINSTANCE.createManifest();

      EMap<String, String> headers = manifest.getHeaders();
      headers.put("Case", "foo");
      assertEquals(2, headers.size());
      assertTrue(headers.containsValue("foo"));
      assertFalse(headers.containsValue("bar"));

      assertTrue(headers.containsKey("Case"));
      assertEquals("foo", headers.get("Case"));
      assertTrue(headers.containsKey("case"));
      assertEquals("foo", headers.get("case"));
      assertEquals("Case", manifest.getHeader("Case").getName());
      assertEquals("foo", manifest.getHeader("Case").getValue());
      assertEquals("Case", manifest.getHeader("case").getName());
      assertEquals("foo", manifest.getHeader("case").getValue());

      headers.put("case", "bar");
      assertEquals(2, headers.size());
      assertTrue(headers.containsValue("bar"));
      assertFalse(headers.containsValue("foo"));

      assertTrue(headers.containsKey("Case"));
      assertEquals("bar", headers.get("Case"));
      assertTrue(headers.containsKey("case"));
      assertEquals("bar", headers.get("case"));
      assertEquals("Case", manifest.getHeader("Case").getName());
      assertEquals("bar", manifest.getHeader("Case").getValue());
      assertEquals("Case", manifest.getHeader("case").getName());
      assertEquals("bar", manifest.getHeader("case").getValue());

      manifest.setHeader("case", null);
      assertEquals(1, headers.size());
   }
}
