/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.fail;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNull;
import org.junit.Test;

/**
 * @author Bernd
 */
public class VersionRangeTest extends AbstractVersionCompatibilityTest
{
   private final Class<?>[] rangeTypes = new Class[] { com.springsource.util.osgi.VersionRange.class,
      org.eclipse.osgi.service.resolver.VersionRange.class, VersionRange.class };

   @Test
   public void testInvalidRange()
   {
      for (int i = 0; i < rangeTypes.length; i++)
      {
         testInvalidRange(rangeTypes[i], versionTypes[i]);
      }
   }

   protected <R, V> void testInvalidRange(Class<R> rangeType, Class<V> versionType)
   {
      try
      {
         parseRange(rangeType, "[1.2.3]");
         fail();
      }
      catch (IllegalArgumentException e)
      { // noop
      }

      try
      {
         parseRange(rangeType, "<1.2.3]");
         fail();
      }
      catch (IllegalArgumentException e)
      { // noop
      }

      try
      {
         parseRange(rangeType, "[a,b]");
         fail();
      }
      catch (IllegalArgumentException e)
      { // noop
      }
   }

   @Test
   public void testInviniteRange()
   {
      for (int i = 0; i < rangeTypes.length; i++)
      {
         testInviniteRange(rangeTypes[i], versionTypes[i]);
      }
   }

   private <R, V> void testInviniteRange(Class<R> rangeType, Class<V> versionType)
   {
      R invinite = newInviniteRange(rangeType);
      assertThat("0.0.0", IsEqual.equalTo(toParseString(invinite)));
   }

   @SuppressWarnings("unchecked")
   private <R> R newInviniteRange(Class<R> rangeType)
   {
      if (VersionRange.class == rangeType)
      {
         return (R) VersionRange.INFINITE_RANGE;
      }
      if (org.eclipse.osgi.service.resolver.VersionRange.class == rangeType)
      {
         return (R) new org.eclipse.osgi.service.resolver.VersionRange(org.osgi.framework.Version.emptyVersion, true,
            null, false);
      }
      if (com.springsource.util.osgi.VersionRange.class == rangeType)
      {
         return (R) new com.springsource.util.osgi.VersionRange(null);
      }
      throw new IllegalArgumentException();
   }

   private <R> String toParseString(R range)
   {
      if (range instanceof VersionRange)
      {
         return ((VersionRange) range).toString();
      }
      if (range instanceof org.eclipse.osgi.service.resolver.VersionRange)
      {
         return ((org.eclipse.osgi.service.resolver.VersionRange) range).toString();
      }
      if (range instanceof com.springsource.util.osgi.VersionRange)
      {
         return ((com.springsource.util.osgi.VersionRange) range).toParseString();
      }
      throw new IllegalArgumentException();
   }

   @Test
   public void testRange()
   {
      for (int i = 0; i < rangeTypes.length; i++)
      {
         testRange(rangeTypes[i], versionTypes[i]);
      }
   }

