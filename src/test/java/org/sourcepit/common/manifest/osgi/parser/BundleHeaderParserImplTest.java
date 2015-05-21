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

package org.sourcepit.common.manifest.osgi.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.sourcepit.common.manifest.osgi.ParameterType.ATTRIBUTE;
import static org.sourcepit.common.manifest.osgi.ParameterType.DIRECTIVE;
import static org.sourcepit.common.manifest.util.EOL.EOL;

import org.eclipse.emf.common.util.EList;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.junit.Test;
import org.sourcepit.common.manifest.Header;
import org.sourcepit.common.manifest.Parseable;
import org.sourcepit.common.manifest.osgi.BundleHeaderName;
import org.sourcepit.common.manifest.osgi.BundleManifest;
import org.sourcepit.common.manifest.osgi.BundleManifestFactory;
import org.sourcepit.common.manifest.osgi.PackageExport;
import org.sourcepit.common.manifest.osgi.PackageImport;
import org.sourcepit.common.manifest.osgi.Parameter;
import org.sourcepit.common.manifest.osgi.Parameterized;
import org.sourcepit.common.manifest.osgi.Version;
import org.sourcepit.common.manifest.osgi.VersionRange;

/**
 * @author Bernd
 */
public class BundleHeaderParserImplTest {
   private BundleHeaderParserImpl parser = new BundleHeaderParserImpl();

   @Test
   public void testParameter() {
      String str = "name=foo";
      Parameter param = parseParameter(str);
      assertThat(param.getName(), IsEqual.equalTo("name"));
      assertThat(param.getValue(), IsEqual.equalTo("foo"));
      assertThat(param.isQuoted(), Is.is(false));
      assertThat(param.getType(), Is.is(ATTRIBUTE));
      assertThat(parser.toString(param), IsEqual.equalTo(str));

      str = "name:=foo";
      param = parseParameter(str);
      assertThat(param.getName(), IsEqual.equalTo("name"));
      assertThat(param.getValue(), IsEqual.equalTo("foo"));
      assertThat(param.isQuoted(), Is.is(false));
      assertThat(param.getType(), Is.is(DIRECTIVE));
      assertThat(parser.toString(param), IsEqual.equalTo(str));

      str = "name:=\"foo \\\"bar\\\"\"";
      param = parseParameter(str);
      assertThat(param.getName(), IsEqual.equalTo("name"));
      assertThat(param.getValue(), IsEqual.equalTo("foo \"bar\""));
      assertThat(param.isQuoted(), Is.is(true));
      assertThat(param.getType(), Is.is(DIRECTIVE));
      assertThat(parser.toString(param), IsEqual.equalTo(str));

      str = "name:=\"\"";
      param = parseParameter(str);
      assertThat(param.getName(), IsEqual.equalTo("name"));
      assertThat(param.getValue(), IsEqual.equalTo(""));
      assertThat(param.isQuoted(), Is.is(true));
      assertThat(param.getType(), Is.is(DIRECTIVE));
      assertThat(parser.toString(param), IsEqual.equalTo(str));
   }

   @Test
   public void testVersionParameter() {
      Version version = Version.parse("1.2.3");

      PackageExport export = parser.parseExportPackage("a.b.c;d.e.f;version=" + version.toString()).get(0);

      Parameter verionParam = getFirstParameter(export);
      assertThat(verionParam.getName(), IsEqual.equalTo("version"));
      assertThat(verionParam.getValue(), IsEqual.equalTo("1.2.3"));

      assertThat(parser.toString(verionParam), IsEqual.equalTo("version=1.2.3"));

      Version parsedValue = (Version) parser.parseParameter(verionParam);
      assertThat(parsedValue, IsEqual.equalTo(version));
   }

   @Test
   public void testVersionRangeParameter() {
      VersionRange range = VersionRange.parse("[1,2)");

      PackageImport export = parser.parseImportPackage("a.b.c;d.e.f;version=\"" + range.toString() + "\"").get(0);

      Parameter verionParam = getFirstParameter(export);
      assertThat(verionParam.getName(), IsEqual.equalTo("version"));
      assertThat(verionParam.getValue(), IsEqual.equalTo("[1,2)"));

      assertThat(parser.toString(verionParam), IsEqual.equalTo("version=\"[1,2)\""));

      VersionRange parsedValue = (VersionRange) parser.parseParameter(verionParam);
      assertThat(parsedValue, IsEqual.equalTo(range));
   }

