/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.merge;

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
