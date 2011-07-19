/*
 * Copyright (C) 2011 Bosch Software Innovations GmbH. All rights reserved.
 */

package org.sourcepit.common.mf.internal.resource;

import java.io.InputStream;
import java.net.URL;

import junit.framework.TestCase;

import org.apache.commons.io.IOUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.sourcepit.common.mf.internal.model.Manifest;

public class ManifestResourceImplTest extends TestCase
{
   public void testLoadFromUri() throws Exception
   {
      URL url = getClass().getClassLoader().getResource("MANIFEST.MF");
      assertNotNull(url);
      URI uri = URI.createURI(url.toString());

      Resource resource = new ManifestResourceImpl();
      resource.setURI(uri);
      resource.load(null);

      Manifest manifest = (Manifest) resource.getContents().get(0);
      assertNotNull(manifest);
   }

   public void testLoadFromStream() throws Exception
   {
      InputStream inputStream = getClass().getClassLoader().getResourceAsStream("MANIFEST.MF");
      assertNotNull(inputStream);
      try
      {
         Resource resource = new ManifestResourceImpl();
         resource.load(inputStream, null);

         Manifest manifest = (Manifest) resource.getContents().get(0);
         assertNotNull(manifest);
      }
      finally
      {
         IOUtils.closeQuietly(inputStream);
      }
   }
}
