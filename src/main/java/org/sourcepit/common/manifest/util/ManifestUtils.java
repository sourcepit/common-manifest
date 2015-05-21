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

package org.sourcepit.common.manifest.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.eclipse.emf.common.util.URI;
import org.sourcepit.common.manifest.Manifest;
import org.sourcepit.common.manifest.osgi.parser.GenericManifestBuilder;
import org.sourcepit.common.manifest.osgi.resource.GenericManifestResourceImpl;
import org.sourcepit.common.manifest.resource.ManifestResource;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public final class ManifestUtils {
   private ManifestUtils() {
      super();
   }

   public static Manifest readJarManifest(File jarFile) throws IOException {
      final URI manifestUri = URI.createURI("jar:" + URI.createFileURI(jarFile.getAbsolutePath()) + "!/"
         + JarFile.MANIFEST_NAME);

      final ManifestResource resource = new GenericManifestResourceImpl(manifestUri);

      ZipInputStream jarIn = null;
      try {
         jarIn = new ZipInputStream(new BufferedInputStream(FileUtils.openInputStream(jarFile)));
         ZipEntry zipEntry = jarIn.getNextEntry();
         while (zipEntry != null) {
            if (JarFile.MANIFEST_NAME.equals(zipEntry.getName())) {
               resource.load(jarIn, null);
               break;
            }
            zipEntry = jarIn.getNextEntry();
         }
      }
      finally {
         IOUtils.closeQuietly(jarIn);
      }

      return (Manifest) resource.getContents().get(0);

   }

   public static Manifest toManifest(java.util.jar.Manifest manifest) {
      GenericManifestBuilder builder = new GenericManifestBuilder();

      // map main section
      builder.visitSection(true, null);
      for (Map.Entry<Object, Object> header : manifest.getMainAttributes().entrySet()) {
         builder.visitHeader(header.getKey().toString(), header.getValue().toString());
      }

      // map other section
      for (Map.Entry<String, Attributes> entry : manifest.getEntries().entrySet()) {
         builder.visitSection(false, entry.getKey());
         Attributes attributes = entry.getValue();
         for (Map.Entry<Object, Object> header : attributes.entrySet()) {
            builder.visitHeader(header.getKey().toString(), header.getValue().toString());
         }
      }
      return builder.getManifest();
   }
}
