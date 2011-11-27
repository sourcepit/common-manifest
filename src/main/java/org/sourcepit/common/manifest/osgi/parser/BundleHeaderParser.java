/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi.parser;

import org.eclipse.emf.common.util.EList;
import org.sourcepit.common.manifest.osgi.BundleActivationPolicy;
import org.sourcepit.common.manifest.osgi.BundleRequirement;
import org.sourcepit.common.manifest.osgi.BundleSymbolicName;
import org.sourcepit.common.manifest.osgi.ClassPathEntry;
import org.sourcepit.common.manifest.osgi.FragmentHost;
import org.sourcepit.common.manifest.osgi.PackageExport;
import org.sourcepit.common.manifest.osgi.PackageImport;
import org.sourcepit.common.manifest.parser.HeaderParser;

public interface BundleHeaderParser extends HeaderParser
{
   BundleActivationPolicy parseBundleActivationPolicy(String value);

   BundleSymbolicName parseBundleSymbolicName(String value);

   FragmentHost parseFragmentHost(String value);

   EList<PackageExport> parseExportPackage(String value);

   EList<PackageImport> parseImportPackage(String value);

   EList<PackageImport> parseDynamicImportPackage(String value);

   EList<BundleRequirement> parseRequireBundle(String value);

   EList<ClassPathEntry> parseBundleClassPath(String value);
}
