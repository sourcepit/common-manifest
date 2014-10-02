/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle License</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.common.manifest.osgi.BundleLicense#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getBundleLicense()
 * @model
 * @generated
 */
public interface BundleLicense extends Parameterized
{
   /**
    * Returns the value of the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Name</em>' attribute.
    * @see #setName(String)
    * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getBundleLicense_Name()
    * @model
    * @generated
    */
   String getName();

   /**
    * Sets the value of the '{@link org.sourcepit.common.manifest.osgi.BundleLicense#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   void setName(String value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation"
    * @generated
    */
   String getDescription();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   void setDescription(String description);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation"
    * @generated
    */
   String getLink();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   void setLink(String link);

} // BundleLicense
