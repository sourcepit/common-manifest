/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Activation Policy</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.common.manifest.osgi.BundleActivationPolicy#getPolicy <em>Policy</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getBundleActivationPolicy()
 * @model
 * @generated
 */
public interface BundleActivationPolicy extends Parameterized
{
   /**
    * Returns the value of the '<em><b>Policy</b></em>' attribute.
    * The default value is <code>"EAGER"</code>.
    * The literals are from the enumeration {@link org.sourcepit.common.manifest.osgi.ActivationPolicy}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Policy</em>' attribute isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Policy</em>' attribute.
    * @see org.sourcepit.common.manifest.osgi.ActivationPolicy
    * @see #setPolicy(ActivationPolicy)
    * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getBundleActivationPolicy_Policy()
    * @model default="EAGER" required="true"
    * @generated
    */
   ActivationPolicy getPolicy();

   /**
    * Sets the value of the '{@link org.sourcepit.common.manifest.osgi.BundleActivationPolicy#getPolicy <em>Policy</em>}
    * ' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Policy</em>' attribute.
    * @see org.sourcepit.common.manifest.osgi.ActivationPolicy
    * @see #getPolicy()
    * @generated
    */
   void setPolicy(ActivationPolicy value);

} // BundleActivationPolicy
