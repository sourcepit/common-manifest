/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi.parser;

import static org.junit.Assert.assertThat;
import static org.sourcepit.common.manifest.osgi.ParameterType.ATTRIBUTE;
import static org.sourcepit.common.manifest.osgi.ParameterType.DIRECTIVE;

import org.eclipse.emf.common.util.EList;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.junit.Test;
import org.sourcepit.common.manifest.osgi.PackageExport;
import org.sourcepit.common.manifest.osgi.PackageImport;
import org.sourcepit.common.manifest.osgi.Parameter;
import org.sourcepit.common.manifest.osgi.Parameterized;
import org.sourcepit.common.manifest.osgi.Version;
import org.sourcepit.common.manifest.osgi.VersionRange;

/**
 * @author Bernd
 */
public class BundleHeaderParserImplTest
{
   private BundleHeaderParserImpl parser = new BundleHeaderParserImpl();

   @Test
   public void testParameter()
   {
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
   public void testVersionParameter()
   {
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
   public void testVersionRangeParameter()
   {
      VersionRange range = VersionRange.parse("[1,2)");

      PackageImport export = parser.parseImportPackage("a.b.c;d.e.f;version=\"" + range.toString() + "\"").get(0);

      Parameter verionParam = getFirstParameter(export);
      assertThat(verionParam.getName(), IsEqual.equalTo("version"));
      assertThat(verionParam.getValue(), IsEqual.equalTo("[1,2)"));

      assertThat(parser.toString(verionParam), IsEqual.equalTo("version=\"[1,2)\""));

      VersionRange parsedValue = (VersionRange) parser.parseParameter(verionParam);
      assertThat(parsedValue, IsEqual.equalTo(range));
   }

   protected Parameter parseParameter(String parameter)
   {
      PackageExport export = parser.parseExportPackage("a.b.bc;" + parameter).get(0);
      return getFirstParameter(export);
   }

   protected Parameter getFirstParameter(Parameterized parameterized)
   {
      EList<Parameter> parameters = parameterized.getParameters();
      assertThat(parameters.size(), Is.is(1));
      Parameter p = parameters.get(0);
      assertThat(p, IsNull.notNullValue());
      return p;
   }

}
