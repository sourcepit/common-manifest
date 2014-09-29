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
