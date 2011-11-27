
package org.sourcepit.common.manifest.parser;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.sourcepit.common.manifest.Parseable;

/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

/**
 * HeaderValueParserRegistry
 * 
 * @author Bernd
 */
public class HeaderParserRegistry implements HeaderParser.Registry
{
   private List<HeaderParser> parsers = new CopyOnWriteArrayList<HeaderParser>();

   public Object parse(Parseable parseable)
   {
      for (HeaderParser parser : parsers)
      {
         final Object result = parser.parse(parseable);
         if (result != null)
         {
            return result;
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

   public void addParser(HeaderParser parser)
   {
      parsers.add(parser);
   }

   public void removeParser(HeaderParser parser)
   {
      parsers.remove(parser);
   }

}
