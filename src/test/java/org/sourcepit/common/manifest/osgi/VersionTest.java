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

package org.sourcepit.common.manifest.osgi;

import static org.junit.Assert.*;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsSame;
import org.junit.Test;

/**
 * @author Bernd
 */
public class VersionTest extends AbstractVersionCompatibilityTest
{

   @Test
   public void testInvalidParse()
   {
      for (Class<?> versionType : versionTypes)
      {
         testInvalidParse(versionType);
      }
   }

   private <V> void testInvalidParse(Class<V> versionType)
   {
      try
      {
         parse(versionType, "1.2.3.4.5");
         fail();
      }
      catch (IllegalArgumentException e)
      { // noop
      }
   }

   @Test
   public void testParse()
   {
      for (Class<?> versionType : versionTypes)
      {
         testParse(versionType);
      }
   }

   protected <V> void testParse(Class<V> versionType)
   {
      V version = parse(versionType, null);
      assertThat(version, IsSame.sameInstance(getEmptyVerstion(versionType)));

      version = parse(versionType, "");
      assertThat(version, IsSame.sameInstance(getEmptyVerstion(versionType)));

      version = parse(versionType, "1.2.3.qualifier");
      assertThat(getMajor(version), Is.is(1));
      assertThat(getMinor(version), Is.is(2));
      assertThat(getMicro(version), Is.is(3));
      assertThat(getQualifier(version), IsEqual.equalTo("qualifier"));

      version = parse(versionType, "1.2.3.4");
      assertThat(getMajor(version), Is.is(1));
      assertThat(getMinor(version), Is.is(2));
      assertThat(getMicro(version), Is.is(3));
      assertThat(getQualifier(version), IsEqual.equalTo("4"));

      version = parse(versionType, "1.2.3.45");
      assertThat(getMajor(version), Is.is(1));
      assertThat(getMinor(version), Is.is(2));
      assertThat(getMicro(version), Is.is(3));
      assertThat(getQualifier(version), IsEqual.equalTo("45"));

      version = parse(versionType, "1.2.3");
      assertThat(getMajor(version), Is.is(1));
      assertThat(getMinor(version), Is.is(2));
      assertThat(getMicro(version), Is.is(3));
      assertThat(getQualifier(version), IsEqual.equalTo(""));

      version = parse(versionType, "1.2.0");
      assertThat(getMajor(version), Is.is(1));
      assertThat(getMinor(version), Is.is(2));
      assertThat(getMicro(version), Is.is(0));
      assertThat(getQualifier(version), IsEqual.equalTo(""));

      version = parse(versionType, "1.2");
      assertThat(getMajor(version), Is.is(1));
      assertThat(getMinor(version), Is.is(2));
      assertThat(getMicro(version), Is.is(0));
      assertThat(getQualifier(version), IsEqual.equalTo(""));

      version = parse(versionType, "1.0.0");
      assertThat(getMajor(version), Is.is(1));
      assertThat(getMinor(version), Is.is(0));
      assertThat(getMicro(version), Is.is(0));
      assertThat(getQualifier(version), IsEqual.equalTo(""));

      version = parse(versionType, "1");
      assertThat(getMajor(version), Is.is(1));
      assertThat(getMinor(version), Is.is(0));
      assertThat(getMicro(version), Is.is(0));
      assertThat(getQualifier(version), IsEqual.equalTo(""));

      version = parse(versionType, "0.0.0");
      assertThat(getMajor(version), Is.is(0));
      assertThat(getMinor(version), Is.is(0));
      assertThat(getMicro(version), Is.is(0));
      assertThat(getQualifier(version), IsEqual.equalTo(""));
   }

   @Test
   public void testCompare()
   {
      for (Class<? extends Comparable<Object>> versionType : versionTypes)
      {
         testCompare(versionType);
      }
   }

   @Test
   public void testConstructor() throws Exception
   {
      try
      {
         new Version(-1, -1, -1);
         fail();
      }
      catch (IllegalArgumentException e)
      { // noop
      }

      try
      {
         new Version(-1, -1, 0);
         fail();
      }
      catch (IllegalArgumentException e)
      { // noop
      }

      try
      {
         new Version(-1, 0, 0);
         fail();
      }
      catch (IllegalArgumentException e)
      { // noop
      }

      try
      {
         new Version(0, -1, 0);
         fail();
      }
      catch (IllegalArgumentException e)
      { // noop
      }

      try
      {
         new Version(0, -1, -1, "quali");
         fail();
      }
      catch (IllegalArgumentException e)
      { // noop
      }

      try
      {
         new Version(0, 0, -1, "quali");
         fail();
      }
      catch (IllegalArgumentException e)
      { // noop
      }
   }

