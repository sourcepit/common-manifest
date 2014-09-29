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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bernd
 */
public abstract class AbstractVersionCompatibilityTest
{
   @SuppressWarnings("unchecked")
   protected final Class<? extends Comparable<Object>>[] versionTypes = new Class[] { org.osgi.framework.Version.class,
      org.osgi.framework.Version.class, Version.class };

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
