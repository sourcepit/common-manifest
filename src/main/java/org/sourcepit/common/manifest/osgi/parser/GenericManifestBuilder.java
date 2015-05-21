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
public class GenericManifestBuilder extends ManifestBuilder {
   public GenericManifestBuilder() {
      super();
   }

   public GenericManifestBuilder(Map<?, ?> options) {
      super(options);
   }

   public Manifest getManifest() {
      if (hasBundleManifestHeaders()) {
         BundleManifest bundleManifest = BundleManifestFactory.eINSTANCE.createBundleManifest();
         bundleManifest.getHeaders().addAll(manifest.getHeaders());
         bundleManifest.getSections().addAll(manifest.getSections());
         return bundleManifest;
      }
      return manifest;
   }

   protected boolean hasBundleManifestHeaders() {
      for (BundleHeaderName bundleHeaderName : BundleHeaderName.VALUES) {
         if (manifest.getHeader(bundleHeaderName.getLiteral()) != null) {
            return true;
         }
      }
      return false;
   };
}
