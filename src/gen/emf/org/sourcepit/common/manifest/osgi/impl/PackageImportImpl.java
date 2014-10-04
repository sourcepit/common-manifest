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