   protected <R, V> void testRange(Class<R> rangeType, Class<V> versionType)
   {
      R range = parseRange(rangeType, null);
      assertInfinite(versionType, range);

      range = parseRange(rangeType, "");
      assertInfinite(versionType, range);

      range = parseRange(rangeType, "0.0.0");
      assertInfinite(versionType, range);

      range = parseRange(rangeType, "0");
      assertInfinite(versionType, range);

      range = parseRange(rangeType, "1.2.3");
      assertThat(range, IsNull.notNullValue());
      assertFalse(includes(range, parse(versionType, "0.0.0")));
      assertFalse(includes(range, parse(versionType, "1.1.9")));
      assertFalse(includes(range, parse(versionType, "1.2.0")));
      assertTrue(includes(range, parse(versionType, "1.2.3")));
      assertTrue(includes(range, parse(versionType, "3")));
      assertTrue(includes(range, parse(versionType, "3.0.0")));
      assertTrue(includes(range, parse(versionType, "3.0.1")));
      assertTrue(includes(range, parse(versionType, String.valueOf(Integer.MAX_VALUE))));

      // fails since org.eclipse.osgi 3.8.1-v20120830-144521
      // range = parseRange(rangeType, "[,1.2.3]"); // [0.0.0,1.2.3]
      // assertThat(range, IsNull.notNullValue());
      // assertTrue(includes(range, parse(versionType, "0.0.0")));
      // assertTrue(includes(range, parse(versionType, "0.0.1")));
      // assertTrue(includes(range, parse(versionType, "1.2.2")));
      // assertTrue(includes(range, parse(versionType, "1.2.3")));
      // assertFalse(includes(range, parse(versionType, "1.2.4")));

      range = parseRange(rangeType, "[0,1.2.3]"); // [0.0.0,1.2.3]
      assertThat(range, IsNull.notNullValue());
      assertTrue(includes(range, parse(versionType, "0.0.0")));
      assertTrue(includes(range, parse(versionType, "0.0.1")));
      assertTrue(includes(range, parse(versionType, "1.2.2")));
      assertTrue(includes(range, parse(versionType, "1.2.3")));
      assertFalse(includes(range, parse(versionType, "1.2.4")));

      // range = parseRange(rangeType, "(,1.2.3]"); // (0.0.0,1.2.3]
      // assertThat(range, IsNull.notNullValue());
      // assertFalse(includes(range, parse(versionType, "0.0.0")));
      // assertTrue(includes(range, parse(versionType, "0.0.1")));
      // assertTrue(includes(range, parse(versionType, "1.2.2")));
      // assertTrue(includes(range, parse(versionType, "1.2.3")));
      // assertFalse(includes(range, parse(versionType, "1.2.4")));

      range = parseRange(rangeType, "(0,1.2.3]"); // (0.0.0,1.2.3]
      assertThat(range, IsNull.notNullValue());
      assertFalse(includes(range, parse(versionType, "0.0.0")));
      assertTrue(includes(range, parse(versionType, "0.0.1")));
      assertTrue(includes(range, parse(versionType, "1.2.2")));
      assertTrue(includes(range, parse(versionType, "1.2.3")));
      assertFalse(includes(range, parse(versionType, "1.2.4")));

      // range = parseRange(rangeType, "[1.2.3,]"); // [1.2.3,0.0.0] ... this is rather silly
      // assertThat(range, IsNull.notNullValue());
      // assertFalse(includes(range, parse(versionType, "0.0.0")));
      // assertFalse(includes(range, parse(versionType, "1.2.2")));
      // assertFalse(includes(range, parse(versionType, "1.2.3")));
      // assertFalse(includes(range, parse(versionType, "1.2.4")));

      // range = parseRange(rangeType, "[,1.2.3)"); // [0.0.0,1.2.3)
      // assertThat(range, IsNull.notNullValue());
      // assertTrue(includes(range, parse(versionType, "0.0.0")));
      // assertTrue(includes(range, parse(versionType, "1.2.2")));
      // assertFalse(includes(range, parse(versionType, "1.2.3")));

      // range = parseRange(rangeType, "[1.2.3,)"); // [1.2.3,0.0.0) ... this is rather silly
      // assertThat(range, IsNull.notNullValue());
      // assertFalse(includes(range, parse(versionType, "0.0.0")));
      // assertFalse(includes(range, parse(versionType, "1.2.2")));
      // assertFalse(includes(range, parse(versionType, "1.2.3")));
      // assertFalse(includes(range, parse(versionType, "1.2.4")));

      range = parseRange(rangeType, "[1.2,3]");
      assertThat(range, IsNull.notNullValue());
      assertFalse(includes(range, parse(versionType, "0.0.0")));
      assertFalse(includes(range, parse(versionType, "1.1.9")));
      assertTrue(includes(range, parse(versionType, "1.2.0")));
      assertTrue(includes(range, parse(versionType, "1.2.3")));
      assertTrue(includes(range, parse(versionType, "1.2.4")));
      assertTrue(includes(range, parse(versionType, "3")));
      assertTrue(includes(range, parse(versionType, "3.0.0")));
      assertFalse(includes(range, parse(versionType, "3.0.1")));

      range = parseRange(rangeType, "[1.2,3)");
      assertThat(range, IsNull.notNullValue());
      assertFalse(includes(range, parse(versionType, "0.0.0")));
      assertFalse(includes(range, parse(versionType, "1.1.9")));
      assertTrue(includes(range, parse(versionType, "1.2.0")));
      assertTrue(includes(range, parse(versionType, "1.2.3")));
      assertTrue(includes(range, parse(versionType, "1.2.4")));
      assertFalse(includes(range, parse(versionType, "3")));
      assertFalse(includes(range, parse(versionType, "3.0.0")));

      range = parseRange(rangeType, "[1.0.0.RC1,2)");
      assertThat(range, IsNull.notNullValue());
      assertFalse(includes(range, parse(versionType, "0.0.0")));
      assertFalse(includes(range, parse(versionType, "1.0.0")));
      assertTrue(includes(range, parse(versionType, "1.0.0.RC1")));
      assertTrue(includes(range, parse(versionType, "1.0.0.RC2")));
      assertTrue(includes(range, parse(versionType, "1.0.0.Z")));

      range = parseRange(rangeType, "[1.0.0.RC1,2)");
      assertThat(range, IsNull.notNullValue());
      assertFalse(includes(range, parse(versionType, "0.0.0")));
      assertFalse(includes(range, parse(versionType, "1.0.0")));
      assertTrue(includes(range, parse(versionType, "1.0.0.RC1")));
      assertTrue(includes(range, parse(versionType, "1.0.0.RC2")));
      assertTrue(includes(range, parse(versionType, "1.0.0.Z")));

      assertThat(includes(parseRange(rangeType, "[1,2)"), parse(versionType, "1.0.0")), Is.is(true));
      assertThat(includes(parseRange(rangeType, "[1.0.0.RC1,2)"), parse(versionType, "1.0.0.RC1")), Is.is(true));
      assertThat(includes(parseRange(rangeType, "[1.0.0.RC1,2)"), parse(versionType, "1.0.0.RC2")), Is.is(true));
      assertThat(includes(parseRange(rangeType, "[1,2)"), parse(versionType, "1.0.0")), Is.is(true));
      assertThat(includes(parseRange(rangeType, "[1,2)"), parse(versionType, "1.0.0.A")), Is.is(true));
      assertThat(includes(parseRange(rangeType, "[1.0.0.RC1,2)"), parse(versionType, "1.0.0.a")), Is.is(true));
      assertThat(includes(parseRange(rangeType, "[1.0.0.RC1,2)"), parse(versionType, "1.0.0.fooooooo")), Is.is(true));
      assertThat(includes(parseRange(rangeType, "[1,2)"), parse(versionType, "1.0.0.AAA")), Is.is(true));
      assertThat(includes(parseRange(rangeType, "[1,2)"), parse(versionType, "1.0.0.AAAA")), Is.is(true));
      assertThat(includes(parseRange(rangeType, "[1,2)"), parse(versionType, "1.0.0.Z")), Is.is(true));
      assertThat(includes(parseRange(rangeType, "[1,2)"), parse(versionType, "1.0.0.SNAPSHOT")), Is.is(true));
      assertThat(includes(parseRange(rangeType, "[1,2)"), parse(versionType, "1.0.0.121212")), Is.is(true));
   }

