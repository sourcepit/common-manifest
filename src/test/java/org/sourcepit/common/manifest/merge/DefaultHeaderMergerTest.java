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

   public void testSourceDominantFlag() throws Exception
   {
      DefaultHeaderMerger merger = new DefaultHeaderMerger(false);
      assertEquals("", merger.computeNewValue("", "", ""));
      assertEquals("hallo", merger.computeNewValue("", "hallo", ""));
      assertEquals("hallo", merger.computeNewValue("", "hallo", null));
      assertEquals("", merger.computeNewValue("", "", "hallo"));
      assertNull(merger.computeNewValue("", null, "hallo"));
      assertNull(merger.computeNewValue("", null, null));
   }
}
