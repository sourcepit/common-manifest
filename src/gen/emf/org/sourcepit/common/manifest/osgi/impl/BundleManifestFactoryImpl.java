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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.sourcepit.common.manifest.osgi.ActivationPolicy;
import org.sourcepit.common.manifest.osgi.BundleActivationPolicy;
import org.sourcepit.common.manifest.osgi.BundleHeaderName;
import org.sourcepit.common.manifest.osgi.BundleLicense;
import org.sourcepit.common.manifest.osgi.BundleManifest;
import org.sourcepit.common.manifest.osgi.BundleManifestFactory;
import org.sourcepit.common.manifest.osgi.BundleManifestPackage;
import org.sourcepit.common.manifest.osgi.BundleRequirement;
import org.sourcepit.common.manifest.osgi.BundleSymbolicName;
import org.sourcepit.common.manifest.osgi.ClassPathEntry;
import org.sourcepit.common.manifest.osgi.DynamicPackageImport;
import org.sourcepit.common.manifest.osgi.FragmentHost;
import org.sourcepit.common.manifest.osgi.PackageExport;
import org.sourcepit.common.manifest.osgi.PackageImport;
import org.sourcepit.common.manifest.osgi.Parameter;
import org.sourcepit.common.manifest.osgi.ParameterType;
import org.sourcepit.common.manifest.osgi.Version;
import org.sourcepit.common.manifest.osgi.VersionRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class BundleManifestFactoryImpl extends EFactoryImpl implements BundleManifestFactory {
   /**
    * Creates the default factory implementation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static BundleManifestFactory init() {
      try {
         BundleManifestFactory theBundleManifestFactory = (BundleManifestFactory) EPackage.Registry.INSTANCE.getEFactory(BundleManifestPackage.eNS_URI);
         if (theBundleManifestFactory != null) {
            return theBundleManifestFactory;
         }
      }
      catch (Exception exception) {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new BundleManifestFactoryImpl();
   }

   /**
    * Creates an instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public BundleManifestFactoryImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public EObject create(EClass eClass) {
      switch (eClass.getClassifierID()) {
         case BundleManifestPackage.BUNDLE_MANIFEST :
            return createBundleManifest();
         case BundleManifestPackage.PARAMETER :
            return createParameter();
         case BundleManifestPackage.BUNDLE_ACTIVATION_POLICY :
            return createBundleActivationPolicy();
         case BundleManifestPackage.PACKAGE_EXPORT :
            return createPackageExport();
         case BundleManifestPackage.PACKAGE_IMPORT :
            return createPackageImport();
         case BundleManifestPackage.BUNDLE_REQUIREMENT :
            return createBundleRequirement();
         case BundleManifestPackage.BUNDLE_SYMBOLIC_NAME :
            return createBundleSymbolicName();
         case BundleManifestPackage.CLASS_PATH_ENTRY :
            return createClassPathEntry();
         case BundleManifestPackage.FRAGMENT_HOST :
            return createFragmentHost();
         case BundleManifestPackage.DYNAMIC_PACKAGE_IMPORT :
            return createDynamicPackageImport();
         case BundleManifestPackage.BUNDLE_LICENSE :
            return createBundleLicense();
         default :
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public Object createFromString(EDataType eDataType, String initialValue) {
      switch (eDataType.getClassifierID()) {
         case BundleManifestPackage.BUNDLE_HEADER_NAME :
            return createBundleHeaderNameFromString(eDataType, initialValue);
         case BundleManifestPackage.ACTIVATION_POLICY :
            return createActivationPolicyFromString(eDataType, initialValue);
         case BundleManifestPackage.PARAMETER_TYPE :
            return createParameterTypeFromString(eDataType, initialValue);
         case BundleManifestPackage.ELIST :
            return createEListFromString(eDataType, initialValue);
         case BundleManifestPackage.VERSION :
            return createVersionFromString(eDataType, initialValue);
         case BundleManifestPackage.VERSION_RANGE :
            return createVersionRangeFromString(eDataType, initialValue);
         default :
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public String convertToString(EDataType eDataType, Object instanceValue) {
      switch (eDataType.getClassifierID()) {
         case BundleManifestPackage.BUNDLE_HEADER_NAME :
            return convertBundleHeaderNameToString(eDataType, instanceValue);
         case BundleManifestPackage.ACTIVATION_POLICY :
            return convertActivationPolicyToString(eDataType, instanceValue);
         case BundleManifestPackage.PARAMETER_TYPE :
            return convertParameterTypeToString(eDataType, instanceValue);
         case BundleManifestPackage.ELIST :
            return convertEListToString(eDataType, instanceValue);
         case BundleManifestPackage.VERSION :
            return convertVersionToString(eDataType, instanceValue);
         case BundleManifestPackage.VERSION_RANGE :
            return convertVersionRangeToString(eDataType, instanceValue);
         default :
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public Parameter createParameter() {
      ParameterImpl parameter = new ParameterImpl();
      return parameter;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public BundleActivationPolicy createBundleActivationPolicy() {
      BundleActivationPolicyImpl bundleActivationPolicy = new BundleActivationPolicyImpl();
      return bundleActivationPolicy;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public BundleManifest createBundleManifest() {
      BundleManifestImpl bundleManifest = new BundleManifestImpl();
      return bundleManifest;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public PackageExport createPackageExport() {
      PackageExportImpl packageExport = new PackageExportImpl();
      return packageExport;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public PackageImport createPackageImport() {
      PackageImportImpl packageImport = new PackageImportImpl();
      return packageImport;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public BundleRequirement createBundleRequirement() {
      BundleRequirementImpl bundleRequirement = new BundleRequirementImpl();
      return bundleRequirement;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public BundleSymbolicName createBundleSymbolicName() {
      BundleSymbolicNameImpl bundleSymbolicName = new BundleSymbolicNameImpl();
      return bundleSymbolicName;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public ClassPathEntry createClassPathEntry() {
      ClassPathEntryImpl classPathEntry = new ClassPathEntryImpl();
      return classPathEntry;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public FragmentHost createFragmentHost() {
      FragmentHostImpl fragmentHost = new FragmentHostImpl();
      return fragmentHost;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public DynamicPackageImport createDynamicPackageImport() {
      DynamicPackageImportImpl dynamicPackageImport = new DynamicPackageImportImpl();
      return dynamicPackageImport;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public BundleLicense createBundleLicense() {
      BundleLicenseImpl bundleLicense = new BundleLicenseImpl();
      return bundleLicense;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public BundleHeaderName createBundleHeaderNameFromString(EDataType eDataType, String initialValue) {
      BundleHeaderName result = BundleHeaderName.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String convertBundleHeaderNameToString(EDataType eDataType, Object instanceValue) {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public ParameterType createParameterTypeFromString(EDataType eDataType, String initialValue) {
      ParameterType result = ParameterType.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String convertParameterTypeToString(EDataType eDataType, Object instanceValue) {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public ActivationPolicy createActivationPolicyFromString(EDataType eDataType, String initialValue) {
      ActivationPolicy result = ActivationPolicy.get(initialValue);
      if (result == null)
         throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
            + eDataType.getName() + "'");
      return result;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String convertActivationPolicyToString(EDataType eDataType, Object instanceValue) {
      return instanceValue == null ? null : instanceValue.toString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public List<?> createEListFromString(EDataType eDataType, String initialValue) {
      return (List<?>) super.createFromString(initialValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String convertEListToString(EDataType eDataType, Object instanceValue) {
      return super.convertToString(instanceValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public Version createVersionFromString(EDataType eDataType, String initialValue) {
      return Version.parse(initialValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public String convertVersionToString(EDataType eDataType, Object instanceValue) {
      return ((Version) instanceValue).toMinimalString();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public VersionRange createVersionRangeFromString(EDataType eDataType, String initialValue) {
      return VersionRange.parse(initialValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String convertVersionRangeToString(EDataType eDataType, Object instanceValue) {
      return super.convertToString(eDataType, instanceValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public BundleManifestPackage getBundleManifestPackage() {
      return (BundleManifestPackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @deprecated
    * @generated
    */
   @Deprecated
   public static BundleManifestPackage getPackage() {
      return BundleManifestPackage.eINSTANCE;
   }

} // BundleManifestFactoryImpl
