/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi;

import static org.junit.Assert.*;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.junit.Test;
import org.sourcepit.common.manifest.osgi.parser.BundleHeaderParserImpl;
import org.sourcepit.common.manifest.parser.HeaderParser;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class PackageImportTest
{
   @Test
   public void testSetVersionRange()
   {
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
