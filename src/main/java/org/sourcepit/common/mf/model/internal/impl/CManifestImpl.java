/*
 * Copyright (C) 2011 Bosch Software Innovations GmbH. All rights reserved.
 */

package org.sourcepit.common.mf.model.internal.impl;

import java.util.jar.Attributes.Name;

import org.sourcepit.common.mf.internal.model.ManifestFactory;
import org.sourcepit.common.mf.internal.model.Section;

public class CManifestImpl extends ManifestImpl
{
   @Override
   public String getVersion()
   {
      return getEntries().get(Name.MANIFEST_VERSION.toString());
   }

   @Override
   public Section getSection(String name)
   {
      if (name == null)
      {
         return null;
      }
      for (Section section : getSections())
      {
         if (name.equals(section.getName()))
         {
            return section;
         }
      }
      return null;
   }

   @Override
   public Section getSection(String name, boolean createOnDemand)
   {
      Section section = getSection(name);
      if (section == null && createOnDemand)
      {
         section = ManifestFactory.eINSTANCE.createSection();
         section.setName(name);
         getSections().add(section);
      }
      return section;
   }
}
