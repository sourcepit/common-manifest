/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi.resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.junit.Test;
import org.sourcepit.common.manifest.osgi.BundleHeaderName;
import org.sourcepit.common.manifest.osgi.BundleManifest;
import org.sourcepit.common.manifest.osgi.BundleManifestFactory;
import org.sourcepit.common.manifest.osgi.PackageExport;
import org.sourcepit.common.manifest.osgi.Version;
import org.sourcepit.common.manifest.resource.ManifestResource;

/**
 * @author Bernd
 */
public class BundleManifestResourceImplTest
{
   @Test
   public void test() throws IOException
   {
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
      sb.append("\r\n");
      sb.append("Bundle-ManifestVersion: 2");
      sb.append("\r\n");
      sb.append("Bundle-Version: 1.2.3");
      sb.append("\r\n");
      sb.append("foo: bar");
      sb.append("\r\n");
      sb.append("fu: bä");
      sb.append("\r\n");
      sb.append("\r\n");

      String expectedContent = sb.toString();
      assertThat(content, IsEqual.equalTo(expectedContent));

      // reload
      resource = new BundleManifestResourceImpl();
      resource.load(new ByteArrayInputStream(out.toByteArray()), null);
      BundleManifest newManifest = (BundleManifest) resource.getContents().get(0);
      assertThat(newManifest.getHeaders().size(), Is.is(5));
      assertThat(newManifest.getBundleVersion(), IsEqual.equalTo(Version.parse("1.2.3")));
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

      Resource resource = new BundleManifestResourceImpl();
      resource.setURI(uri);
      resource.load(null);

      BundleManifest manifest = (BundleManifest) resource.getContents().get(0);
      assertThat(manifest, IsNull.notNullValue());
   }

   @Test
   public void testPrettyPrinting() throws Exception
   {
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
      
      assertFalse(resource.isMake72Safe());
      
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      resource.save(out, null);

      String content = out.toString("UTF-8");

      StringBuilder expectedContent = new StringBuilder();
      expectedContent.append("Manifest-Version: 1.0");
      expectedContent.append("\r\n");
      expectedContent.append("Bundle-ManifestVersion: 2");
      expectedContent.append("\r\n");
      expectedContent.append("Export-Package: a;b;c;version=1,");
      expectedContent.append("\r\n");
      expectedContent.append(" foo");
      expectedContent.append("\r\n");
      expectedContent.append("\r\n");

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
   public void testOptionMake72Safe() throws Exception
   {
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

      assertFalse(resource.isMake72Safe());
      
      Map<String, String> options = new HashMap<String, String>();
      options.put(ManifestResource.OPTION_MAKE72SAFE, "true");

      ByteArrayOutputStream out = new ByteArrayOutputStream();
      resource.save(out, options);

      String content = out.toString("UTF-8");
      
      StringBuilder expectedContent = new StringBuilder();
      expectedContent.append("Manifest-Version: 1.0");
      expectedContent.append("\r\n");
      expectedContent.append("Bundle-ManifestVersion: 2");
      expectedContent.append("\r\n");
      expectedContent.append("Export-Package: a;b;c;version=1,fooooooooooooooooooooooooooooooooooooo");
      expectedContent.append("\r\n");
      expectedContent.append(" ooooooooooooooooooooooooooooooooooooo");
      expectedContent.append("\r\n");
      expectedContent.append("\r\n");

      assertEquals(expectedContent.toString(), content);
   }

}
