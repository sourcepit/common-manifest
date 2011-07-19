/*
 * Copyright (C) 2011 Bosch Software Innovations GmbH. All rights reserved.
 */

package org.sourcepit.common.mf.model.internal.impl;

import junit.framework.TestCase;

import org.sourcepit.common.mf.internal.model.ManifestFactory;

public class CManifestFactoryImplTest extends TestCase
{
   public void testIsDefault() throws Exception
   {
      // bernd: if this test fails edit ManifestFactoryImpl.init() in a way that is will instantiate the
      // CManifestFactoryImpl factory instead of ManifestFactoryImpl
      assertTrue(ManifestFactory.eINSTANCE instanceof CManifestFactoryImpl);
   }
}
