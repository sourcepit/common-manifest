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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterized</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.common.manifest.osgi.Parameterized#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getParameterized()
 * @model abstract="true"
 * @generated
 */
public interface Parameterized extends EObject
{
   /**
    * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.common.manifest.osgi.Parameter}.
    * It is bidirectional and its opposite is '{@link org.sourcepit.common.manifest.osgi.Parameter#getParameterized
    * <em>Parameterized</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear, there really should be more of
    * a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Parameters</em>' containment reference list.
    * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getParameterized_Parameters()
    * @see org.sourcepit.common.manifest.osgi.Parameter#getParameterized
    * @model opposite="parameterized" containment="true"
    * @generated
    */
   EList<Parameter> getParameters();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   Parameter getParameter(String name);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   String getParameterValue(String name);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   Object getParsedParameterValue(String name);

} // Parameterized
