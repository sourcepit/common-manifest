/**
 * Copyright (c) 2014 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;
import org.sourcepit.common.manifest.osgi.BundleManifest;
import org.sourcepit.common.manifest.util.ManifestUtils;

public class ManifestUtilsTest
{

   private java.util.jar.Manifest javaManifest;

   @Before
   public void init() throws IOException
   {
      InputStream is = getClass().getResourceAsStream("/MANIFEST.MF");
      javaManifest = new java.util.jar.Manifest(is);
      assertNotNull(javaManifest);
   }

   @Test
   public void test()
   {
      Manifest manifest = ManifestUtils.toManifest(javaManifest);
      assertNotNull(manifest);
      Header vendorHeader = manifest.getHeader("Bundle-Vendor");
      assertNotNull(vendorHeader);
      assertEquals("sourcepit.org", vendorHeader.getValue());
   }

   @Test
   public void testBundleManifest()
   {
      Manifest manifest = ManifestUtils.toManifest(javaManifest);
      assertNotNull(manifest);
      assertEquals(Boolean.TRUE, Boolean.valueOf(manifest instanceof BundleManifest));
   }
}
