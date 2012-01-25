/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage
 * @generated
 */
public class BundleManifestAdapterFactory extends AdapterFactoryImpl
{
   /**
    * The cached model package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected static BundleManifestPackage modelPackage;

   /**
    * Creates an instance of the adapter factory.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public BundleManifestAdapterFactory()
   {
      if (modelPackage == null)
      {
         modelPackage = BundleManifestPackage.eINSTANCE;
      }
   }

   /**
    * Returns whether this factory is applicable for the type of the object.
    * <!-- begin-user-doc -->
    * This implementation returns <code>true</code> if the object is either the model's package or is an instance object
    * of the model.
    * <!-- end-user-doc -->
    * 
    * @return whether this factory is applicable for the type of the object.
    * @generated
    */
   @Override
   public boolean isFactoryForType(Object object)
   {
      if (object == modelPackage)
      {
         return true;
      }
      if (object instanceof EObject)
      {
         return ((EObject) object).eClass().getEPackage() == modelPackage;
      }
      return false;
   }

   /**
    * The switch that delegates to the <code>createXXX</code> methods.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected BundleManifestSwitch<Adapter> modelSwitch = new BundleManifestSwitch<Adapter>()
   {
      @Override
      public Adapter caseBundleManifest(BundleManifest object)
      {
         return createBundleManifestAdapter();
      }

      @Override
      public Adapter caseParameterized(Parameterized object)
      {
         return createParameterizedAdapter();
      }

      @Override
      public Adapter caseParameter(Parameter object)
      {
         return createParameterAdapter();
      }

      @Override
      public Adapter caseBundleActivationPolicy(BundleActivationPolicy object)
      {
         return createBundleActivationPolicyAdapter();
      }

      @Override
      public Adapter casePackagesDeclaration(PackagesDeclaration object)
      {
         return createPackagesDeclarationAdapter();
      }

      @Override
      public Adapter casePackageExport(PackageExport object)
      {
         return createPackageExportAdapter();
      }

      @Override
      public Adapter casePackageImport(PackageImport object)
      {
         return createPackageImportAdapter();
      }

      @Override
      public Adapter caseBundleRequirement(BundleRequirement object)
      {
         return createBundleRequirementAdapter();
      }

      @Override
      public Adapter caseBundleSymbolicName(BundleSymbolicName object)
      {
         return createBundleSymbolicNameAdapter();
      }

      @Override
      public Adapter caseClassPathEntry(ClassPathEntry object)
      {
         return createClassPathEntryAdapter();
      }

      @Override
      public Adapter caseFragmentHost(FragmentHost object)
      {
         return createFragmentHostAdapter();
      }

      @Override
      public Adapter caseDynamicPackageImport(DynamicPackageImport object)
      {
         return createDynamicPackageImportAdapter();
      }

      @Override
      public Adapter caseAbstractSection(AbstractSection object)
      {
         return createAbstractSectionAdapter();
      }

      @Override
      public Adapter caseManifest(Manifest object)
      {
         return createManifestAdapter();
      }

      @Override
      public Adapter caseParseable(Parseable object)
      {
         return createParseableAdapter();
      }

      @Override
      public Adapter defaultCase(EObject object)
      {
         return createEObjectAdapter();
      }
   };

   /**
    * Creates an adapter for the <code>target</code>.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param target the object to adapt.
    * @return the adapter for the <code>target</code>.
    * @generated
    */
   @Override
   public Adapter createAdapter(Notifier target)
   {
      return modelSwitch.doSwitch((EObject) target);
   }


   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.common.manifest.osgi.BundleManifest
    * <em>Bundle Manifest</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.common.manifest.osgi.BundleManifest
    * @generated
    */
   public Adapter createBundleManifestAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.common.manifest.osgi.Parameterized
    * <em>Parameterized</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.common.manifest.osgi.Parameterized
    * @generated
    */
   public Adapter createParameterizedAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.common.manifest.osgi.Parameter
    * <em>Parameter</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.common.manifest.osgi.Parameter
    * @generated
    */
   public Adapter createParameterAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.common.manifest.osgi.BundleActivationPolicy
    * <em>Bundle Activation Policy</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.common.manifest.osgi.BundleActivationPolicy
    * @generated
    */
   public Adapter createBundleActivationPolicyAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.common.manifest.osgi.PackagesDeclaration
    * <em>Packages Declaration</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.common.manifest.osgi.PackagesDeclaration
    * @generated
    */
   public Adapter createPackagesDeclarationAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.common.manifest.osgi.PackageExport
    * <em>Package Export</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.common.manifest.osgi.PackageExport
    * @generated
    */
   public Adapter createPackageExportAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.common.manifest.osgi.PackageImport
    * <em>Package Import</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.common.manifest.osgi.PackageImport
    * @generated
    */
   public Adapter createPackageImportAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.common.manifest.osgi.BundleRequirement
    * <em>Bundle Requirement</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.common.manifest.osgi.BundleRequirement
    * @generated
    */
   public Adapter createBundleRequirementAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.common.manifest.osgi.BundleSymbolicName
    * <em>Bundle Symbolic Name</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.common.manifest.osgi.BundleSymbolicName
    * @generated
    */
   public Adapter createBundleSymbolicNameAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.common.manifest.osgi.ClassPathEntry
    * <em>Class Path Entry</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.common.manifest.osgi.ClassPathEntry
    * @generated
    */
   public Adapter createClassPathEntryAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.common.manifest.osgi.FragmentHost
    * <em>Fragment Host</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.common.manifest.osgi.FragmentHost
    * @generated
    */
   public Adapter createFragmentHostAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.common.manifest.osgi.DynamicPackageImport
    * <em>Dynamic Package Import</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.common.manifest.osgi.DynamicPackageImport
    * @generated
    */
   public Adapter createDynamicPackageImportAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.common.manifest.AbstractSection
    * <em>Abstract Section</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.common.manifest.AbstractSection
    * @generated
    */
   public Adapter createAbstractSectionAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.common.manifest.Manifest <em>Manifest</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.common.manifest.Manifest
    * @generated
    */
   public Adapter createManifestAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for an object of class '{@link org.sourcepit.common.manifest.Parseable <em>Parseable</em>}'.
    * <!-- begin-user-doc -->
    * This default implementation returns null so that we can easily ignore cases;
    * it's useful to ignore a case when inheritance will catch all the cases anyway.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @see org.sourcepit.common.manifest.Parseable
    * @generated
    */
   public Adapter createParseableAdapter()
   {
      return null;
   }

   /**
    * Creates a new adapter for the default case.
    * <!-- begin-user-doc -->
    * This default implementation returns null.
    * <!-- end-user-doc -->
    * 
    * @return the new adapter.
    * @generated
    */
   public Adapter createEObjectAdapter()
   {
      return null;
   }

} // BundleManifestAdapterFactory
