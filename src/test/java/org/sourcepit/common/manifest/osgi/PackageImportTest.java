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

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.junit.Test;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class PackageImportTest {
   @Test
   public void testSetVersionRange() {
      PackageImport packageExport = BundleManifestFactory.eINSTANCE.createPackageImport();
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

      Parameter parameter = BundleManifestFactory.eINSTANCE.createParameter();
      parameter.setName("specification-version");
      parameter.setQuoted(true);
      parameter.setValue("1.2");
      packageExport.getParameters().add(parameter);

      assertThat(packageExport.getVersion(), IsEqual.equalTo(VersionRange.parse("1.2")));
      assertThat(packageExport.getParameter("specification-version"), IsNull.notNullValue());
      assertThat(packageExport.getParameter("version"), IsNull.nullValue());
   }

}
