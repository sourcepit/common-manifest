/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.eclipse.emf.common.util.URI;
import org.sourcepit.common.manifest.Manifest;
import org.sourcepit.common.manifest.osgi.resource.GenericManifestResourceImpl;
import org.sourcepit.common.manifest.resource.ManifestResource;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public final class ManifestUtils
{
   private ManifestUtils()
   {
      super();
   }

   public static Manifest readJarManifest(File jarFile) throws IOException
   {
      final URI manifestUri = URI.createURI("jar:" + URI.createFileURI(jarFile.getAbsolutePath()) + "!/"
         + JarFile.MANIFEST_NAME);

      final ManifestResource resource = new GenericManifestResourceImpl(manifestUri);

      ZipInputStream jarIn = null;
      try
      {
         jarIn = new ZipInputStream(new BufferedInputStream(FileUtils.openInputStream(jarFile)));
         ZipEntry zipEntry = jarIn.getNextEntry();
         while (zipEntry != null)
         {
            if (JarFile.MANIFEST_NAME.equals(zipEntry.getName()))
            {
               resource.load(jarIn, null);
               break;
            }
            zipEntry = jarIn.getNextEntry();
         }
      }
      finally
      {
         IOUtils.closeQuietly(jarIn);
      }

      return (Manifest) resource.getContents().get(0);

   }
}
