/**
 * Copyright (c) 2014 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.merge;
public enum BytesByLine
{
   UNLIMITED, _72, _512;

   public static BytesByLine parse(String string)
   {
      if ("unlimited".equalsIgnoreCase(string) || "-1".equals(string))
      {
         return UNLIMITED;
      }
      if ("72".equals(string))
      {
         return _72;
      }
      if ("512".equals(string))
      {
         return _512;
      }
      throw new IllegalArgumentException("Invalid bytes by line literal: " + string);
   }
}