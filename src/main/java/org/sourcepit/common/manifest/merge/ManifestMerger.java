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
   private final List<AbstractHeaderMerger> headerMergers = new ArrayList<AbstractHeaderMerger>();

   public List<AbstractHeaderMerger> getHeaderMergers()
   {
      return headerMergers;
   }

   // adder for maven mojo configuration injection
   public void addHeaderMergers(List<AbstractHeaderMerger> headerMergers)
   {
      this.headerMergers.addAll(headerMergers);
   }

   @SuppressWarnings({ "unchecked", "rawtypes" })
   public void merge(Manifest target, Manifest source)
   {
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
         if (targetSection == null)
         {
            targetSection = target.getSection(sectionName, true);
            targetSectionMap.put(sectionName, targetSection);
         }

         final EMap<String, String> targetHeaders = targetSection.getHeaders();
         final EMap<String, String> sourceHeaders = sourceSection.getHeaders();
         mergeHeaders(sectionName, targetHeaders, sourceHeaders);

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
         final String targetValue = targetHeaders.get(headerName);
         final String sourceValue = header.getValue();
         final String newValue = getHeaderMerger(sectionName, headerName).computeNewValue(headerName, targetValue,
            sourceValue);
         if (newValue == null)
         {
            targetHeaders.removeKey(headerName);
         }
         else
         {
            targetHeaders.put(headerName, newValue);
         }
      }
   }

   private AbstractHeaderMerger getHeaderMerger(String sectionName, String headerName)
   {
      for (AbstractHeaderMerger merger : this.headerMergers)
      {
         if (merger.isHeaderMergerFor(headerName))
         {
            return merger;
         }
      }
      return new DefaultHeaderMerger();
   }
}
