/*
 * Copyright (C) 2011 Bosch Software Innovations GmbH. All rights reserved.
 */

package org.sourcepit.common.mf.internal.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.jar.Attributes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.sourcepit.common.mf.internal.model.AbstractSection;
import org.sourcepit.common.mf.internal.model.Manifest;
import org.sourcepit.common.mf.internal.model.Section;
import org.sourcepit.common.mf.internal.parser.ManifestBuilder;
import org.sourcepit.common.mf.internal.parser.ManifestParser;

public class ManifestResourceImpl extends ResourceImpl
{
   @Override
   protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException
   {
      final ManifestBuilder builder = new ManifestBuilder();
      new ManifestParser().parse(inputStream, builder);
      final Manifest manifest = builder.getManifest();
      if (manifest != null)
      {
         getContents().add(manifest);
      }
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
      if (manifest.getVersion() == null)
      {
         manifest.setVersion("1.0");
      }
      java.util.jar.Manifest javaManifest = createOrderedManifest();
      Attributes attributes = javaManifest.getMainAttributes();
      doSave(manifest, attributes);
      for (Section section : manifest.getSections())
      {
         attributes = new OrderedAttributes();
         doSave(section, attributes);
         javaManifest.getEntries().put(section.getName(), attributes);
      }
      javaManifest.write(outputStream);
   }

   private void doSave(AbstractSection container, Attributes attributes)
   {
      for (Entry<String, String> header : container.getHeaders())
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
      catch (NoSuchFieldException e1)
      {// hack the planet
      }
      catch (IllegalAccessException e1)
      {// hack the planet
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

   public static class OrderedAttributes extends Attributes
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
