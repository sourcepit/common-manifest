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

package org.sourcepit.common.manifest.osgi;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class BundleManifestFactoryTest {
   private BundleManifestFactory efactory = BundleManifestFactory.eINSTANCE;
   private BundleManifestPackage ePackage = BundleManifestPackage.eINSTANCE;

   @Test
   public void testCreateFromString() {
      Version version = (Version) efactory.createFromString(ePackage.getVersion(), "0.1.0.SNAPSHOT");
      assertThat(version, IsEqual.equalTo(Version.parse("0.1.0.SNAPSHOT")));

      VersionRange versionRange = (VersionRange) efactory.createFromString(ePackage.getVersionRange(), "[1,2)");
      assertThat(versionRange, IsEqual.equalTo(VersionRange.parse("[1,2)")));
   }

   @Test
   public void testConvertToString() {
      assertThat(efactory.convertToString(ePackage.getVersion(), Version.parse("1.0")), IsEqual.equalTo("1.0"));

      assertThat(efactory.convertToString(ePackage.getVersionRange(), VersionRange.parse("[1,2)")),
         IsEqual.equalTo("[1,2)"));

   }

}
