/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bernd
 */
public abstract class AbstractVersionCompatibilityTest
{
   @SuppressWarnings("unchecked")
   protected final Class<? extends Comparable<Object>>[] versionTypes = new Class[] {org.osgi.framework.Version.class,
      Version.class};

   @SuppressWarnings("unchecked")
   protected <V> V[] parseArray(Class<V> versionType, String... versions)
   {
      List<V> result = new ArrayList<V>();
      for (String version : versions)
      {
         result.add(parse(versionType, version));
      }
      return result.toArray((V[]) Array.newInstance(versionType, result.size()));
   }

   @SuppressWarnings("unchecked")
   protected <V> V parse(Class<V> versionType, String version)
   {
      if (Version.class == versionType)
      {
         return (V) Version.parse(version);
      }
      if (org.osgi.framework.Version.class == versionType)
      {
         return (V) org.osgi.framework.Version.parseVersion(version);
      }
      throw new IllegalArgumentException();
   }

   @SuppressWarnings("unchecked")
   protected <V> V getEmptyVerstion(Class<V> versionType)
   {
      if (Version.class == versionType)
      {
         return (V) Version.EMPTY_VERSION;
      }
      if (org.osgi.framework.Version.class == versionType)
      {
         return (V) org.osgi.framework.Version.emptyVersion;
      }
      throw new IllegalArgumentException();
   }

   protected int getMajor(Object version)
   {
      if (version instanceof Version)
      {
         return ((Version) version).getMajor();
      }
      if (version instanceof org.osgi.framework.Version)
      {
         return ((org.osgi.framework.Version) version).getMajor();
      }
      throw new IllegalArgumentException();
   }

   protected int getMinor(Object version)
   {
      if (version instanceof Version)
      {
         return ((Version) version).getMinor();
      }
      if (version instanceof org.osgi.framework.Version)
      {
         return ((org.osgi.framework.Version) version).getMinor();
      }
      throw new IllegalArgumentException();
   }

   protected int getMicro(Object version)
   {
      if (version instanceof Version)
      {
         return ((Version) version).getMicro();
      }
      if (version instanceof org.osgi.framework.Version)
      {
         return ((org.osgi.framework.Version) version).getMicro();
      }
      throw new IllegalArgumentException();
   }

   protected String getQualifier(Object version)
   {
      if (version instanceof Version)
      {
         return ((Version) version).getQualifier();
      }
      if (version instanceof org.osgi.framework.Version)
      {
         return ((org.osgi.framework.Version) version).getQualifier();
      }
      throw new IllegalArgumentException();
   }

}
