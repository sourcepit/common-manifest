/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.common.manifest.ManifestFactory
 * @model kind="package"
 * @generated
 */
public interface ManifestPackage extends EPackage
{
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNAME = "manifest";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_URI = "http://www.sourcepit.org/common/manifest/0.1";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_PREFIX = "manifest";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   ManifestPackage eINSTANCE = org.sourcepit.common.manifest.impl.ManifestPackageImpl.init();

   /**
    * The meta object id for the '{@link org.sourcepit.common.manifest.impl.AbstractSectionImpl
    * <em>Abstract Section</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.impl.AbstractSectionImpl
    * @see org.sourcepit.common.manifest.impl.ManifestPackageImpl#getAbstractSection()
    * @generated
    */
   int ABSTRACT_SECTION = 5;

   /**
    * The number of structural features of the '<em>Abstract Section</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int ABSTRACT_SECTION_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.common.manifest.impl.ManifestImpl <em>Manifest</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.impl.ManifestImpl
    * @see org.sourcepit.common.manifest.impl.ManifestPackageImpl#getManifest()
    * @generated
    */
   int MANIFEST = 0;

   /**
    * The feature id for the '<em><b>Headers</b></em>' map.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MANIFEST__HEADERS = ABSTRACT_SECTION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Sections</b></em>' map.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MANIFEST__SECTIONS = ABSTRACT_SECTION_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Manifest</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MANIFEST_FEATURE_COUNT = ABSTRACT_SECTION_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link org.sourcepit.common.manifest.impl.ManifestSectionImpl <em>Section</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.impl.ManifestSectionImpl
    * @see org.sourcepit.common.manifest.impl.ManifestPackageImpl#getManifestSection()
    * @generated
    */
   int MANIFEST_SECTION = 1;

   /**
    * The number of structural features of the '<em>Section</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int MANIFEST_SECTION_FEATURE_COUNT = ABSTRACT_SECTION_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.common.manifest.Parseable <em>Parseable</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.Parseable
    * @see org.sourcepit.common.manifest.impl.ManifestPackageImpl#getParseable()
    * @generated
    */
   int PARSEABLE = 6;

   /**
    * The number of structural features of the '<em>Parseable</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PARSEABLE_FEATURE_COUNT = 0;

   /**
    * The meta object id for the '{@link org.sourcepit.common.manifest.impl.HeaderImpl <em>Header</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.impl.HeaderImpl
    * @see org.sourcepit.common.manifest.impl.ManifestPackageImpl#getHeader()
    * @generated
    */
   int HEADER = 2;

   /**
    * The number of structural features of the '<em>Header</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int HEADER_FEATURE_COUNT = PARSEABLE_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.common.manifest.impl.SectionEntryImpl <em>Section Entry</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.impl.SectionEntryImpl
    * @see org.sourcepit.common.manifest.impl.ManifestPackageImpl#getSectionEntry()
    * @generated
    */
   int SECTION_ENTRY = 3;

   /**
    * The feature id for the '<em><b>Key</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int SECTION_ENTRY__KEY = MANIFEST_SECTION_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Value</b></em>' map.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int SECTION_ENTRY__VALUE = MANIFEST_SECTION_FEATURE_COUNT + 1;

   /**
    * The number of structural features of the '<em>Section Entry</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int SECTION_ENTRY_FEATURE_COUNT = MANIFEST_SECTION_FEATURE_COUNT + 2;

   /**
    * The meta object id for the '{@link org.sourcepit.common.manifest.impl.HeaderEntryImpl <em>Header Entry</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.impl.HeaderEntryImpl
    * @see org.sourcepit.common.manifest.impl.ManifestPackageImpl#getHeaderEntry()
    * @generated
    */
   int HEADER_ENTRY = 4;

   /**
    * The feature id for the '<em><b>Key</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int HEADER_ENTRY__KEY = HEADER_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int HEADER_ENTRY__VALUE = HEADER_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Manifest</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int HEADER_ENTRY__MANIFEST = HEADER_FEATURE_COUNT + 2;

   /**
    * The number of structural features of the '<em>Header Entry</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int HEADER_ENTRY_FEATURE_COUNT = HEADER_FEATURE_COUNT + 3;

   /**
    * The meta object id for the '{@link org.sourcepit.common.manifest.HeaderName <em>Header Name</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.HeaderName
    * @see org.sourcepit.common.manifest.impl.ManifestPackageImpl#getHeaderName()
    * @generated
    */
   int HEADER_NAME = 7;

