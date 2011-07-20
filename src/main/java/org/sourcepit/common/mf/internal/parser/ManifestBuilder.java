/*
 * Copyright (C) 2007 Innovations Softwaretechnologie GmbH, Immenstaad, Germany. All rights reserved.
 */

package org.sourcepit.common.mf.internal.parser;

import org.sourcepit.common.mf.internal.model.AbstractSection;
import org.sourcepit.common.mf.internal.model.Manifest;
import org.sourcepit.common.mf.internal.model.ManifestFactory;
import org.sourcepit.common.mf.internal.model.Section;

/**
 * @author Bernd
 */
public class ManifestBuilder extends AbstractManifestVisitor
{
   protected Manifest manifest;

   protected AbstractSection current;

   public Manifest getManifest()
   {
      return manifest;
   }

   @Override
   public void visitSection(boolean isMainSection, String name)
   {
      if (isMainSection)
      {
         manifest = createManifest();
         current = manifest;
      }
      else
      {
         if (manifest == null)
         {
            manifest = createManifest();
         }
         current = createSection(name);
      }
   }

   @Override
   public void visitHeader(String name, String value)
   {
      current.getHeaders().put(name, value);
   }

   protected Manifest createManifest()
   {
      return ManifestFactory.eINSTANCE.createManifest();
   }

   protected Section createSection(String name)
   {
      return manifest.getSection(name, true);
   }
}
