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

package org.sourcepit.common.manifest.parser;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

/**
 * @author Bernd
 */
public class ManifestParser
{
   public void parse(InputStream inputStream, AbstractManifestVisitor visitor) throws IOException
   {
      final Manifest manifest = createManifest(visitor);
      manifest.read(inputStream);
   }

   private static java.util.jar.Manifest createManifest(final AbstractManifestVisitor visitor)
   {
      final java.util.jar.Manifest mf = new java.util.jar.Manifest()
      {
         @Override
         public Attributes getAttributes(String name)
         {
            Attributes attributes = super.getAttributes(name);
            if (attributes == null)
            {
               visitor.visitSection(false, name);
               attributes = new Attributes()
               {
                  @Override
                  public Object put(Object name, Object value)
                  {
                     visitor.visitHeader(name.toString(), value.toString());
                     return super.put(name, value);
                  }
               };
               getEntries().put(name, attributes);
            }
            return attributes;
         }
      };
      final Class<? extends java.util.jar.Manifest> mfClass = java.util.jar.Manifest.class;

      try
      {
         setField(mfClass, "attr", mf, new Attributes()
         {
            private boolean init = true;

            @Override
            public Object put(Object name, Object value)
            {
               if (init)
               {
                  visitor.visitSection(true, null);
                  init = false;
               }
               visitor.visitHeader(name.toString(), value.toString());
               return super.put(name, value);
            }
         });
      }
      catch (NoSuchFieldException e)
      {
         throw new IllegalStateException(e);
      }
      catch (IllegalAccessException e)
      {
         throw new IllegalStateException(e);
      }

      return mf;
   }

   private static void setField(Class<?> clazz, String name, Object obj, Object value) throws NoSuchFieldException,
      IllegalAccessException
   {
      final Field field = clazz.getDeclaredField(name);
      boolean accessible = field.isAccessible();
      try
      {
         field.setAccessible(true);
      }
      catch (SecurityException e)
      { // swallow
      }
      try
      {
         field.set(obj, value);
      }
      finally
      {
         try
         {
            field.setAccessible(accessible);
         }
         catch (SecurityException e)
         { // swallow
         }
      }
   }
}
