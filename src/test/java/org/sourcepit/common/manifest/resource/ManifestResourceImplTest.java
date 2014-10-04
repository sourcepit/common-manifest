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

package org.sourcepit.common.manifest.resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.sourcepit.common.manifest.util.EOL.EOL;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Map.Entry;

import org.apache.commons.io.IOUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.junit.Test;
import org.sourcepit.common.manifest.HeaderName;
import org.sourcepit.common.manifest.Manifest;
import org.sourcepit.common.manifest.ManifestFactory;
import org.sourcepit.common.manifest.merge.BytesByLine;

/**
 * @author Bernd
 */
public class ManifestResourceImplTest
{
   @Test
   public void test() throws IOException
   {
      Manifest manifest = ManifestFactory.eINSTANCE.createManifest();
      manifest.setHeader(HeaderName.MAIN_CLASS, "foo");
      manifest.setHeader("foo", "bar");
      manifest.setHeader("fu", "bä");

      Resource resource = new ManifestResourceImpl();
      resource.getContents().add(manifest);

      // save
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      resource.save(out, null);

      String content = new String(out.toByteArray(), "UTF-8");

      StringBuilder sb = new StringBuilder();
      sb.append("Manifest-Version: 1.0");
      sb.append(EOL);
      sb.append("Main-Class: foo");
      sb.append(EOL);
      sb.append("foo: bar");
      sb.append(EOL);
      sb.append("fu: bä");
      sb.append(EOL);
      sb.append(EOL);

      String expectedContent = sb.toString();
      assertThat(content, IsEqual.equalTo(expectedContent));

      // reload
      resource = new ManifestResourceImpl();
      resource.load(new ByteArrayInputStream(out.toByteArray()), null);
      Manifest newManifest = (Manifest) resource.getContents().get(0);
      assertThat(newManifest.getHeaders().size(), Is.is(4));
      for (Entry<String, String> header : manifest.getHeaders().entrySet())
      {
         assertThat(newManifest.getHeaderValue(header.getKey()), IsEqual.equalTo(header.getValue()));
      }
   }

   @Test
   public void testLoadFromUri() throws Exception
   {
      URL url = getClass().getClassLoader().getResource("MANIFEST.MF");
      assertThat(url, IsNull.notNullValue());
      URI uri = URI.createURI(url.toString());

      Resource resource = new ManifestResourceImpl();
      resource.setURI(uri);
      resource.load(null);

      Manifest manifest = (Manifest) resource.getContents().get(0);
      assertThat(manifest, IsNull.notNullValue());
   }

   @Test
   public void testLoadFromStream() throws Exception
   {
      InputStream inputStream = getClass().getClassLoader().getResourceAsStream("MANIFEST.MF");
      assertThat(inputStream, IsNull.notNullValue());
      try
      {
         Resource resource = new ManifestResourceImpl();
         resource.load(inputStream, null);

         Manifest manifest = (Manifest) resource.getContents().get(0);
         assertThat(manifest, IsNull.notNullValue());
      }
      finally
      {
         IOUtils.closeQuietly(inputStream);
      }
   }

   @Test
   public void testGetBytesByLine() throws Exception
   {
      ManifestResource resource = new ManifestResourceImpl();
      assertEquals(BytesByLine._512, resource.getBytesByLine());

      resource = new ManifestResourceImpl(BytesByLine._72);
      assertEquals(BytesByLine._72, resource.getBytesByLine());

      resource = new ManifestResourceImpl(BytesByLine.UNLIMITED);
      assertEquals(BytesByLine.UNLIMITED, resource.getBytesByLine());
   }

}
