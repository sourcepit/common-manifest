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
