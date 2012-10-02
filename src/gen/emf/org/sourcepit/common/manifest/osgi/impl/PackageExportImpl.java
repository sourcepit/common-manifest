/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi.impl;

import org.eclipse.emf.ecore.EClass;
import org.sourcepit.common.manifest.osgi.BundleManifestPackage;
import org.sourcepit.common.manifest.osgi.PackageExport;
import org.sourcepit.common.manifest.osgi.Parameter;
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

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setVersion(Version version)
   {
      Parameter parameter = getParameter("version");
      if (parameter == null)
      {
         parameter = getParameter("specification-version");
      }
      if (parameter == null)
      {
         if (version != null)
         {
            parameter = BundleManifestFactoryImpl.eINSTANCE.createParameter();
            parameter.setName("version");
            parameter.setParsedValue(version);
            getParameters().add(parameter);
            // init value
            parameter.getValue();
         }
      }
      else
      {
         if (version == null)
         {
            getParameters().remove(parameter);
         }
         else
         {
            parameter.setParsedValue(version);
         }
      }
   }

} // PackageExportImpl
