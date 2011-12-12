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
 * 
 * @see org.sourcepit.common.manifest.ManifestPackage#getParseable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Parseable extends EObject
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation"
    * @generated
    */
   String getValue();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation"
    * @generated
    */
   Object getParsedValue();

} // Parseable
