/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
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
