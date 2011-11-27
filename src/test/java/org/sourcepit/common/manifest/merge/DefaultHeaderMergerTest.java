/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.merge;

import junit.framework.TestCase;

public class DefaultHeaderMergerTest extends TestCase
{
   public void testComputeNewValue() throws Exception
   {
      DefaultHeaderMerger merger = new DefaultHeaderMerger();
      assertEquals("", merger.computeNewValue("", "", ""));
      assertEquals("hallo", merger.computeNewValue("", "", "hallo"));
      assertEquals("hallo", merger.computeNewValue("", null, "hallo"));
      assertEquals("", merger.computeNewValue("", "hallo", ""));
      assertNull(merger.computeNewValue("", "hallo", null));
      assertNull(merger.computeNewValue("", null, null));
   }
}
