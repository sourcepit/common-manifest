/**
 * <copyright>
 * </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.manifest.osgi.impl;

import org.eclipse.emf.ecore.EClass;
import org.sourcepit.common.manifest.osgi.BundleManifestPackage;
import org.sourcepit.common.manifest.osgi.PackageImport;
import org.sourcepit.common.manifest.osgi.VersionRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class PackageImportImpl extends PackagesDeclarationImpl implements PackageImport
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected PackageImportImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   protected EClass eStaticClass()
   {
      return BundleManifestPackage.Literals.PACKAGE_IMPORT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public VersionRange getVersionRange()
   {
      VersionRange range = (VersionRange) getParsedParameterValue("version");
      if (range == null)
      {
         range = (VersionRange) getParsedParameterValue("bundle-version");
      }
      if (range == null)
      {
         range = (VersionRange) getParsedParameterValue("specification-version");
      }
      return range;
   }

} // PackageImportImpl
