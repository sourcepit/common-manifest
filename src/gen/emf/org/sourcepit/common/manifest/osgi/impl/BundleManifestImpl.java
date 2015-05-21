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

package org.sourcepit.common.manifest.osgi.impl;

import static org.sourcepit.common.manifest.osgi.BundleHeaderName.BUNDLE_ACTIVATIONPOLICY;
import static org.sourcepit.common.manifest.osgi.BundleHeaderName.BUNDLE_ACTIVATOR;
import static org.sourcepit.common.manifest.osgi.BundleHeaderName.BUNDLE_CLASSPATH;
import static org.sourcepit.common.manifest.osgi.BundleHeaderName.BUNDLE_LICENSE;
import static org.sourcepit.common.manifest.osgi.BundleHeaderName.BUNDLE_MANIFESTVERSION;
import static org.sourcepit.common.manifest.osgi.BundleHeaderName.BUNDLE_REQUIREDEXECUTIONENVIRONMENT;
import static org.sourcepit.common.manifest.osgi.BundleHeaderName.BUNDLE_SYMBOLICNAME;
import static org.sourcepit.common.manifest.osgi.BundleHeaderName.BUNDLE_VERSION;
import static org.sourcepit.common.manifest.osgi.BundleHeaderName.DYNAMICIMPORT_PACKAGE;
import static org.sourcepit.common.manifest.osgi.BundleHeaderName.EXPORT_PACKAGE;
import static org.sourcepit.common.manifest.osgi.BundleHeaderName.FRAGMENT_HOST;
import static org.sourcepit.common.manifest.osgi.BundleHeaderName.IMPORT_PACKAGE;
import static org.sourcepit.common.manifest.osgi.BundleHeaderName.REQUIRE_BUNDLE;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.sourcepit.common.manifest.Header;
import org.sourcepit.common.manifest.impl.ManifestImpl;
import org.sourcepit.common.manifest.osgi.ActivationPolicy;
import org.sourcepit.common.manifest.osgi.BundleActivationPolicy;
import org.sourcepit.common.manifest.osgi.BundleHeaderName;
import org.sourcepit.common.manifest.osgi.BundleLicense;
import org.sourcepit.common.manifest.osgi.BundleManifest;
import org.sourcepit.common.manifest.osgi.BundleManifestFactory;
import org.sourcepit.common.manifest.osgi.BundleManifestPackage;
import org.sourcepit.common.manifest.osgi.BundleRequirement;
import org.sourcepit.common.manifest.osgi.BundleSymbolicName;
import org.sourcepit.common.manifest.osgi.ClassPathEntry;
import org.sourcepit.common.manifest.osgi.DynamicPackageImport;
import org.sourcepit.common.manifest.osgi.FragmentHost;
import org.sourcepit.common.manifest.osgi.PackageExport;
import org.sourcepit.common.manifest.osgi.PackageImport;
import org.sourcepit.common.manifest.osgi.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle Manifest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BundleManifestImpl extends ManifestImpl implements BundleManifest {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   protected BundleManifestImpl() {
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
   protected EClass eStaticClass() {
      return BundleManifestPackage.Literals.BUNDLE_MANIFEST;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public Header getHeader(BundleHeaderName name) {
      return getHeader(name.getLiteral());
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public BundleActivationPolicy getBundleActivationPolicy() {
      return getParsedHeaderValueUnchecked(BUNDLE_ACTIVATIONPOLICY);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public BundleActivationPolicy getBundleActivationPolicy(boolean createOnDemand) {
      BundleActivationPolicy activationPolicy = getBundleActivationPolicy();
      if (activationPolicy == null && createOnDemand) {
         setHeader(BUNDLE_ACTIVATIONPOLICY, BundleManifestFactory.eINSTANCE.createBundleActivationPolicy());
         activationPolicy = getBundleActivationPolicy();
      }
      return activationPolicy;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public BundleActivationPolicy setBundleActivationPolicy(ActivationPolicy activationPolicy) {
      return setBundleActivationPolicy(activationPolicy == null ? null : activationPolicy.getLiteral());
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public BundleActivationPolicy setBundleActivationPolicy(String activationPolicy) {
      setHeader(BUNDLE_ACTIVATIONPOLICY, activationPolicy);
      return getBundleActivationPolicy();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setBundleActivationPolicy(BundleActivationPolicy bundleActivationPolicy) {
      setHeader(BUNDLE_ACTIVATIONPOLICY, bundleActivationPolicy);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public String getBundleActivator() {
      return getHeaderValue(BUNDLE_ACTIVATOR);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setBundleActivator(String bundleActivator) {
      setHeader(BUNDLE_ACTIVATOR, bundleActivator);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EList<PackageExport> getExportPackage() {
      return getParsedHeaderValueUnchecked(EXPORT_PACKAGE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EList<PackageExport> getExportPackage(boolean createOnDemand) {
      EList<PackageExport> exportPackage = getExportPackage();
      if (exportPackage == null && createOnDemand) {
         setHeader(EXPORT_PACKAGE, new ArrayList<PackageExport>());
         exportPackage = getExportPackage();
      }
      return exportPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setExportPackage(List<PackageExport> packageExports) {
      setHeader(EXPORT_PACKAGE, packageExports);
   }

   @SuppressWarnings("unchecked")
   protected <T> T getParsedHeaderValueUnchecked(BundleHeaderName name) {
      return (T) getParsedHeaderValue(name);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EList<PackageImport> getImportPackage() {
      return getParsedHeaderValueUnchecked(IMPORT_PACKAGE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EList<PackageImport> getImportPackage(boolean createOnDemand) {
      EList<PackageImport> importPackage = getImportPackage();
      if (importPackage == null && createOnDemand) {
         setHeader(IMPORT_PACKAGE, new ArrayList<PackageImport>());
         importPackage = getImportPackage();
      }
      return importPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setImportPackage(List<PackageImport> packageImports) {
      setHeader(IMPORT_PACKAGE, packageImports);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EList<DynamicPackageImport> getDynamicImportPackage() {
      return getParsedHeaderValueUnchecked(DYNAMICIMPORT_PACKAGE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EList<DynamicPackageImport> getDynamicImportPackage(boolean createOnDemand) {
      EList<DynamicPackageImport> importPackage = getDynamicImportPackage();
      if (importPackage == null && createOnDemand) {
         setHeader(DYNAMICIMPORT_PACKAGE, new ArrayList<DynamicPackageImport>());
         importPackage = getDynamicImportPackage();
      }
      return importPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setDynamicImportPackage(List<DynamicPackageImport> dynamicPackageImports) {
      setHeader(DYNAMICIMPORT_PACKAGE, dynamicPackageImports);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EList<BundleRequirement> getRequireBundle() {
      return getParsedHeaderValueUnchecked(REQUIRE_BUNDLE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EList<BundleRequirement> getRequireBundle(boolean createOnDemand) {
      EList<BundleRequirement> bundleRequirements = getRequireBundle();
      if (bundleRequirements == null && createOnDemand) {
         setHeader(REQUIRE_BUNDLE, new ArrayList<BundleRequirement>());
         bundleRequirements = getRequireBundle();
      }
      return bundleRequirements;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setRequireBundle(List<BundleRequirement> bundleRequirements) {
      setHeader(REQUIRE_BUNDLE, bundleRequirements);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EList<ClassPathEntry> getBundleClassPath() {
      return getParsedHeaderValueUnchecked(BUNDLE_CLASSPATH);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EList<ClassPathEntry> getBundleClassPath(boolean createOnDemand) {
      EList<ClassPathEntry> classPathEntries = getBundleClassPath();
      if (classPathEntries == null && createOnDemand) {
         setHeader(BUNDLE_CLASSPATH, new ArrayList<ClassPathEntry>());
         classPathEntries = getBundleClassPath();
      }
      return classPathEntries;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setBundleClassPath(List<ClassPathEntry> classPathEntries) {
      setHeader(BUNDLE_CLASSPATH, classPathEntries);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EList<BundleLicense> getBundleLicense() {
      return getParsedHeaderValueUnchecked(BUNDLE_LICENSE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EList<BundleLicense> getBundleLicense(boolean createOnDemand) {
      EList<BundleLicense> licenses = getBundleLicense();
      if (licenses == null && createOnDemand) {
         setHeader(BUNDLE_LICENSE, new ArrayList<ClassPathEntry>());
         licenses = getBundleLicense();
      }
      return licenses;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setBundleLicense(List<BundleLicense> bundleLicenses) {
      setHeader(BUNDLE_LICENSE, bundleLicenses);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setHeader(BundleHeaderName name, String value) {
      setHeader(name.getLiteral(), value);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setHeader(BundleHeaderName name, Object parsedValue) {
      setHeader(name.getLiteral(), parsedValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public String getHeaderValue(BundleHeaderName name) {
      return getHeaderValue(name.getLiteral());
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public Object getParsedHeaderValue(BundleHeaderName name) {
      return getParsedHeaderValue(name.getLiteral());
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public String getBundleManifestVersion() {
      return getHeaderValue(BUNDLE_MANIFESTVERSION);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public Version getBundleVersion() {
      return getParsedHeaderValueUnchecked(BUNDLE_VERSION);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public Version setBundleVersion(String version) {
      setHeader(BUNDLE_VERSION, version);
      return getBundleVersion();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setBundleVersion(Version version) {
      setHeader(BUNDLE_VERSION, version);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public BundleSymbolicName getBundleSymbolicName() {
      return getParsedHeaderValueUnchecked(BUNDLE_SYMBOLICNAME);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public BundleSymbolicName getBundleSymbolicName(boolean createOnDemand) {
      BundleSymbolicName symbolicName = getBundleSymbolicName();
      if (symbolicName == null && createOnDemand) {
         setHeader(BUNDLE_SYMBOLICNAME, BundleManifestFactory.eINSTANCE.createBundleSymbolicName());
         symbolicName = getBundleSymbolicName();
      }
      return symbolicName;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public BundleSymbolicName setBundleSymbolicName(String bundleSymbolicName) {
      setHeader(BUNDLE_SYMBOLICNAME, bundleSymbolicName);
      return getBundleSymbolicName();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setBundleSymbolicName(BundleSymbolicName bundleSymbolicName) {
      setHeader(BUNDLE_SYMBOLICNAME, bundleSymbolicName);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public EList<String> getBundleRequiredExecutionEnvironment() {
      return getParsedHeaderValueUnchecked(BundleHeaderName.BUNDLE_REQUIREDEXECUTIONENVIRONMENT);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setBundleRequiredExecutionEnvironment(String executionEnvironment) {
      setHeader(BUNDLE_REQUIREDEXECUTIONENVIRONMENT, executionEnvironment);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setBundleRequiredExecutionEnvironment(List<String> executionEnvironments) {
      setHeader(BUNDLE_REQUIREDEXECUTIONENVIRONMENT, executionEnvironments);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public FragmentHost getFragmentHost() {
      return getParsedHeaderValueUnchecked(FRAGMENT_HOST);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public FragmentHost getFragmentHost(boolean createOnDemand) {
      FragmentHost fragmentHost = getFragmentHost();
      if (fragmentHost == null && createOnDemand) {
         setHeader(FRAGMENT_HOST, BundleManifestFactory.eINSTANCE.createFragmentHost());
         fragmentHost = getFragmentHost();
      }
      return fragmentHost;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public FragmentHost setFragmentHost(String fragmentHost) {
      setHeader(FRAGMENT_HOST, fragmentHost);
      return getFragmentHost();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setFragmentHost(FragmentHost fragmentHost) {
      setHeader(FRAGMENT_HOST, fragmentHost);
   }

} // BundleManifestImpl

