/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parseable</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.common.manifest.Parseable#getParsedValue <em>Parsed Value</em>}</li>
 * <li>{@link org.sourcepit.common.manifest.Parseable#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.common.manifest.ManifestPackage#getParseable()
 * @model abstract="true"
 * @generated
 */
public interface Parseable extends EObject
{
   /**
    * Returns the value of the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Value</em>' attribute.
    * @see #setValue(String)
    * @see org.sourcepit.common.manifest.ManifestPackage#getParseable_Value()
    * @model
    * @generated
    */
   String getValue();

   /**
    * Sets the value of the '{@link org.sourcepit.common.manifest.Parseable#getValue <em>Value</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Value</em>' attribute.
    * @see #getValue()
    * @generated NOT
    */
   String setValue(String value);

   /**
    * Returns the value of the '<em><b>Parsed Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Parsed Value</em>' attribute.
    * @see #setParsedValue(Object)
    * @see org.sourcepit.common.manifest.ManifestPackage#getParseable_ParsedValue()
    * @model transient="true"
    * @generated
    */
   Object getParsedValue();

   /**
    * Sets the value of the '{@link org.sourcepit.common.manifest.Parseable#getParsedValue <em>Parsed Value</em>}'
    * attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Parsed Value</em>' attribute.
    * @see #getParsedValue()
    * @generated
    */
   void setParsedValue(Object value);

} // Parseable
