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

package org.sourcepit.common.manifest.parser;

import java.util.Map;

import org.sourcepit.common.manifest.AbstractSection;
import org.sourcepit.common.manifest.Manifest;
import org.sourcepit.common.manifest.ManifestFactory;
import org.sourcepit.common.manifest.ManifestSection;

/**
 * @author Bernd
 */
public class ManifestBuilder extends AbstractManifestVisitor
{
   protected Manifest manifest;

   protected AbstractSection current;

   protected Map<?, ?> options;

   public ManifestBuilder()
   {
      this(null);
   }

   public ManifestBuilder(Map<?, ?> options)
   {
      this.options = options;
   }

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
      final Map<?, ?> oldOptions = HeaderParserRegistry.getCurrentOptions();
      try
      {
         HeaderParserRegistry.setCurrentOptions(options);
         current.getHeaders().put(name, value);
      }
      finally
      {
         HeaderParserRegistry.setCurrentOptions(oldOptions);
      }
   }

   protected Manifest createManifest()
   {
      return ManifestFactory.eINSTANCE.createManifest();
   }

   protected ManifestSection createSection(String name)
   {
      return manifest.getSection(name, true);
   }
}
