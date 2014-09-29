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

import static org.junit.Assert.assertThat;

import java.io.ByteArrayInputStream;

import org.eclipse.emf.ecore.resource.Resource;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;
import org.sourcepit.common.manifest.Manifest;
import org.sourcepit.common.manifest.osgi.BundleManifest;

/**
 * @author Bernd
 */
public class GenericManifestResourceImplTest
{
   @Test
   public void testBundleManifest() throws Exception
   {
      StringBuilder sb = new StringBuilder();
      sb.append("Manifest-Version: 1.0");
      sb.append("\r\n");
      sb.append("Bundle-ManifestVersion: 2");
      sb.append("\r\n");
      sb.append("Bundle-Version: 1.2.3");
      sb.append("\r\n");
      sb.append("Main-Class: foo.Bar");
      sb.append("\r\n");
      sb.append("\r\n");

      Resource resource = new GenericManifestResourceImpl();
      resource.load(new ByteArrayInputStream(sb.toString().getBytes("UTF-8")), null);

      assertThat(resource.getContents().get(0), IsInstanceOf.instanceOf(BundleManifest.class));
   }

   @Test
   public void testManifest() throws Exception
   {
      StringBuilder sb = new StringBuilder();
      sb.append("Manifest-Version: 1.0");
      sb.append("\r\n");
      sb.append("Main-Class: foo.Bar");
      sb.append("\r\n");
      sb.append("\r\n");

      Resource resource = new GenericManifestResourceImpl();
      resource.load(new ByteArrayInputStream(sb.toString().getBytes("UTF-8")), null);

      assertThat(resource.getContents().get(0), IsInstanceOf.instanceOf(Manifest.class));
   }
}
