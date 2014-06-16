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
import org.sourcepit.common.manifest.merge.BytesByLine;
import org.sourcepit.common.manifest.merge.ManifestWriter;
import org.sourcepit.common.manifest.parser.HeaderParser;
import org.sourcepit.common.manifest.parser.ManifestBuilder;
import org.sourcepit.common.manifest.parser.ManifestParser;

public class ManifestResourceImpl extends ResourceImpl implements ManifestResource
{
   private final BytesByLine bytesByLine;

   public ManifestResourceImpl()
   {
      this(BytesByLine._512);
   }

   public ManifestResourceImpl(BytesByLine bytesByLine)
   {
      super();
      this.bytesByLine = bytesByLine;
   }

   public ManifestResourceImpl(URI uri)
   {
      this(uri, BytesByLine._512);
   }

   public ManifestResourceImpl(URI uri, BytesByLine bytesByLine)
   {
      super(uri);
      this.bytesByLine = bytesByLine;
   }

   @Override
   public BytesByLine getBytesByLine()
   {
      return bytesByLine;
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
      BytesByLine bytesByLine = getBytesByLine();
      if (options != null)
      {
         final Object object = options.get(OPTION_BYTES_BY_LINE);
         if (object != null)
         {
            bytesByLine = BytesByLine.parse(object.toString());
         }
      }

      for (EObject eObject : getContents())
      {
         doSave((Manifest) eObject, outputStream, bytesByLine);
      }
   }

   protected void doSave(Manifest manifest, OutputStream outputStream, BytesByLine bytesByLine) throws IOException
   {
      final String versionHeaderName = HeaderName.MANIFEST_VERSION.getLiteral();

      final ManifestWriter writer = new ManifestWriter(outputStream, bytesByLine);
      writer.startMain(manifest.getHeaderValue(versionHeaderName));
      for (Entry<String, String> header : manifest.getHeaders())
      {
         final String name = header.getKey();
         if (!versionHeaderName.equals(name))
         {
            writer.attribute(name, getValueString(header, bytesByLine));
         }
      }
      writer.endMain();

      for (Entry<String, EMap<String, String>> section : manifest.getSections())
      {
         writer.startSection(section.getKey());
         for (Entry<String, String> entry : section.getValue())
         {
            writer.attribute(entry.getKey(), getValueString(entry, bytesByLine));
         }
         writer.endSection();
      }
   }

   private String getValueString(Entry<String, String> header, BytesByLine bytesByLine)
   {
      return HeaderParser.INSTANCE.toValueString((Parseable) header, true);
   }
}
