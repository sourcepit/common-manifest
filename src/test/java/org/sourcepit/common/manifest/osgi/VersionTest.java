/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi;

import static junit.framework.Assert.fail;
import static org.junit.Assert.assertThat;

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
      {
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
      {
      }

      try
      {
         new Version(-1, -1, 0);
         fail();
      }
      catch (IllegalArgumentException e)
      {
      }

      try
      {
         new Version(-1, 0, 0);
         fail();
      }
      catch (IllegalArgumentException e)
      {
      }

      try
      {
         new Version(0, -1, 0);
         fail();
      }
      catch (IllegalArgumentException e)
      {
      }

      try
      {
         new Version(0, -1, -1, "quali");
         fail();
      }
      catch (IllegalArgumentException e)
      {
      }

      try
      {
         new Version(0, 0, -1, "quali");
         fail();
      }
      catch (IllegalArgumentException e)
      {
      }
   }

   @Test
   public void testToString()
   {
      String string = "1";
      Version version = Version.parse(string);
      assertThat(version.toString(), IsEqual.equalTo(string));
      version = new Version(1, -1, -1);
      assertThat(version.toString(), IsEqual.equalTo(string));

      string = "1.2";
      version = Version.parse(string);
      assertThat(version.toString(), IsEqual.equalTo(string));
      version = new Version(1, 2, -1);
      assertThat(version.toString(), IsEqual.equalTo(string));

      string = "1.2.3";
      version = Version.parse(string);
      assertThat(version.toString(), IsEqual.equalTo(string));
      version = new Version(1, 2, 3);
      assertThat(version.toString(), IsEqual.equalTo(string));

      string = "1.2.3.foo";
      version = Version.parse(string);
      assertThat(version.toString(), IsEqual.equalTo(string));
      version = new Version(1, 2, 3, "foo");
      assertThat(version.toString(), IsEqual.equalTo(string));
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
}
