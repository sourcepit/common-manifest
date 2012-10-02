/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi.impl;

import org.eclipse.emf.ecore.EClass;
import org.sourcepit.common.manifest.osgi.BundleManifestPackage;
import org.sourcepit.common.manifest.osgi.PackageImport;
import org.sourcepit.common.manifest.osgi.Parameter;
import org.sourcepit.common.manifest.osgi.Parameterized;
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
   public VersionRange getVersion()
   {
      VersionRange range = (VersionRange) getParsedParameterValue("version");
      if (range == null)
      {
         range = (VersionRange) getParsedParameterValue("specification-version");
      }
      return range;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setVersion(VersionRange version)
   {
      setVersionRange(this, version, false);
   }

   static void setVersionRange(final Parameterized parameterized, VersionRange versionRange, boolean isBundleVersion)
   {
      final String versionKey = isBundleVersion ? "bundle-version" : "version";

      Parameter parameter = parameterized.getParameter(versionKey);
      if (parameter == null && !isBundleVersion)
      {
         parameter = parameterized.getParameter("specification-version");
      }

      if (parameter == null)
      {
         if (versionRange != null)
         {
            parameter = BundleManifestFactoryImpl.eINSTANCE.createParameter();
            parameter.setName(isBundleVersion ? "bundle-version" : "version");
            parameter.setParsedValue(versionRange);
            parameter.setQuoted(true);
            parameterized.getParameters().add(parameter);
            // init value
            parameter.getValue();
         }
      }
      else
      {
         if (versionRange == null)
         {
            parameterized.getParameters().remove(parameter);
         }
         else
         {
            parameter.setParsedValue(versionRange);
         }
      }
   }

} // PackageImportImpl
