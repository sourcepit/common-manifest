/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.sourcepit.common.manifest.osgi.ActivationPolicy;
import org.sourcepit.common.manifest.osgi.BundleActivationPolicy;
import org.sourcepit.common.manifest.osgi.BundleManifestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle Activation Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.common.manifest.osgi.impl.BundleActivationPolicyImpl#getPolicy <em>Policy</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BundleActivationPolicyImpl extends ParameterizedImpl implements BundleActivationPolicy
{
   /**
    * The default value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getPolicy()
    * @generated
    * @ordered
    */
   protected static final ActivationPolicy POLICY_EDEFAULT = ActivationPolicy.EAGER;

   /**
    * The cached value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getPolicy()
    * @generated
    * @ordered
    */
   protected ActivationPolicy policy = POLICY_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected BundleActivationPolicyImpl()
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
      return BundleManifestPackage.Literals.BUNDLE_ACTIVATION_POLICY;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public ActivationPolicy getPolicy()
   {
      return policy;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setPolicy(ActivationPolicy newPolicy)
   {
      ActivationPolicy oldPolicy = policy;
      policy = newPolicy == null ? POLICY_EDEFAULT : newPolicy;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, BundleManifestPackage.BUNDLE_ACTIVATION_POLICY__POLICY,
            oldPolicy, policy));
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
         case BundleManifestPackage.BUNDLE_ACTIVATION_POLICY__POLICY :
            return getPolicy();
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
         case BundleManifestPackage.BUNDLE_ACTIVATION_POLICY__POLICY :
            setPolicy((ActivationPolicy) newValue);
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
         case BundleManifestPackage.BUNDLE_ACTIVATION_POLICY__POLICY :
            setPolicy(POLICY_EDEFAULT);
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
         case BundleManifestPackage.BUNDLE_ACTIVATION_POLICY__POLICY :
            return policy != POLICY_EDEFAULT;
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
      result.append(" (policy: ");
      result.append(policy);
      result.append(')');
      return result.toString();
   }

} // BundleActivationPolicyImpl
