/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.junit.Test;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class DynamicPackageImportTest
{

   @Test
   public void testSetVersion()
   {
      DynamicPackageImport packageExport = BundleManifestFactory.eINSTANCE.createDynamicPackageImport();
      assertThat(packageExport.getVersion(), IsNull.nullValue());
      assertThat(packageExport.getParameter("version"), IsNull.nullValue());

      packageExport.setVersion(VersionRange.parse("1.2"));

      assertThat(packageExport.getVersion(), IsEqual.equalTo(VersionRange.parse("1.2")));
      assertThat(packageExport.getParameter("version"), IsNull.notNullValue());
      assertThat(packageExport.getParameter("specification-version"), IsNull.nullValue());

      packageExport.setVersion(null);
      assertThat(packageExport.getParameters().size(), Is.is(0));
      assertThat(packageExport.getVersion(), IsNull.nullValue());
      assertThat(packageExport.getParameter("version"), IsNull.nullValue());
   }

   @Test
   public void testSetBundleVersion()
   {
      DynamicPackageImport packageImport = BundleManifestFactory.eINSTANCE.createDynamicPackageImport();
      assertThat(packageImport.getBundleVersion(), IsNull.nullValue());
      assertThat(packageImport.getParameter("bundle-version"), IsNull.nullValue());

      packageImport.setBundleVersion(VersionRange.parse("1.2"));

      assertThat(packageImport.getBundleVersion(), IsEqual.equalTo(VersionRange.parse("1.2")));
      assertThat(packageImport.getParameter("bundle-version"), IsNull.notNullValue());

      packageImport.setBundleVersion(null);
      assertThat(packageImport.getBundleVersion(), IsNull.nullValue());
      assertThat(packageImport.getParameter("bundle-version"), IsNull.nullValue());
   }

}
