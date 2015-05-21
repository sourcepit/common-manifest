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
/**
 * @author Bernd
 */
public class DefaultHeaderMerger implements HeaderMerger {
   private boolean sourceDominant = true;

   public DefaultHeaderMerger() {
      super();
   }

   public DefaultHeaderMerger(boolean sourceDominant) {
      this.sourceDominant = sourceDominant;
   }

   public boolean isSourceDominant() {
      return sourceDominant;
   }

   public void setSourceDominant(boolean sourceDominant) {
      this.sourceDominant = sourceDominant;
   }

   @Override
   public String computeNewValue(String headerName, String targetValue, String sourceValue) {
      return sourceDominant ? sourceValue : targetValue;
   }

   @Override
   public boolean isResponsibleFor(String sectionName, String headerName, String targetValue, String sourceValue) {
      return true;
   }
}
