/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packages Declaration</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.common.manifest.osgi.PackagesDeclaration#getPackageNames <em>Package Names</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getPackagesDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface PackagesDeclaration extends Parameterized
{
   /**
    * Returns the value of the '<em><b>Package Names</b></em>' attribute list.
    * The list contents are of type {@link java.lang.String}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Package Names</em>' attribute list isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Package Names</em>' attribute list.
    * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getPackagesDeclaration_PackageNames()
    * @model required="true"
    * @generated
    */
   EList<String> getPackageNames();

} // PackagesDeclaration
