/*
 * Copyright (C) 2007 Innovations Softwaretechnologie GmbH, Immenstaad, Germany. All rights reserved.
 */

package org.sourcepit.common.manifest.merge;
/**
 * @author Bernd
 */
public class DefaultHeaderMerger extends AbstractHeaderMerger
{
   @Override
   public String computeNewValue(String headerName, String leftValue, String rightValue)
   {
      return rightValue;
   }
}
