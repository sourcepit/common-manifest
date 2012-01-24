/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi.impl;

import static org.sourcepit.common.manifest.osgi.BundleHeaderName.BUNDLE_ACTIVATIONPOLICY;
import static org.sourcepit.common.manifest.osgi.BundleHeaderName.BUNDLE_ACTIVATOR;
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
import org.eclipse.emf.ecore.EClass;
import org.sourcepit.common.manifest.Header;
import org.sourcepit.common.manifest.impl.ManifestImpl;
import org.sourcepit.common.manifest.osgi.BundleActivationPolicy;
import org.sourcepit.common.manifest.osgi.BundleHeaderName;
import org.sourcepit.common.manifest.osgi.BundleManifest;
import org.sourcepit.common.manifest.osgi.BundleManifestPackage;
import org.sourcepit.common.manifest.osgi.BundleRequirement;
import org.sourcepit.common.manifest.osgi.BundleSymbolicName;
import org.sourcepit.common.manifest.osgi.ClassPathEntry;
import org.sourcepit.common.manifest.osgi.FragmentHost;
import org.sourcepit.common.manifest.osgi.PackageExport;
import org.sourcepit.common.manifest.osgi.PackageImport;
import org.sourcepit.common.manifest.osgi.Version;
import org.sourcepit.common.manifest.osgi.parser.BundleHeaderParserImpl;
import org.sourcepit.common.manifest.parser.HeaderParser;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle Manifest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class BundleManifestImpl extends ManifestImpl implements BundleManifest
{
   static
   {
      HeaderParser.Registry.INSTANCE.addParser(new BundleHeaderParserImpl());
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   protected BundleManifestImpl()
   {
      super();
      setHeader(BUNDLE_MANIFESTVERSION, "2");
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   protected EClass eStaticClass()
   {
      return BundleManifestPackage.Literals.BUNDLE_MANIFEST;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public Header getHeader(BundleHeaderName name)
   {
      return getHeader(name.getLiteral());
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public BundleActivationPolicy getBundleActivationPolicy()
   {
      return getParsedHeaderValueUnchecked(BUNDLE_ACTIVATIONPOLICY);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setBundleActivationPolicy(BundleActivationPolicy bundleActivationPolicy)
   {
      setHeader(BUNDLE_ACTIVATIONPOLICY, bundleActivationPolicy);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public String getBundleActivator()
   {
      return getHeaderValue(BUNDLE_ACTIVATOR);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setBundleActivator(String bundleActivator)
   {
      setHeader(BUNDLE_ACTIVATOR, bundleActivator);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EList<PackageExport> getExportPackage()
   {
      return getParsedHeaderValueUnchecked(EXPORT_PACKAGE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setExportPackage(List<PackageExport> packageExports)
   {
      setHeader(EXPORT_PACKAGE, packageExports);
   }

   @SuppressWarnings("unchecked")
   protected <T> T getParsedHeaderValueUnchecked(BundleHeaderName name)
   {
      return (T) getParsedHeaderValue(name);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EList<PackageImport> getImportPackage()
   {
      return getParsedHeaderValueUnchecked(IMPORT_PACKAGE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setImportPackage(List<PackageImport> packageImports)
   {
      setHeader(IMPORT_PACKAGE, packageImports);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EList<PackageImport> getDynamicImportPackage()
   {
      return getParsedHeaderValueUnchecked(DYNAMICIMPORT_PACKAGE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setDynamicImportPackage(List<PackageImport> dynamicPackageImports)
   {
      setHeader(DYNAMICIMPORT_PACKAGE, dynamicPackageImports);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EList<BundleRequirement> getRequireBundle()
   {
      return getParsedHeaderValueUnchecked(REQUIRE_BUNDLE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setRequireBundle(List<BundleRequirement> bundleRequirements)
   {
      setHeader(REQUIRE_BUNDLE, bundleRequirements);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EList<ClassPathEntry> getBundleClassPath()
   {
      return getParsedHeaderValueUnchecked(BUNDLE_CLASSPATH);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setBundleClassPath(List<ClassPathEntry> classPathEntries)
   {
      setHeader(BUNDLE_CLASSPATH, classPathEntries);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setHeader(BundleHeaderName name, String value)
   {
      setHeader(name.getLiteral(), value);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setHeader(BundleHeaderName name, Object parsedValue)
   {
      setHeader(name.getLiteral(), parsedValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public String getHeaderValue(BundleHeaderName name)
   {
      return getHeaderValue(name.getLiteral());
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public Object getParsedHeaderValue(BundleHeaderName name)
   {
      return getParsedHeaderValue(name.getLiteral());
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public String getBundleManifestVersion()
   {
      return getHeaderValue(BUNDLE_MANIFESTVERSION);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public Version getBundleVersion()
   {
      return getParsedHeaderValueUnchecked(BUNDLE_VERSION);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setBundleVersion(Version version)
   {
      setHeader(BUNDLE_VERSION, version);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public BundleSymbolicName getBundleSymbolicName()
   {
      return getParsedHeaderValueUnchecked(BUNDLE_SYMBOLICNAME);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setBundleSymbolicName(BundleSymbolicName bundleSymbolicName)
   {
      setHeader(BUNDLE_SYMBOLICNAME, bundleSymbolicName);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public FragmentHost getFragmentHost()
   {
      return getParsedHeaderValueUnchecked(FRAGMENT_HOST);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setFragmentHost(FragmentHost fragmentHost)
   {
      setHeader(FRAGMENT_HOST, fragmentHost);
   }

} // BundleManifestImpl

