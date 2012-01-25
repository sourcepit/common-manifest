/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.sourcepit.common.manifest.AbstractSection;
import org.sourcepit.common.manifest.Manifest;
import org.sourcepit.common.manifest.Parseable;
import org.sourcepit.common.manifest.osgi.BundleActivationPolicy;
import org.sourcepit.common.manifest.osgi.BundleManifest;
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
import org.sourcepit.common.manifest.osgi.Parameterized;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each
 * class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage
 * @generated
 */
public class BundleManifestSwitch<T> extends Switch<T>
{
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected static BundleManifestPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public BundleManifestSwitch()
   {
      if (modelPackage == null)
      {
         modelPackage = BundleManifestPackage.eINSTANCE;
      }
   }

   /**
    * Checks whether this is a switch for the given package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @parameter ePackage the package in question.
    * @return whether this is a switch for the given package.
    * @generated
    */
   @Override
   protected boolean isSwitchFor(EPackage ePackage)
   {
      return ePackage == modelPackage;
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   @Override
   protected T doSwitch(int classifierID, EObject theEObject)
   {
      switch (classifierID)
      {
         case BundleManifestPackage.BUNDLE_MANIFEST :
         {
            BundleManifest bundleManifest = (BundleManifest) theEObject;
            T result = caseBundleManifest(bundleManifest);
            if (result == null)
               result = caseManifest(bundleManifest);
            if (result == null)
               result = caseAbstractSection(bundleManifest);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case BundleManifestPackage.PARAMETERIZED :
         {
            Parameterized parameterized = (Parameterized) theEObject;
            T result = caseParameterized(parameterized);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case BundleManifestPackage.PARAMETER :
         {
            Parameter parameter = (Parameter) theEObject;
            T result = caseParameter(parameter);
            if (result == null)
               result = caseParseable(parameter);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case BundleManifestPackage.BUNDLE_ACTIVATION_POLICY :
         {
            BundleActivationPolicy bundleActivationPolicy = (BundleActivationPolicy) theEObject;
            T result = caseBundleActivationPolicy(bundleActivationPolicy);
            if (result == null)
               result = caseParameterized(bundleActivationPolicy);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case BundleManifestPackage.PACKAGES_DECLARATION :
         {
            PackagesDeclaration packagesDeclaration = (PackagesDeclaration) theEObject;
            T result = casePackagesDeclaration(packagesDeclaration);
            if (result == null)
               result = caseParameterized(packagesDeclaration);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case BundleManifestPackage.PACKAGE_EXPORT :
         {
            PackageExport packageExport = (PackageExport) theEObject;
            T result = casePackageExport(packageExport);
            if (result == null)
               result = casePackagesDeclaration(packageExport);
            if (result == null)
               result = caseParameterized(packageExport);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case BundleManifestPackage.PACKAGE_IMPORT :
         {
            PackageImport packageImport = (PackageImport) theEObject;
            T result = casePackageImport(packageImport);
            if (result == null)
               result = casePackagesDeclaration(packageImport);
            if (result == null)
               result = caseParameterized(packageImport);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case BundleManifestPackage.BUNDLE_REQUIREMENT :
         {
            BundleRequirement bundleRequirement = (BundleRequirement) theEObject;
            T result = caseBundleRequirement(bundleRequirement);
            if (result == null)
               result = caseParameterized(bundleRequirement);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case BundleManifestPackage.BUNDLE_SYMBOLIC_NAME :
         {
            BundleSymbolicName bundleSymbolicName = (BundleSymbolicName) theEObject;
            T result = caseBundleSymbolicName(bundleSymbolicName);
            if (result == null)
               result = caseParameterized(bundleSymbolicName);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case BundleManifestPackage.CLASS_PATH_ENTRY :
         {
            ClassPathEntry classPathEntry = (ClassPathEntry) theEObject;
            T result = caseClassPathEntry(classPathEntry);
            if (result == null)
               result = caseParameterized(classPathEntry);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case BundleManifestPackage.FRAGMENT_HOST :
         {
            FragmentHost fragmentHost = (FragmentHost) theEObject;
            T result = caseFragmentHost(fragmentHost);
            if (result == null)
               result = caseParameterized(fragmentHost);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case BundleManifestPackage.DYNAMIC_PACKAGE_IMPORT :
         {
            DynamicPackageImport dynamicPackageImport = (DynamicPackageImport) theEObject;
            T result = caseDynamicPackageImport(dynamicPackageImport);
            if (result == null)
               result = casePackagesDeclaration(dynamicPackageImport);
            if (result == null)
               result = caseParameterized(dynamicPackageImport);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         default :
            return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Bundle Manifest</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Bundle Manifest</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseBundleManifest(BundleManifest object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Parameterized</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Parameterized</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseParameterized(Parameterized object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseParameter(Parameter object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Bundle Activation Policy</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Bundle Activation Policy</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseBundleActivationPolicy(BundleActivationPolicy object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Packages Declaration</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Packages Declaration</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casePackagesDeclaration(PackagesDeclaration object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Package Export</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Package Export</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casePackageExport(PackageExport object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Package Import</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Package Import</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T casePackageImport(PackageImport object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Bundle Requirement</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Bundle Requirement</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseBundleRequirement(BundleRequirement object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Bundle Symbolic Name</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Bundle Symbolic Name</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseBundleSymbolicName(BundleSymbolicName object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Class Path Entry</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Class Path Entry</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseClassPathEntry(ClassPathEntry object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Fragment Host</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Fragment Host</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseFragmentHost(FragmentHost object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Dynamic Package Import</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Dynamic Package Import</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseDynamicPackageImport(DynamicPackageImport object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Abstract Section</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Abstract Section</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAbstractSection(AbstractSection object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Manifest</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Manifest</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseManifest(Manifest object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Parseable</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Parseable</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseParseable(Parseable object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch, but this is the last case anyway.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   @Override
   public T defaultCase(EObject object)
   {
      return null;
   }

} // BundleManifestSwitch
