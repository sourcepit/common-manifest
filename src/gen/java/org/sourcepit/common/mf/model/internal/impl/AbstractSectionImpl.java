/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.mf.model.internal.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.sourcepit.common.mf.internal.model.AbstractSection;
import org.sourcepit.common.mf.internal.model.ManifestPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Abstract Section</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.common.mf.model.internal.impl.AbstractSectionImpl#getHeaders <em>Headers</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class AbstractSectionImpl extends EObjectImpl implements AbstractSection
{
   /**
    * The cached value of the '{@link #getHeaders() <em>Headers</em>}' map. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @see #getHeaders()
    * @generated
    * @ordered
    */
   protected EMap<String, String> headers;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected AbstractSectionImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   protected EClass eStaticClass()
   {
      return ManifestPackage.Literals.ABSTRACT_SECTION;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EMap<String, String> getHeaders()
   {
      if (headers == null)
      {
         headers = new EcoreEMap<String, String>(ManifestPackage.Literals.EMAP_ENTRY, EMapEntryImpl.class, this,
            ManifestPackage.ABSTRACT_SECTION__HEADERS);
      }
      return headers;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case ManifestPackage.ABSTRACT_SECTION__HEADERS :
            return ((InternalEList<?>) getHeaders()).basicRemove(otherEnd, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
         case ManifestPackage.ABSTRACT_SECTION__HEADERS :
            if (coreType)
               return getHeaders();
            else
               return getHeaders().map();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
         case ManifestPackage.ABSTRACT_SECTION__HEADERS :
            ((EStructuralFeature.Setting) getHeaders()).set(newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public void eUnset(int featureID)
   {
      switch (featureID)
      {
         case ManifestPackage.ABSTRACT_SECTION__HEADERS :
            getHeaders().clear();
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID)
   {
      switch (featureID)
      {
         case ManifestPackage.ABSTRACT_SECTION__HEADERS :
            return headers != null && !headers.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // AbstractSectionImpl
