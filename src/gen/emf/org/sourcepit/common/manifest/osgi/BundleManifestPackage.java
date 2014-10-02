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

package org.sourcepit.common.manifest.osgi;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.sourcepit.common.manifest.ManifestPackage;

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
 * @see org.sourcepit.common.manifest.osgi.BundleManifestFactory
 * @model kind="package"
 * @generated
 */
public interface BundleManifestPackage extends EPackage
{
   /**
    * The package name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNAME = "osgi";

   /**
    * The package namespace URI.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_URI = "http://www.sourcepit.org/common/manifest/osgi/0.1";

   /**
    * The package namespace name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   String eNS_PREFIX = "manifest-osgi";

   /**
    * The singleton instance of the package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   BundleManifestPackage eINSTANCE = org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl.init();

   /**
    * The meta object id for the '{@link org.sourcepit.common.manifest.osgi.impl.BundleManifestImpl
    * <em>Bundle Manifest</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestImpl
    * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getBundleManifest()
    * @generated
    */
   int BUNDLE_MANIFEST = 0;

   /**
    * The feature id for the '<em><b>Headers</b></em>' map.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int BUNDLE_MANIFEST__HEADERS = ManifestPackage.MANIFEST__HEADERS;

   /**
    * The feature id for the '<em><b>Sections</b></em>' map.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int BUNDLE_MANIFEST__SECTIONS = ManifestPackage.MANIFEST__SECTIONS;

   /**
    * The number of structural features of the '<em>Bundle Manifest</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int BUNDLE_MANIFEST_FEATURE_COUNT = ManifestPackage.MANIFEST_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.common.manifest.osgi.impl.ParameterizedImpl
    * <em>Parameterized</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.osgi.impl.ParameterizedImpl
    * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getParameterized()
    * @generated
    */
   int PARAMETERIZED = 1;

   /**
    * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PARAMETERIZED__PARAMETERS = 0;

   /**
    * The number of structural features of the '<em>Parameterized</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PARAMETERIZED_FEATURE_COUNT = 1;

   /**
    * The meta object id for the '{@link org.sourcepit.common.manifest.osgi.impl.ParameterImpl <em>Parameter</em>}'
    * class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.osgi.impl.ParameterImpl
    * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getParameter()
    * @generated
    */
   int PARAMETER = 2;

   /**
    * The feature id for the '<em><b>Parsed Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PARAMETER__PARSED_VALUE = ManifestPackage.PARSEABLE__PARSED_VALUE;

   /**
    * The feature id for the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PARAMETER__VALUE = ManifestPackage.PARSEABLE__VALUE;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PARAMETER__NAME = ManifestPackage.PARSEABLE_FEATURE_COUNT + 0;

   /**
    * The feature id for the '<em><b>Quoted</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PARAMETER__QUOTED = ManifestPackage.PARSEABLE_FEATURE_COUNT + 1;

   /**
    * The feature id for the '<em><b>Type</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PARAMETER__TYPE = ManifestPackage.PARSEABLE_FEATURE_COUNT + 2;

   /**
    * The feature id for the '<em><b>Parameterized</b></em>' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PARAMETER__PARAMETERIZED = ManifestPackage.PARSEABLE_FEATURE_COUNT + 3;

   /**
    * The number of structural features of the '<em>Parameter</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PARAMETER_FEATURE_COUNT = ManifestPackage.PARSEABLE_FEATURE_COUNT + 4;

   /**
    * The meta object id for the '{@link org.sourcepit.common.manifest.osgi.impl.BundleActivationPolicyImpl
    * <em>Bundle Activation Policy</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.osgi.impl.BundleActivationPolicyImpl
    * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getBundleActivationPolicy()
    * @generated
    */
   int BUNDLE_ACTIVATION_POLICY = 3;

   /**
    * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int BUNDLE_ACTIVATION_POLICY__PARAMETERS = PARAMETERIZED__PARAMETERS;

   /**
    * The feature id for the '<em><b>Policy</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int BUNDLE_ACTIVATION_POLICY__POLICY = PARAMETERIZED_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Bundle Activation Policy</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int BUNDLE_ACTIVATION_POLICY_FEATURE_COUNT = PARAMETERIZED_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.common.manifest.osgi.impl.PackagesDeclarationImpl
    * <em>Packages Declaration</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.osgi.impl.PackagesDeclarationImpl
    * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getPackagesDeclaration()
    * @generated
    */
   int PACKAGES_DECLARATION = 4;

