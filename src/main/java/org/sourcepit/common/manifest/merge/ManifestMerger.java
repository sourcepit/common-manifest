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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.sourcepit.common.manifest.Manifest;
import org.sourcepit.common.manifest.ManifestSection;

public class ManifestMerger
{
   private final List<HeaderMerger> customerHeaderMergers;
   private HeaderMerger defaultHeaderMerger;

   public ManifestMerger()
   {
      this.customerHeaderMergers = new ArrayList<HeaderMerger>();
   }

   public void merge(Manifest target, Manifest source)
   {
      merge(target, source, true);
   }


   @SuppressWarnings({ "unchecked", "rawtypes" })
   public void merge(Manifest target, Manifest source, boolean sourceDominant)
   {
      this.defaultHeaderMerger = new DefaultHeaderMerger(sourceDominant);

      final EMap<String, String> targetHeaders = target.getHeaders();
      final EMap<String, String> sourceHeaders = source.getHeaders();
      mergeHeaders(null, targetHeaders, sourceHeaders);

      final EList<ManifestSection> targetSections = (EList) target.getSections();
      final EList<ManifestSection> sourceSections = (EList) source.getSections();
      mergeSections(target, targetSections, sourceSections);
   }

   private void mergeSections(Manifest target, EList<ManifestSection> targetSections,
      EList<ManifestSection> sourceSections)
   {
      final Map<String, ManifestSection> targetSectionMap = new HashMap<String, ManifestSection>();
      for (ManifestSection targetSection : targetSections)
      {
         targetSectionMap.put(targetSection.getName(), targetSection);
      }

      for (ManifestSection sourceSection : sourceSections)
      {
         final String sectionName = sourceSection.getName();

         ManifestSection targetSection = targetSectionMap.get(sectionName);
         if (targetSection != null)
         {
            // merge section headers
            final EMap<String, String> targetHeaders = targetSection.getHeaders();
            final EMap<String, String> sourceHeaders = sourceSection.getHeaders();
            mergeHeaders(sectionName, targetHeaders, sourceHeaders);
         }
         else
         {
            // add section if not existent
            targetSection = target.getSection(sectionName, true);
            targetSection.getHeaders().addAll(sourceSection.getHeaders());
            targetSectionMap.put(sectionName, targetSection);
         }

         // delete empty sections
         final EMap<String, String> targetHeaders = targetSection.getHeaders();
         if (targetHeaders.isEmpty())
         {
            targetSectionMap.remove(sectionName);
            targetSections.remove(targetSection);
         }
      }
   }

   private void mergeHeaders(final String sectionName, final EMap<String, String> targetHeaders,
      final EMap<String, String> sourceHeaders)
   {
      for (Entry<String, String> header : sourceHeaders)
      {
         final String headerName = header.getKey();
         final String sourceValue = header.getValue();
         if (targetHeaders.containsKey(headerName))
         {
            // merge header value
            final String targetValue = targetHeaders.get(headerName);
            final String newValue = getHeaderMerger(sectionName, headerName, targetValue, sourceValue).computeNewValue(
               headerName, targetValue, sourceValue);
            targetHeaders.put(headerName, newValue);
         }
         else
         {
            // add header if not existent
            targetHeaders.put(headerName, sourceValue);
         }

         // delete empty headers
         final String newValue = targetHeaders.get(headerName);
         if (newValue == null)
         {
            targetHeaders.removeKey(headerName);
         }
      }
   }

   private HeaderMerger getHeaderMerger(String sectionName, String headerName, String targetValue, String sourceValue)
   {
      for (HeaderMerger merger : this.customerHeaderMergers)
      {
         if (merger.isResponsibleFor(sectionName, headerName, targetValue, sourceValue))
         {
            return merger;
         }
      }
      return defaultHeaderMerger;
   }

   public List<HeaderMerger> getCustomHeaderMergers()
   {
      return customerHeaderMergers;
   }

   public void addCustomHeaderMergers(List<HeaderMerger> headerMergers)
   {
      this.customerHeaderMergers.addAll(headerMergers);
   }


}
