/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.parser;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import org.sourcepit.common.manifest.Parseable;

/**
 * @author Bernd
 */
public class HeaderParserRegistry implements HeaderParser.Registry
{
   private List<HeaderParser> parsers = new CopyOnWriteArrayList<HeaderParser>();

   private static final ThreadLocal<Map<?, ?>> CURRENT_OPTIONS = new ThreadLocal<Map<?, ?>>();

   public static Map<?, ?> getCurrentOptions()
   {
      return CURRENT_OPTIONS.get();
   }

   public static void setCurrentOptions(Map<?, ?> options)
   {
      CURRENT_OPTIONS.set(options);
   }

   public Object parse(Parseable parseable)
   {
      for (HeaderParser parser : parsers)
      {
         try
         {
            final Object result = parser.parse(parseable);
            if (result != null)
            {
               return result;
            }
         }
         catch (IllegalArgumentException e)
         {
            final Map<?, ?> options = getCurrentOptions();
            if (options == null || !Boolean.FALSE.equals(options.get("strict")))
            {
               throw e;
            }
         }
      }
      return null;
   }

   public String toString(Parseable parseable)
   {
      for (HeaderParser parser : parsers)
      {
         final String result = parser.toString(parseable);
         if (result != null)
         {
            return result;
         }
      }
      return null;
   }

   public String toString(Parseable parseable, boolean prettyPrinting)
   {
      for (HeaderParser parser : parsers)
      {
         final String result = parser.toString(parseable, prettyPrinting);
         if (result != null)
         {
            return result;
         }
      }
      return null;
   }

   public String toValueString(Parseable parseable)
   {
      for (HeaderParser parser : parsers)
      {
         final String result = parser.toValueString(parseable);
         if (result != null)
         {
            return result;
         }
      }
      return null;
   }

   public String toValueString(Parseable parseable, boolean prettyPrinting)
   {
      for (HeaderParser parser : parsers)
      {
         final String result = parser.toValueString(parseable, prettyPrinting);
         if (result != null)
         {
            return result;
         }
      }
      return null;
   }

   public void addParser(HeaderParser parser)
   {
      parsers.add(parser);
   }

   public void removeParser(HeaderParser parser)
   {
      parsers.remove(parser);
   }

}
