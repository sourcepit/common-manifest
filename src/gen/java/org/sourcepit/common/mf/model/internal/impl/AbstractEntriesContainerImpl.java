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
import org.sourcepit.common.mf.internal.model.AbstractEntriesContainer;
import org.sourcepit.common.mf.internal.model.ManifestPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Abstract Entries Container</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.common.mf.model.internal.impl.AbstractEntriesContainerImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class AbstractEntriesContainerImpl extends EObjectImpl implements AbstractEntriesContainer
{
   /**
    * The cached value of the '{@link #getEntries() <em>Entries</em>}' map. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @see #getEntries()
    * @generated
    * @ordered
    */
   protected EMap<String, String> entries;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected AbstractEntriesContainerImpl()
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
      return ManifestPackage.Literals.ABSTRACT_ENTRIES_CONTAINER;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EMap<String, String> getEntries()
   {
      if (entries == null)
      {
         entries = new EcoreEMap<String, String>(ManifestPackage.Literals.EMAP_ENTRY, EMapEntryImpl.class, this,
            ManifestPackage.ABSTRACT_ENTRIES_CONTAINER__ENTRIES);
      }
      return entries;
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
         case ManifestPackage.ABSTRACT_ENTRIES_CONTAINER__ENTRIES :
            return ((InternalEList<?>) getEntries()).basicRemove(otherEnd, msgs);
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
         case ManifestPackage.ABSTRACT_ENTRIES_CONTAINER__ENTRIES :
            if (coreType)
               return getEntries();
            else
               return getEntries().map();
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
         case ManifestPackage.ABSTRACT_ENTRIES_CONTAINER__ENTRIES :
            ((EStructuralFeature.Setting) getEntries()).set(newValue);
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
         case ManifestPackage.ABSTRACT_ENTRIES_CONTAINER__ENTRIES :
            getEntries().clear();
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
         case ManifestPackage.ABSTRACT_ENTRIES_CONTAINER__ENTRIES :
            return entries != null && !entries.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // AbstractEntriesContainerImpl
