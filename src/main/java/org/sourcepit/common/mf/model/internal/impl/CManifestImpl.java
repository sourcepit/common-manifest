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
      return getHeaders().get(Name.MANIFEST_VERSION.toString());
   }

   @Override
   public void setVersion(String version)
   {
      if (getVersion() != null)
      {
         getHeaders().put(Name.MANIFEST_VERSION.toString(), version);
      }
      else
      {
         getHeaders().put(Name.MANIFEST_VERSION.toString(), version);
         int idx = getHeaders().indexOfKey(Name.MANIFEST_VERSION.toString());
         if (idx != 0)
         {
            getHeaders().move(0, idx);
         }
      }
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
