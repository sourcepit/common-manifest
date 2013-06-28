/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi.parser;

import java.util.Map;

import org.sourcepit.common.manifest.Manifest;
import org.sourcepit.common.manifest.osgi.BundleManifestFactory;
import org.sourcepit.common.manifest.parser.ManifestBuilder;

/**
 * @author Bernd
 */
public class BundleManifestBuilder extends ManifestBuilder
{
   public BundleManifestBuilder()
   {
      super();
   }
   
   public BundleManifestBuilder(Map<?, ?> options)
   {
      super(options);
   }
   
   @Override
   protected Manifest createManifest()
   {
      return BundleManifestFactory.eINSTANCE.createBundleManifest();
   }
}
