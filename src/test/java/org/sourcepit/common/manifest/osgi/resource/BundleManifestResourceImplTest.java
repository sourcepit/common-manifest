/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi.resource;

import static org.junit.Assert.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
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
import org.sourcepit.common.manifest.osgi.Version;

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

}