   /**
    * The meta object id for the '<em>EE Map</em>' data type.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.eclipse.emf.common.util.EMap
    * @see org.sourcepit.common.manifest.impl.ManifestPackageImpl#getEEMap()
    * @generated
    */
   int EE_MAP = 8;


   /**
    * Returns the meta object for class '{@link org.sourcepit.common.manifest.Manifest <em>Manifest</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Manifest</em>'.
    * @see org.sourcepit.common.manifest.Manifest
    * @generated
    */
   EClass getManifest();

   /**
    * Returns the meta object for the map '{@link org.sourcepit.common.manifest.Manifest#getHeaders <em>Headers</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the map '<em>Headers</em>'.
    * @see org.sourcepit.common.manifest.Manifest#getHeaders()
    * @see #getManifest()
    * @generated
    */
   EReference getManifest_Headers();

   /**
    * Returns the meta object for the map '{@link org.sourcepit.common.manifest.Manifest#getSections <em>Sections</em>}
    * '.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the map '<em>Sections</em>'.
    * @see org.sourcepit.common.manifest.Manifest#getSections()
    * @see #getManifest()
    * @generated
    */
   EReference getManifest_Sections();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.manifest.ManifestSection <em>Section</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Section</em>'.
    * @see org.sourcepit.common.manifest.ManifestSection
    * @generated
    */
   EClass getManifestSection();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.manifest.Header <em>Header</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Header</em>'.
    * @see org.sourcepit.common.manifest.Header
    * @generated
    */
   EClass getHeader();

   /**
    * Returns the meta object for class '{@link java.util.Map.Entry <em>Section Entry</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Section Entry</em>'.
    * @see java.util.Map.Entry
    * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
    *        valueMapType=
    *        "org.sourcepit.common.manifest.HeaderEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
    * @generated
    */
   EClass getSectionEntry();

   /**
    * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Key</em>'.
    * @see java.util.Map.Entry
    * @see #getSectionEntry()
    * @generated
    */
   EAttribute getSectionEntry_Key();

   /**
    * Returns the meta object for the map '{@link java.util.Map.Entry <em>Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the map '<em>Value</em>'.
    * @see java.util.Map.Entry
    * @see #getSectionEntry()
    * @generated
    */
   EReference getSectionEntry_Value();

   /**
    * Returns the meta object for class '{@link java.util.Map.Entry <em>Header Entry</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Header Entry</em>'.
    * @see java.util.Map.Entry
    * @model features="key value manifest"
    *        keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
    *        valueDataType="org.eclipse.emf.ecore.EString"
    *        manifestType="org.sourcepit.common.manifest.Manifest" manifestOpposite="headers" manifestTransient="false"
    * @generated
    */
   EClass getHeaderEntry();

   /**
    * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Key</em>'.
    * @see java.util.Map.Entry
    * @see #getHeaderEntry()
    * @generated
    */
   EAttribute getHeaderEntry_Key();

   /**
    * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Value</em>'.
    * @see java.util.Map.Entry
    * @see #getHeaderEntry()
    * @generated
    */
   EAttribute getHeaderEntry_Value();

