/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.impl;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.sourcepit.common.manifest.AbstractSection;
import org.sourcepit.common.manifest.Header;
import org.sourcepit.common.manifest.ManifestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public abstract class AbstractSectionImpl extends EObjectImpl implements AbstractSection
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected AbstractSectionImpl()
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
      return ManifestPackage.Literals.ABSTRACT_SECTION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public Header getHeader(String name)
   {
      final int idx = getHeaders().indexOfKey(name);
      return idx > -1 ? (Header) getHeaders().get(idx) : null;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setHeader(String name, String value)
   {
      if (value == null)
      {
         getHeaders().removeKey(name);
      }
      else
      {
         getHeaders().put(name, value);
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setHeader(String name, Object parsedValue)
   {
      if (parsedValue == null)
      {
         getHeaders().removeKey(name);
      }
      else
      {
         getHeaders().put(name, null);
         getHeader(name).setParsedValue(parsedValue);
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public String getHeaderValue(String name)
   {
      return getHeaders().get(name);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public Object getParsedHeaderValue(String name)
   {
      final Header header = getHeader(name);
      if (header == null)
      {
         return null;
      }
      return header.getParsedValue();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public abstract EMap<String, String> getHeaders();

} // AbstractSectionImpl
