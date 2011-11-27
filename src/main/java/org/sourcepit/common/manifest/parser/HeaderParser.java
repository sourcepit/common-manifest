/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.parser;

import org.sourcepit.common.manifest.Parseable;

public interface HeaderParser
{
   Object parse(Parseable parseable);

   String toString(Parseable parseable);

   interface Registry extends HeaderParser
   {
      void addParser(HeaderParser parser);

      void removeParser(HeaderParser parser);

      Registry INSTANCE = new HeaderParserRegistry();
   }

   HeaderParser INSTANCE = Registry.INSTANCE;
}
