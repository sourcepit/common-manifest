/*
 * Copyright (C) 2011 Bosch Software Innovations GmbH. All rights reserved.
 */

package org.sourcepit.common.mf.internal.merge;

import junit.framework.TestCase;

public class DefaultEntryMergerTest extends TestCase
{
   public void testComputeNewValue() throws Exception
   {
      DefaultEntryMerger merger = new DefaultEntryMerger();
      assertEquals("", merger.computeNewValue("", "", ""));
      assertEquals("hallo", merger.computeNewValue("", "", "hallo"));
      assertEquals("hallo", merger.computeNewValue("", null, "hallo"));
      assertEquals("", merger.computeNewValue("", "hallo", ""));
      assertNull(merger.computeNewValue("", "hallo", null));
      assertNull(merger.computeNewValue("", null, null));
   }
}
