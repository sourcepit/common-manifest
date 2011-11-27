/**
 * <copyright>
 * </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.manifest.osgi.impl;

import org.eclipse.emf.ecore.EClass;
import org.sourcepit.common.manifest.osgi.BundleManifestPackage;
import org.sourcepit.common.manifest.osgi.PackageExport;
import org.sourcepit.common.manifest.osgi.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Export</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class PackageExportImpl extends PackagesDeclarationImpl implements PackageExport
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected PackageExportImpl()
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
      return BundleManifestPackage.Literals.PACKAGE_EXPORT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public Version getVersion()
   {
      Version version = (Version) getParsedParameterValue("version");
      if (version == null)
      {
         version = (Version) getParsedParameterValue("specification-version");
      }
      return version;
   }

} // PackageExportImpl
