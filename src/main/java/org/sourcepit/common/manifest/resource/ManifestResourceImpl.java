/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.jar.Attributes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.sourcepit.common.manifest.AbstractSection;
import org.sourcepit.common.manifest.Manifest;
import org.sourcepit.common.manifest.ManifestSection;
import org.sourcepit.common.manifest.parser.ManifestBuilder;
import org.sourcepit.common.manifest.parser.ManifestParser;

public class ManifestResourceImpl extends ResourceImpl
{
   @Override
   protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException
   {
      final ManifestBuilder builder = createManifestBuilder();
      new ManifestParser().parse(inputStream, builder);
      final Manifest manifest = builder.getManifest();
      if (manifest != null)
      {
         getContents().add(manifest);
      }
   }

   protected ManifestBuilder createManifestBuilder()
   {
      return new ManifestBuilder();
   }

   @Override
   protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException
   {
      for (EObject eObject : getContents())
      {
         doSave((Manifest) eObject, outputStream);
      }
   }

   protected void doSave(Manifest manifest, OutputStream outputStream) throws IOException
   {
      java.util.jar.Manifest javaManifest = createOrderedManifest();
      Attributes attributes = javaManifest.getMainAttributes();
      doSave(manifest, attributes);

      @SuppressWarnings({"unchecked", "rawtypes"})
      List<ManifestSection> sections = (List) manifest.getSections();
      for (ManifestSection section : sections)
      {
         attributes = new OrderedAttributes();
         doSave(section, attributes);
         javaManifest.getEntries().put(section.getName(), attributes);
      }
      javaManifest.write(outputStream);
   }

   private void doSave(AbstractSection section, Attributes attributes)
   {
      for (Entry<String, String> header : section.getHeaders())
      {
         attributes.putValue(header.getKey(), header.getValue());
      }
   }

   public static java.util.jar.Manifest createOrderedManifest()
   {
      final java.util.jar.Manifest mf = new java.util.jar.Manifest();
      final Class<? extends java.util.jar.Manifest> mfClass = mf.getClass();

      try
      {
         setField(mfClass, "attr", mf, new OrderedAttributes());
         setField(mfClass, "entries", mf, new LinkedHashMap<Object, Object>());
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

   private static class OrderedAttributes extends Attributes
   {
      public OrderedAttributes()
      {
         this(11);
      }

      public OrderedAttributes(int size)
      {
         map = new LinkedHashMap<Object, Object>(size);
      }

      public OrderedAttributes(Attributes attr)
      {
         map = new LinkedHashMap<Object, Object>(attr);
      }

      public Object clone()
      {
         return new OrderedAttributes(this);
      }
   }
}
