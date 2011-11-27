/*
 * Copyright (C) 2007 Innovations Softwaretechnologie GmbH, Immenstaad, Germany. All rights reserved.
 */

package org.sourcepit.common.manifest.merge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bernd
 */
public abstract class AbstractHeaderMerger
{
   private final List<String> headerNames = new ArrayList<String>();

   public List<String> getHeaderNames()
   {
      return headerNames;
   }

   // adder for maven mojo configuration injection
   public void addHeaderNames(List<String> headerNames)
   {
      this.headerNames.addAll(headerNames);
   }

   public boolean isHeaderMergerFor(String headerName)
   {
      return headerNames.contains(headerName);
   }

   public abstract String computeNewValue(String headerName, String targetValue, String sourceValue);
}
