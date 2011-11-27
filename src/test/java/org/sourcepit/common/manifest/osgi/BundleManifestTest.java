/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi;

import static org.junit.Assert.assertThat;
import static org.sourcepit.common.manifest.osgi.BundleHeaderName.BUNDLE_ACTIVATIONPOLICY;
import static org.sourcepit.common.manifest.osgi.BundleHeaderName.BUNDLE_CLASSPATH;
import static org.sourcepit.common.manifest.osgi.BundleHeaderName.BUNDLE_MANIFESTVERSION;
import static org.sourcepit.common.manifest.osgi.BundleHeaderName.BUNDLE_SYMBOLICNAME;
import static org.sourcepit.common.manifest.osgi.BundleHeaderName.BUNDLE_VERSION;
import static org.sourcepit.common.manifest.osgi.BundleHeaderName.DYNAMICIMPORT_PACKAGE;
import static org.sourcepit.common.manifest.osgi.BundleHeaderName.EXPORT_PACKAGE;
import static org.sourcepit.common.manifest.osgi.BundleHeaderName.FRAGMENT_HOST;
import static org.sourcepit.common.manifest.osgi.BundleHeaderName.IMPORT_PACKAGE;
import static org.sourcepit.common.manifest.osgi.BundleHeaderName.REQUIRE_BUNDLE;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.junit.Test;
import org.sourcepit.common.manifest.Header;
import org.sourcepit.common.manifest.HeaderName;

/**
 * @author Bernd
 */
public class BundleManifestTest
{
   @Test
   public void testNew()
   {
      BundleManifest manifest = BundleManifestFactory.eINSTANCE.createBundleManifest();
      assertThat(manifest.getHeaderValue(HeaderName.MANIFEST_VERSION), IsEqual.equalTo("1.0"));
   }

   @Test
   public void testHeaderOperations()
   {
      BundleManifest manifest = BundleManifestFactory.eINSTANCE.createBundleManifest();
      assertThat(manifest.getHeader(BUNDLE_VERSION.getLiteral()), IsNull.nullValue());
      assertThat(manifest.getHeader(BUNDLE_VERSION), IsNull.nullValue());
      assertThat(manifest.getHeaderValue(BUNDLE_VERSION.getLiteral()), IsNull.nullValue());
      assertThat(manifest.getHeaderValue(BUNDLE_VERSION), IsNull.nullValue());
      assertThat(manifest.getParsedHeaderValue(BUNDLE_VERSION.getLiteral()), IsNull.nullValue());
      assertThat(manifest.getParsedHeaderValue(BUNDLE_VERSION), IsNull.nullValue());

      manifest.setHeader(BUNDLE_VERSION, "1.2.3");

      assertThat(manifest.getHeader(BUNDLE_VERSION.getLiteral()), IsNull.notNullValue());
      assertThat(manifest.getHeader(BUNDLE_VERSION), IsNull.notNullValue());
      assertThat(manifest.getHeaderValue(BUNDLE_VERSION.getLiteral()), IsNull.notNullValue());
      assertThat(manifest.getHeaderValue(BUNDLE_VERSION), IsNull.notNullValue());
      assertThat(manifest.getParsedHeaderValue(BUNDLE_VERSION.getLiteral()), IsNull.notNullValue());
      assertThat(manifest.getParsedHeaderValue(BUNDLE_VERSION), IsNull.notNullValue());

      manifest.setHeader(BUNDLE_VERSION, null);

      assertThat(manifest.getHeader(BUNDLE_VERSION.getLiteral()), IsNull.nullValue());
      assertThat(manifest.getHeader(BUNDLE_VERSION), IsNull.nullValue());
      assertThat(manifest.getHeaderValue(BUNDLE_VERSION.getLiteral()), IsNull.nullValue());
      assertThat(manifest.getHeaderValue(BUNDLE_VERSION), IsNull.nullValue());
      assertThat(manifest.getParsedHeaderValue(BUNDLE_VERSION.getLiteral()), IsNull.nullValue());
      assertThat(manifest.getParsedHeaderValue(BUNDLE_VERSION), IsNull.nullValue());

      manifest.getHeaders().put(BUNDLE_VERSION.getLiteral(), "1.2.3");

      assertThat(manifest.getHeader(BUNDLE_VERSION.getLiteral()), IsNull.notNullValue());
      assertThat(manifest.getHeader(BUNDLE_VERSION), IsNull.notNullValue());
      assertThat(manifest.getHeaderValue(BUNDLE_VERSION.getLiteral()), IsNull.notNullValue());
      assertThat(manifest.getHeaderValue(BUNDLE_VERSION), IsNull.notNullValue());
      assertThat(manifest.getParsedHeaderValue(BUNDLE_VERSION.getLiteral()), IsNull.notNullValue());
      assertThat(manifest.getParsedHeaderValue(BUNDLE_VERSION), IsNull.notNullValue());
   }

