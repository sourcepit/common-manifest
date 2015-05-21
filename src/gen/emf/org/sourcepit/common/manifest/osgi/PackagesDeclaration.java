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
public interface PackagesDeclaration extends Parameterized {
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
