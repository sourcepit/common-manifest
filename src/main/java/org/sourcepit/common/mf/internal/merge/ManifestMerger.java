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
   private final List<AbstractEntryMerger> entryMergers = new ArrayList<AbstractEntryMerger>();

   public List<AbstractEntryMerger> getEntryMergers()
   {
      return entryMergers;
   }

   // adder for maven mojo configuration injection
   public void addEntryMergers(List<AbstractEntryMerger> entryMergers)
   {
      this.entryMergers.addAll(entryMergers);
   }

   /**
    * {@inheritDoc}
    */
   public void merge(Manifest target, Manifest source)
   {
      final EMap<String, String> targetEntries = target.getEntries();
      final EMap<String, String> sourceEntries = source.getEntries();
      mergeEntries(null, targetEntries, sourceEntries);

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

         final EMap<String, String> targetEntries = targetSection.getEntries();
         final EMap<String, String> sourceEntries = sourceSection.getEntries();
         mergeEntries(sectionName, targetEntries, sourceEntries);

         if (targetEntries.isEmpty())
         {
            targetSectionMap.remove(sectionName);
            targetSections.remove(targetSection);
         }
      }
   }

   private void mergeEntries(final String sectionName, final EMap<String, String> targetEntries,
      final EMap<String, String> sourceEntries)
   {
      for (Entry<String, String> entry : sourceEntries)
      {
         final String entryName = entry.getKey();
         final String targetValue = targetEntries.get(entryName);
         final String sourceValue = entry.getValue();
         final String newValue = getEntryMerger(sectionName, entryName).computeNewValue(entryName, targetValue,
            sourceValue);
         if (newValue == null)
         {
            targetEntries.removeKey(entryName);
         }
         else
         {
            targetEntries.put(entryName, newValue);
         }
      }
   }

   private AbstractEntryMerger getEntryMerger(String sectionName, String entryName)
   {
      for (AbstractEntryMerger merger : this.entryMergers)
      {
         if (merger.isEntryMergerFor(entryName))
         {
            return merger;
         }
      }
      return new DefaultEntryMerger();
   }
}