   @Test
   public void testToString()
   {
      BundleManifest manifest = BundleManifestFactory.eINSTANCE.createBundleManifest();
      manifest.setHeader(IMPORT_PACKAGE, "a.b.c;d.e.f.g;version=\"[1.2,3)\"");

      List<PackageImport> importPackage = manifest.getImportPackage();
      assertThat(1, Is.is(importPackage.size()));

      PackageImport packageImport = importPackage.get(0);
      // assertThat(packageImport.toString(), IsEqual.equalTo("a.b.c;d.e.f.g;version=\"[1.2,3)\""));

      EList<Parameter> parameters = packageImport.getParameters();
      assertThat(1, Is.is(parameters.size()));

      Parameter parameter = parameters.get(0);
      assertThat(parameter.toString(), IsEqual.equalTo("version=\"[1.2,3)\""));

      Header header = manifest.getHeader(IMPORT_PACKAGE);
      assertThat(header.toString(), IsEqual.equalTo("Import-Package: a.b.c;d.e.f.g;version=\"[1.2,3)\""));

      assertThat(
         manifest.toString(),
         IsEqual
            .equalTo("Manifest-Version: 1.0\nBundle-ManifestVersion: 2\nImport-Package: a.b.c;d.e.f.g;version=\"[1.2,3)\"\n"));
   }

   @Test
   public void testBundleManifestVersion()
   {
      BundleManifest manifest = BundleManifestFactory.eINSTANCE.createBundleManifest();
      assertThat(manifest.getBundleManifestVersion(), IsEqual.equalTo("2"));

      manifest.setHeader(BUNDLE_MANIFESTVERSION, "42");

      assertThat(manifest.getBundleManifestVersion(), IsEqual.equalTo("42"));
   }

   @Test
   public void testBundleVersion()
   {
      BundleManifest manifest = BundleManifestFactory.eINSTANCE.createBundleManifest();
      manifest.setHeader(BUNDLE_VERSION, "1.2.3");

      String versionStr = manifest.getHeaderValue(BUNDLE_VERSION);
      assertThat(versionStr, IsEqual.equalTo("1.2.3"));

      manifest.setHeader(BUNDLE_VERSION, null);
      versionStr = manifest.getHeaderValue(BUNDLE_VERSION);
      assertThat(versionStr, IsNull.nullValue());

      manifest.setHeader(BUNDLE_VERSION, "1.2.3");

      Version version = manifest.getBundleVersion();
      assertThat(version, IsEqual.equalTo(Version.parse("1.2.3")));
   }

   @Test
   public void testBundleSymbolicName()
   {
      BundleManifest manifest = BundleManifestFactory.eINSTANCE.createBundleManifest();

      BundleSymbolicName symbolicName = manifest.getBundleSymbolicName();
      assertThat(symbolicName, IsNull.nullValue());

      manifest.setHeader(BUNDLE_SYMBOLICNAME, "foo-bar");

      symbolicName = manifest.getBundleSymbolicName();
      assertThat(symbolicName, IsNull.notNullValue());
      assertThat(symbolicName.getParameters().size(), Is.is(0));
      assertThat(symbolicName.getSymbolicName(), IsEqual.equalTo("foo-bar"));
      assertThat(symbolicName.isSingleton(), Is.is(false));

      manifest.setHeader(BUNDLE_SYMBOLICNAME, "foo-bar;singleton:=true");
      symbolicName = manifest.getBundleSymbolicName();
      assertThat(symbolicName, IsNull.notNullValue());
      assertThat(symbolicName.getParameters().size(), Is.is(1));
      assertThat(symbolicName.getSymbolicName(), IsEqual.equalTo("foo-bar"));
      assertThat(symbolicName.getParameterValue("singleton"), IsEqual.equalTo("true"));
      assertThat((Boolean) symbolicName.getParsedParameterValue("singleton"), IsEqual.equalTo(Boolean.TRUE));
      assertThat(symbolicName.isSingleton(), Is.is(true));
   }

   @Test
   public void testFragmentHost()
   {
      BundleManifest manifest = BundleManifestFactory.eINSTANCE.createBundleManifest();

      FragmentHost fragmentHost = manifest.getFragmentHost();
      assertThat(fragmentHost, IsNull.nullValue());

      manifest.setHeader(FRAGMENT_HOST, "org.eclipse.swt; bundle-version=\"[3.0.0,4.0.0)\"");

      fragmentHost = manifest.getFragmentHost();
      assertThat(fragmentHost, IsNull.notNullValue());

      VersionRange bundleVersion = fragmentHost.getVersionRange();
      assertThat(bundleVersion, IsNull.notNullValue());
      assertThat(bundleVersion, IsEqual.equalTo(VersionRange.parse("[3.0.0,4.0.0)")));
   }

