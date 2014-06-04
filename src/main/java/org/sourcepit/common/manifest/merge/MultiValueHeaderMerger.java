/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.merge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

/**
 * @author Bernd
 */
public class MultiValueHeaderMerger implements HeaderMerger
{
   private String separator = ",";
   private boolean unique = true;

   public MultiValueHeaderMerger()
   {
      super();
   }

   public void setSeparator(String separator)
   {
      this.separator = separator;
   }

   public String getSeparator()
   {
      return separator;
   }

   public void setUnique(boolean unique)
   {
      this.unique = unique;
   }

   public boolean isUnique()
   {
      return unique;
   }

   @Override
   public String computeNewValue(String headerName, String targetValue, String sourceValue)
   {
      Collection<String> targetValues = parse(targetValue);
      Collection<String> sourceValues = parse(sourceValue);

      targetValues.addAll(sourceValues);
      return buildValue(targetValues);
   }

   private Collection<String> parse(String value)
   {
      final Collection<String> values = unique ? new LinkedHashSet<String>() : new ArrayList<String>();
      if (value != null)
      {
         Collections.addAll(values, split(value));
      }
      return values;
   }

   private String[] split(String value)
   {
      if (value.equals(separator))
      {
         return new String[] { "", "" };
      }
      return value.split(separator);
   }

   private String buildValue(Collection<String> values)
   {
      final StringBuilder sb = new StringBuilder();
      for (String value : values)
      {
         sb.append(value);
         sb.append(separator);
      }
      if (sb.length() > 0)
      {
         sb.delete(sb.length() - separator.length(), sb.length());
         return sb.toString();
      }
      return null;
   }

   @Override
   public boolean isResponsibleFor(String sectionName, String headerName, String targetValue, String sourceValue)
   {
      return true;
   }

}