   /**
    * Returns the meta object for the container reference '{@link java.util.Map.Entry <em>Manifest</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the container reference '<em>Manifest</em>'.
    * @see java.util.Map.Entry
    * @see #getHeaderEntry()
    * @generated
    */
   EReference getHeaderEntry_Manifest();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.manifest.AbstractSection <em>Abstract Section</em>}
    * '.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Abstract Section</em>'.
    * @see org.sourcepit.common.manifest.AbstractSection
    * @generated
    */
   EClass getAbstractSection();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.manifest.Parseable <em>Parseable</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Parseable</em>'.
    * @see org.sourcepit.common.manifest.Parseable
    * @generated
    */
   EClass getParseable();

   /**
    * Returns the meta object for enum '{@link org.sourcepit.common.manifest.HeaderName <em>Header Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for enum '<em>Header Name</em>'.
    * @see org.sourcepit.common.manifest.HeaderName
    * @generated
    */
   EEnum getHeaderName();

   /**
    * Returns the meta object for data type '{@link org.eclipse.emf.common.util.EMap <em>EE Map</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for data type '<em>EE Map</em>'.
    * @see org.eclipse.emf.common.util.EMap
    * @model instanceClass="org.eclipse.emf.common.util.EMap" typeParameters="K V"
    * @generated
    */
   EDataType getEEMap();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the factory that creates the instances of the model.
    * @generated
    */
   ManifestFactory getManifestFactory();

   /**
    * <!-- begin-user-doc -->
    * Defines literals for the meta objects that represent
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
       * The meta object literal for the '{@link org.sourcepit.common.manifest.impl.ManifestImpl <em>Manifest</em>}'
       * class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.impl.ManifestImpl
       * @see org.sourcepit.common.manifest.impl.ManifestPackageImpl#getManifest()
       * @generated
       */
      EClass MANIFEST = eINSTANCE.getManifest();

      /**
       * The meta object literal for the '<em><b>Headers</b></em>' map feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference MANIFEST__HEADERS = eINSTANCE.getManifest_Headers();

      /**
       * The meta object literal for the '<em><b>Sections</b></em>' map feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference MANIFEST__SECTIONS = eINSTANCE.getManifest_Sections();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.manifest.impl.ManifestSectionImpl
       * <em>Section</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.impl.ManifestSectionImpl
       * @see org.sourcepit.common.manifest.impl.ManifestPackageImpl#getManifestSection()
       * @generated
       */
      EClass MANIFEST_SECTION = eINSTANCE.getManifestSection();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.manifest.impl.HeaderImpl <em>Header</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.impl.HeaderImpl
       * @see org.sourcepit.common.manifest.impl.ManifestPackageImpl#getHeader()
       * @generated
       */
      EClass HEADER = eINSTANCE.getHeader();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.manifest.impl.SectionEntryImpl
       * <em>Section Entry</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.impl.SectionEntryImpl
       * @see org.sourcepit.common.manifest.impl.ManifestPackageImpl#getSectionEntry()
       * @generated
       */
      EClass SECTION_ENTRY = eINSTANCE.getSectionEntry();

      /**
       * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute SECTION_ENTRY__KEY = eINSTANCE.getSectionEntry_Key();

      /**
       * The meta object literal for the '<em><b>Value</b></em>' map feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference SECTION_ENTRY__VALUE = eINSTANCE.getSectionEntry_Value();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.manifest.impl.HeaderEntryImpl
       * <em>Header Entry</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.impl.HeaderEntryImpl
       * @see org.sourcepit.common.manifest.impl.ManifestPackageImpl#getHeaderEntry()
       * @generated
       */
      EClass HEADER_ENTRY = eINSTANCE.getHeaderEntry();

      /**
       * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute HEADER_ENTRY__KEY = eINSTANCE.getHeaderEntry_Key();

      /**
       * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute HEADER_ENTRY__VALUE = eINSTANCE.getHeaderEntry_Value();

      /**
       * The meta object literal for the '<em><b>Manifest</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference HEADER_ENTRY__MANIFEST = eINSTANCE.getHeaderEntry_Manifest();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.manifest.impl.AbstractSectionImpl
       * <em>Abstract Section</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.impl.AbstractSectionImpl
       * @see org.sourcepit.common.manifest.impl.ManifestPackageImpl#getAbstractSection()
       * @generated
       */
      EClass ABSTRACT_SECTION = eINSTANCE.getAbstractSection();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.manifest.Parseable <em>Parseable</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.Parseable
       * @see org.sourcepit.common.manifest.impl.ManifestPackageImpl#getParseable()
       * @generated
       */
      EClass PARSEABLE = eINSTANCE.getParseable();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.manifest.HeaderName <em>Header Name</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.HeaderName
       * @see org.sourcepit.common.manifest.impl.ManifestPackageImpl#getHeaderName()
       * @generated
       */
      EEnum HEADER_NAME = eINSTANCE.getHeaderName();

      /**
       * The meta object literal for the '<em>EE Map</em>' data type.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.eclipse.emf.common.util.EMap
       * @see org.sourcepit.common.manifest.impl.ManifestPackageImpl#getEEMap()
       * @generated
       */
      EDataType EE_MAP = eINSTANCE.getEEMap();

   }

} // ManifestPackage