   /**
    * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PACKAGES_DECLARATION__PARAMETERS = PARAMETERIZED__PARAMETERS;

   /**
    * The feature id for the '<em><b>Package Names</b></em>' attribute list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PACKAGES_DECLARATION__PACKAGE_NAMES = PARAMETERIZED_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Packages Declaration</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PACKAGES_DECLARATION_FEATURE_COUNT = PARAMETERIZED_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.common.manifest.osgi.impl.PackageExportImpl
    * <em>Package Export</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.osgi.impl.PackageExportImpl
    * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getPackageExport()
    * @generated
    */
   int PACKAGE_EXPORT = 5;

   /**
    * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PACKAGE_EXPORT__PARAMETERS = PACKAGES_DECLARATION__PARAMETERS;

   /**
    * The feature id for the '<em><b>Package Names</b></em>' attribute list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PACKAGE_EXPORT__PACKAGE_NAMES = PACKAGES_DECLARATION__PACKAGE_NAMES;

   /**
    * The number of structural features of the '<em>Package Export</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PACKAGE_EXPORT_FEATURE_COUNT = PACKAGES_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.common.manifest.osgi.impl.PackageImportImpl
    * <em>Package Import</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.osgi.impl.PackageImportImpl
    * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getPackageImport()
    * @generated
    */
   int PACKAGE_IMPORT = 6;

   /**
    * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PACKAGE_IMPORT__PARAMETERS = PACKAGES_DECLARATION__PARAMETERS;

   /**
    * The feature id for the '<em><b>Package Names</b></em>' attribute list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PACKAGE_IMPORT__PACKAGE_NAMES = PACKAGES_DECLARATION__PACKAGE_NAMES;

   /**
    * The number of structural features of the '<em>Package Import</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int PACKAGE_IMPORT_FEATURE_COUNT = PACKAGES_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.common.manifest.osgi.impl.BundleRequirementImpl
    * <em>Bundle Requirement</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.osgi.impl.BundleRequirementImpl
    * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getBundleRequirement()
    * @generated
    */
   int BUNDLE_REQUIREMENT = 7;

   /**
    * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int BUNDLE_REQUIREMENT__PARAMETERS = PARAMETERIZED__PARAMETERS;

   /**
    * The feature id for the '<em><b>Symbolic Names</b></em>' attribute list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int BUNDLE_REQUIREMENT__SYMBOLIC_NAMES = PARAMETERIZED_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Bundle Requirement</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int BUNDLE_REQUIREMENT_FEATURE_COUNT = PARAMETERIZED_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.common.manifest.osgi.impl.BundleSymbolicNameImpl
    * <em>Bundle Symbolic Name</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.osgi.impl.BundleSymbolicNameImpl
    * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getBundleSymbolicName()
    * @generated
    */
   int BUNDLE_SYMBOLIC_NAME = 8;

   /**
    * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int BUNDLE_SYMBOLIC_NAME__PARAMETERS = PARAMETERIZED__PARAMETERS;

   /**
    * The feature id for the '<em><b>Symbolic Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int BUNDLE_SYMBOLIC_NAME__SYMBOLIC_NAME = PARAMETERIZED_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Bundle Symbolic Name</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int BUNDLE_SYMBOLIC_NAME_FEATURE_COUNT = PARAMETERIZED_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.common.manifest.osgi.impl.ClassPathEntryImpl
    * <em>Class Path Entry</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.osgi.impl.ClassPathEntryImpl
    * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getClassPathEntry()
    * @generated
    */
   int CLASS_PATH_ENTRY = 9;

   /**
    * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_PATH_ENTRY__PARAMETERS = PARAMETERIZED__PARAMETERS;

   /**
    * The feature id for the '<em><b>Paths</b></em>' attribute list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_PATH_ENTRY__PATHS = PARAMETERIZED_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Class Path Entry</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int CLASS_PATH_ENTRY_FEATURE_COUNT = PARAMETERIZED_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.common.manifest.osgi.impl.FragmentHostImpl
    * <em>Fragment Host</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.osgi.impl.FragmentHostImpl
    * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getFragmentHost()
    * @generated
    */
   int FRAGMENT_HOST = 10;