   @Test
   public void testIntersect()
   {
      VersionRange r1 = VersionRange.parse("[1,3]");
      VersionRange r2 = VersionRange.parse("[2,4]");
      VersionRange r3 = VersionRange.intersect(r1, r2);
      assertThat(r3.toString(), IsEqual.equalTo("[2,3]"));

      r1 = VersionRange.parse("[1,2]");
      r2 = VersionRange.parse("[1,2)");
      r3 = VersionRange.intersect(r1, r2);
      assertThat(r3.toString(), IsEqual.equalTo("[1,2)"));

      r1 = VersionRange.parse("(1,2]");
      r2 = VersionRange.parse("[1,2)");
      r3 = VersionRange.intersect(r1, r2);
      assertThat(r3.toString(), IsEqual.equalTo("(1,2)"));

      r1 = VersionRange.parse("[1,2]"); // conflict
      r2 = VersionRange.parse("[3,4]");
      try
      {
         VersionRange.intersect(r1, r2);
         fail();
      }
      catch (IllegalArgumentException e)
      { // as expected
      }
      
      r1 = VersionRange.parse("[1,2)"); // conflict
      r2 = VersionRange.parse("[2,3]");
      try
      {
         VersionRange.intersect(r1, r2);
         fail();
      }
      catch (IllegalArgumentException e)
      { // as expected
      }
      
      r1 = VersionRange.parse("[1,1]"); // conflict
      r2 = VersionRange.parse("(1,2]");
      try
      {
         VersionRange.intersect(r1, r2);
         fail();
      }
      catch (IllegalArgumentException e)
      { // as expected
      }
   }

