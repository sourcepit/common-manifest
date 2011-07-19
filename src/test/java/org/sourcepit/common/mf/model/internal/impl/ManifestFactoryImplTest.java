/*
 * Copyright (C) 2011 Bosch Software Innovations GmbH. All rights reserved.
 */

package org.sourcepit.common.mf.model.internal.impl;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EPackage;
import org.sourcepit.common.mf.internal.model.ManifestFactory;
import org.sourcepit.common.mf.internal.model.ManifestPackage;

public class ManifestFactoryImplTest extends TestCase
{
   public void testNsUrl() throws Exception
   {
      ManifestFactory eFactory = ManifestFactory.eINSTANCE;

      ManifestPackage ePackage = ManifestPackage.eINSTANCE;
      try
      {
         assertSame(eFactory, ePackage.getEFactoryInstance());

         ManifestFactory mockFactory = new ManifestFactoryImpl();
         ePackage.setEFactoryInstance(mockFactory);

         ManifestFactory eFactoryFromRegistry = (ManifestFactory) EPackage.Registry.INSTANCE
            .getEFactory(ManifestPackage.eNS_URI);
         assertNotNull(eFactoryFromRegistry);

         assertSame(mockFactory, eFactoryFromRegistry);
         assertSame(mockFactory, ePackage.getEFactoryInstance());

         // bernd: if this assertion fails you have to remove the not from the @generated annotation of the build model
         // factories init method, because the NS URI has changed in the model
         assertSame(mockFactory, ManifestFactoryImpl.init());
      }
      finally
      {
         ePackage.setEFactoryInstance(eFactory);

         ManifestFactory eFactoryFromRegistry = (ManifestFactory) EPackage.Registry.INSTANCE
            .getEFactory(ManifestPackage.eNS_URI);
         assertNotNull(eFactoryFromRegistry);
         assertSame(eFactory, eFactoryFromRegistry);
         assertSame(eFactory, ePackage.getEFactoryInstance());
      }
   }
}
