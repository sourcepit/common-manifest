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
      EMap<String, String> entries = manifest.getEntries();

      entries.put("c", "123");
      entries.put("b", "456");
      entries.put("a", "789");

      for (Entry<String, String> entry : entries)
      {
         System.out.println(entry.getKey() + ": " + entry.getValue());
      }

      System.out.println(entries.get(0));
      System.out.println(entries.get(1));
      System.out.println(entries.get(2));
   }
}
