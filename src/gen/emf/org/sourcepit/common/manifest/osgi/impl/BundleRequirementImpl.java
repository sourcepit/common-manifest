/*
 * Copyright 2014 Bernd Vogt and others.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sourcepit.common.manifest.osgi.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.sourcepit.common.manifest.osgi.BundleManifestPackage;
import org.sourcepit.common.manifest.osgi.BundleRequirement;
import org.sourcepit.common.manifest.osgi.VersionRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bundle Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.common.manifest.osgi.impl.BundleRequirementImpl#getSymbolicNames <em>Symbolic Names</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BundleRequirementImpl extends ParameterizedImpl implements BundleRequirement
{
   /**
    * The cached value of the '{@link #getSymbolicNames() <em>Symbolic Names</em>}' attribute list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getSymbolicNames()
    * @generated
    * @ordered
    */
   protected EList<String> symbolicNames;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected BundleRequirementImpl()
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
      return BundleManifestPackage.Literals.BUNDLE_REQUIREMENT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<String> getSymbolicNames()
   {
      if (symbolicNames == null)
      {
         symbolicNames = new EDataTypeUniqueEList<String>(String.class, this,
            BundleManifestPackage.BUNDLE_REQUIREMENT__SYMBOLIC_NAMES);
      }
      return symbolicNames;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public VersionRange getBundleVersion()
   {
      return (VersionRange) getParsedParameterValue("bundle-version");
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setBundleVersion(VersionRange bundleVersion)
   {
      PackageImportImpl.setVersionRange(this, bundleVersion, true);
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
         case BundleManifestPackage.BUNDLE_REQUIREMENT__SYMBOLIC_NAMES :
            return getSymbolicNames();
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
         case BundleManifestPackage.BUNDLE_REQUIREMENT__SYMBOLIC_NAMES :
            getSymbolicNames().clear();
            getSymbolicNames().addAll((Collection<? extends String>) newValue);
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
         case BundleManifestPackage.BUNDLE_REQUIREMENT__SYMBOLIC_NAMES :
            getSymbolicNames().clear();
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
         case BundleManifestPackage.BUNDLE_REQUIREMENT__SYMBOLIC_NAMES :
            return symbolicNames != null && !symbolicNames.isEmpty();
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
      result.append(" (symbolicNames: ");
      result.append(symbolicNames);
      result.append(')');
      return result.toString();
   }

} // BundleRequirementImpl
