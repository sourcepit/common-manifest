/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.mf.internal.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.common.mf.internal.model.ManifestFactory
 * @model kind="package"
 * @generated
 */
public interface ManifestPackage extends EPackage
{
   /**
    * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNAME = "mf";

   /**
    * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_URI = "http://www.sourcepit.org/common/mf/0.1";

   /**
    * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_PREFIX = "mf";

   /**
    * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   ManifestPackage eINSTANCE = org.sourcepit.common.mf.model.internal.impl.ManifestPackageImpl.init();

   /**
    * The meta object id for the '{@link org.sourcepit.common.mf.model.internal.impl.AbstractSectionImpl
    * <em>Abstract Section</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.mf.model.internal.impl.AbstractSectionImpl
    * @see org.sourcepit.common.mf.model.internal.impl.ManifestPackageImpl#getAbstractSection()
    * @generated
    */
   int ABSTRACT_SECTION = 3;

   /**
    * The feature id for the '<em><b>Headers</b></em>' map. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ABSTRACT_SECTION__HEADERS = 0;

   /**
    * The number of structural features of the '<em>Abstract Section</em>' class. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ABSTRACT_SECTION_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.sourcepit.common.mf.model.internal.impl.ManifestImpl <em>Manifest</em>}'
    * class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.mf.model.internal.impl.ManifestImpl
    * @see org.sourcepit.common.mf.model.internal.impl.ManifestPackageImpl#getManifest()
    * @generated
    */
   int MANIFEST = 0;

   /**
    * The feature id for the '<em><b>Headers</b></em>' map. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MANIFEST__HEADERS = ABSTRACT_SECTION__HEADERS;

   /**
    * The feature id for the '<em><b>Sections</b></em>' containment reference list. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MANIFEST__SECTIONS = ABSTRACT_SECTION_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Manifest</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MANIFEST_FEATURE_COUNT = ABSTRACT_SECTION_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.common.mf.model.internal.impl.EMapEntryImpl <em>EMap Entry</em>}'
    * class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.mf.model.internal.impl.EMapEntryImpl
    * @see org.sourcepit.common.mf.model.internal.impl.ManifestPackageImpl#getEMapEntry()
    * @generated
    */
   int EMAP_ENTRY = 1;

   /**
    * The feature id for the '<em><b>Key</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int EMAP_ENTRY__KEY = 0;

   /**
    * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int EMAP_ENTRY__VALUE = 1;

   /**
    * The number of structural features of the '<em>EMap Entry</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
    * -->
    * 
    * @generated
    * @ordered
    */
   int EMAP_ENTRY_FEATURE_COUNT = 2;

   /**
    * The meta object id for the '{@link org.sourcepit.common.mf.model.internal.impl.SectionImpl <em>Section</em>}'
    * class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.mf.model.internal.impl.SectionImpl
    * @see org.sourcepit.common.mf.model.internal.impl.ManifestPackageImpl#getSection()
    * @generated
    */
   int SECTION = 2;

   /**
    * The feature id for the '<em><b>Headers</b></em>' map. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int SECTION__HEADERS = ABSTRACT_SECTION__HEADERS;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int SECTION__NAME = ABSTRACT_SECTION_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Section</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int SECTION_FEATURE_COUNT = ABSTRACT_SECTION_FEATURE_COUNT + 1;


   /**
    * Returns the meta object for class '{@link org.sourcepit.common.mf.internal.model.Manifest <em>Manifest</em>}'.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Manifest</em>'.
    * @see org.sourcepit.common.mf.internal.model.Manifest
    * @generated
    */
   EClass getManifest();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.common.mf.internal.model.Manifest#getSections <em>Sections</em>}'. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Sections</em>'.
    * @see org.sourcepit.common.mf.internal.model.Manifest#getSections()
    * @see #getManifest()
    * @generated
    */
   EReference getManifest_Sections();

   /**
    * Returns the meta object for class '{@link java.util.Map.Entry <em>EMap Entry</em>}'. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @return the meta object for class '<em>EMap Entry</em>'.
    * @see java.util.Map.Entry
    * @model keyDataType="K" valueDataType="V"
    * @generated
    */
   EClass getEMapEntry();

