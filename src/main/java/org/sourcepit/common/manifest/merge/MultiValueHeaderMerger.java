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
