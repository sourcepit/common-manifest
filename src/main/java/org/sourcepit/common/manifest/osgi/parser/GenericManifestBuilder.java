/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi.parser;

import java.util.Map;

import org.sourcepit.common.manifest.Manifest;
import org.sourcepit.common.manifest.osgi.BundleHeaderName;
import org.sourcepit.common.manifest.osgi.BundleManifest;
import org.sourcepit.common.manifest.osgi.BundleManifestFactory;
import org.sourcepit.common.manifest.parser.ManifestBuilder;

/**
 * @author Bernd
 */
public class GenericManifestBuilder extends ManifestBuilder
{
   public GenericManifestBuilder()
   {
      super();
   }

   public GenericManifestBuilder(Map<?, ?> options)
   {
      super(options);
   }

   public Manifest getManifest()
   {
      if (hasBundleManifestHeaders())
      {
         BundleManifest bundleManifest = BundleManifestFactory.eINSTANCE.createBundleManifest();
         bundleManifest.getHeaders().addAll(manifest.getHeaders());
         bundleManifest.getSections().addAll(manifest.getSections());
         return bundleManifest;
      }
      return manifest;
   }

   protected boolean hasBundleManifestHeaders()
   {
      for (BundleHeaderName bundleHeaderName : BundleHeaderName.VALUES)
      {
         if (manifest.getHeader(bundleHeaderName.getLiteral()) != null)
         {
            return true;
         }
      }
      return false;
   };
}
