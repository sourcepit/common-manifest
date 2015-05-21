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

package org.sourcepit.common.manifest.osgi.resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.sourcepit.common.manifest.util.EOL.EOL;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.junit.Test;
import org.sourcepit.common.manifest.merge.BytesByLine;
import org.sourcepit.common.manifest.osgi.BundleHeaderName;
import org.sourcepit.common.manifest.osgi.BundleManifest;
import org.sourcepit.common.manifest.osgi.BundleManifestFactory;
import org.sourcepit.common.manifest.osgi.PackageExport;
import org.sourcepit.common.manifest.osgi.Version;
import org.sourcepit.common.manifest.resource.ManifestResource;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class BundleManifestResourceImplTest {
   @Test
   public void test() throws IOException {
      BundleManifest manifest = BundleManifestFactory.eINSTANCE.createBundleManifest();
      manifest.setHeader(BundleHeaderName.BUNDLE_VERSION, "1.2.3");
      manifest.setHeader("foo", "bar");
      manifest.setHeader("fu", "bä");

      Resource resource = new BundleManifestResourceImpl();
      resource.getContents().add(manifest);

      // save
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      resource.save(out, null);

      String content = new String(out.toByteArray(), "UTF-8");

      StringBuilder sb = new StringBuilder();
      sb.append("Manifest-Version: 1.0");
      sb.append(EOL);
      sb.append("Bundle-ManifestVersion: 2");
      sb.append(EOL);
      sb.append("Bundle-Version: 1.2.3");
      sb.append(EOL);
      sb.append("foo: bar");
      sb.append(EOL);
      sb.append("fu: bä");
      sb.append(EOL);
      sb.append(EOL);

      String expectedContent = sb.toString();
      assertThat(content, IsEqual.equalTo(expectedContent));

      // reload
      resource = new BundleManifestResourceImpl();
      resource.load(new ByteArrayInputStream(out.toByteArray()), null);
      BundleManifest newManifest = (BundleManifest) resource.getContents().get(0);
      assertThat(newManifest.getHeaders().size(), Is.is(5));
      assertThat(newManifest.getBundleVersion(), IsEqual.equalTo(Version.parse("1.2.3")));
      for (Entry<String, String> header : manifest.getHeaders().entrySet()) {
         assertThat(newManifest.getHeaderValue(header.getKey()), IsEqual.equalTo(header.getValue()));
      }
   }

   @Test
   public void testLoadFromUri() throws Exception {
      URL url = getClass().getClassLoader().getResource("MANIFEST.MF");
      assertThat(url, IsNull.notNullValue());
      URI uri = URI.createURI(url.toString());

      Resource resource = new BundleManifestResourceImpl();
      resource.setURI(uri);
      resource.load(null);

      BundleManifest manifest = (BundleManifest) resource.getContents().get(0);
      assertThat(manifest, IsNull.notNullValue());
   }

   @Test
   public void testPrettyPrinting() throws Exception {
      BundleManifest manifest = BundleManifestFactory.eINSTANCE.createBundleManifest();

      PackageExport export = BundleManifestFactory.eINSTANCE.createPackageExport();
      export.getPackageNames().add("a");
      export.getPackageNames().add("b");
      export.getPackageNames().add("c");
      export.setVersion(Version.parse("1"));
      manifest.getExportPackage(true).add(export);

      export = BundleManifestFactory.eINSTANCE.createPackageExport();
      export.getPackageNames().add("foo");
      manifest.getExportPackage(true).add(export);

      ManifestResource resource = new BundleManifestResourceImpl();
      resource.getContents().add(manifest);

      assertEquals(BytesByLine._512, resource.getBytesByLine());

      ByteArrayOutputStream out = new ByteArrayOutputStream();
      resource.save(out, null);

      String content = out.toString("UTF-8");

      StringBuilder expectedContent = new StringBuilder();
      expectedContent.append("Manifest-Version: 1.0");
      expectedContent.append(EOL);
      expectedContent.append("Bundle-ManifestVersion: 2");
      expectedContent.append(EOL);
      expectedContent.append("Export-Package: a;b;c;version=1,");
      expectedContent.append(EOL);
      expectedContent.append(" foo");
      expectedContent.append(EOL);
      expectedContent.append(EOL);

      assertEquals(expectedContent.toString(), content);

      // test re-parse
      resource = new BundleManifestResourceImpl();
      resource.load(new ByteArrayInputStream(out.toByteArray()), null);

      BundleManifest manifest2 = (BundleManifest) resource.getContents().get(0);
      assertNotNull(manifest2);

      out = new ByteArrayOutputStream();
      resource.save(out, null);

      content = out.toString("UTF-8");

      assertEquals(expectedContent.toString(), content);
   }

   @Test
   public void testOptionMake72Safe() throws Exception {
      BundleManifest manifest = BundleManifestFactory.eINSTANCE.createBundleManifest();

      PackageExport export = BundleManifestFactory.eINSTANCE.createPackageExport();
      export.getPackageNames().add("a");
      export.getPackageNames().add("b");
      export.getPackageNames().add("c");
      export.setVersion(Version.parse("1"));
      manifest.getExportPackage(true).add(export);

      export = BundleManifestFactory.eINSTANCE.createPackageExport();
      export.getPackageNames().add("foooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
      manifest.getExportPackage(true).add(export);

      ManifestResource resource = new BundleManifestResourceImpl();
      resource.getContents().add(manifest);

      assertEquals(BytesByLine._512, resource.getBytesByLine());

      Map<String, String> options = new HashMap<String, String>();
      options.put(ManifestResource.OPTION_BYTES_BY_LINE, "72");

      ByteArrayOutputStream out = new ByteArrayOutputStream();
      resource.save(out, options);

      String content = out.toString("UTF-8");

      StringBuilder expected = new StringBuilder();
      expected.append("Manifest-Version: 1.0");
      expected.append(EOL);
      expected.append("Bundle-ManifestVersion: 2");
      expected.append(EOL);
      expected.append("Export-Package: a;b;c;version=1,");
      expected.append(EOL);
      expected.append(" foooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
      expected.append(EOL);
      expected.append(" oooooo");
      expected.append(EOL);
      expected.append(EOL);

      assertEquals(expected.toString(), content);
   }

   @Test
   public void testDuplicatedBundleManifestVersion() throws Exception {
      BundleManifest manifest = BundleManifestFactory.eINSTANCE.createBundleManifest();
      manifest.setBundleSymbolicName("foo");

      assertEquals(3, manifest.getHeaders().size());
      assertEquals("2", manifest.getBundleManifestVersion());

      manifest = EcoreUtil.copy(manifest);
      assertEquals(3, manifest.getHeaders().size());
      assertEquals("2", manifest.getBundleManifestVersion());
   }
}
