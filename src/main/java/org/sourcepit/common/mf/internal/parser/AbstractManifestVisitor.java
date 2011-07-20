/*
 * Copyright (C) 2007 Innovations Softwaretechnologie GmbH, Immenstaad, Germany. All rights reserved.
 */

package org.sourcepit.common.mf.internal.parser;


/**
 * @author Bernd
 */
public abstract class AbstractManifestVisitor
{
   public abstract void visitSection(boolean isMainSection, String name);

   public abstract void visitHeader(String name, String value);
}
