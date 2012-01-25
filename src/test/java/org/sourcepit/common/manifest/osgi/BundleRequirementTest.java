/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi;

import static org.junit.Assert.*;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.junit.Test;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class BundleRequirementTest
{

   @Test
   public void testSetVersionRange()
   {
      BundleRequirement packageExport = BundleManifestFactory.eINSTANCE.createBundleRequirement();
      assertThat(packageExport.getBundleVersion(), IsNull.nullValue());
      assertThat(packageExport.getParameter("bundle-version"), IsNull.nullValue());

      packageExport.setBundleVersion(VersionRange.parse("1.2"));

      assertThat(packageExport.getBundleVersion(), IsEqual.equalTo(VersionRange.parse("1.2")));
      assertThat(packageExport.getParameter("bundle-version"), IsNull.notNullValue());

      packageExport.setBundleVersion(null);
      assertThat(packageExport.getBundleVersion(), IsNull.nullValue());
      assertThat(packageExport.getParameter("bundle-version"), IsNull.nullValue());
   }

}
