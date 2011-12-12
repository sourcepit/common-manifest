/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage
 * @generated
 */
public interface BundleManifestFactory extends EFactory
{
   /**
    * The singleton instance of the factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   BundleManifestFactory eINSTANCE = org.sourcepit.common.manifest.osgi.impl.BundleManifestFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Bundle Manifest</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Bundle Manifest</em>'.
    * @generated
    */
   BundleManifest createBundleManifest();

   /**
    * Returns a new object of class '<em>Parameter</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Parameter</em>'.
    * @generated
    */
   Parameter createParameter();

   /**
    * Returns a new object of class '<em>Bundle Activation Policy</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Bundle Activation Policy</em>'.
    * @generated
    */
   BundleActivationPolicy createBundleActivationPolicy();

   /**
    * Returns a new object of class '<em>Package Export</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Package Export</em>'.
    * @generated
    */
   PackageExport createPackageExport();

   /**
    * Returns a new object of class '<em>Package Import</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Package Import</em>'.
    * @generated
    */
   PackageImport createPackageImport();

   /**
    * Returns a new object of class '<em>Bundle Requirement</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Bundle Requirement</em>'.
    * @generated
    */
   BundleRequirement createBundleRequirement();

   /**
    * Returns a new object of class '<em>Bundle Symbolic Name</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Bundle Symbolic Name</em>'.
    * @generated
    */
   BundleSymbolicName createBundleSymbolicName();

   /**
    * Returns a new object of class '<em>Class Path Entry</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Class Path Entry</em>'.
    * @generated
    */
   ClassPathEntry createClassPathEntry();

   /**
    * Returns a new object of class '<em>Fragment Host</em>'.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Fragment Host</em>'.
    * @generated
    */
   FragmentHost createFragmentHost();

   /**
    * Returns the package supported by this factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the package supported by this factory.
    * @generated
    */
   BundleManifestPackage getBundleManifestPackage();

} // BundleManifestFactory
