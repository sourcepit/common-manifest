/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.merge;


/**
 * @author Bernd
 */
public interface HeaderMerger
{
   String computeNewValue(String headerName, String targetValue, String sourceValue);

   boolean isResponsibleFor(String sectionName, String headerName, String targetValue, String sourceValue);
}
