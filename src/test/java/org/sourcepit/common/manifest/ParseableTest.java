/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest;

import static org.junit.Assert.assertThat;
import static org.sourcepit.common.manifest.osgi.BundleHeaderName.EXPORT_PACKAGE;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.junit.Test;
import org.sourcepit.common.manifest.osgi.BundleManifest;
import org.sourcepit.common.manifest.osgi.BundleManifestFactory;
import org.sourcepit.common.manifest.osgi.PackageExport;
import org.sourcepit.common.manifest.osgi.Parameter;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class ParseableTest
{

   @Test
   public void testSetValue()
   {
      BundleManifest mf = BundleManifestFactory.eINSTANCE.createBundleManifest();
      mf.setHeader(EXPORT_PACKAGE, "foo");

      final List<Notification> notifications = new ArrayList<Notification>();

      mf.eAdapters().add(new EContentAdapter()
      {
         public void notifyChanged(org.eclipse.emf.common.notify.Notification notification)
         {
            super.notifyChanged(notification);
            notifications.add(notification);
         };
      });

      // header is parseable
      Header header = mf.getHeader(EXPORT_PACKAGE);

      Object parsedValue = header.getParsedValue();
      assertThat(parsedValue, IsNull.notNullValue());

      // start actual test
      notifications.clear();
      header.setValue(null);
      assertThat(notifications.size(), Is.is(2));
      assertThat((EAttribute) notifications.get(0).getFeature(),
         IsEqual.equalTo(ManifestPackage.eINSTANCE.getParseable_ParsedValue()));
      assertThat((EAttribute) notifications.get(1).getFeature(),
         IsEqual.equalTo(ManifestPackage.eINSTANCE.getParseable_Value()));

      parsedValue = header.getParsedValue();
      assertThat(parsedValue, IsNull.nullValue());

      notifications.clear();
      header.setValue("foo,bar");
      assertThat(notifications.size(), Is.is(2));
      assertThat((EAttribute) notifications.get(0).getFeature(),
         IsEqual.equalTo(ManifestPackage.eINSTANCE.getParseable_ParsedValue()));
      assertThat((EAttribute) notifications.get(1).getFeature(),
         IsEqual.equalTo(ManifestPackage.eINSTANCE.getParseable_Value()));

      parsedValue = header.getParsedValue();
      assertThat(parsedValue, IsNull.notNullValue());

      List<PackageExport> packageExports = (List<PackageExport>) parsedValue;
      assertThat(packageExports.size(), Is.is(2));
      assertThat(packageExports.get(0).getPackageNames().get(0), IsEqual.equalTo("foo"));
      assertThat(packageExports.get(1).getPackageNames().get(0), IsEqual.equalTo("bar"));
   }

   @Test
   public void testSetParsedValue()
   {
      BundleManifest mf = BundleManifestFactory.eINSTANCE.createBundleManifest();
      mf.setHeader(EXPORT_PACKAGE, "foo");

      final List<Notification> notifications = new ArrayList<Notification>();

      mf.eAdapters().add(new EContentAdapter()
      {
         public void notifyChanged(org.eclipse.emf.common.notify.Notification notification)
         {
            super.notifyChanged(notification);
            notifications.add(notification);
         };
      });

      // header is parseable
      Header header = mf.getHeader(EXPORT_PACKAGE);

      Object parsedValue = header.getParsedValue();
      assertThat(parsedValue, IsNull.notNullValue());

      // start actual test
      notifications.clear();
      header.setParsedValue(null);
      assertThat(notifications.size(), Is.is(2));
      assertThat((EAttribute) notifications.get(0).getFeature(),
         IsEqual.equalTo(ManifestPackage.eINSTANCE.getParseable_Value()));
      assertThat((EAttribute) notifications.get(1).getFeature(),
         IsEqual.equalTo(ManifestPackage.eINSTANCE.getParseable_ParsedValue()));

      assertThat(header.getValue(), IsNull.nullValue());

      List<PackageExport> packageExports = new ArrayList<PackageExport>();
      packageExports.add(BundleManifestFactory.eINSTANCE.createPackageExport());
      packageExports.add(BundleManifestFactory.eINSTANCE.createPackageExport());
      packageExports.get(0).getPackageNames().add("foo");
      packageExports.get(1).getPackageNames().add("bar");

      notifications.clear();
      header.setParsedValue(packageExports);
      assertThat(notifications.size(), Is.is(2));
      assertThat((EAttribute) notifications.get(0).getFeature(),
         IsEqual.equalTo(ManifestPackage.eINSTANCE.getParseable_Value()));
      assertThat((EAttribute) notifications.get(1).getFeature(),
         IsEqual.equalTo(ManifestPackage.eINSTANCE.getParseable_ParsedValue()));

      assertThat(header.getValue(), IsEqual.equalTo("foo,bar"));

      PackageExport export = BundleManifestFactory.eINSTANCE.createPackageExport();
      export.getPackageNames().add("murks");
      ((List<PackageExport>) header.getParsedValue()).add(export);

      assertThat(header.getValue(), IsEqual.equalTo("foo,bar,murks"));

      export.getPackageNames().add("hans");

      assertThat(header.getValue(), IsEqual.equalTo("foo,bar,murks;hans"));

      Parameter versionParam = BundleManifestFactory.eINSTANCE.createParameter();
      versionParam.setName("version");
      versionParam.setValue("1.2");

      export.getParameters().add(versionParam);
      assertThat(header.getValue(), IsEqual.equalTo("foo,bar,murks;hans;version=1.2"));

      // test remove adapters
      ((List<PackageExport>) header.getParsedValue()).clear();
      assertThat(export.eAdapters().size(), Is.is(0));
   }

}
