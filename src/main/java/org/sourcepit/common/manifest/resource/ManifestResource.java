/**
 * Copyright (c) 2012 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.resource;

import org.eclipse.emf.ecore.resource.Resource;

public interface ManifestResource extends Resource
{
   String OPTION_MAKE72SAFE = "make72Safe";

   boolean isMake72Safe();
}