   /**
    * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int FRAGMENT_HOST__PARAMETERS = PARAMETERIZED__PARAMETERS;

   /**
    * The feature id for the '<em><b>Symbolic Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int FRAGMENT_HOST__SYMBOLIC_NAME = PARAMETERIZED_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Fragment Host</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int FRAGMENT_HOST_FEATURE_COUNT = PARAMETERIZED_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.common.manifest.osgi.impl.DynamicPackageImportImpl
    * <em>Dynamic Package Import</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.osgi.impl.DynamicPackageImportImpl
    * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getDynamicPackageImport()
    * @generated
    */
   int DYNAMIC_PACKAGE_IMPORT = 11;

   /**
    * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int DYNAMIC_PACKAGE_IMPORT__PARAMETERS = PACKAGES_DECLARATION__PARAMETERS;

   /**
    * The feature id for the '<em><b>Package Names</b></em>' attribute list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int DYNAMIC_PACKAGE_IMPORT__PACKAGE_NAMES = PACKAGES_DECLARATION__PACKAGE_NAMES;

   /**
    * The number of structural features of the '<em>Dynamic Package Import</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int DYNAMIC_PACKAGE_IMPORT_FEATURE_COUNT = PACKAGES_DECLARATION_FEATURE_COUNT + 0;

   /**
    * The meta object id for the '{@link org.sourcepit.common.manifest.osgi.impl.BundleLicenseImpl
    * <em>Bundle License</em>}' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.osgi.impl.BundleLicenseImpl
    * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getBundleLicense()
    * @generated
    */
   int BUNDLE_LICENSE = 12;

   /**
    * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int BUNDLE_LICENSE__PARAMETERS = PARAMETERIZED__PARAMETERS;

   /**
    * The feature id for the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int BUNDLE_LICENSE__NAME = PARAMETERIZED_FEATURE_COUNT + 0;

   /**
    * The number of structural features of the '<em>Bundle License</em>' class.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    * @ordered
    */
   int BUNDLE_LICENSE_FEATURE_COUNT = PARAMETERIZED_FEATURE_COUNT + 1;

   /**
    * The meta object id for the '{@link org.sourcepit.common.manifest.osgi.BundleHeaderName
    * <em>Bundle Header Name</em>}' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.osgi.BundleHeaderName
    * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getBundleHeaderName()
    * @generated
    */
   int BUNDLE_HEADER_NAME = 13;

   /**
    * The meta object id for the '{@link org.sourcepit.common.manifest.osgi.ActivationPolicy <em>Activation Policy</em>}
    * ' enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.osgi.ActivationPolicy
    * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getActivationPolicy()
    * @generated
    */
   int ACTIVATION_POLICY = 14;

   /**
    * The meta object id for the '{@link org.sourcepit.common.manifest.osgi.ParameterType <em>Parameter Type</em>}'
    * enum.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.osgi.ParameterType
    * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getParameterType()
    * @generated
    */
   int PARAMETER_TYPE = 15;

   /**
    * The meta object id for the '<em>EList</em>' data type.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see java.util.List
    * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getEList()
    * @generated
    */
   int ELIST = 16;

   /**
    * The meta object id for the '<em>Version</em>' data type.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.osgi.Version
    * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getVersion()
    * @generated
    */
   int VERSION = 17;

   /**
    * The meta object id for the '<em>Version Range</em>' data type.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see org.sourcepit.common.manifest.osgi.VersionRange
    * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getVersionRange()
    * @generated
    */
   int VERSION_RANGE = 18;


