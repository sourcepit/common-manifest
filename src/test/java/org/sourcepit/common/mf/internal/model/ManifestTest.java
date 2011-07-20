/*
 * Copyright (C) 2011 Bosch Software Innovations GmbH. All rights reserved.
 */

package org.sourcepit.common.mf.internal.model;

import java.util.Map.Entry;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.EMap;

public class ManifestTest extends TestCase
{
   public void testOrdering() throws Exception
   {
      Manifest manifest = ManifestFactory.eINSTANCE.createManifest();
      EMap<String, String> headers = manifest.getHeaders();

      headers.put("c", "123");
      headers.put("b", "456");
      headers.put("a", "789");

      for (Entry<String, String> header : headers)
      {
         System.out.println(header.getKey() + ": " + header.getValue());
      }

      System.out.println(headers.get(0));
      System.out.println(headers.get(1));
      System.out.println(headers.get(2));
   }
}
