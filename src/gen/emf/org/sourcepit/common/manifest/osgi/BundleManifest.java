/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi;

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
    * @model kind="operation"
    * @generated
    */
   BundleSymbolicName getBundleSymbolicName();

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
    * @model kind="operation"
    * @generated
    */
   BundleActivationPolicy getBundleActivationPolicy();

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
    * @model kind="operation" many="false"
    * @generated
    */
   EList<PackageExport> getExportPackage();

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
    * @model kind="operation" many="false"
    * @generated
    */
   EList<PackageImport> getDynamicImportPackage();

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
    * @model kind="operation" many="false"
    * @generated
    */
   EList<ClassPathEntry> getBundleClassPath();

} // BundleManifest
