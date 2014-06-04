/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
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
