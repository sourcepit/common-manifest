/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi.resource;

import org.sourcepit.common.manifest.osgi.parser.GenericManifestBuilder;
import org.sourcepit.common.manifest.parser.ManifestBuilder;
import org.sourcepit.common.manifest.resource.ManifestResourceImpl;

/**
 * @author Bernd
 */
public class GenericManifestResourceImpl extends ManifestResourceImpl
{
   @Override
   protected ManifestBuilder createManifestBuilder()
   {
      return new GenericManifestBuilder();
   }
}