   /**
    * Returns the meta object for class '{@link org.sourcepit.common.manifest.osgi.BundleManifest
    * <em>Bundle Manifest</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Bundle Manifest</em>'.
    * @see org.sourcepit.common.manifest.osgi.BundleManifest
    * @generated
    */
   EClass getBundleManifest();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.manifest.osgi.Parameterized <em>Parameterized</em>}
    * '.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Parameterized</em>'.
    * @see org.sourcepit.common.manifest.osgi.Parameterized
    * @generated
    */
   EClass getParameterized();

   /**
    * Returns the meta object for the containment reference list '
    * {@link org.sourcepit.common.manifest.osgi.Parameterized#getParameters <em>Parameters</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the containment reference list '<em>Parameters</em>'.
    * @see org.sourcepit.common.manifest.osgi.Parameterized#getParameters()
    * @see #getParameterized()
    * @generated
    */
   EReference getParameterized_Parameters();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.manifest.osgi.Parameter <em>Parameter</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Parameter</em>'.
    * @see org.sourcepit.common.manifest.osgi.Parameter
    * @generated
    */
   EClass getParameter();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.common.manifest.osgi.Parameter#getName
    * <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.sourcepit.common.manifest.osgi.Parameter#getName()
    * @see #getParameter()
    * @generated
    */
   EAttribute getParameter_Name();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.common.manifest.osgi.Parameter#isQuoted
    * <em>Quoted</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Quoted</em>'.
    * @see org.sourcepit.common.manifest.osgi.Parameter#isQuoted()
    * @see #getParameter()
    * @generated
    */
   EAttribute getParameter_Quoted();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.common.manifest.osgi.Parameter#getType
    * <em>Type</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Type</em>'.
    * @see org.sourcepit.common.manifest.osgi.Parameter#getType()
    * @see #getParameter()
    * @generated
    */
   EAttribute getParameter_Type();

   /**
    * Returns the meta object for the container reference '
    * {@link org.sourcepit.common.manifest.osgi.Parameter#getParameterized <em>Parameterized</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the container reference '<em>Parameterized</em>'.
    * @see org.sourcepit.common.manifest.osgi.Parameter#getParameterized()
    * @see #getParameter()
    * @generated
    */
   EReference getParameter_Parameterized();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.manifest.osgi.BundleActivationPolicy
    * <em>Bundle Activation Policy</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Bundle Activation Policy</em>'.
    * @see org.sourcepit.common.manifest.osgi.BundleActivationPolicy
    * @generated
    */
   EClass getBundleActivationPolicy();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.common.manifest.osgi.BundleActivationPolicy#getPolicy <em>Policy</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Policy</em>'.
    * @see org.sourcepit.common.manifest.osgi.BundleActivationPolicy#getPolicy()
    * @see #getBundleActivationPolicy()
    * @generated
    */
   EAttribute getBundleActivationPolicy_Policy();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.manifest.osgi.PackagesDeclaration
    * <em>Packages Declaration</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Packages Declaration</em>'.
    * @see org.sourcepit.common.manifest.osgi.PackagesDeclaration
    * @generated
    */
   EClass getPackagesDeclaration();

   /**
    * Returns the meta object for the attribute list '
    * {@link org.sourcepit.common.manifest.osgi.PackagesDeclaration#getPackageNames <em>Package Names</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute list '<em>Package Names</em>'.
    * @see org.sourcepit.common.manifest.osgi.PackagesDeclaration#getPackageNames()
    * @see #getPackagesDeclaration()
    * @generated
    */
   EAttribute getPackagesDeclaration_PackageNames();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.manifest.osgi.PackageExport
    * <em>Package Export</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Package Export</em>'.
    * @see org.sourcepit.common.manifest.osgi.PackageExport
    * @generated
    */
   EClass getPackageExport();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.manifest.osgi.PackageImport
    * <em>Package Import</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Package Import</em>'.
    * @see org.sourcepit.common.manifest.osgi.PackageImport
    * @generated
    */
   EClass getPackageImport();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.manifest.osgi.BundleRequirement
    * <em>Bundle Requirement</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Bundle Requirement</em>'.
    * @see org.sourcepit.common.manifest.osgi.BundleRequirement
    * @generated
    */
   EClass getBundleRequirement();

   /**
    * Returns the meta object for the attribute list '
    * {@link org.sourcepit.common.manifest.osgi.BundleRequirement#getSymbolicNames <em>Symbolic Names</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute list '<em>Symbolic Names</em>'.
    * @see org.sourcepit.common.manifest.osgi.BundleRequirement#getSymbolicNames()
    * @see #getBundleRequirement()
    * @generated
    */
   EAttribute getBundleRequirement_SymbolicNames();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.manifest.osgi.BundleSymbolicName
    * <em>Bundle Symbolic Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Bundle Symbolic Name</em>'.
    * @see org.sourcepit.common.manifest.osgi.BundleSymbolicName
    * @generated
    */
   EClass getBundleSymbolicName();

   /**
    * Returns the meta object for the attribute '
    * {@link org.sourcepit.common.manifest.osgi.BundleSymbolicName#getSymbolicName <em>Symbolic Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Symbolic Name</em>'.
    * @see org.sourcepit.common.manifest.osgi.BundleSymbolicName#getSymbolicName()
    * @see #getBundleSymbolicName()
    * @generated
    */
   EAttribute getBundleSymbolicName_SymbolicName();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.manifest.osgi.ClassPathEntry
    * <em>Class Path Entry</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Class Path Entry</em>'.
    * @see org.sourcepit.common.manifest.osgi.ClassPathEntry
    * @generated
    */
   EClass getClassPathEntry();

   /**
    * Returns the meta object for the attribute list '{@link org.sourcepit.common.manifest.osgi.ClassPathEntry#getPaths
    * <em>Paths</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute list '<em>Paths</em>'.
    * @see org.sourcepit.common.manifest.osgi.ClassPathEntry#getPaths()
    * @see #getClassPathEntry()
    * @generated
    */
   EAttribute getClassPathEntry_Paths();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.manifest.osgi.FragmentHost <em>Fragment Host</em>}
    * '.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Fragment Host</em>'.
    * @see org.sourcepit.common.manifest.osgi.FragmentHost
    * @generated
    */
   EClass getFragmentHost();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.common.manifest.osgi.FragmentHost#getSymbolicName
    * <em>Symbolic Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Symbolic Name</em>'.
    * @see org.sourcepit.common.manifest.osgi.FragmentHost#getSymbolicName()
    * @see #getFragmentHost()
    * @generated
    */
   EAttribute getFragmentHost_SymbolicName();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.manifest.osgi.DynamicPackageImport
    * <em>Dynamic Package Import</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Dynamic Package Import</em>'.
    * @see org.sourcepit.common.manifest.osgi.DynamicPackageImport
    * @generated
    */
   EClass getDynamicPackageImport();

   /**
    * Returns the meta object for class '{@link org.sourcepit.common.manifest.osgi.BundleLicense
    * <em>Bundle License</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for class '<em>Bundle License</em>'.
    * @see org.sourcepit.common.manifest.osgi.BundleLicense
    * @generated
    */
   EClass getBundleLicense();

   /**
    * Returns the meta object for the attribute '{@link org.sourcepit.common.manifest.osgi.BundleLicense#getName
    * <em>Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for the attribute '<em>Name</em>'.
    * @see org.sourcepit.common.manifest.osgi.BundleLicense#getName()
    * @see #getBundleLicense()
    * @generated
    */
   EAttribute getBundleLicense_Name();

   /**
    * Returns the meta object for enum '{@link org.sourcepit.common.manifest.osgi.BundleHeaderName
    * <em>Bundle Header Name</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for enum '<em>Bundle Header Name</em>'.
    * @see org.sourcepit.common.manifest.osgi.BundleHeaderName
    * @generated
    */
   EEnum getBundleHeaderName();

   /**
    * Returns the meta object for enum '{@link org.sourcepit.common.manifest.osgi.ActivationPolicy
    * <em>Activation Policy</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for enum '<em>Activation Policy</em>'.
    * @see org.sourcepit.common.manifest.osgi.ActivationPolicy
    * @generated
    */
   EEnum getActivationPolicy();

   /**
    * Returns the meta object for enum '{@link org.sourcepit.common.manifest.osgi.ParameterType <em>Parameter Type</em>}
    * '.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for enum '<em>Parameter Type</em>'.
    * @see org.sourcepit.common.manifest.osgi.ParameterType
    * @generated
    */
   EEnum getParameterType();

   /**
    * Returns the meta object for data type '{@link java.util.List <em>EList</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for data type '<em>EList</em>'.
    * @see java.util.List
    * @model instanceClass="java.util.List" typeParameters="T"
    * @generated
    */
   EDataType getEList();

   /**
    * Returns the meta object for data type '{@link org.sourcepit.common.manifest.osgi.Version <em>Version</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for data type '<em>Version</em>'.
    * @see org.sourcepit.common.manifest.osgi.Version
    * @model instanceClass="org.sourcepit.common.manifest.osgi.Version"
    * @generated
    */
   EDataType getVersion();

   /**
    * Returns the meta object for data type '{@link org.sourcepit.common.manifest.osgi.VersionRange
    * <em>Version Range</em>}'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the meta object for data type '<em>Version Range</em>'.
    * @see org.sourcepit.common.manifest.osgi.VersionRange
    * @model instanceClass="org.sourcepit.common.manifest.osgi.VersionRange"
    * @generated
    */
   EDataType getVersionRange();

   /**
    * Returns the factory that creates the instances of the model.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the factory that creates the instances of the model.
    * @generated
    */
   BundleManifestFactory getBundleManifestFactory();

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
       * The meta object literal for the '{@link org.sourcepit.common.manifest.osgi.impl.BundleManifestImpl
       * <em>Bundle Manifest</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestImpl
       * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getBundleManifest()
       * @generated
       */
      EClass BUNDLE_MANIFEST = eINSTANCE.getBundleManifest();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.manifest.osgi.impl.ParameterizedImpl
       * <em>Parameterized</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.osgi.impl.ParameterizedImpl
       * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getParameterized()
       * @generated
       */
      EClass PARAMETERIZED = eINSTANCE.getParameterized();

      /**
       * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference PARAMETERIZED__PARAMETERS = eINSTANCE.getParameterized_Parameters();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.manifest.osgi.impl.ParameterImpl
       * <em>Parameter</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.osgi.impl.ParameterImpl
       * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getParameter()
       * @generated
       */
      EClass PARAMETER = eINSTANCE.getParameter();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

      /**
       * The meta object literal for the '<em><b>Quoted</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute PARAMETER__QUOTED = eINSTANCE.getParameter_Quoted();

      /**
       * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

      /**
       * The meta object literal for the '<em><b>Parameterized</b></em>' container reference feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EReference PARAMETER__PARAMETERIZED = eINSTANCE.getParameter_Parameterized();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.manifest.osgi.impl.BundleActivationPolicyImpl
       * <em>Bundle Activation Policy</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.osgi.impl.BundleActivationPolicyImpl
       * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getBundleActivationPolicy()
       * @generated
       */
      EClass BUNDLE_ACTIVATION_POLICY = eINSTANCE.getBundleActivationPolicy();

      /**
       * The meta object literal for the '<em><b>Policy</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute BUNDLE_ACTIVATION_POLICY__POLICY = eINSTANCE.getBundleActivationPolicy_Policy();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.manifest.osgi.impl.PackagesDeclarationImpl
       * <em>Packages Declaration</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.osgi.impl.PackagesDeclarationImpl
       * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getPackagesDeclaration()
       * @generated
       */
      EClass PACKAGES_DECLARATION = eINSTANCE.getPackagesDeclaration();

      /**
       * The meta object literal for the '<em><b>Package Names</b></em>' attribute list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute PACKAGES_DECLARATION__PACKAGE_NAMES = eINSTANCE.getPackagesDeclaration_PackageNames();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.manifest.osgi.impl.PackageExportImpl
       * <em>Package Export</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.osgi.impl.PackageExportImpl
       * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getPackageExport()
       * @generated
       */
      EClass PACKAGE_EXPORT = eINSTANCE.getPackageExport();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.manifest.osgi.impl.PackageImportImpl
       * <em>Package Import</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.osgi.impl.PackageImportImpl
       * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getPackageImport()
       * @generated
       */
      EClass PACKAGE_IMPORT = eINSTANCE.getPackageImport();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.manifest.osgi.impl.BundleRequirementImpl
       * <em>Bundle Requirement</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.osgi.impl.BundleRequirementImpl
       * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getBundleRequirement()
       * @generated
       */
      EClass BUNDLE_REQUIREMENT = eINSTANCE.getBundleRequirement();

      /**
       * The meta object literal for the '<em><b>Symbolic Names</b></em>' attribute list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute BUNDLE_REQUIREMENT__SYMBOLIC_NAMES = eINSTANCE.getBundleRequirement_SymbolicNames();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.manifest.osgi.impl.BundleSymbolicNameImpl
       * <em>Bundle Symbolic Name</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.osgi.impl.BundleSymbolicNameImpl
       * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getBundleSymbolicName()
       * @generated
       */
      EClass BUNDLE_SYMBOLIC_NAME = eINSTANCE.getBundleSymbolicName();

      /**
       * The meta object literal for the '<em><b>Symbolic Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute BUNDLE_SYMBOLIC_NAME__SYMBOLIC_NAME = eINSTANCE.getBundleSymbolicName_SymbolicName();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.manifest.osgi.impl.ClassPathEntryImpl
       * <em>Class Path Entry</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.osgi.impl.ClassPathEntryImpl
       * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getClassPathEntry()
       * @generated
       */
      EClass CLASS_PATH_ENTRY = eINSTANCE.getClassPathEntry();

      /**
       * The meta object literal for the '<em><b>Paths</b></em>' attribute list feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute CLASS_PATH_ENTRY__PATHS = eINSTANCE.getClassPathEntry_Paths();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.manifest.osgi.impl.FragmentHostImpl
       * <em>Fragment Host</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.osgi.impl.FragmentHostImpl
       * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getFragmentHost()
       * @generated
       */
      EClass FRAGMENT_HOST = eINSTANCE.getFragmentHost();

      /**
       * The meta object literal for the '<em><b>Symbolic Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute FRAGMENT_HOST__SYMBOLIC_NAME = eINSTANCE.getFragmentHost_SymbolicName();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.manifest.osgi.impl.DynamicPackageImportImpl
       * <em>Dynamic Package Import</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.osgi.impl.DynamicPackageImportImpl
       * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getDynamicPackageImport()
       * @generated
       */
      EClass DYNAMIC_PACKAGE_IMPORT = eINSTANCE.getDynamicPackageImport();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.manifest.osgi.impl.BundleLicenseImpl
       * <em>Bundle License</em>}' class.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.osgi.impl.BundleLicenseImpl
       * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getBundleLicense()
       * @generated
       */
      EClass BUNDLE_LICENSE = eINSTANCE.getBundleLicense();

      /**
       * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @generated
       */
      EAttribute BUNDLE_LICENSE__NAME = eINSTANCE.getBundleLicense_Name();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.manifest.osgi.BundleHeaderName
       * <em>Bundle Header Name</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.osgi.BundleHeaderName
       * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getBundleHeaderName()
       * @generated
       */
      EEnum BUNDLE_HEADER_NAME = eINSTANCE.getBundleHeaderName();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.manifest.osgi.ActivationPolicy
       * <em>Activation Policy</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.osgi.ActivationPolicy
       * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getActivationPolicy()
       * @generated
       */
      EEnum ACTIVATION_POLICY = eINSTANCE.getActivationPolicy();

      /**
       * The meta object literal for the '{@link org.sourcepit.common.manifest.osgi.ParameterType
       * <em>Parameter Type</em>}' enum.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.osgi.ParameterType
       * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getParameterType()
       * @generated
       */
      EEnum PARAMETER_TYPE = eINSTANCE.getParameterType();

      /**
       * The meta object literal for the '<em>EList</em>' data type.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see java.util.List
       * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getEList()
       * @generated
       */
      EDataType ELIST = eINSTANCE.getEList();

      /**
       * The meta object literal for the '<em>Version</em>' data type.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.osgi.Version
       * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getVersion()
       * @generated
       */
      EDataType VERSION = eINSTANCE.getVersion();

      /**
       * The meta object literal for the '<em>Version Range</em>' data type.
       * <!-- begin-user-doc -->
       * <!-- end-user-doc -->
       * 
       * @see org.sourcepit.common.manifest.osgi.VersionRange
       * @see org.sourcepit.common.manifest.osgi.impl.BundleManifestPackageImpl#getVersionRange()
       * @generated
       */
      EDataType VERSION_RANGE = eINSTANCE.getVersionRange();

   }

} // BundleManifestPackage
