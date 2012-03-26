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
import org.sourcepit.common.manifest.merge.ManifestWriter;
import org.sourcepit.common.manifest.parser.ManifestBuilder;
import org.sourcepit.common.manifest.parser.ManifestParser;

public class ManifestResourceImpl extends ResourceImpl
{
   private final boolean make72Safe;

   public ManifestResourceImpl()
   {
      this(true);
   }

   public ManifestResourceImpl(boolean make72Safe)
   {
      super();
      this.make72Safe = make72Safe;
   }

   public ManifestResourceImpl(URI uri)
   {
      this(uri, true);
   }

   public ManifestResourceImpl(URI uri, boolean make72Safe)
   {
      super(uri);
      this.make72Safe = make72Safe;
   }

   public boolean isMake72Safe()
   {
      return make72Safe;
   }

   @Override
   protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException
   {
      final ManifestBuilder builder = createManifestBuilder();
      new ManifestParser().parse(inputStream, builder);
      final Manifest manifest = builder.getManifest();
      if (manifest != null)
      {
         getContents().add(manifest);
      }
   }

   protected ManifestBuilder createManifestBuilder()
   {
      return new ManifestBuilder();
   }

   @Override
   protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException
   {
      for (EObject eObject : getContents())
      {
         doSave((Manifest) eObject, outputStream);
      }
   }

   protected void doSave(Manifest manifest, OutputStream outputStream) throws IOException
   {
      final String versionHeaderName = HeaderName.MANIFEST_VERSION.getLiteral();

      final ManifestWriter writer = new ManifestWriter(outputStream, isMake72Safe());
      writer.startMain(manifest.getHeaderValue(versionHeaderName));
      for (Entry<String, String> header : manifest.getHeaders())
      {
         final String name = header.getKey();
         if (!versionHeaderName.equals(name))
         {
            writer.attribute(name, header.getValue());
         }
      }
      writer.endMain();

      for (Entry<String, EMap<String, String>> section : manifest.getSections())
      {
         writer.startSection(section.getKey());
         for (Entry<String, String> entry : section.getValue())
         {
            writer.attribute(entry.getKey(), entry.getValue());
         }
         writer.endSection();
      }
   }
}
