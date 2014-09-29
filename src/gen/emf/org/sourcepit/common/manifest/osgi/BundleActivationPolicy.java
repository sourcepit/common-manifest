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
    * The default value is <code>"eager"</code>.
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
    * @model default="eager" required="true"
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
