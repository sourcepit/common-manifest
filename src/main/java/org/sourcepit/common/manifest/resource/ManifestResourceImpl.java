/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.sourcepit.common.manifest.HeaderName;
import org.sourcepit.common.manifest.Manifest;
import org.sourcepit.common.manifest.Parseable;
import org.sourcepit.common.manifest.merge.ManifestWriter;
import org.sourcepit.common.manifest.parser.HeaderParser;
import org.sourcepit.common.manifest.parser.ManifestBuilder;
import org.sourcepit.common.manifest.parser.ManifestParser;

public class ManifestResourceImpl extends ResourceImpl implements ManifestResource
{
   private final boolean make72Safe;

   public ManifestResourceImpl()
   {
      this(false);
   }

   public ManifestResourceImpl(boolean make72Safe)
   {
      super();
      this.make72Safe = make72Safe;
   }

   public ManifestResourceImpl(URI uri)
   {
      this(uri, false);
   }

   public ManifestResourceImpl(URI uri, boolean make72Safe)
   {
      super(uri);
      this.make72Safe = make72Safe;
   }

   /**
    * {@inheritDoc}
    */
   public boolean isMake72Safe()
   {
      return make72Safe;
   }

   @Override
   protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException
   {
      final ManifestBuilder builder = createManifestBuilder(options);
      new ManifestParser().parse(inputStream, builder);
      final Manifest manifest = builder.getManifest();
      if (manifest != null)
      {
         getContents().add(manifest);
      }
   }

   protected ManifestBuilder createManifestBuilder(Map<?, ?> options)
   {
      return new ManifestBuilder(options);
   }

   @Override
   protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException
   {
      boolean make72Safe = isMake72Safe();
      if (options != null)
      {
         final Object object = options.get(OPTION_MAKE72SAFE);
         if (object != null)
         {
            make72Safe = Boolean.valueOf(object.toString());
         }
      }

      for (EObject eObject : getContents())
      {
         doSave((Manifest) eObject, outputStream, make72Safe);
      }
   }

   protected void doSave(Manifest manifest, OutputStream outputStream, boolean make72Safe) throws IOException
   {
      final String versionHeaderName = HeaderName.MANIFEST_VERSION.getLiteral();

      final ManifestWriter writer = new ManifestWriter(outputStream, make72Safe);
      writer.startMain(manifest.getHeaderValue(versionHeaderName));
      for (Entry<String, String> header : manifest.getHeaders())
      {
         final String name = header.getKey();
         if (!versionHeaderName.equals(name))
         {
            writer.attribute(name, getValueString(header, make72Safe));
         }
      }
      writer.endMain();

      for (Entry<String, EMap<String, String>> section : manifest.getSections())
      {
         writer.startSection(section.getKey());
         for (Entry<String, String> entry : section.getValue())
         {
            writer.attribute(entry.getKey(), getValueString(entry, make72Safe));
         }
         writer.endSection();
      }
   }

   private String getValueString(Entry<String, String> header, boolean make72Safe)
   {
      if (make72Safe)
      {
         return header.getValue();
      }
      else
      {
         return HeaderParser.INSTANCE.toValueString((Parseable) header, true);
      }
   }
}
