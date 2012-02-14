/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class BundleManifestFactoryTest
{
   private BundleManifestFactory efactory = BundleManifestFactory.eINSTANCE;
   private BundleManifestPackage ePackage = BundleManifestPackage.eINSTANCE;

   @Test
   public void testCreateFromString()
   {
      Version version = (Version) efactory.createFromString(ePackage.getVersion(), "0.1.0.SNAPSHOT");
      assertThat(version, IsEqual.equalTo(Version.parse("0.1.0.SNAPSHOT")));

      VersionRange versionRange = (VersionRange) efactory.createFromString(ePackage.getVersionRange(), "[1,2)");
      assertThat(versionRange, IsEqual.equalTo(VersionRange.parse("[1,2)")));
   }

   @Test
   public void testConvertToString()
   {
      assertThat(efactory.convertToString(ePackage.getVersion(), Version.parse("1.0")), IsEqual.equalTo("1.0"));

      assertThat(efactory.convertToString(ePackage.getVersionRange(), VersionRange.parse("[1,2)")),
         IsEqual.equalTo("[1,2)"));

   }

}
