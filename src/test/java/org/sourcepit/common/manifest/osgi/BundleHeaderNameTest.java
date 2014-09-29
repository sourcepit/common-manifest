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
