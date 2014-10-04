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

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.sourcepit.common.manifest.Header;
import org.sourcepit.common.manifest.Manifest;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Manifest</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getBundleManifest()
 * @model
 * @generated
 */
public interface BundleManifest extends Manifest
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   Header getHeader(BundleHeaderName name);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   void setHeader(BundleHeaderName name, String value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model nameRequired="true"
    * @generated
    */
   void setHeader(BundleHeaderName name, Object parsedValue);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   String getHeaderValue(BundleHeaderName name);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   Object getParsedHeaderValue(BundleHeaderName name);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation"
    * @generated
    */
   String getBundleManifestVersion();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation" dataType="org.sourcepit.common.manifest.osgi.Version"
    * @generated
    */
   Version getBundleVersion();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model dataType="org.sourcepit.common.manifest.osgi.Version"
    * @generated
    */
   Version setBundleVersion(String version);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model versionDataType="org.sourcepit.common.manifest.osgi.Version"
    * @generated
    */
   void setBundleVersion(Version version);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation"
    * @generated
    */
   BundleSymbolicName getBundleSymbolicName();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   BundleSymbolicName getBundleSymbolicName(boolean createOnDemand);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   BundleSymbolicName setBundleSymbolicName(String bundleSymbolicName);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   void setBundleSymbolicName(BundleSymbolicName bundleSymbolicName);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation"
    * @generated
    */
   EList<String> getBundleRequiredExecutionEnvironment();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   void setBundleRequiredExecutionEnvironment(String executionEnvironment);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model executionEnvironmentsDataType="org.sourcepit.common.manifest.osgi.EList<org.eclipse.emf.ecore.EString>"
    *        executionEnvironmentsMany="false"
    * @generated
    */
   void setBundleRequiredExecutionEnvironment(List<String> executionEnvironments);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation"
    * @generated
    */
   FragmentHost getFragmentHost();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   FragmentHost getFragmentHost(boolean createOnDemand);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   FragmentHost setFragmentHost(String fragmentHost);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   void setFragmentHost(FragmentHost fragmentHost);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation"
    * @generated
    */
   BundleActivationPolicy getBundleActivationPolicy();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   BundleActivationPolicy getBundleActivationPolicy(boolean createOnDemand);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   BundleActivationPolicy setBundleActivationPolicy(ActivationPolicy activationPolicy);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   BundleActivationPolicy setBundleActivationPolicy(String activationPolicy);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   void setBundleActivationPolicy(BundleActivationPolicy bundleActivationPolicy);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation"
    * @generated
    */
   String getBundleActivator();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   void setBundleActivator(String bundleActivator);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation" many="false"
    * @generated
    */
   EList<PackageExport> getExportPackage();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model many="false"
    * @generated
    */
   EList<PackageExport> getExportPackage(boolean createOnDemand);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model packageExportsDataType=
    *        "org.sourcepit.common.manifest.osgi.EList<org.sourcepit.common.manifest.osgi.PackageExport>"
    *        packageExportsMany="false"
    * @generated
    */
   void setExportPackage(List<PackageExport> packageExports);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation" many="false"
    * @generated
    */
   EList<PackageImport> getImportPackage();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model many="false"
    * @generated
    */
   EList<PackageImport> getImportPackage(boolean createOnDemand);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model packageImportsDataType=
    *        "org.sourcepit.common.manifest.osgi.EList<org.sourcepit.common.manifest.osgi.PackageImport>"
    *        packageImportsMany="false"
    * @generated
    */
   void setImportPackage(List<PackageImport> packageImports);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation" many="false"
    * @generated
    */
   EList<DynamicPackageImport> getDynamicImportPackage();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model many="false"
    * @generated
    */
   EList<DynamicPackageImport> getDynamicImportPackage(boolean createOnDemand);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model dynamicPackageImportsDataType=
    *        "org.sourcepit.common.manifest.osgi.EList<org.sourcepit.common.manifest.osgi.DynamicPackageImport>"
    *        dynamicPackageImportsMany="false"
    * @generated
    */
   void setDynamicImportPackage(List<DynamicPackageImport> dynamicPackageImports);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation" many="false"
    * @generated
    */
   EList<BundleRequirement> getRequireBundle();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model many="false"
    * @generated
    */
   EList<BundleRequirement> getRequireBundle(boolean createOnDemand);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model bundleRequirementsDataType=
    *        "org.sourcepit.common.manifest.osgi.EList<org.sourcepit.common.manifest.osgi.BundleRequirement>"
    *        bundleRequirementsMany="false"
    * @generated
    */
   void setRequireBundle(List<BundleRequirement> bundleRequirements);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation" many="false"
    * @generated
    */
   EList<ClassPathEntry> getBundleClassPath();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model many="false"
    * @generated
    */
   EList<ClassPathEntry> getBundleClassPath(boolean createOnDemand);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model classPathEntriesDataType=
    *        "org.sourcepit.common.manifest.osgi.EList<org.sourcepit.common.manifest.osgi.ClassPathEntry>"
    *        classPathEntriesMany="false"
    * @generated
    */
   void setBundleClassPath(List<ClassPathEntry> classPathEntries);

} // BundleManifest