   @Test
   public void testSupportBrokenVersionRange() throws Exception {
      // MANIFEST.MF of org.eclipse.birt.core_2.6.2.r262_v20110209.jar has a broken Require-Bundle header :-(
      VersionRange range = VersionRange.parse("[1,2)");
      PackageImport export = parser.parseImportPackage("a.b.c;version=\"" + range.toString()).get(0);
      Parameter parameter = export.getParameter("version");
      assertThat(parameter.getValue(), IsEqual.equalTo("[1,2)"));

      EList<PackageImport> importPackages = parser.parseImportPackage("foo;version=\"[1,2)\",a.b.c;version=\"[1,3)");
      assertThat(importPackages.size(), Is.is(2));
      assertThat(importPackages.get(0).getParameterValue("version"), IsEqual.equalTo("[1,2)"));
      assertThat(importPackages.get(1).getParameterValue("version"), IsEqual.equalTo("[1,3)"));

      importPackages = parser.parseImportPackage("foo;version=\"[1,2)\",a.b.c;version=\"[1,3)\"");
      assertThat(importPackages.size(), Is.is(2));
      assertThat(importPackages.get(0).getParameterValue("version"), IsEqual.equalTo("[1,2)"));
      assertThat(importPackages.get(1).getParameterValue("version"), IsEqual.equalTo("[1,3)"));
   }

   protected Parameter parseParameter(String parameter) {
      PackageExport export = parser.parseExportPackage("a.b.bc;" + parameter).get(0);
      return getFirstParameter(export);
   }

   protected Parameter getFirstParameter(Parameterized parameterized) {
      EList<Parameter> parameters = parameterized.getParameters();
      assertThat(parameters.size(), Is.is(1));
      Parameter p = parameters.get(0);
      assertThat(p, IsNull.notNullValue());
      return p;
   }

   @Test
   public void testParameterToValueString() throws Exception {
      // force init of static initializers
      BundleManifestFactory.eINSTANCE.createBundleManifest();

      String str = "version=1";
      Parameter param = parseParameter(str);

      Version version = (Version) param.getParsedValue();
      assertThat(version.toMinimalString(), IsEqual.equalTo("1"));
      assertThat(parser.toValueString((Parseable) param), IsEqual.equalTo("1"));
   }

   @Test
   public void testExportPackageToString() throws Exception {
      BundleManifest manifest = BundleManifestFactory.eINSTANCE.createBundleManifest();
      manifest.setHeader(BundleHeaderName.EXPORT_PACKAGE, "a.b.c;d.e.f;version=1.0,g.h.i");

      Header header = manifest.getHeader(BundleHeaderName.EXPORT_PACKAGE);
      assertEquals("a.b.c;d.e.f;version=1.0,g.h.i", parser.toValueString((Parseable) header));
      assertEquals("a.b.c;d.e.f;version=1.0," + EOL + " g.h.i", parser.toValueString((Parseable) header, true));
   }

   @Test
   public void testBundleLicenseToString() throws Exception {
      BundleManifest manifest = BundleManifestFactory.eINSTANCE.createBundleManifest();
      manifest.setHeader(BundleHeaderName.BUNDLE_LICENSE,
         "Apache License Version 2.0;link=\"http://www.apache.org/licenses/LICENSE-2.0\"");

      Header header = manifest.getHeader(BundleHeaderName.BUNDLE_LICENSE);
      assertEquals("Apache License Version 2.0;link=\"http://www.apache.org/licenses/LICENSE-2.0\"",
         parser.toValueString((Parseable) header));
      assertEquals("Apache License Version 2.0;link=\"http://www.apache.org/licenses/LICENSE-2.0\"",
         parser.toValueString((Parseable) header, true));
   }

   @Test
   public void testBundleLicenseWithSOmeSpecialChars() throws Exception {
      BundleManifest manifest = BundleManifestFactory.eINSTANCE.createBundleManifest();
      manifest.setHeader(BundleHeaderName.BUNDLE_LICENSE, "\"The License\"");

      Header header = manifest.getHeader(BundleHeaderName.BUNDLE_LICENSE);
      assertEquals("\"The License\"", parser.toValueString((Parseable) header));
   }
}
