/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi.resource;

import org.eclipse.emf.common.util.URI;
import org.sourcepit.common.manifest.osgi.parser.BundleManifestBuilder;
import org.sourcepit.common.manifest.parser.ManifestBuilder;
import org.sourcepit.common.manifest.resource.ManifestResourceImpl;

/**
 * @author Bernd
 */
public class BundleManifestResourceImpl extends ManifestResourceImpl
{
   public BundleManifestResourceImpl()
   {
      super();
   }

   public BundleManifestResourceImpl(boolean make72Safe)
   {
      super(make72Safe);
   }

   public BundleManifestResourceImpl(URI uri)
   {
      super(uri);
   }

   public BundleManifestResourceImpl(URI uri, boolean make72Safe)
   {
      super(uri, make72Safe);
   }
   
   @Override
   protected ManifestBuilder createManifestBuilder()
   {
      return new BundleManifestBuilder();
   }
}
