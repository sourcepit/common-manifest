/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi.resource;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.sourcepit.common.manifest.merge.BytesByLine;
import org.sourcepit.common.manifest.osgi.parser.GenericManifestBuilder;
import org.sourcepit.common.manifest.parser.ManifestBuilder;
import org.sourcepit.common.manifest.resource.ManifestResourceImpl;

/**
 * @author Bernd
 */
public class GenericManifestResourceImpl extends ManifestResourceImpl
{
   public GenericManifestResourceImpl()
   {
      super();
   }

   public GenericManifestResourceImpl(BytesByLine bytesByLine)
   {
      super(bytesByLine);
   }

   public GenericManifestResourceImpl(URI uri)
   {
      super(uri);
   }

   public GenericManifestResourceImpl(URI uri, BytesByLine bytesByLine)
   {
      super(uri, bytesByLine);
   }

   @Override
   protected ManifestBuilder createManifestBuilder(Map<?, ?> options)
   {
      return new GenericManifestBuilder(options);
   }
}