   @Test
   public void testBundleActivationPolicy()
   {
      BundleManifest manifest = BundleManifestFactory.eINSTANCE.createBundleManifest();

      BundleActivationPolicy activationPolicy = manifest.getBundleActivationPolicy();
      assertThat(activationPolicy, IsNull.nullValue());

      manifest.setHeader(BUNDLE_ACTIVATIONPOLICY, "lazy");

      activationPolicy = manifest.getBundleActivationPolicy();
      assertThat(activationPolicy, IsNull.notNullValue());
      assertThat(activationPolicy.getParameters().size(), Is.is(0));
      assertThat(activationPolicy.getPolicy(), Is.is(ActivationPolicy.LAZY));

      manifest.setHeader(BUNDLE_ACTIVATIONPOLICY, "eager;foo:=bar");
      activationPolicy = manifest.getBundleActivationPolicy();
      assertThat(activationPolicy, IsNull.notNullValue());
      assertThat(activationPolicy.getPolicy(), Is.is(ActivationPolicy.EAGER));
      assertThat(activationPolicy.getParameters().size(), Is.is(1));
      assertThat(activationPolicy.getParameterValue("foo"), IsEqual.equalTo("bar"));
   }

   @Test
   public void testBundleActivator()
   {
      BundleManifest manifest = BundleManifestFactory.eINSTANCE.createBundleManifest();

      String activator = manifest.getBundleActivator();
      assertThat(activator, IsNull.nullValue());

      manifest.setHeader(BundleHeaderName.BUNDLE_ACTIVATOR, "foo.Bar");

      activator = manifest.getBundleActivator();
      assertThat(activator, IsEqual.equalTo("foo.Bar"));
   }

   @Test
   public void testExportPackage()
   {
      BundleManifest manifest = BundleManifestFactory.eINSTANCE.createBundleManifest();
      assertThat(manifest.getExportPackage(), IsNull.notNullValue());

      manifest.setHeader(EXPORT_PACKAGE, "a.b.c;d.e.f.g;version=\"1.0.0\",foo.bar;specification-version=1.2.3");

      List<PackageExport> exportPackage = manifest.getExportPackage();
      assertThat(exportPackage.size(), Is.is(2));

      PackageExport e1 = exportPackage.get(0);
      assertThat(e1.getPackageNames().size(), Is.is(2));
      assertThat(e1.getPackageNames().get(0), IsEqual.equalTo("a.b.c"));
      assertThat(e1.getPackageNames().get(1), IsEqual.equalTo("d.e.f.g"));
      assertThat(e1.getVersion(), IsEqual.equalTo(Version.parse("1.0.0")));

      PackageExport e2 = exportPackage.get(1);
      assertThat(e2.getPackageNames().size(), Is.is(1));
      assertThat(e2.getPackageNames().get(0), IsEqual.equalTo("foo.bar"));
      assertThat(e2.getVersion(), IsEqual.equalTo(Version.parse("1.2.3")));
   }

   @Test
   public void testImportPackage()
   {
      BundleManifest manifest = BundleManifestFactory.eINSTANCE.createBundleManifest();
      assertThat(manifest.getImportPackage(), IsNull.notNullValue());

      manifest.setHeader(IMPORT_PACKAGE,
         "a.b.c;d.e.f.g;version=\"[1.2,3)\",foo.bar;bundle-version=1.2.3,bar.foo;specification-version=\"[1.2,3)\"");

      List<PackageImport> importPackage = manifest.getImportPackage();
      assertThat(importPackage.size(), Is.is(3));

      PackageImport i1 = importPackage.get(0);
      assertThat(i1.getPackageNames().size(), Is.is(2));
      assertThat(i1.getPackageNames().get(0), IsEqual.equalTo("a.b.c"));
      assertThat(i1.getPackageNames().get(1), IsEqual.equalTo("d.e.f.g"));
      assertThat(i1.getVersionRange(), IsEqual.equalTo(VersionRange.parse("[1.2,3)")));

      PackageImport i2 = importPackage.get(1);
      assertThat(i2.getPackageNames().size(), Is.is(1));
      assertThat(i2.getPackageNames().get(0), IsEqual.equalTo("foo.bar"));
      assertThat(i2.getVersionRange(), IsEqual.equalTo(VersionRange.parse("1.2.3")));

      PackageImport i3 = importPackage.get(2);
      assertThat(i3.getPackageNames().size(), Is.is(1));
      assertThat(i3.getPackageNames().get(0), IsEqual.equalTo("bar.foo"));
      assertThat(i3.getVersionRange(), IsEqual.equalTo(VersionRange.parse("[1.2,3)")));
   }

