/*
 * Copyright (C) 2011 Bosch Software Innovations GmbH. All rights reserved.
 */

package org.sourcepit.common.mf.internal.merge;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.EMap;
import org.sourcepit.common.mf.internal.model.Manifest;
import org.sourcepit.common.mf.internal.model.ManifestFactory;
import org.sourcepit.common.mf.internal.model.Section;

public class ManifestMergerTest extends TestCase
{
   public void test1() throws Exception
   {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      source.getHeaders().put("key", "value");

      new ManifestMerger().merge(target, source);

      EMap<String, String> targetHeaders = target.getHeaders();
      assertEquals(1, targetHeaders.size());
      assertEquals("value", targetHeaders.get("key"));
   }

   public void test2() throws Exception
   {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      target.getHeaders().put("key", "value");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      source.getHeaders().put("key", "value");

      new ManifestMerger().merge(target, source);

      EMap<String, String> targetHeaders = target.getHeaders();
      assertEquals(1, targetHeaders.size());
      assertEquals("value", targetHeaders.get("key"));
   }

   public void test3() throws Exception
   {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      target.getHeaders().put("key", "value");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      source.getHeaders().put("key", "new value");

      new ManifestMerger().merge(target, source);

      EMap<String, String> targetHeaders = target.getHeaders();
      assertEquals(1, targetHeaders.size());
      assertEquals("new value", targetHeaders.get("key"));
   }

   public void test4() throws Exception
   {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      target.getHeaders().put("key", "value");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      source.getHeaders().put("key", "value");
      source.getHeaders().put("key2", "value2");

      new ManifestMerger().merge(target, source);

      EMap<String, String> targetHeaders = target.getHeaders();
      assertEquals(2, targetHeaders.size());
      assertEquals("value", targetHeaders.get("key"));
      assertEquals("value2", targetHeaders.get("key2"));
   }

   public void test5() throws Exception
   {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      target.getHeaders().put("key", "value");
      target.getHeaders().put("key2", "value2");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      source.getHeaders().put("key", "value");

      new ManifestMerger().merge(target, source);

      EMap<String, String> targetHeaders = target.getHeaders();
      assertEquals(2, targetHeaders.size());
      assertEquals("value", targetHeaders.get("key"));
      assertEquals("value2", targetHeaders.get("key2"));
   }

   public void testSection1() throws Exception
   {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      Section sourceSection = source.getSection("section", true);
      sourceSection.getHeaders().put("key", "value");

      new ManifestMerger().merge(target, source);

      assertEquals(1, target.getSections().size());

      EMap<String, String> targetHeaders = target.getSection("section", false).getHeaders();
      assertEquals(1, targetHeaders.size());
      assertEquals("value", targetHeaders.get("key"));
   }

   public void testSection2() throws Exception
   {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      Section targetSection = target.getSection("section", true);
      targetSection.getHeaders().put("key", "value");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();

      new ManifestMerger().merge(target, source);

      assertEquals(1, target.getSections().size());

      EMap<String, String> targetHeaders = target.getSection("section", false).getHeaders();
      assertEquals(1, targetHeaders.size());
      assertEquals("value", targetHeaders.get("key"));
   }

   public void testSection3() throws Exception
   {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      Section targetSection = target.getSection("section", true);
      targetSection.getHeaders().put("key", "value");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      Section sourceSection = source.getSection("section", true);
      sourceSection.getHeaders().put("key", "value");

      new ManifestMerger().merge(target, source);

      assertEquals(1, target.getSections().size());

      EMap<String, String> targetHeaders = target.getSection("section", false).getHeaders();
      assertEquals(1, targetHeaders.size());
      assertEquals("value", targetHeaders.get("key"));
   }

   public void testSection4() throws Exception
   {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      Section targetSection = target.getSection("section", true);
      targetSection.getHeaders().put("key", "value");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      Section sourceSection = source.getSection("section", true);
      sourceSection.getHeaders().put("key2", "value2");

      new ManifestMerger().merge(target, source);

      assertEquals(1, target.getSections().size());

      EMap<String, String> targetHeaders = target.getSection("section", false).getHeaders();
      assertEquals(2, targetHeaders.size());
      assertEquals("value", targetHeaders.get("key"));
      assertEquals("value2", targetHeaders.get("key2"));
   }

   public void testSection5() throws Exception
   {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      Section targetSection = target.getSection("section", true);
      targetSection.getHeaders().put("key", "value");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      Section sourceSection = source.getSection("section2", true);
      sourceSection.getHeaders().put("key2", "value2");

      new ManifestMerger().merge(target, source);

      assertEquals(2, target.getSections().size());

      EMap<String, String> targetHeaders = target.getSection("section", false).getHeaders();
      assertEquals(1, targetHeaders.size());
      assertEquals("value", targetHeaders.get("key"));

      targetHeaders = target.getSection("section2", false).getHeaders();
      assertEquals(1, targetHeaders.size());
      assertEquals("value2", targetHeaders.get("key2"));
   }
}
