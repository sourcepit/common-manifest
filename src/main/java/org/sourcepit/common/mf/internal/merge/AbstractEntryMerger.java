/*
 * Copyright (C) 2007 Innovations Softwaretechnologie GmbH, Immenstaad, Germany. All rights reserved.
 */

package org.sourcepit.common.mf.internal.merge;

/**
 * @author Bernd
 */
public abstract class AbstractEntryMerger
{
   public abstract String computeNewValue(String entryName, String targetValue, String sourceValue);
}
