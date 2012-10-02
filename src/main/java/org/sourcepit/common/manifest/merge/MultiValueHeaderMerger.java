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
import java.util.List;

/**
 * @author Bernd
 */
public class MultiValueHeaderMerger extends AbstractHeaderMerger
{
   private String separator = ",";

   private boolean unique = true;

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
   public String computeNewValue(String headerName, String leftValue, String rightValue)
   {
      Collection<String> leftValues = parse(leftValue);
      if (unique)
      {
         leftValues = new LinkedHashSet<String>(leftValues);
      }
      leftValues.addAll(parse(rightValue));
      if (leftValues.isEmpty())
      {
         return null;
      }
      final StringBuilder sb = new StringBuilder();
      for (String value : leftValues)
      {
         sb.append(value);
         sb.append(separator);
      }
      if (sb.length() > 0)
      {
         sb.delete(sb.length() - separator.length(), sb.length());
      }
      return sb.toString();
   }

   private List<String> parse(String value)
   {
      final List<String> values = new ArrayList<String>();
      if (value != null)
      {
         if (unique)
         {
            final LinkedHashSet<String> set = new LinkedHashSet<String>();
            Collections.addAll(set, split(value));
            values.addAll(set);
         }
         else
         {
            Collections.addAll(values, split(value));
         }
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

}
