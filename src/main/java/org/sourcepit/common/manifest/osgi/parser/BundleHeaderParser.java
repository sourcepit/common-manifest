/*
 * Copyright 2014 Bernd Vogt and others.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sourcepit.common.manifest.osgi.parser;

import org.eclipse.emf.common.util.EList;
import org.sourcepit.common.manifest.osgi.BundleActivationPolicy;
import org.sourcepit.common.manifest.osgi.BundleLicense;
import org.sourcepit.common.manifest.osgi.BundleRequirement;
import org.sourcepit.common.manifest.osgi.BundleSymbolicName;
import org.sourcepit.common.manifest.osgi.ClassPathEntry;
import org.sourcepit.common.manifest.osgi.DynamicPackageImport;
import org.sourcepit.common.manifest.osgi.FragmentHost;
import org.sourcepit.common.manifest.osgi.PackageExport;
import org.sourcepit.common.manifest.osgi.PackageImport;
import org.sourcepit.common.manifest.parser.HeaderParser;

public interface BundleHeaderParser extends HeaderParser {
   BundleActivationPolicy parseBundleActivationPolicy(String value);

   BundleSymbolicName parseBundleSymbolicName(String value);

   EList<String> parseBundleRequiredExecutionEnvironment(String value);

   FragmentHost parseFragmentHost(String value);

   EList<PackageExport> parseExportPackage(String value);

   EList<PackageImport> parseImportPackage(String value);

   EList<DynamicPackageImport> parseDynamicImportPackage(String value);

   EList<BundleRequirement> parseRequireBundle(String value);

   EList<ClassPathEntry> parseBundleClassPath(String value);

   EList<BundleLicense> parseBundleLicense(String value);
}
