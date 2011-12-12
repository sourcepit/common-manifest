/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.impl;

import java.util.Map.Entry;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.sourcepit.common.manifest.Header;
import org.sourcepit.common.manifest.HeaderName;
import org.sourcepit.common.manifest.Manifest;
import org.sourcepit.common.manifest.ManifestPackage;
import org.sourcepit.common.manifest.ManifestSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manifest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.common.manifest.impl.ManifestImpl#getHeaders <em>Headers</em>}</li>
 * <li>{@link org.sourcepit.common.manifest.impl.ManifestImpl#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ManifestImpl extends AbstractSectionImpl implements Manifest
{
   /**
    * The cached value of the '{@link #getHeaders() <em>Headers</em>}' map.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getHeaders()
    * @generated
    * @ordered
    */
   protected EMap<String, String> headers;

   /**
    * The cached value of the '{@link #getSections() <em>Sections</em>}' map.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getSections()
    * @generated
    * @ordered
    */
   protected EMap<String, EMap<String, String>> sections;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   protected ManifestImpl()
   {
      super();
      setHeader(HeaderName.MANIFEST_VERSION, "1.0");
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
      return ManifestPackage.Literals.MANIFEST;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EMap<String, String> getHeaders()
   {
      if (headers == null)
      {
         headers = new EcoreEMap<String, String>(ManifestPackage.Literals.HEADER_ENTRY, HeaderEntryImpl.class, this,
            ManifestPackage.MANIFEST__HEADERS, ManifestPackage.HEADER_ENTRY__MANIFEST);
      }
      return headers;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EMap<String, EMap<String, String>> getSections()
   {
      if (sections == null)
      {
         sections = new EcoreEMap<String, EMap<String, String>>(ManifestPackage.Literals.SECTION_ENTRY,
            SectionEntryImpl.class, this, ManifestPackage.MANIFEST__SECTIONS);
      }
      return sections;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public ManifestSection getSection(String name, boolean createOnDemand)
   {
      int idx = getSections().indexOfKey(name);
      if (idx < 0 && createOnDemand)
      {
         getSections().put(name, new BasicEMap<String, String>());
         idx = getSections().indexOfKey(name);
      }
      return idx > -1 ? (ManifestSection) getSections().get(idx) : null;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setHeader(HeaderName name, String value)
   {
      setHeader(name.getLiteral(), value);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public Header getHeader(HeaderName name)
   {
      return getHeader(name.getLiteral());
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public String getHeaderValue(HeaderName name)
   {
      return getHeaderValue(name.getLiteral());
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public Object getParsedHeaderValue(HeaderName name)
   {
      return getParsedHeaderValue(name.getLiteral());
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case ManifestPackage.MANIFEST__HEADERS :
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getHeaders()).basicAdd(otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case ManifestPackage.MANIFEST__HEADERS :
            return ((InternalEList<?>) getHeaders()).basicRemove(otherEnd, msgs);
         case ManifestPackage.MANIFEST__SECTIONS :
            return ((InternalEList<?>) getSections()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
         case ManifestPackage.MANIFEST__HEADERS :
            if (coreType)
               return getHeaders();
            else
               return getHeaders().map();
         case ManifestPackage.MANIFEST__SECTIONS :
            if (coreType)
               return getSections();
            else
               return getSections().map();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
         case ManifestPackage.MANIFEST__HEADERS :
            ((EStructuralFeature.Setting) getHeaders()).set(newValue);
            return;
         case ManifestPackage.MANIFEST__SECTIONS :
            ((EStructuralFeature.Setting) getSections()).set(newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public void eUnset(int featureID)
   {
      switch (featureID)
      {
         case ManifestPackage.MANIFEST__HEADERS :
            getHeaders().clear();
            return;
         case ManifestPackage.MANIFEST__SECTIONS :
            getSections().clear();
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID)
   {
      switch (featureID)
      {
         case ManifestPackage.MANIFEST__HEADERS :
            return headers != null && !headers.isEmpty();
         case ManifestPackage.MANIFEST__SECTIONS :
            return sections != null && !sections.isEmpty();
      }
      return super.eIsSet(featureID);
   }

   @Override
   public String toString()
   {
      StringBuilder sb = new StringBuilder();
      for (Entry<String, String> entry : headers)
      {
         sb.append(entry);
         sb.append('\n');
      }
      return sb.toString();
   }

} // ManifestImpl
