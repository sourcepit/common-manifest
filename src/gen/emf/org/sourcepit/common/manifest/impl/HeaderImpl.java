/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.sourcepit.common.manifest.Header;
import org.sourcepit.common.manifest.Manifest;
import org.sourcepit.common.manifest.ManifestPackage;
import org.sourcepit.common.manifest.parser.HeaderParser;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public abstract class HeaderImpl extends EObjectImpl implements Header
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected HeaderImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   protected EClass eStaticClass()
   {
      return ManifestPackage.Literals.HEADER;
   }

   private transient Object parsedValue;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public Object getParsedValue()
   {
      if (parsedValue == null)
      {
         parsedValue = HeaderParser.INSTANCE.parse(this);
      }
      return parsedValue;
   }
   
   protected void unsetParsedValue()
   {
      parsedValue = null;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public abstract String getName();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public abstract String getValue();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public abstract String setValue(String name);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public Manifest getManifest()
   {
      // TODO: implement this method
      // Ensure that you remove @generated or mark it @generated NOT
      throw new UnsupportedOperationException();
   }

} // HeaderImpl
