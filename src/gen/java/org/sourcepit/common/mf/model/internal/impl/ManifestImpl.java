/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.mf.model.internal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.sourcepit.common.mf.internal.model.Manifest;
import org.sourcepit.common.mf.internal.model.ManifestPackage;
import org.sourcepit.common.mf.internal.model.Section;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Manifest</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.common.mf.model.internal.impl.ManifestImpl#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ManifestImpl extends AbstractSectionImpl implements Manifest
{
   /**
    * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list. <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * 
    * @see #getSections()
    * @generated
    * @ordered
    */
   protected EList<Section> sections;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected ManifestImpl()
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
      return ManifestPackage.Literals.MANIFEST;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<Section> getSections()
   {
      if (sections == null)
      {
         sections = new EObjectContainmentEList<Section>(Section.class, this, ManifestPackage.MANIFEST__SECTIONS);
      }
      return sections;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getVersion()
   {
      // TODO: implement this method
      // Ensure that you remove @generated or mark it @generated NOT
      throw new UnsupportedOperationException();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public Section getSection(String name)
   {
      // TODO: implement this method
      // Ensure that you remove @generated or mark it @generated NOT
      throw new UnsupportedOperationException();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public Section getSection(String name, boolean createOnDemand)
   {
      // TODO: implement this method
      // Ensure that you remove @generated or mark it @generated NOT
      throw new UnsupportedOperationException();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setVersion(String version)
   {
      // TODO: implement this method
      // Ensure that you remove @generated or mark it @generated NOT
      throw new UnsupportedOperationException();
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
         case ManifestPackage.MANIFEST__SECTIONS :
            return ((InternalEList<?>) getSections()).basicRemove(otherEnd, msgs);
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
         case ManifestPackage.MANIFEST__SECTIONS :
            return getSections();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
         case ManifestPackage.MANIFEST__SECTIONS :
            getSections().clear();
            getSections().addAll((Collection<? extends Section>) newValue);
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
         case ManifestPackage.MANIFEST__SECTIONS :
            getSections().clear();
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
         case ManifestPackage.MANIFEST__SECTIONS :
            return sections != null && !sections.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // ManifestImpl
