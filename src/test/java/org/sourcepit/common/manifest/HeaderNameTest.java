/**
 * Copyright (c) 2013 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class HeaderNameTest
{
   @Test
   public void testGet()
   {
      assertNull(HeaderName.get("foo"));
      assertSame(HeaderName.MANIFEST_VERSION, HeaderName.get("Manifest-Version"));
      assertSame(HeaderName.MANIFEST_VERSION, HeaderName.get("Manifest-version"));
   }

   @Test
   public void testGetByName()
   {
      assertNull(HeaderName.get("foo"));
      assertNull(HeaderName.getByName("Manifest-Version"));
      assertSame(HeaderName.MANIFEST_VERSION, HeaderName.getByName("MANIFEST_VERSION"));
   }

}
