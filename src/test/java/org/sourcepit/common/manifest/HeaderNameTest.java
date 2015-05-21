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

package org.sourcepit.common.manifest;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class HeaderNameTest {
   @Test
   public void testGet() {
      assertNull(HeaderName.get("foo"));
      assertSame(HeaderName.MANIFEST_VERSION, HeaderName.get("Manifest-Version"));
      assertSame(HeaderName.MANIFEST_VERSION, HeaderName.get("Manifest-version"));
   }

   @Test
   public void testGetByName() {
      assertNull(HeaderName.get("foo"));
      assertNull(HeaderName.getByName("Manifest-Version"));
      assertSame(HeaderName.MANIFEST_VERSION, HeaderName.getByName("MANIFEST_VERSION"));
   }

}
