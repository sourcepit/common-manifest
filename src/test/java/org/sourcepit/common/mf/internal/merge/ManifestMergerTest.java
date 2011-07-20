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
      source.getEntries().put("key", "value");

      new ManifestMerger().merge(target, source);

      EMap<String, String> targetEntries = target.getEntries();
      assertEquals(1, targetEntries.size());
      assertEquals("value", targetEntries.get("key"));
   }

   public void test2() throws Exception
   {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      target.getEntries().put("key", "value");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      source.getEntries().put("key", "value");

      new ManifestMerger().merge(target, source);

      EMap<String, String> targetEntries = target.getEntries();
      assertEquals(1, targetEntries.size());
      assertEquals("value", targetEntries.get("key"));
   }

   public void test3() throws Exception
   {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      target.getEntries().put("key", "value");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      source.getEntries().put("key", "new value");

      new ManifestMerger().merge(target, source);

      EMap<String, String> targetEntries = target.getEntries();
      assertEquals(1, targetEntries.size());
      assertEquals("new value", targetEntries.get("key"));
   }

   public void test4() throws Exception
   {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      target.getEntries().put("key", "value");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      source.getEntries().put("key", "value");
      source.getEntries().put("key2", "value2");

      new ManifestMerger().merge(target, source);

      EMap<String, String> targetEntries = target.getEntries();
      assertEquals(2, targetEntries.size());
      assertEquals("value", targetEntries.get("key"));
      assertEquals("value2", targetEntries.get("key2"));
   }

   public void test5() throws Exception
   {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      target.getEntries().put("key", "value");
      target.getEntries().put("key2", "value2");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      source.getEntries().put("key", "value");

      new ManifestMerger().merge(target, source);

      EMap<String, String> targetEntries = target.getEntries();
      assertEquals(2, targetEntries.size());
      assertEquals("value", targetEntries.get("key"));
      assertEquals("value2", targetEntries.get("key2"));
   }

   public void testSection1() throws Exception
   {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      Section sourceSection = source.getSection("section", true);
      sourceSection.getEntries().put("key", "value");

      new ManifestMerger().merge(target, source);

      assertEquals(1, target.getSections().size());

      EMap<String, String> targetEntries = target.getSection("section", false).getEntries();
      assertEquals(1, targetEntries.size());
      assertEquals("value", targetEntries.get("key"));
   }

   public void testSection2() throws Exception
   {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      Section targetSection = target.getSection("section", true);
      targetSection.getEntries().put("key", "value");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();

      new ManifestMerger().merge(target, source);

      assertEquals(1, target.getSections().size());

      EMap<String, String> targetEntries = target.getSection("section", false).getEntries();
      assertEquals(1, targetEntries.size());
      assertEquals("value", targetEntries.get("key"));
   }

   public void testSection3() throws Exception
   {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      Section targetSection = target.getSection("section", true);
      targetSection.getEntries().put("key", "value");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      Section sourceSection = source.getSection("section", true);
      sourceSection.getEntries().put("key", "value");

      new ManifestMerger().merge(target, source);

      assertEquals(1, target.getSections().size());

      EMap<String, String> targetEntries = target.getSection("section", false).getEntries();
      assertEquals(1, targetEntries.size());
      assertEquals("value", targetEntries.get("key"));
   }

   public void testSection4() throws Exception
   {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      Section targetSection = target.getSection("section", true);
      targetSection.getEntries().put("key", "value");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      Section sourceSection = source.getSection("section", true);
      sourceSection.getEntries().put("key2", "value2");

      new ManifestMerger().merge(target, source);

      assertEquals(1, target.getSections().size());

      EMap<String, String> targetEntries = target.getSection("section", false).getEntries();
      assertEquals(2, targetEntries.size());
      assertEquals("value", targetEntries.get("key"));
      assertEquals("value2", targetEntries.get("key2"));
   }

   public void testSection5() throws Exception
   {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      Section targetSection = target.getSection("section", true);
      targetSection.getEntries().put("key", "value");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      Section sourceSection = source.getSection("section2", true);
      sourceSection.getEntries().put("key2", "value2");

      new ManifestMerger().merge(target, source);

      assertEquals(2, target.getSections().size());

      EMap<String, String> targetEntries = target.getSection("section", false).getEntries();
      assertEquals(1, targetEntries.size());
      assertEquals("value", targetEntries.get("key"));

      targetEntries = target.getSection("section2", false).getEntries();
      assertEquals(1, targetEntries.size());
      assertEquals("value2", targetEntries.get("key2"));
   }
}
