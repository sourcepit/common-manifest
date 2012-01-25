/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
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
public interface DynamicPackageImport extends PackagesDeclaration
{
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
