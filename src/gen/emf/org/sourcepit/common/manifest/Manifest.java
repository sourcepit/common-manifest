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

package org.sourcepit.common.manifest;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.common.manifest.Manifest#getHeaders <em>Headers</em>}</li>
 * <li>{@link org.sourcepit.common.manifest.Manifest#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.common.manifest.ManifestPackage#getManifest()
 * @model
 * @generated
 */
public interface Manifest extends AbstractSection {
   /**
    * Returns the value of the '<em><b>Headers</b></em>' map.
    * The key is of type {@link java.lang.String},
    * and the value is of type {@link java.lang.String},
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Headers</em>' map isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Headers</em>' map.
    * @see org.sourcepit.common.manifest.ManifestPackage#getManifest_Headers()
    * @model
    *        mapType=
    *        "org.sourcepit.common.manifest.HeaderEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
    * @generated
    */
   EMap<String, String> getHeaders();

   /**
    * Returns the value of the '<em><b>Sections</b></em>' map.
    * The key is of type {@link java.lang.String},
    * and the value is of type list of {@link java.util.Map.Entry<java.lang.String, java.lang.String>},
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Sections</em>' map isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Sections</em>' map.
    * @see org.sourcepit.common.manifest.ManifestPackage#getManifest_Sections()
    * @model mapType=
    *        "org.sourcepit.common.manifest.SectionEntry<org.eclipse.emf.ecore.EString, org.sourcepit.common.manifest.HeaderEntry>"
    * @generated
    */
   EMap<String, EMap<String, String>> getSections();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   ManifestSection getSection(String name, boolean createOnDemand);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model nameRequired="true"
    * @generated
    */
   void setHeader(HeaderName name, String value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model nameRequired="true"
    * @generated
    */
   void setHeader(HeaderName name, Object parsedValue);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   Header getHeader(HeaderName name);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   String getHeaderValue(HeaderName name);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   Object getParsedHeaderValue(HeaderName name);

} // Manifest