   /**
    * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'. <!-- begin-user-doc --> <!--
    * end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Key</em>'.
    * @see java.util.Map.Entry
    * @see #getEMapEntry()
    * @generated
    */
   EAttribute getEMapEntry_Key();

   /**
    * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'. <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Value</em>'.
    * @see java.util.Map.Entry
    * @see #getEMapEntry()
    * @generated
    */
   EAttribute getEMapEntry_Value();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.mf.internal.model.Section <em>Section</em>}'. <!--
    * begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Section</em>'.
    * @see org.sourcepit.common.mf.internal.model.Section
    * @generated
    */
   EClass getSection();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.common.mf.internal.model.Section#getName
    * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.sourcepit.common.mf.internal.model.Section#getName()
    * @see #getSection()
    * @generated
    */
   EAttribute getSection_Name();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.mf.internal.model.AbstractSection
    * <em>Abstract Section</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Abstract Section</em>'.
    * @see org.sourcepit.common.mf.internal.model.AbstractSection
    * @generated
    */
   EClass getAbstractSection();

   /**
    * Returns the meta object for the map '{@link org.sourcepit.common.mf.internal.model.AbstractSection#getHeaders
    * <em>Headers</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the meta object for the map '<em>Headers</em>'.
    * @see org.sourcepit.common.mf.internal.model.AbstractSection#getHeaders()
    * @see #getAbstractSection()
    * @generated
    */
   EReference getAbstractSection_Headers();

   /**
    * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the factory that creates the instances of the model.
    * @generated
    */
   ManifestFactory getManifestFactory();

   /**
    * <!-- begin-user-doc --> Defines literals for the meta objects that represent
    * <ul>
    * <li>each class,</li>
    * <li>each feature of each class,</li>
    * <li>each enum,</li>
    * <li>and each data type</li>
    * </ul>
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   interface Literals
   {
      /**
       * The meta object literal for the '{@link org.sourcepit.common.mf.model.internal.impl.ManifestImpl
       * <em>Manifest</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.mf.model.internal.impl.ManifestImpl
       * @see org.sourcepit.common.mf.model.internal.impl.ManifestPackageImpl#getManifest()
       * @generated
       */
      EClass MANIFEST = eINSTANCE.getManifest();

      /**
       * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature. <!--
       * begin-user-doc --> <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference MANIFEST__SECTIONS = eINSTANCE.getManifest_Sections();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.mf.model.internal.impl.EMapEntryImpl
       * <em>EMap Entry</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.mf.model.internal.impl.EMapEntryImpl
       * @see org.sourcepit.common.mf.model.internal.impl.ManifestPackageImpl#getEMapEntry()
       * @generated
       */
      EClass EMAP_ENTRY = eINSTANCE.getEMapEntry();

      /**
       * The meta object literal for the '<em><b>Key</b></em>' attribute feature. <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * 
       * @generated
       */
      EAttribute EMAP_ENTRY__KEY = eINSTANCE.getEMapEntry_Key();

      /**
       * The meta object literal for the '<em><b>Value</b></em>' attribute feature. <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * 
       * @generated
       */
      EAttribute EMAP_ENTRY__VALUE = eINSTANCE.getEMapEntry_Value();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.mf.model.internal.impl.SectionImpl
       * <em>Section</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.mf.model.internal.impl.SectionImpl
       * @see org.sourcepit.common.mf.model.internal.impl.ManifestPackageImpl#getSection()
       * @generated
       */
      EClass SECTION = eINSTANCE.getSection();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * 
       * @generated
       */
      EAttribute SECTION__NAME = eINSTANCE.getSection_Name();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.mf.model.internal.impl.AbstractSectionImpl
       * <em>Abstract Section</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.mf.model.internal.impl.AbstractSectionImpl
       * @see org.sourcepit.common.mf.model.internal.impl.ManifestPackageImpl#getAbstractSection()
       * @generated
       */
      EClass ABSTRACT_SECTION = eINSTANCE.getAbstractSection();

      /**
       * The meta object literal for the '<em><b>Headers</b></em>' map feature. <!-- begin-user-doc --> <!--
       * end-user-doc -->
       * 
       * @generated
       */
      EReference ABSTRACT_SECTION__HEADERS = eINSTANCE.getAbstractSection_Headers();

   }

} // ManifestPackage
