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

package org.sourcepit.common.manifest.merge;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.EMap;
import org.sourcepit.common.manifest.Manifest;
import org.sourcepit.common.manifest.ManifestFactory;
import org.sourcepit.common.manifest.ManifestSection;

public class ManifestMergerTest extends TestCase {
   public void test1() throws Exception {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      source.getHeaders().put("key", "value");

      new ManifestMerger().merge(target, source);

      EMap<String, String> targetHeaders = target.getHeaders();
      assertEquals(2, targetHeaders.size());
      assertEquals("value", targetHeaders.get("key"));
   }

   public void test2() throws Exception {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      target.getHeaders().put("key", "value");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      source.getHeaders().put("key", "value");

      new ManifestMerger().merge(target, source);

      EMap<String, String> targetHeaders = target.getHeaders();
      assertEquals(2, targetHeaders.size());
      assertEquals("value", targetHeaders.get("key"));
   }

   public void test3() throws Exception {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      target.getHeaders().put("key", "value");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      source.getHeaders().put("key", "new value");

      new ManifestMerger().merge(target, source);

      EMap<String, String> targetHeaders = target.getHeaders();
      assertEquals(2, targetHeaders.size());
      assertEquals("new value", targetHeaders.get("key"));
   }

   public void test4() throws Exception {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      target.getHeaders().put("key", "value");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      source.getHeaders().put("key", "value");
      source.getHeaders().put("key2", "value2");

      new ManifestMerger().merge(target, source);

      EMap<String, String> targetHeaders = target.getHeaders();
      assertEquals(3, targetHeaders.size());
      assertEquals("value", targetHeaders.get("key"));
      assertEquals("value2", targetHeaders.get("key2"));
   }

   public void test5() throws Exception {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      target.getHeaders().put("key", "value");
      target.getHeaders().put("key2", "value2");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      source.getHeaders().put("key", "value");

      new ManifestMerger().merge(target, source);

      EMap<String, String> targetHeaders = target.getHeaders();
      assertEquals(3, targetHeaders.size());
      assertEquals("value", targetHeaders.get("key"));
      assertEquals("value2", targetHeaders.get("key2"));
   }

   public void testSection1() throws Exception {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      ManifestSection sourceSection = source.getSection("section", true);
      sourceSection.getHeaders().put("key", "value");

      new ManifestMerger().merge(target, source);

      assertEquals(1, target.getSections().size());

      EMap<String, String> targetHeaders = target.getSection("section", false).getHeaders();
      assertEquals(1, targetHeaders.size());
      assertEquals("value", targetHeaders.get("key"));
   }

   public void testSection2() throws Exception {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      ManifestSection targetSection = target.getSection("section", true);
      targetSection.getHeaders().put("key", "value");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();

      new ManifestMerger().merge(target, source);

      assertEquals(1, target.getSections().size());

      EMap<String, String> targetHeaders = target.getSection("section", false).getHeaders();
      assertEquals(1, targetHeaders.size());
      assertEquals("value", targetHeaders.get("key"));
   }

   public void testSection3() throws Exception {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      ManifestSection targetSection = target.getSection("section", true);
      targetSection.getHeaders().put("key", "value");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      ManifestSection sourceSection = source.getSection("section", true);
      sourceSection.getHeaders().put("key", "value");

      new ManifestMerger().merge(target, source);

      assertEquals(1, target.getSections().size());

      EMap<String, String> targetHeaders = target.getSection("section", false).getHeaders();
      assertEquals(1, targetHeaders.size());
      assertEquals("value", targetHeaders.get("key"));
   }

   public void testSection4() throws Exception {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      ManifestSection targetSection = target.getSection("section", true);
      targetSection.getHeaders().put("key", "value");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      ManifestSection sourceSection = source.getSection("section", true);
      sourceSection.getHeaders().put("key2", "value2");

      new ManifestMerger().merge(target, source);

      assertEquals(1, target.getSections().size());

      EMap<String, String> targetHeaders = target.getSection("section", false).getHeaders();
      assertEquals(2, targetHeaders.size());
      assertEquals("value", targetHeaders.get("key"));
      assertEquals("value2", targetHeaders.get("key2"));
   }

