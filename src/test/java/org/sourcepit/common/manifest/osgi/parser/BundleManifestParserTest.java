/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi.parser;

import static org.junit.Assert.*;
import static org.sourcepit.common.manifest.osgi.parser.BundleManifestParser.trimQuotes;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

public class BundleManifestParserTest
{
   @Test
   public void testTrimQuotes()
   {
      assertNull(trimQuotes(null));
      assertThat(trimQuotes(""), IsEqual.equalTo(""));
      assertThat(trimQuotes("\""), IsEqual.equalTo(""));
      assertThat(trimQuotes("\"\""), IsEqual.equalTo(""));
      
      assertThat(trimQuotes("hans"), IsEqual.equalTo("hans"));
      assertThat(trimQuotes("\"hans"), IsEqual.equalTo("hans"));
      assertThat(trimQuotes("\"hans\""), IsEqual.equalTo("hans"));
      assertThat(trimQuotes("hans\""), IsEqual.equalTo("hans"));
      
      assertThat(trimQuotes("\"\"hans\"\""), IsEqual.equalTo("\"hans\""));
   }

}
