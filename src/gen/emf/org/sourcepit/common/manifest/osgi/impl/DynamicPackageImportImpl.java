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

import org.eclipse.emf.ecore.EClass;
import org.sourcepit.common.manifest.osgi.BundleManifestPackage;
import org.sourcepit.common.manifest.osgi.DynamicPackageImport;
import org.sourcepit.common.manifest.osgi.VersionRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Package Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DynamicPackageImportImpl extends PackagesDeclarationImpl implements DynamicPackageImport {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected DynamicPackageImportImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return BundleManifestPackage.Literals.DYNAMIC_PACKAGE_IMPORT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public VersionRange getVersion() {
      return (VersionRange) getParsedParameterValue("version");
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setVersion(VersionRange version) {
      PackageImportImpl.setVersionRange(this, version, false);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public VersionRange getBundleVersion() {
      return (VersionRange) getParsedParameterValue("bundle-version");
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setBundleVersion(VersionRange bundleVersion) {
      PackageImportImpl.setVersionRange(this, bundleVersion, true);
   }

} // DynamicPackageImportImpl