   public void testSection5() throws Exception {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      ManifestSection targetSection = target.getSection("section", true);
      targetSection.getHeaders().put("key", "value");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      ManifestSection sourceSection = source.getSection("section2", true);
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

   public void testSourceDominant1() throws Exception {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      source.getHeaders().put("key", "value");

      new ManifestMerger().merge(target, source, true);

      EMap<String, String> targetHeaders = target.getHeaders();
      assertEquals(2, targetHeaders.size());
      assertEquals("value", targetHeaders.get("key"));
   }

   public void testSourceDominant2() throws Exception {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      target.getHeaders().put("key", "targetValue");
      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      source.getHeaders().put("key", "sourceValue");

      new ManifestMerger().merge(target, source, false);

      EMap<String, String> targetHeaders = target.getHeaders();
      assertEquals(2, targetHeaders.size());
      assertEquals("targetValue", targetHeaders.get("key"));
   }

   public void testSourceDominant3() throws Exception {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      source.getHeaders().put("key", "sourceValue");

      new ManifestMerger().merge(target, source, false);

      EMap<String, String> targetHeaders = target.getHeaders();
      assertEquals(2, targetHeaders.size());
      assertEquals("sourceValue", targetHeaders.get("key"));
   }

   public void testSectionSourceDominant1() throws Exception {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      ManifestSection sourceSection = source.getSection("section", true);
      sourceSection.getHeaders().put("key", "value");

      new ManifestMerger().merge(target, source, true);

      assertEquals(1, target.getSections().size());

      EMap<String, String> targetHeaders = target.getSection("section", false).getHeaders();
      assertEquals(1, targetHeaders.size());
      assertEquals("value", targetHeaders.get("key"));
   }

   public void testSectionSourceDominant2() throws Exception {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      ManifestSection sourceSection = source.getSection("section", true);
      sourceSection.getHeaders().put("key", "value");

      new ManifestMerger().merge(target, source, false);

      assertEquals(1, target.getSections().size());

      EMap<String, String> targetHeaders = target.getSection("section", false).getHeaders();
      assertEquals(1, targetHeaders.size());
      assertEquals("value", targetHeaders.get("key"));
   }

   public void testSectionSourceDominant3() throws Exception {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      ManifestSection targetSection = target.getSection("section", true);
      targetSection.getHeaders().put("key", "targetValue");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      ManifestSection sourceSection = source.getSection("section", true);
      sourceSection.getHeaders().put("key", "sourceValue");

      new ManifestMerger().merge(target, source, false);

      assertEquals(1, target.getSections().size());

      EMap<String, String> targetHeaders = target.getSection("section", false).getHeaders();
      assertEquals(1, targetHeaders.size());
      assertEquals("targetValue", targetHeaders.get("key"));
   }

   public void testSectionSourceDominant4() throws Exception {
      Manifest target = ManifestFactory.eINSTANCE.createManifest();
      ManifestSection targetSection = target.getSection("section", true);
      targetSection.getHeaders().put("key", "targetValue");

      Manifest source = ManifestFactory.eINSTANCE.createManifest();
      ManifestSection sourceSection = source.getSection("section", true);
      sourceSection.getHeaders().put("key", "sourceValue");
      sourceSection.getHeaders().put("sourceOnlyKey", "sourceValue");

      new ManifestMerger().merge(target, source, false);

      assertEquals(1, target.getSections().size());

      EMap<String, String> targetHeaders = target.getSection("section", false).getHeaders();
      assertEquals(2, targetHeaders.size());
      assertEquals("targetValue", targetHeaders.get("key"));
      assertEquals("sourceValue", targetHeaders.get("sourceOnlyKey"));
   }
}