   @Test
   public void testDynamicImportPackage()
   {
      BundleManifest manifest = BundleManifestFactory.eINSTANCE.createBundleManifest();
      assertThat(manifest.getImportPackage(), IsNull.notNullValue());

      manifest.setHeader(DYNAMICIMPORT_PACKAGE, "*;d.e.f.g;version=\"[1.2,3)\",foo.*;version=1.2.3");

      List<PackageImport> importPackage = manifest.getDynamicImportPackage();
      assertThat(importPackage.size(), Is.is(2));

      PackageImport i1 = importPackage.get(0);
      assertThat(i1.getPackageNames().size(), Is.is(2));
      assertThat(i1.getPackageNames().get(0), IsEqual.equalTo("*"));
      assertThat(i1.getPackageNames().get(1), IsEqual.equalTo("d.e.f.g"));
      assertThat(i1.getVersionRange(), IsEqual.equalTo(VersionRange.parse("[1.2,3)")));

      PackageImport i2 = importPackage.get(1);
      assertThat(i2.getPackageNames().size(), Is.is(1));
      assertThat(i2.getPackageNames().get(0), IsEqual.equalTo("foo.*"));
      assertThat(i2.getVersionRange(), IsEqual.equalTo(VersionRange.parse("1.2.3")));
   }

   @Test
   public void testRequireBundle()
   {
      BundleManifest manifest = BundleManifestFactory.eINSTANCE.createBundleManifest();
      assertThat(manifest.getRequireBundle(), IsNull.notNullValue());

      manifest.setHeader(REQUIRE_BUNDLE, "a.b.c;d.e.f.g;bundle-version=\"[1.2,3)\",foo-bar;bundle-version=1.2.3");

      List<BundleRequirement> requireBundle = manifest.getRequireBundle();
      assertThat(requireBundle.size(), Is.is(2));

      BundleRequirement r1 = requireBundle.get(0);
      assertThat(r1.getSymbolicNames().size(), Is.is(2));
      assertThat(r1.getSymbolicNames().get(0), IsEqual.equalTo("a.b.c"));
      assertThat(r1.getSymbolicNames().get(1), IsEqual.equalTo("d.e.f.g"));
      assertThat(r1.getVersionRange(), IsEqual.equalTo(VersionRange.parse("[1.2,3)")));

      BundleRequirement r2 = requireBundle.get(1);
      assertThat(r2.getSymbolicNames().size(), Is.is(1));
      assertThat(r2.getSymbolicNames().get(0), IsEqual.equalTo("foo-bar"));
      assertThat(r2.getVersionRange(), IsEqual.equalTo(VersionRange.parse("1.2.3")));
   }

   @Test
   public void testBundleClassPath()
   {
      BundleManifest manifest = BundleManifestFactory.eINSTANCE.createBundleManifest();

      EList<ClassPathEntry> classPath = manifest.getBundleClassPath();
      assertThat(classPath, IsNull.notNullValue());
      assertThat(classPath.size(), Is.is(0));

      manifest.setHeader(BUNDLE_CLASSPATH, ".,foo.jar,lib/lib1.jar;lib/lib2.jar;version=1.2.3");

      classPath = manifest.getBundleClassPath();
      assertThat(classPath, IsNull.notNullValue());
      assertThat(classPath.size(), Is.is(3));

      ClassPathEntry e1 = classPath.get(0);
      assertThat(e1.getPaths().size(), Is.is(1));
      assertThat(e1.getPaths().get(0), IsEqual.equalTo("."));
      assertThat(e1.getParameters().size(), Is.is(0));

      ClassPathEntry e2 = classPath.get(1);
      assertThat(e2.getPaths().size(), Is.is(1));
      assertThat(e2.getPaths().get(0), IsEqual.equalTo("foo.jar"));
      assertThat(e2.getParameters().size(), Is.is(0));

      ClassPathEntry e3 = classPath.get(2);
      assertThat(e3.getPaths().size(), Is.is(2));
      assertThat(e3.getPaths().get(0), IsEqual.equalTo("lib/lib1.jar"));
      assertThat(e3.getPaths().get(1), IsEqual.equalTo("lib/lib2.jar"));
      assertThat(e3.getParameters().size(), Is.is(1));
      assertThat(e3.getParameterValue("version"), IsEqual.equalTo("1.2.3"));
   }
}
