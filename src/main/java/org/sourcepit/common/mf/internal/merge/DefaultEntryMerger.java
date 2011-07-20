/*
 * Copyright (C) 2007 Innovations Softwaretechnologie GmbH, Immenstaad, Germany. All rights reserved.
 */

package org.sourcepit.common.mf.internal.merge;
/**
 * @author Bernd
 */
public class DefaultEntryMerger extends AbstractEntryMerger
{
   @Override
   public String computeNewValue(String entryName, String leftValue, String rightValue)
   {
      return rightValue;
   }
}
