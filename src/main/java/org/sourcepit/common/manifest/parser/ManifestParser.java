/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
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