   @Test
   public void testToString()
   {
      String string = "1";
      VersionRange version = VersionRange.parse(string);
      assertThat(toParseString(version), IsEqual.equalTo(string));
      assertThat(toParseString(version), IsEqual.equalTo(string));

      string = "1.2";
      version = VersionRange.parse(string);
      assertThat(toParseString(version), IsEqual.equalTo(string));
      assertThat(toParseString(version), IsEqual.equalTo(string));

      string = "1.2.3";
      version = VersionRange.parse(string);
      assertThat(toParseString(version), IsEqual.equalTo(string));
      assertThat(toParseString(version), IsEqual.equalTo(string));

      string = "1.2.3.foo";
      version = VersionRange.parse(string);
      assertThat(toParseString(version), IsEqual.equalTo(string));
      assertThat(toParseString(version), IsEqual.equalTo(string));

      string = "[1,2)";
      version = VersionRange.parse(string);
      assertThat(toParseString(version), IsEqual.equalTo(string));
      assertThat(toParseString(version), IsEqual.equalTo(string));

      string = "[1.2,1.2)";
      version = VersionRange.parse(string);
      assertThat(toParseString(version), IsEqual.equalTo(string));
      assertThat(toParseString(version), IsEqual.equalTo(string));

      string = "[1.2.3,1.2.3)";
      version = VersionRange.parse(string);
      assertThat(toParseString(version), IsEqual.equalTo(string));
      assertThat(toParseString(version), IsEqual.equalTo(string));

      string = "[1.2.3.foo,1.2.3.foo)";
      version = VersionRange.parse(string);
      assertThat(toParseString(version), IsEqual.equalTo(string));
      assertThat(toParseString(version), IsEqual.equalTo(string));
   }

   protected <R, V> void assertInfinite(Class<V> versionType, R range)
   {
      // INFINITE_RANGE
      assertThat(range, IsNull.notNullValue());
      assertTrue(includes(range, parse(versionType, "0.0.0")));
      assertTrue(includes(range, parse(versionType, String.valueOf(Integer.MAX_VALUE))));
   }

   @SuppressWarnings("unchecked")
   protected <V> V getLowVersion(Object range, Class<V> versionType)
   {
      if (range instanceof VersionRange)
      {
         return (V) ((VersionRange) range).getLowVersion();
      }
      else if (range instanceof org.eclipse.osgi.service.resolver.VersionRange)
      {
         return (V) ((org.eclipse.osgi.service.resolver.VersionRange) range).getMinimum();
      }
      throw new IllegalArgumentException();
   }

   protected boolean isLowInclusive(Object range)
   {
      if (range instanceof VersionRange)
      {
         return ((VersionRange) range).isLowInclusive();
      }
      else if (range instanceof org.eclipse.osgi.service.resolver.VersionRange)
      {
         return ((org.eclipse.osgi.service.resolver.VersionRange) range).getIncludeMinimum();
      }
      throw new IllegalArgumentException();
   }

   @SuppressWarnings("unchecked")
   protected <V> V getHighVersion(Object range, Class<V> versionType)
   {
      if (range instanceof VersionRange)
      {
         return (V) ((VersionRange) range).getHighVersion();
      }
      else if (range instanceof org.eclipse.osgi.service.resolver.VersionRange)
      {
         return (V) ((org.eclipse.osgi.service.resolver.VersionRange) range).getMaximum();
      }
      throw new IllegalArgumentException();
   }

   protected boolean isHighInclusive(Object range)
   {
      if (range instanceof VersionRange)
      {
         return ((VersionRange) range).isHighInclusive();
      }
      else if (range instanceof org.eclipse.osgi.service.resolver.VersionRange)
      {
         return ((org.eclipse.osgi.service.resolver.VersionRange) range).getIncludeMinimum();
      }
      throw new IllegalArgumentException();
   }

   protected boolean includes(Object range, Object version)
   {
      if (range instanceof VersionRange)
      {
         return ((VersionRange) range).includes((Version) version);
      }
      else if (range instanceof org.eclipse.osgi.service.resolver.VersionRange)
      {
         return ((org.eclipse.osgi.service.resolver.VersionRange) range)
            .isIncluded((org.osgi.framework.Version) version);
      }
      else if (range instanceof com.springsource.util.osgi.VersionRange)
      {
         return ((com.springsource.util.osgi.VersionRange) range).includes((org.osgi.framework.Version) version);
      }
      throw new IllegalArgumentException();
   }

   @SuppressWarnings("unchecked")
   protected <V> V parseRange(Class<V> rangeType, String range)
   {
      if (VersionRange.class == rangeType)
      {
         return (V) VersionRange.parse(range);
      }
      if (org.eclipse.osgi.service.resolver.VersionRange.class == rangeType)
      {
         return (V) new org.eclipse.osgi.service.resolver.VersionRange(range);
      }
      if (com.springsource.util.osgi.VersionRange.class == rangeType)
      {
         return (V) new com.springsource.util.osgi.VersionRange(range);
      }
      throw new IllegalArgumentException();
   }

}
