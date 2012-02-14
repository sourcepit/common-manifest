/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.junit.Test;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class PackageExportTest
{

   @Test
   public void testSetVersion()
   {
      PackageExport packageExport = BundleManifestFactory.eINSTANCE.createPackageExport();
      assertThat(packageExport.getVersion(), IsNull.nullValue());
      assertThat(packageExport.getParameter("version"), IsNull.nullValue());

      packageExport.setVersion(Version.parse("1.2"));

      assertThat(packageExport.getVersion(), IsEqual.equalTo(Version.parse("1.2")));
      assertThat(packageExport.getParameter("version"), IsNull.notNullValue());

      packageExport.setVersion(null);
      assertThat(packageExport.getVersion(), IsNull.nullValue());
      assertThat(packageExport.getParameter("version"), IsNull.nullValue());
   }

}
