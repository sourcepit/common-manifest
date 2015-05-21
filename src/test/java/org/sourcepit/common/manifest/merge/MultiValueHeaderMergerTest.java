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

/**
 * @author Bernd
 */
public class MultiValueHeaderMergerTest extends TestCase {
   public void test1() throws Exception {
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
