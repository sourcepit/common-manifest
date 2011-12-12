/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Export</b></em>'.
 * <!-- end-user-doc -->
 * 
 * 
 * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getPackageExport()
 * @model
 * @generated
 */
public interface PackageExport extends PackagesDeclaration
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation" dataType="org.sourcepit.common.manifest.osgi.Version"
    * @generated
    */
   Version getVersion();

} // PackageExport
