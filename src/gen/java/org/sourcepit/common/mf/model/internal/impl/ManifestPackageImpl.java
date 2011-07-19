/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.mf.model.internal.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.sourcepit.common.mf.internal.model.AbstractEntriesContainer;
import org.sourcepit.common.mf.internal.model.Manifest;
import org.sourcepit.common.mf.internal.model.ManifestFactory;
import org.sourcepit.common.mf.internal.model.ManifestPackage;
import org.sourcepit.common.mf.internal.model.Section;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class ManifestPackageImpl extends EPackageImpl implements ManifestPackage
{
   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass manifestEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass eMapEntryEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass sectionEClass = null;

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private EClass abstractEntriesContainerEClass = null;

   /**
    * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
    * EPackage.Registry} by the package package URI value.
    * <p>
    * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
    * performs initialization of the package, or returns the registered package, if one already exists. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.eclipse.emf.ecore.EPackage.Registry
    * @see org.sourcepit.common.mf.internal.model.ManifestPackage#eNS_URI
    * @see #init()
    * @generated
    */
   private ManifestPackageImpl()
   {
      super(eNS_URI, ManifestFactory.eINSTANCE);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private static boolean isInited = false;

   /**
    * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
    * 
    * <p>This method is used to initialize {@link ManifestPackage#eINSTANCE} when that field is accessed.
    * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
    * <!-- begin-user-doc
    * --> <!-- end-user-doc -->
    * @see #eNS_URI
    * @see #createPackageContents()
    * @see #initializePackageContents()
    * @generated
    */
   public static ManifestPackage init()
   {
      if (isInited) return (ManifestPackage)EPackage.Registry.INSTANCE.getEPackage(ManifestPackage.eNS_URI);

      // Obtain or create and register package
      ManifestPackageImpl theManifestPackage = (ManifestPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ManifestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ManifestPackageImpl());

      isInited = true;

      // Create package meta-data objects
      theManifestPackage.createPackageContents();

      // Initialize created meta-data
      theManifestPackage.initializePackageContents();

      // Mark meta-data to indicate it can't be changed
      theManifestPackage.freeze();

  
      // Update the registry and return the package
      EPackage.Registry.INSTANCE.put(ManifestPackage.eNS_URI, theManifestPackage);
      return theManifestPackage;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getManifest()
   {
      return manifestEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getManifest_Sections()
   {
      return (EReference)manifestEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getEMapEntry()
   {
      return eMapEntryEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getEMapEntry_Key()
   {
      return (EAttribute)eMapEntryEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getEMapEntry_Value()
   {
      return (EAttribute)eMapEntryEClass.getEStructuralFeatures().get(1);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getSection()
   {
      return sectionEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EAttribute getSection_Name()
   {
      return (EAttribute)sectionEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EClass getAbstractEntriesContainer()
   {
      return abstractEntriesContainerEClass;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public EReference getAbstractEntriesContainer_Entries()
   {
      return (EReference)abstractEntriesContainerEClass.getEStructuralFeatures().get(0);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public ManifestFactory getManifestFactory()
   {
      return (ManifestFactory)getEFactoryInstance();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private boolean isCreated = false;

   /**
    * Creates the meta-model objects for the package.  This method is
    * guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void createPackageContents()
   {
      if (isCreated) return;
      isCreated = true;

      // Create classes and their features
      manifestEClass = createEClass(MANIFEST);
      createEReference(manifestEClass, MANIFEST__SECTIONS);

      eMapEntryEClass = createEClass(EMAP_ENTRY);
      createEAttribute(eMapEntryEClass, EMAP_ENTRY__KEY);
      createEAttribute(eMapEntryEClass, EMAP_ENTRY__VALUE);

      sectionEClass = createEClass(SECTION);
      createEAttribute(sectionEClass, SECTION__NAME);

      abstractEntriesContainerEClass = createEClass(ABSTRACT_ENTRIES_CONTAINER);
      createEReference(abstractEntriesContainerEClass, ABSTRACT_ENTRIES_CONTAINER__ENTRIES);
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   private boolean isInitialized = false;

   /**
    * Complete the initialization of the package and its meta-model.  This
    * method is guarded to have no affect on any invocation but its first.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * @generated
    */
   public void initializePackageContents()
   {
      if (isInitialized) return;
      isInitialized = true;

      // Initialize package
      setName(eNAME);
      setNsPrefix(eNS_PREFIX);
      setNsURI(eNS_URI);

      // Create type parameters
      ETypeParameter eMapEntryEClass_K = addETypeParameter(eMapEntryEClass, "K");
      ETypeParameter eMapEntryEClass_V = addETypeParameter(eMapEntryEClass, "V");

      // Set bounds for type parameters

      // Add supertypes to classes
      manifestEClass.getESuperTypes().add(this.getAbstractEntriesContainer());
      sectionEClass.getESuperTypes().add(this.getAbstractEntriesContainer());

      // Initialize classes and features; add operations and parameters
      initEClass(manifestEClass, Manifest.class, "Manifest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEReference(getManifest_Sections(), this.getSection(), null, "sections", null, 0, -1, Manifest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      addEOperation(manifestEClass, ecorePackage.getEString(), "getVersion", 0, 1, IS_UNIQUE, IS_ORDERED);

      EOperation op = addEOperation(manifestEClass, this.getSection(), "getSection", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

      op = addEOperation(manifestEClass, this.getSection(), "getSection", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
      addEParameter(op, ecorePackage.getEBoolean(), "createOnDemand", 0, 1, IS_UNIQUE, IS_ORDERED);

      initEClass(eMapEntryEClass, Map.Entry.class, "EMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
      EGenericType g1 = createEGenericType(eMapEntryEClass_K);
      initEAttribute(getEMapEntry_Key(), g1, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
      g1 = createEGenericType(eMapEntryEClass_V);
      initEAttribute(getEMapEntry_Value(), g1, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      initEAttribute(getSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      initEClass(abstractEntriesContainerEClass, AbstractEntriesContainer.class, "AbstractEntriesContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
      g1 = createEGenericType(this.getEMapEntry());
      EGenericType g2 = createEGenericType(ecorePackage.getEString());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEString());
      g1.getETypeArguments().add(g2);
      initEReference(getAbstractEntriesContainer_Entries(), g1, null, "entries", null, 0, -1, AbstractEntriesContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

      op = addEOperation(abstractEntriesContainerEClass, null, "addEntries", 0, 1, IS_UNIQUE, IS_ORDERED);
      g1 = createEGenericType(ecorePackage.getEMap());
      g2 = createEGenericType(ecorePackage.getEString());
      g1.getETypeArguments().add(g2);
      g2 = createEGenericType(ecorePackage.getEString());
      g1.getETypeArguments().add(g2);
      addEParameter(op, g1, "entries", 0, 1, IS_UNIQUE, IS_ORDERED);

      // Create resource
      createResource(eNS_URI);
   }

} // ManifestPackageImpl
