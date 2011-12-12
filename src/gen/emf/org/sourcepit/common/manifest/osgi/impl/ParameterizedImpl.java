/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.sourcepit.common.manifest.osgi.BundleManifestPackage;
import org.sourcepit.common.manifest.osgi.Parameter;
import org.sourcepit.common.manifest.osgi.Parameterized;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameterized</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.common.manifest.osgi.impl.ParameterizedImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class ParameterizedImpl extends EObjectImpl implements Parameterized
{
   /**
    * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getParameters()
    * @generated
    * @ordered
    */
   protected EList<Parameter> parameters;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected ParameterizedImpl()
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
      return BundleManifestPackage.Literals.PARAMETERIZED;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<Parameter> getParameters()
   {
      if (parameters == null)
      {
         parameters = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this,
            BundleManifestPackage.PARAMETERIZED__PARAMETERS, BundleManifestPackage.PARAMETER__PARAMETERIZED);
      }
      return parameters;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public Parameter getParameter(String name)
   {
      for (Parameter parameter : getParameters())
      {
         if (name.equals(parameter.getName()))
         {
            return parameter;
         }
      }
      return null;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public String getParameterValue(String name)
   {
      final Parameter parameter = getParameter(name);
      if (parameter == null)
      {
         return null;
      }
      return parameter.getValue();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public Object getParsedParameterValue(String name)
   {
      final Parameter parameter = getParameter(name);
      if (parameter == null)
      {
         return null;
      }
      return parameter.getParsedValue();
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
         case BundleManifestPackage.PARAMETERIZED__PARAMETERS :
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getParameters()).basicAdd(otherEnd, msgs);
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
         case BundleManifestPackage.PARAMETERIZED__PARAMETERS :
            return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
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
         case BundleManifestPackage.PARAMETERIZED__PARAMETERS :
            return getParameters();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
         case BundleManifestPackage.PARAMETERIZED__PARAMETERS :
            getParameters().clear();
            getParameters().addAll((Collection<? extends Parameter>) newValue);
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
         case BundleManifestPackage.PARAMETERIZED__PARAMETERS :
            getParameters().clear();
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
         case BundleManifestPackage.PARAMETERIZED__PARAMETERS :
            return parameters != null && !parameters.isEmpty();
      }
      return super.eIsSet(featureID);
   }

} // ParameterizedImpl
