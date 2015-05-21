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
public enum BytesByLine {
   UNLIMITED, _72, _512;

   public static BytesByLine parse(String string) {
      if ("unlimited".equalsIgnoreCase(string) || "-1".equals(string)) {
         return UNLIMITED;
      }
      if ("72".equals(string)) {
         return _72;
      }
      if ("512".equals(string)) {
         return _512;
      }
      throw new IllegalArgumentException("Invalid bytes by line literal: " + string);
   }
}