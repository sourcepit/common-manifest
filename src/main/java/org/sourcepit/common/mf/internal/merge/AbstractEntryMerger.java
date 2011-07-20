/*
 * Copyright (C) 2007 Innovations Softwaretechnologie GmbH, Immenstaad, Germany. All rights reserved.
 */

package org.sourcepit.common.mf.internal.merge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bernd
 */
public abstract class AbstractEntryMerger
{
   private final List<String> entryNames = new ArrayList<String>();

   public List<String> getEntryNames()
   {
      return entryNames;
   }

   // adder for maven mojo configuration injection
   public void addEntryNames(List<String> entryNames)
   {
      this.entryNames.addAll(entryNames);
   }

   public boolean isEntryMergerFor(String entryName)
   {
      return entryNames.contains(entryName);
   }

   public abstract String computeNewValue(String entryName, String targetValue, String sourceValue);
}
