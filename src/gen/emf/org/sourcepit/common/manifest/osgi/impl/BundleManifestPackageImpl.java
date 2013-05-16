/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi.impl;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.sourcepit.common.manifest.ManifestPackage;
import org.sourcepit.common.manifest.impl.ManifestPackageImpl;
import org.sourcepit.common.manifest.osgi.ActivationPolicy;
import org.sourcepit.common.manifest.osgi.BundleActivationPolicy;
import org.sourcepit.common.manifest.osgi.BundleHeaderName;
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
import org.sourcepit.common.manifest.osgi.PackagesDeclaration;
import org.sourcepit.common.manifest.osgi.Parameter;
import org.sourcepit.common.manifest.osgi.ParameterType;
import org.sourcepit.common.manifest.osgi.Parameterized;
import org.sourcepit.common.manifest.osgi.Version;
import org.sourcepit.common.manifest.osgi.VersionRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class BundleManifestPackageImpl extends EPackageImpl implements BundleManifestPackage
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass parameterEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass parameterizedEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass bundleActivationPolicyEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass bundleManifestEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass packagesDeclarationEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass packageExportEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass packageImportEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass bundleRequirementEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass bundleSymbolicNameEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass classPathEntryEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass fragmentHostEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass dynamicPackageImportEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum bundleHeaderNameEEnum = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum parameterTypeEEnum = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum activationPolicyEEnum = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EDataType eListEDataType = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EDataType versionEDataType = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EDataType versionRangeEDataType = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
    * EPackage.Registry} by the package
    * package URI value.
    * <p>
    * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
    * performs initialization of the package, or returns the registered package, if one already exists. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private BundleManifestPackageImpl()
   {
      super(eNS_URI, BundleManifestFactory.eINSTANCE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>
    * This method is used to initialize {@link BundleManifestPackage#eINSTANCE} when that field is accessed. Clients
    * should not invoke it directly. Instead, they should simply access that field to obtain the package. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static BundleManifestPackage init()
   {
      if (isInited)
         return (BundleManifestPackage) EPackage.Registry.INSTANCE.getEPackage(BundleManifestPackage.eNS_URI);

      // Obtain or create and register package
      BundleManifestPackageImpl theBundleManifestPackage = (BundleManifestPackageImpl) (EPackage.Registry.INSTANCE
         .get(eNS_URI) instanceof BundleManifestPackageImpl
         ? EPackage.Registry.INSTANCE.get(eNS_URI)
         : new BundleManifestPackageImpl());

      isInited = true;

      // Obtain or create and register interdependencies
      ManifestPackageImpl theManifestPackage = (ManifestPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(ManifestPackage.eNS_URI) instanceof ManifestPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(ManifestPackage.eNS_URI) : ManifestPackage.eINSTANCE);

      // Create package meta-data objects
      theBundleManifestPackage.createPackageContents();
      theManifestPackage.createPackageContents();

      // Initialize created meta-data
      theBundleManifestPackage.initializePackageContents();
      theManifestPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theBundleManifestPackage.freeze();


      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(BundleManifestPackage.eNS_URI, theBundleManifestPackage);
      return theBundleManifestPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getParameter()
   {
      return parameterEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getParameter_Name()
   {
      return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getParameter_Quoted()
   {
      return (EAttribute) parameterEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getParameter_Type()
   {
      return (EAttribute) parameterEClass.getEStructuralFeatures().get(2);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getParameter_Parameterized()
   {
      return (EReference) parameterEClass.getEStructuralFeatures().get(3);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getParameterized()
   {
      return parameterizedEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getParameterized_Parameters()
   {
      return (EReference) parameterizedEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getBundleActivationPolicy()
   {
      return bundleActivationPolicyEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getBundleActivationPolicy_Policy()
   {
      return (EAttribute) bundleActivationPolicyEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getBundleManifest()
   {
      return bundleManifestEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getPackagesDeclaration()
   {
      return packagesDeclarationEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getPackagesDeclaration_PackageNames()
   {
      return (EAttribute) packagesDeclarationEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getPackageExport()
   {
      return packageExportEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getPackageImport()
   {
      return packageImportEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getBundleRequirement()
   {
      return bundleRequirementEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getBundleRequirement_SymbolicNames()
   {
      return (EAttribute) bundleRequirementEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getBundleSymbolicName()
   {
      return bundleSymbolicNameEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getBundleSymbolicName_SymbolicName()
   {
      return (EAttribute) bundleSymbolicNameEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getClassPathEntry()
   {
      return classPathEntryEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getClassPathEntry_Paths()
   {
      return (EAttribute) classPathEntryEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getFragmentHost()
   {
      return fragmentHostEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getFragmentHost_SymbolicName()
   {
      return (EAttribute) fragmentHostEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getDynamicPackageImport()
   {
      return dynamicPackageImportEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getBundleHeaderName()
   {
      return bundleHeaderNameEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getParameterType()
   {
      return parameterTypeEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getActivationPolicy()
   {
      return activationPolicyEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EDataType getEList()
   {
      return eListEDataType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EDataType getVersion()
   {
      return versionEDataType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EDataType getVersionRange()
   {
      return versionRangeEDataType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public BundleManifestFactory getBundleManifestFactory()
   {
      return (BundleManifestFactory) getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package. This method is
    * guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void createPackageContents()
   {
      if (isCreated)
         return;
      isCreated = true;

      // Create classes and their features
      bundleManifestEClass = createEClass(BUNDLE_MANIFEST);

      parameterizedEClass = createEClass(PARAMETERIZED);
      createEReference(parameterizedEClass, PARAMETERIZED__PARAMETERS);

      parameterEClass = createEClass(PARAMETER);
      createEAttribute(parameterEClass, PARAMETER__NAME);
      createEAttribute(parameterEClass, PARAMETER__QUOTED);
      createEAttribute(parameterEClass, PARAMETER__TYPE);
      createEReference(parameterEClass, PARAMETER__PARAMETERIZED);

      bundleActivationPolicyEClass = createEClass(BUNDLE_ACTIVATION_POLICY);
      createEAttribute(bundleActivationPolicyEClass, BUNDLE_ACTIVATION_POLICY__POLICY);

      packagesDeclarationEClass = createEClass(PACKAGES_DECLARATION);
      createEAttribute(packagesDeclarationEClass, PACKAGES_DECLARATION__PACKAGE_NAMES);

      packageExportEClass = createEClass(PACKAGE_EXPORT);

      packageImportEClass = createEClass(PACKAGE_IMPORT);

      bundleRequirementEClass = createEClass(BUNDLE_REQUIREMENT);
      createEAttribute(bundleRequirementEClass, BUNDLE_REQUIREMENT__SYMBOLIC_NAMES);

      bundleSymbolicNameEClass = createEClass(BUNDLE_SYMBOLIC_NAME);
      createEAttribute(bundleSymbolicNameEClass, BUNDLE_SYMBOLIC_NAME__SYMBOLIC_NAME);

      classPathEntryEClass = createEClass(CLASS_PATH_ENTRY);
      createEAttribute(classPathEntryEClass, CLASS_PATH_ENTRY__PATHS);

      fragmentHostEClass = createEClass(FRAGMENT_HOST);
      createEAttribute(fragmentHostEClass, FRAGMENT_HOST__SYMBOLIC_NAME);

      dynamicPackageImportEClass = createEClass(DYNAMIC_PACKAGE_IMPORT);

      // Create enums
      bundleHeaderNameEEnum = createEEnum(BUNDLE_HEADER_NAME);
      activationPolicyEEnum = createEEnum(ACTIVATION_POLICY);
      parameterTypeEEnum = createEEnum(PARAMETER_TYPE);

      // Create data types
      eListEDataType = createEDataType(ELIST);
      versionEDataType = createEDataType(VERSION);
      versionRangeEDataType = createEDataType(VERSION_RANGE);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model. This
    * method is guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void initializePackageContents()
   {
      if (isInitialized)
         return;
      isInitialized = true;

      // Initialize package
      setName(eNAME);
      setNsPrefix(eNS_PREFIX);
      setNsURI(eNS_URI);

      // Obtain other dependent packages
      ManifestPackage theManifestPackage = (ManifestPackage) EPackage.Registry.INSTANCE
         .getEPackage(ManifestPackage.eNS_URI);

      // Create type parameters
      addETypeParameter(eListEDataType, "T");

      // Set bounds for type parameters

      // Add supertypes to classes
      bundleManifestEClass.getESuperTypes().add(theManifestPackage.getManifest());
      parameterEClass.getESuperTypes().add(theManifestPackage.getParseable());
      bundleActivationPolicyEClass.getESuperTypes().add(this.getParameterized());
      packagesDeclarationEClass.getESuperTypes().add(this.getParameterized());
      packageExportEClass.getESuperTypes().add(this.getPackagesDeclaration());
      packageImportEClass.getESuperTypes().add(this.getPackagesDeclaration());
      bundleRequirementEClass.getESuperTypes().add(this.getParameterized());
      bundleSymbolicNameEClass.getESuperTypes().add(this.getParameterized());
      classPathEntryEClass.getESuperTypes().add(this.getParameterized());
      fragmentHostEClass.getESuperTypes().add(this.getParameterized());
      dynamicPackageImportEClass.getESuperTypes().add(this.getPackagesDeclaration());

      // Initialize classes and features; add operations and parameters
      initEClass(bundleManifestEClass, BundleManifest.class, "BundleManifest", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      EOperation op = addEOperation(bundleManifestEClass, theManifestPackage.getHeader(), "getHeader", 0, 1, IS_UNIQUE,
         IS_ORDERED);
      addEParameter(op, this.getBundleHeaderName(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(bundleManifestEClass, null, "setHeader", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getBundleHeaderName(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(bundleManifestEClass, null, "setHeader", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getBundleHeaderName(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEJavaObject(), "parsedValue", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(bundleManifestEClass, ecorePackage.getEString(), "getHeaderValue", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getBundleHeaderName(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(bundleManifestEClass, ecorePackage.getEJavaObject(), "getParsedHeaderValue", 0, 1, IS_UNIQUE,
         IS_ORDERED);
      addEParameter(op, this.getBundleHeaderName(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

      addEOperation(bundleManifestEClass, ecorePackage.getEString(), "getBundleManifestVersion", 0, 1, IS_UNIQUE,
         IS_ORDERED);

      addEOperation(bundleManifestEClass, this.getVersion(), "getBundleVersion", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(bundleManifestEClass, this.getVersion(), "setBundleVersion", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "version", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(bundleManifestEClass, null, "setBundleVersion", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getVersion(), "version", 0, 1, IS_UNIQUE, IS_ORDERED);

      addEOperation(bundleManifestEClass, this.getBundleSymbolicName(), "getBundleSymbolicName", 0, 1, IS_UNIQUE,
         IS_ORDERED);

      op = addEOperation(bundleManifestEClass, this.getBundleSymbolicName(), "getBundleSymbolicName", 0, 1, IS_UNIQUE,
         IS_ORDERED);
      addEParameter(op, ecorePackage.getEBoolean(), "createOnDemand", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(bundleManifestEClass, this.getBundleSymbolicName(), "setBundleSymbolicName", 0, 1, IS_UNIQUE,
         IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "bundleSymbolicName", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(bundleManifestEClass, null, "setBundleSymbolicName", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getBundleSymbolicName(), "bundleSymbolicName", 0, 1, IS_UNIQUE, IS_ORDERED);

      addEOperation(bundleManifestEClass, ecorePackage.getEString(), "getBundleRequiredExecutionEnvironment", 0, -1,
         IS_UNIQUE, IS_ORDERED);

      op = addEOperation(bundleManifestEClass, null, "setBundleRequiredExecutionEnvironment", 0, 1, IS_UNIQUE,
         IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "executionEnvironment", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(bundleManifestEClass, null, "setBundleRequiredExecutionEnvironment", 0, 1, IS_UNIQUE,
         IS_ORDERED);
      EGenericType g1 = createEGenericType(this.getEList());
      EGenericType g2 = createEGenericType(ecorePackage.getEString());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "executionEnvironments", 0, 1, IS_UNIQUE, IS_ORDERED);

      addEOperation(bundleManifestEClass, this.getFragmentHost(), "getFragmentHost", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(bundleManifestEClass, this.getFragmentHost(), "getFragmentHost", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEBoolean(), "createOnDemand", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(bundleManifestEClass, this.getFragmentHost(), "setFragmentHost", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "fragmentHost", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(bundleManifestEClass, null, "setFragmentHost", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getFragmentHost(), "fragmentHost", 0, 1, IS_UNIQUE, IS_ORDERED);

      addEOperation(bundleManifestEClass, this.getBundleActivationPolicy(), "getBundleActivationPolicy", 0, 1,
         IS_UNIQUE, IS_ORDERED);

      op = addEOperation(bundleManifestEClass, this.getBundleActivationPolicy(), "getBundleActivationPolicy", 0, 1,
         IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEBoolean(), "createOnDemand", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(bundleManifestEClass, this.getBundleActivationPolicy(), "setBundleActivationPolicy", 0, 1,
         IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getActivationPolicy(), "activationPolicy", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(bundleManifestEClass, this.getBundleActivationPolicy(), "setBundleActivationPolicy", 0, 1,
         IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "activationPolicy", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(bundleManifestEClass, null, "setBundleActivationPolicy", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getBundleActivationPolicy(), "bundleActivationPolicy", 0, 1, IS_UNIQUE, IS_ORDERED);

      addEOperation(bundleManifestEClass, ecorePackage.getEString(), "getBundleActivator", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(bundleManifestEClass, null, "setBundleActivator", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "bundleActivator", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(bundleManifestEClass, null, "getExportPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEEList());
      g2 = createEGenericType(this.getPackageExport());
      g1.getETypeArguments().add(g2);
      initEOperation(op, g1);

      op = addEOperation(bundleManifestEClass, null, "getExportPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEBoolean(), "createOnDemand", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEEList());
      g2 = createEGenericType(this.getPackageExport());
      g1.getETypeArguments().add(g2);
      initEOperation(op, g1);

      op = addEOperation(bundleManifestEClass, null, "setExportPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(this.getEList());
      g2 = createEGenericType(this.getPackageExport());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "packageExports", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(bundleManifestEClass, null, "getImportPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEEList());
      g2 = createEGenericType(this.getPackageImport());
      g1.getETypeArguments().add(g2);
      initEOperation(op, g1);

      op = addEOperation(bundleManifestEClass, null, "getImportPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEBoolean(), "createOnDemand", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEEList());
      g2 = createEGenericType(this.getPackageImport());
      g1.getETypeArguments().add(g2);
      initEOperation(op, g1);

      op = addEOperation(bundleManifestEClass, null, "setImportPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(this.getEList());
      g2 = createEGenericType(this.getPackageImport());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "packageImports", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(bundleManifestEClass, null, "getDynamicImportPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEEList());
      g2 = createEGenericType(this.getDynamicPackageImport());
      g1.getETypeArguments().add(g2);
      initEOperation(op, g1);

      op = addEOperation(bundleManifestEClass, null, "getDynamicImportPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEBoolean(), "createOnDemand", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEEList());
      g2 = createEGenericType(this.getDynamicPackageImport());
      g1.getETypeArguments().add(g2);
      initEOperation(op, g1);

      op = addEOperation(bundleManifestEClass, null, "setDynamicImportPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(this.getEList());
      g2 = createEGenericType(this.getDynamicPackageImport());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "dynamicPackageImports", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(bundleManifestEClass, null, "getRequireBundle", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEEList());
      g2 = createEGenericType(this.getBundleRequirement());
      g1.getETypeArguments().add(g2);
      initEOperation(op, g1);

      op = addEOperation(bundleManifestEClass, null, "getRequireBundle", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEBoolean(), "createOnDemand", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEEList());
      g2 = createEGenericType(this.getBundleRequirement());
      g1.getETypeArguments().add(g2);
      initEOperation(op, g1);

      op = addEOperation(bundleManifestEClass, null, "setRequireBundle", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(this.getEList());
      g2 = createEGenericType(this.getBundleRequirement());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "bundleRequirements", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(bundleManifestEClass, null, "getBundleClassPath", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEEList());
      g2 = createEGenericType(this.getClassPathEntry());
      g1.getETypeArguments().add(g2);
      initEOperation(op, g1);

      op = addEOperation(bundleManifestEClass, null, "getBundleClassPath", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEBoolean(), "createOnDemand", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEEList());
      g2 = createEGenericType(this.getClassPathEntry());
      g1.getETypeArguments().add(g2);
      initEOperation(op, g1);

      op = addEOperation(bundleManifestEClass, null, "setBundleClassPath", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(this.getEList());
      g2 = createEGenericType(this.getClassPathEntry());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "classPathEntries", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(parameterizedEClass, Parameterized.class, "Parameterized", IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEReference(getParameterized_Parameters(), this.getParameter(), this.getParameter_Parameterized(),
         "parameters", null, 0, -1, Parameterized.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
         !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      op = addEOperation(parameterizedEClass, this.getParameter(), "getParameter", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(parameterizedEClass, ecorePackage.getEString(), "getParameterValue", 0, 1, IS_UNIQUE,
         IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(parameterizedEClass, ecorePackage.getEJavaObject(), "getParsedParameterValue", 0, 1,
         IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, Parameter.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getParameter_Quoted(), ecorePackage.getEBoolean(), "quoted", null, 0, 1, Parameter.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEAttribute(getParameter_Type(), this.getParameterType(), "type", null, 1, 1, Parameter.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getParameter_Parameterized(), this.getParameterized(), this.getParameterized_Parameters(),
         "parameterized", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
         !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(bundleActivationPolicyEClass, BundleActivationPolicy.class, "BundleActivationPolicy", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getBundleActivationPolicy_Policy(), this.getActivationPolicy(), "policy", "eager", 1, 1,
         BundleActivationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(packagesDeclarationEClass, PackagesDeclaration.class, "PackagesDeclaration", IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getPackagesDeclaration_PackageNames(), ecorePackage.getEString(), "packageNames", null, 1, -1,
         PackagesDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(packageExportEClass, PackageExport.class, "PackageExport", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      addEOperation(packageExportEClass, this.getVersion(), "getVersion", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(packageExportEClass, null, "setVersion", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getVersion(), "version", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(packageImportEClass, PackageImport.class, "PackageImport", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      addEOperation(packageImportEClass, this.getVersionRange(), "getVersion", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(packageImportEClass, null, "setVersion", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getVersionRange(), "version", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(bundleRequirementEClass, BundleRequirement.class, "BundleRequirement", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getBundleRequirement_SymbolicNames(), ecorePackage.getEString(), "symbolicNames", null, 1, -1,
         BundleRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      addEOperation(bundleRequirementEClass, this.getVersionRange(), "getBundleVersion", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(bundleRequirementEClass, null, "setBundleVersion", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getVersionRange(), "bundleVersion", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(bundleSymbolicNameEClass, BundleSymbolicName.class, "BundleSymbolicName", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getBundleSymbolicName_SymbolicName(), ecorePackage.getEString(), "symbolicName", null, 1, 1,
         BundleSymbolicName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      addEOperation(bundleSymbolicNameEClass, ecorePackage.getEBoolean(), "isSingleton", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(classPathEntryEClass, ClassPathEntry.class, "ClassPathEntry", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getClassPathEntry_Paths(), ecorePackage.getEString(), "paths", null, 1, -1, ClassPathEntry.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(fragmentHostEClass, FragmentHost.class, "FragmentHost", !IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getFragmentHost_SymbolicName(), ecorePackage.getEString(), "symbolicName", null, 1, 1,
         FragmentHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      addEOperation(fragmentHostEClass, this.getVersionRange(), "getBundleVersion", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(fragmentHostEClass, null, "setBundleVersion", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getVersionRange(), "bundleVersion", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(dynamicPackageImportEClass, DynamicPackageImport.class, "DynamicPackageImport", !IS_ABSTRACT,
         !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      addEOperation(dynamicPackageImportEClass, this.getVersionRange(), "getVersion", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(dynamicPackageImportEClass, null, "setVersion", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getVersionRange(), "version", 0, 1, IS_UNIQUE, IS_ORDERED);

      addEOperation(dynamicPackageImportEClass, this.getVersionRange(), "getBundleVersion", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(dynamicPackageImportEClass, null, "setBundleVersion", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getVersionRange(), "bundleVersion", 0, 1, IS_UNIQUE, IS_ORDERED);

      // Initialize enums and add enum literals
      initEEnum(bundleHeaderNameEEnum, BundleHeaderName.class, "BundleHeaderName");
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.BUNDLE_ACTIVATIONPOLICY);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.BUNDLE_ACTIVATOR);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.BUNDLE_CATEGORY);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.BUNDLE_CLASSPATH);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.BUNDLE_CONTACTADRESS);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.BUNDLE_COPYRIGHT);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.BUNDLE_DESCRIPTION);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.BUNDLE_DOCURL);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.BUNDLE_ICON);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.BUNDLE_LICENSE);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.BUNDLE_LOCALIZATION);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.BUNDLE_MANIFESTVERSION);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.BUNDLE_NAME);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.BUNDLE_NATIVECODE);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.BUNDLE_REQUIREDEXECUTIONENVIRONMENT);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.BUNDLE_SYMBOLICNAME);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.BUNDLE_UPDATELOCATION);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.BUNDLE_VENDOR);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.BUNDLE_VERSION);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.DYNAMICIMPORT_PACKAGE);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.EXPORT_PACKAGE);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.EXPORT_SERVICE);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.FRAGMENT_HOST);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.IMPORT_PACKAGE);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.IMPORT_SERVICE);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.PROVIDED_CAPABILITY);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.REQUIRE_BUNDLE);
      addEEnumLiteral(bundleHeaderNameEEnum, BundleHeaderName.REQUIRE_CAPABILITY);

      initEEnum(activationPolicyEEnum, ActivationPolicy.class, "ActivationPolicy");
      addEEnumLiteral(activationPolicyEEnum, ActivationPolicy.EAGER);
      addEEnumLiteral(activationPolicyEEnum, ActivationPolicy.LAZY);

      initEEnum(parameterTypeEEnum, ParameterType.class, "ParameterType");
      addEEnumLiteral(parameterTypeEEnum, ParameterType.ATTRIBUTE);
      addEEnumLiteral(parameterTypeEEnum, ParameterType.DIRECTIVE);

      // Initialize data types
      initEDataType(eListEDataType, List.class, "EList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
      initEDataType(versionEDataType, Version.class, "Version", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
      initEDataType(versionRangeEDataType, VersionRange.class, "VersionRange", IS_SERIALIZABLE,
         !IS_GENERATED_INSTANCE_CLASS);
   }

} // BundleManifestPackageImpl
