/*
 * Copyright (C) 2007 Innovations Softwaretechnologie GmbH, Immenstaad, Germany. All rights reserved.
 */

package org.sourcepit.common.mf.internal.merge;

import junit.framework.TestCase;

/**
 * @author Bernd
 */
public class MultiValueHeaderMergerTest extends TestCase
{
   public void test1() throws Exception
   {
      String newValue;

      MultiValueHeaderMerger merger = new MultiValueHeaderMerger();
      newValue = merger.computeNewValue("", "", "");
      assertEquals("", newValue);

      newValue = merger.computeNewValue("", ",", "");
      assertEquals("", newValue);

      newValue = merger.computeNewValue("", ",", ",");
      assertEquals("", newValue);

      newValue = merger.computeNewValue("", "one,two", "two,three");
      assertEquals("one,two,three", newValue);
   }
}
