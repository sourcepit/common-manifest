/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sourcepit.common.manifest.osgi.BundleManifestPackage;
import org.sourcepit.common.manifest.osgi.BundleSymbolicName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle Symbolic Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.common.manifest.osgi.impl.BundleSymbolicNameImpl#getSymbolicName <em>Symbolic Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BundleSymbolicNameImpl extends ParameterizedImpl implements BundleSymbolicName
{
   /**
    * The default value of the '{@link #getSymbolicName() <em>Symbolic Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getSymbolicName()
    * @generated
    * @ordered
    */
   protected static final String SYMBOLIC_NAME_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getSymbolicName() <em>Symbolic Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getSymbolicName()
    * @generated
    * @ordered
    */
   protected String symbolicName = SYMBOLIC_NAME_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected BundleSymbolicNameImpl()
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
      return BundleManifestPackage.Literals.BUNDLE_SYMBOLIC_NAME;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getSymbolicName()
   {
      return symbolicName;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setSymbolicName(String newSymbolicName)
   {
      String oldSymbolicName = symbolicName;
      symbolicName = newSymbolicName;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET,
            BundleManifestPackage.BUNDLE_SYMBOLIC_NAME__SYMBOLIC_NAME, oldSymbolicName, symbolicName));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public boolean isSingleton()
   {
      final Boolean singleton = (Boolean) getParsedParameterValue("singleton");
      return singleton == null ? false : singleton.booleanValue();
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
         case BundleManifestPackage.BUNDLE_SYMBOLIC_NAME__SYMBOLIC_NAME :
            return getSymbolicName();
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
         case BundleManifestPackage.BUNDLE_SYMBOLIC_NAME__SYMBOLIC_NAME :
            setSymbolicName((String) newValue);
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
         case BundleManifestPackage.BUNDLE_SYMBOLIC_NAME__SYMBOLIC_NAME :
            setSymbolicName(SYMBOLIC_NAME_EDEFAULT);
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
         case BundleManifestPackage.BUNDLE_SYMBOLIC_NAME__SYMBOLIC_NAME :
            return SYMBOLIC_NAME_EDEFAULT == null ? symbolicName != null : !SYMBOLIC_NAME_EDEFAULT.equals(symbolicName);
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public String toString()
   {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (symbolicName: ");
      result.append(symbolicName);
      result.append(')');
      return result.toString();
   }

} // BundleSymbolicNameImpl
