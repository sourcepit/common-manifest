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
public class PackageExportImpl extends PackagesDeclarationImpl implements PackageExport {
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected PackageExportImpl() {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   protected EClass eStaticClass() {
      return BundleManifestPackage.Literals.PACKAGE_EXPORT;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public Version getVersion() {
      Version version = (Version) getParsedParameterValue("version");
      if (version == null) {
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
   public void setVersion(Version version) {
      Parameter parameter = getParameter("version");
      if (parameter == null) {
         parameter = getParameter("specification-version");
      }
      if (parameter == null) {
         if (version != null) {
            parameter = BundleManifestFactoryImpl.eINSTANCE.createParameter();
            parameter.setName("version");
            parameter.setParsedValue(version);
            getParameters().add(parameter);
            // init value
            parameter.getValue();
         }
      }
      else {
         if (version == null) {
            getParameters().remove(parameter);
         }
         else {
            parameter.setParsedValue(version);
         }
      }
   }

} // PackageExportImpl
