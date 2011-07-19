/*
 * Copyright (C) 2011 Bosch Software Innovations GmbH. All rights reserved.
 */

package org.sourcepit.common.mf.model.internal.impl;

import org.sourcepit.common.mf.internal.model.Manifest;

public class CManifestFactoryImpl extends ManifestFactoryImpl
{
   @Override
   public Manifest createManifest()
   {
      return new CManifestImpl();
   }
}
