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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Package Import</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getDynamicPackageImport()
 * @model
 * @generated
 */
public interface DynamicPackageImport extends PackagesDeclaration {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation" dataType="org.sourcepit.common.manifest.osgi.VersionRange"
    * @generated
    */
   VersionRange getVersion();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model versionDataType="org.sourcepit.common.manifest.osgi.VersionRange"
    * @generated
    */
   void setVersion(VersionRange version);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation" dataType="org.sourcepit.common.manifest.osgi.VersionRange"
    * @generated
    */
   VersionRange getBundleVersion();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model bundleVersionDataType="org.sourcepit.common.manifest.osgi.VersionRange"
    * @generated
    */
   void setBundleVersion(VersionRange bundleVersion);

} // DynamicPackageImport
