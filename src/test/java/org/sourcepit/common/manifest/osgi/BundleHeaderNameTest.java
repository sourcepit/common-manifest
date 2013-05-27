/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi;

import static org.junit.Assert.*;

import org.junit.Test;

public class BundleHeaderNameTest
{
   @Test
   public void testGet()
   {
      assertNull(BundleHeaderName.get("foo"));
      assertSame(BundleHeaderName.BUNDLE_SYMBOLICNAME, BundleHeaderName.get("Bundle-SymbolicName"));
      assertSame(BundleHeaderName.BUNDLE_SYMBOLICNAME, BundleHeaderName.get("Bundle-Symbolicname"));
   }

   @Test
   public void testGetByName()
   {
      assertNull(BundleHeaderName.get("foo"));
      assertNull(BundleHeaderName.getByName("Bundle-SymbolicName"));
      assertSame(BundleHeaderName.BUNDLE_SYMBOLICNAME, BundleHeaderName.getByName("BUNDLE_SYMBOLICNAME"));
   }

}
