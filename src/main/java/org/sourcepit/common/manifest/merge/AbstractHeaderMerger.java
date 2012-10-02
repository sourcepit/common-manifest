/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
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