   @Test
   public void testToMinimalString()
   {
      String string = "1";
      Version version = Version.parse(string);
      assertThat(version.toString(false), IsEqual.equalTo(string));
      version = new Version(1, -1, -1);
      assertThat(version.toString(false), IsEqual.equalTo(string));

      string = "1.2";
      version = Version.parse(string);
      assertThat(version.toString(false), IsEqual.equalTo(string));
      version = new Version(1, 2, -1);
      assertThat(version.toString(false), IsEqual.equalTo(string));

      string = "1.2.3";
      version = Version.parse(string);
      assertThat(version.toString(false), IsEqual.equalTo(string));
      version = new Version(1, 2, 3);
      assertThat(version.toString(false), IsEqual.equalTo(string));

      string = "1.2.3.foo";
      version = Version.parse(string);
      assertThat(version.toString(false), IsEqual.equalTo(string));
      version = new Version(1, 2, 3, "foo");
      assertThat(version.toString(false), IsEqual.equalTo(string));
   }

   @Test
   public void testToString()
   {
      for (Class<?> versionType : versionTypes)
      {
         testToString(versionType);
      }
   }

   protected <V> void testToString(Class<V> versionType)
   {
      String string = "1";
      V version = parse(versionType, string);
      assertThat(version.toString(), IsEqual.equalTo("1.0.0"));

      string = "1.2";
      version = parse(versionType, string);
      assertThat(version.toString(), IsEqual.equalTo("1.2.0"));

      string = "1.2.3";
      version = parse(versionType, string);
      assertThat(version.toString(), IsEqual.equalTo("1.2.3"));

      string = "1.2.3.foo";
      version = parse(versionType, string);
      assertThat(version.toString(), IsEqual.equalTo("1.2.3.foo"));
   }

   protected <V extends Comparable<Object>> void testCompare(Class<V> versionType)
   {
      V[] versions1 = parseArray(versionType, "1", "1.2", "1.2.3", "1.2.3.qualifier");
      V[] versions2 = parseArray(versionType, "1", "1.2", "1.2.3", "1.2.3.qualifier");
      for (int i = 0; i < versions1.length; i++)
      {
         V v1 = versions1[i];
         V v2 = versions2[i];

         assertThat(v1.compareTo(v2), Is.is(0));
         assertThat(v2.compareTo(v1), Is.is(0));
      }

      versions1 = parseArray(versionType, "2", "1.3", "1.2.4", "1.2.4.qualifier");
      versions2 = parseArray(versionType, "1", "1.2", "1.2.3", "1.2.3.qualifier");
      for (int i = 0; i < versions1.length; i++)
      {
         V v1 = versions1[i];
         V v2 = versions2[i];

         assertThat(v1.compareTo(v2), Is.is(1));
         assertThat(v2.compareTo(v1), Is.is(-1));
      }

      versions1 = parseArray(versionType, "3", "1.4", "1.2.5", "1.2.5.qualifier");
      versions2 = parseArray(versionType, "1", "1.2", "1.2.3", "1.2.3.qualifier");
      for (int i = 0; i < versions1.length; i++)
      {
         V v1 = versions1[i];
         V v2 = versions2[i];

         assertThat(v1.compareTo(v2), Is.is(2));
         assertThat(v2.compareTo(v1), Is.is(-2));
      }

      versions1 = parseArray(versionType, "0.0.0.1");
      versions2 = parseArray(versionType, "0.0.0.2");
      for (int i = 0; i < versions1.length; i++)
      {
         V v1 = versions1[i];
         V v2 = versions2[i];

         assertThat(v1.compareTo(v2), Is.is(-1));
         assertThat(v2.compareTo(v1), Is.is(1));
      }

      versions1 = parseArray(versionType, "0.0.0.abc");
      versions2 = parseArray(versionType, "0.0.0.cba");
      for (int i = 0; i < versions1.length; i++)
      {
         V v1 = versions1[i];
         V v2 = versions2[i];

         assertThat(v1.compareTo(v2), Is.is(-2));
         assertThat(v2.compareTo(v1), Is.is(2));
      }
   }

   @Test
   public void testTrimQualifier() throws Exception
   {
      Version version = Version.parse("1");
      assertEquals("1", version.trimQualifier().toMinimalString());

      version = Version.parse("1.2.3");
      assertEquals("1.2.3", version.trimQualifier().toMinimalString());

      version = Version.parse("1.2.3.qualifier");
      assertEquals("1.2.3", version.trimQualifier().toMinimalString());

      version = Version.parse("1.2.3.2012");
      assertEquals("1.2.3", version.trimQualifier().toMinimalString());
   }

   @Test
   public void testEmpty() throws Exception
   {
      Version version = Version.parse("0");
      assertEquals(Version.EMPTY_VERSION, version);

      version = Version.parse("0.0");
      assertEquals(Version.EMPTY_VERSION, version);

      version = Version.parse("0.0.0");
      assertEquals(Version.EMPTY_VERSION, version);

      assertEquals("0.0.0", Version.EMPTY_VERSION.toString());

   }
}
