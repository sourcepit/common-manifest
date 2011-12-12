/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
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
public interface Manifest extends AbstractSection
{
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
    * and the value is of type list of {@link java.util.Map.Entry},
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
    * @model
    * @generated
    */
   void setHeader(HeaderName name, String value);

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
