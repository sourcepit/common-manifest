/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.impl;

import java.util.Map.Entry;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.sourcepit.common.manifest.AbstractSection;
import org.sourcepit.common.manifest.Header;
import org.sourcepit.common.manifest.HeaderName;
import org.sourcepit.common.manifest.Manifest;
import org.sourcepit.common.manifest.ManifestFactory;
import org.sourcepit.common.manifest.ManifestPackage;
import org.sourcepit.common.manifest.ManifestSection;
import org.sourcepit.common.manifest.Parseable;
import org.sourcepit.common.manifest.osgi.BundleManifestPackage;
import org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ManifestPackageImpl extends EPackageImpl implements ManifestPackage
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass manifestEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass manifestSectionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass headerEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass sectionEntryEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass headerEntryEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass abstractSectionEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EClass parseableEClass = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EEnum headerNameEEnum = null;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private EDataType eeMapEDataType = null;

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
    * @see org.sourcepit.common.manifest.ManifestPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private ManifestPackageImpl()
   {
      super(eNS_URI, ManifestFactory.eINSTANCE);
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
    * This method is used to initialize {@link ManifestPackage#eINSTANCE} when that field is accessed. Clients should
    * not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * 
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static ManifestPackage init()
   {
      if (isInited)
         return (ManifestPackage) EPackage.Registry.INSTANCE.getEPackage(ManifestPackage.eNS_URI);

      // Obtain or create and register package
      ManifestPackageImpl theManifestPackage = (ManifestPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ManifestPackageImpl
         ? EPackage.Registry.INSTANCE.get(eNS_URI)
         : new ManifestPackageImpl());

      isInited = true;

      // Obtain or create and register interdependencies
      BundleManifestPackageImpl theBundleManifestPackage = (BundleManifestPackageImpl) (EPackage.Registry.INSTANCE
         .getEPackage(BundleManifestPackage.eNS_URI) instanceof BundleManifestPackageImpl ? EPackage.Registry.INSTANCE
         .getEPackage(BundleManifestPackage.eNS_URI) : BundleManifestPackage.eINSTANCE);

      // Create package meta-data objects
      theManifestPackage.createPackageContents();
      theBundleManifestPackage.createPackageContents();

      // Initialize created meta-data
      theManifestPackage.initializePackageContents();
      theBundleManifestPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theManifestPackage.freeze();


      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(ManifestPackage.eNS_URI, theManifestPackage);
      return theManifestPackage;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getManifest()
   {
      return manifestEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getManifest_Headers()
   {
      return (EReference) manifestEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getManifest_Sections()
   {
      return (EReference) manifestEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getManifestSection()
   {
      return manifestSectionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getHeader()
   {
      return headerEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getSectionEntry()
   {
      return sectionEntryEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getSectionEntry_Key()
   {
      return (EAttribute) sectionEntryEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getSectionEntry_Value()
   {
      return (EReference) sectionEntryEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getHeaderEntry()
   {
      return headerEntryEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getHeaderEntry_Key()
   {
      return (EAttribute) headerEntryEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EReference getHeaderEntry_Manifest()
   {
      return (EReference) headerEntryEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getAbstractSection()
   {
      return abstractSectionEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EClass getParseable()
   {
      return parseableEClass;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getParseable_ParsedValue()
   {
      return (EAttribute) parseableEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EAttribute getParseable_Value()
   {
      return (EAttribute) parseableEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EEnum getHeaderName()
   {
      return headerNameEEnum;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EDataType getEEMap()
   {
      return eeMapEDataType;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public ManifestFactory getManifestFactory()
   {
      return (ManifestFactory) getEFactoryInstance();
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
      manifestEClass = createEClass(MANIFEST);
      createEReference(manifestEClass, MANIFEST__HEADERS);
      createEReference(manifestEClass, MANIFEST__SECTIONS);

      manifestSectionEClass = createEClass(MANIFEST_SECTION);

      headerEClass = createEClass(HEADER);

      sectionEntryEClass = createEClass(SECTION_ENTRY);
      createEAttribute(sectionEntryEClass, SECTION_ENTRY__KEY);
      createEReference(sectionEntryEClass, SECTION_ENTRY__VALUE);

      headerEntryEClass = createEClass(HEADER_ENTRY);
      createEAttribute(headerEntryEClass, HEADER_ENTRY__KEY);
      createEReference(headerEntryEClass, HEADER_ENTRY__MANIFEST);

      abstractSectionEClass = createEClass(ABSTRACT_SECTION);

      parseableEClass = createEClass(PARSEABLE);
      createEAttribute(parseableEClass, PARSEABLE__PARSED_VALUE);
      createEAttribute(parseableEClass, PARSEABLE__VALUE);

      // Create enums
      headerNameEEnum = createEEnum(HEADER_NAME);

      // Create data types
      eeMapEDataType = createEDataType(EE_MAP);
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
      BundleManifestPackage theBundleManifestPackage = (BundleManifestPackage) EPackage.Registry.INSTANCE
         .getEPackage(BundleManifestPackage.eNS_URI);

      // Add subpackages
      getESubpackages().add(theBundleManifestPackage);

      // Create type parameters
      addETypeParameter(eeMapEDataType, "K");
      addETypeParameter(eeMapEDataType, "V");

      // Set bounds for type parameters

      // Add supertypes to classes
      manifestEClass.getESuperTypes().add(this.getAbstractSection());
      manifestSectionEClass.getESuperTypes().add(this.getAbstractSection());
      headerEClass.getESuperTypes().add(this.getParseable());
      sectionEntryEClass.getESuperTypes().add(this.getManifestSection());
      headerEntryEClass.getESuperTypes().add(this.getHeader());

      // Initialize classes and features; add operations and parameters
      initEClass(manifestEClass, Manifest.class, "Manifest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getManifest_Headers(), this.getHeaderEntry(), this.getHeaderEntry_Manifest(), "headers", null, 0,
         -1, Manifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
         !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getManifest_Sections(), this.getSectionEntry(), null, "sections", null, 0, -1, Manifest.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      EOperation op = addEOperation(manifestEClass, this.getManifestSection(), "getSection", 0, 1, IS_UNIQUE,
         IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEBoolean(), "createOnDemand", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(manifestEClass, null, "setHeader", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getHeaderName(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(manifestEClass, null, "setHeader", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getHeaderName(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEJavaObject(), "parsedValue", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(manifestEClass, this.getHeader(), "getHeader", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getHeaderName(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(manifestEClass, ecorePackage.getEString(), "getHeaderValue", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, this.getHeaderName(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(manifestEClass, ecorePackage.getEJavaObject(), "getParsedHeaderValue", 0, 1, IS_UNIQUE,
         IS_ORDERED);
      addEParameter(op, this.getHeaderName(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(manifestSectionEClass, ManifestSection.class, "ManifestSection", IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      addEOperation(manifestSectionEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(headerEClass, Header.class, "Header", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

      addEOperation(headerEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

      addEOperation(headerEClass, this.getManifest(), "getManifest", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(sectionEntryEClass, Entry.class, "SectionEntry", !IS_ABSTRACT, !IS_INTERFACE,
         !IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getSectionEntry_Key(), ecorePackage.getEString(), "key", null, 1, 1, Entry.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getSectionEntry_Value(), this.getHeaderEntry(), null, "value", null, 0, -1, Entry.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
         !IS_DERIVED, IS_ORDERED);

      initEClass(headerEntryEClass, Entry.class, "HeaderEntry", !IS_ABSTRACT, !IS_INTERFACE,
         !IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getHeaderEntry_Key(), ecorePackage.getEString(), "key", null, 1, 1, Entry.class, !IS_TRANSIENT,
         !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      initEReference(getHeaderEntry_Manifest(), this.getManifest(), this.getManifest_Headers(), "manifest", null, 0, 1,
         Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
         IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(abstractSectionEClass, AbstractSection.class, "AbstractSection", IS_ABSTRACT, !IS_INTERFACE,
         IS_GENERATED_INSTANCE_CLASS);

      op = addEOperation(abstractSectionEClass, null, "getHeaders", 1, 1, IS_UNIQUE, IS_ORDERED);
      EGenericType g1 = createEGenericType(this.getEEMap());
      EGenericType g2 = createEGenericType(ecorePackage.getEString());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEString());
      g1.getETypeArguments().add(g2);
      initEOperation(op, g1);

      op = addEOperation(abstractSectionEClass, this.getHeader(), "getHeader", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(abstractSectionEClass, null, "setHeader", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(abstractSectionEClass, null, "setHeader", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEJavaObject(), "parsedValue", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(abstractSectionEClass, ecorePackage.getEString(), "getHeaderValue", 0, 1, IS_UNIQUE,
         IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(abstractSectionEClass, ecorePackage.getEJavaObject(), "getParsedHeaderValue", 0, 1, IS_UNIQUE,
         IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(parseableEClass, Parseable.class, "Parseable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getParseable_ParsedValue(), ecorePackage.getEJavaObject(), "parsedValue", null, 0, 1,
         Parseable.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
         IS_ORDERED);
      initEAttribute(getParseable_Value(), ecorePackage.getEString(), "value", null, 0, 1, Parseable.class,
         !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      // Initialize enums and add enum literals
      initEEnum(headerNameEEnum, HeaderName.class, "HeaderName");
      addEEnumLiteral(headerNameEEnum, HeaderName.MANIFEST_VERSION);
      addEEnumLiteral(headerNameEEnum, HeaderName.SIGNATURE_VERSION);
      addEEnumLiteral(headerNameEEnum, HeaderName.CONTENT_TYPE);
      addEEnumLiteral(headerNameEEnum, HeaderName.CLASS_PATH);
      addEEnumLiteral(headerNameEEnum, HeaderName.MAIN_CLASS);
      addEEnumLiteral(headerNameEEnum, HeaderName.SEALED);
      addEEnumLiteral(headerNameEEnum, HeaderName.EXTENSION_LIST);
      addEEnumLiteral(headerNameEEnum, HeaderName.EXTENSION_NAME);
      addEEnumLiteral(headerNameEEnum, HeaderName.EXTENSION_INSTALLATION);
      addEEnumLiteral(headerNameEEnum, HeaderName.IMPLEMENTATION_TITLE);
      addEEnumLiteral(headerNameEEnum, HeaderName.IMPLEMENTATION_VERSION);
      addEEnumLiteral(headerNameEEnum, HeaderName.IMPLEMENTATION_VENDOR);
      addEEnumLiteral(headerNameEEnum, HeaderName.IMPLEMENTATION_VENDOR_ID);
      addEEnumLiteral(headerNameEEnum, HeaderName.IMPLEMENTATION_URL);
      addEEnumLiteral(headerNameEEnum, HeaderName.SPECIFICATION_TITLE);
      addEEnumLiteral(headerNameEEnum, HeaderName.SPECIFICATION_VERSION);
      addEEnumLiteral(headerNameEEnum, HeaderName.SPECIFICATION_VENDOR);

      // Initialize data types
      initEDataType(eeMapEDataType, EMap.class, "EEMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

      // Create resource
      createResource(eNS_URI);
   }

} // ManifestPackageImpl
