/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.mf.model.internal.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.sourcepit.common.mf.internal.model.Manifest;
import org.sourcepit.common.mf.internal.model.ManifestFactory;
import org.sourcepit.common.mf.internal.model.ManifestPackage;
import org.sourcepit.common.mf.internal.model.Section;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ManifestFactoryImpl extends EFactoryImpl implements ManifestFactory
{
   /**
    * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public static ManifestFactory init()
   {
      try
      {
         ManifestFactory theManifestFactory = (ManifestFactory) EPackage.Registry.INSTANCE
            .getEFactory(ManifestPackage.eNS_URI);
         if (theManifestFactory != null)
         {
            return theManifestFactory;
         }
      }
      catch (Exception exception)
      {
         EcorePlugin.INSTANCE.log(exception);
      }
      return new CManifestFactoryImpl();
   }

   /**
    * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public ManifestFactoryImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public EObject create(EClass eClass)
   {
      switch (eClass.getClassifierID())
      {
         case ManifestPackage.MANIFEST :
            return createManifest();
         case ManifestPackage.EMAP_ENTRY :
            return (EObject) createEMapEntry();
         case ManifestPackage.SECTION :
            return createSection();
         default :
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
      }
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public Manifest createManifest()
   {
      ManifestImpl manifest = new ManifestImpl();
      return manifest;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public <K, V> Map.Entry<K, V> createEMapEntry()
   {
      EMapEntryImpl<K, V> eMapEntry = new EMapEntryImpl<K, V>();
      return eMapEntry;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public Section createSection()
   {
      SectionImpl section = new SectionImpl();
      return section;
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public ManifestPackage getManifestPackage()
   {
      return (ManifestPackage) getEPackage();
   }

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @deprecated
    * @generated
    */
   @Deprecated
   public static ManifestPackage getPackage()
   {
      return ManifestPackage.eINSTANCE;
   }

} // ManifestFactoryImpl
