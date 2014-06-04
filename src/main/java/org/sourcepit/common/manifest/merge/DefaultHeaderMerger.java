/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.merge;
/**
 * @author Bernd
 */
public class DefaultHeaderMerger implements HeaderMerger
{
   private boolean sourceDominant = true;

   public DefaultHeaderMerger()
   {
      super();
   }

   public DefaultHeaderMerger(boolean sourceDominant)
   {
      this.sourceDominant = sourceDominant;
   }

   public boolean isSourceDominant()
   {
      return sourceDominant;
   }

   public void setSourceDominant(boolean sourceDominant)
   {
      this.sourceDominant = sourceDominant;
   }

   @Override
   public String computeNewValue(String headerName, String targetValue, String sourceValue)
   {
      return sourceDominant ? sourceValue : targetValue;
   }

   @Override
   public boolean isResponsibleFor(String sectionName, String headerName, String targetValue, String sourceValue)
   {
      return true;
   }
}
