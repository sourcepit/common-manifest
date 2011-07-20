/*
 * Copyright (C) 2011 Bosch Software Innovations GmbH. All rights reserved.
 */

package org.sourcepit.common.mf.internal.merge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.sourcepit.common.mf.internal.model.Manifest;
import org.sourcepit.common.mf.internal.model.ManifestFactory;
import org.sourcepit.common.mf.internal.model.Section;

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

   /**
    * {@inheritDoc}
    */
   public void merge(Manifest target, Manifest source)
   {
      final EMap<String, String> targetHeaders = target.getHeaders();
      final EMap<String, String> sourceHeaders = source.getHeaders();
      mergeHeaders(null, targetHeaders, sourceHeaders);

      final EList<Section> targetSections = target.getSections();
      final EList<Section> sourceSections = source.getSections();
      mergeSections(targetSections, sourceSections);
   }

   private void mergeSections(EList<Section> targetSections, EList<Section> sourceSections)
   {
      final Map<String, Section> targetSectionMap = new HashMap<String, Section>();
      for (Section targetSection : targetSections)
      {
         targetSectionMap.put(targetSection.getName(), targetSection);
      }
      for (Section sourceSection : sourceSections)
      {
         final String sectionName = sourceSection.getName();

         Section targetSection = targetSectionMap.get(sectionName);
         if (targetSection == null)
         {
            targetSection = ManifestFactory.eINSTANCE.createSection();
            targetSection.setName(sectionName);
            targetSectionMap.put(sectionName, targetSection);
            targetSections.add(targetSection);
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
