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

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.RecognitionException;
import org.apache.commons.lang.StringEscapeUtils;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.sourcepit.common.manifest.Header;
import org.sourcepit.common.manifest.Parseable;
import org.sourcepit.common.manifest.osgi.ActivationPolicy;
import org.sourcepit.common.manifest.osgi.BundleActivationPolicy;
import org.sourcepit.common.manifest.osgi.BundleHeaderName;
import org.sourcepit.common.manifest.osgi.BundleLicense;
import org.sourcepit.common.manifest.osgi.BundleRequirement;
import org.sourcepit.common.manifest.osgi.BundleSymbolicName;
import org.sourcepit.common.manifest.osgi.ClassPathEntry;
import org.sourcepit.common.manifest.osgi.DynamicPackageImport;
import org.sourcepit.common.manifest.osgi.FragmentHost;
import org.sourcepit.common.manifest.osgi.PackageExport;
import org.sourcepit.common.manifest.osgi.PackageImport;
import org.sourcepit.common.manifest.osgi.PackagesDeclaration;
import org.sourcepit.common.manifest.osgi.Parameter;
import org.sourcepit.common.manifest.osgi.Parameterized;
import org.sourcepit.common.manifest.osgi.Version;
import org.sourcepit.common.manifest.osgi.VersionRange;

/**
 * @author Bernd Vogt <bernd.vogt@sourcepit.org>
 */
public class BundleHeaderParserImpl implements BundleHeaderParser {
   private static final String PRETTY_SEPARATOR = "," + System.getProperty("line.separator") + " ";

   public Object parse(Parseable parseable) {
      if (parseable instanceof Header) {
         return parseHeader((Header) parseable);
      }
      if (parseable instanceof Parameter) {
         return parseParameter((Parameter) parseable);
      }
      return null;
   }

   protected Object parseHeader(Header header) {
      final String name = header.getName();
      final String value = header.getValue();

      final BundleHeaderName headerName = BundleHeaderName.get(name);
      if (headerName == null) {
         return null;
      }

      return parseHeader(headerName, value);
   }

   protected Object parseHeader(BundleHeaderName headerName, String value) {
      switch (headerName) {
         case BUNDLE_ACTIVATIONPOLICY :
            return parseBundleActivationPolicy(value);
         case BUNDLE_VERSION :
            return Version.parse(value);
         case BUNDLE_SYMBOLICNAME :
            return parseBundleSymbolicName(value);
         case EXPORT_PACKAGE :
            return parseExportPackage(value);
         case IMPORT_PACKAGE :
            return parseImportPackage(value);
         case DYNAMICIMPORT_PACKAGE :
            return parseDynamicImportPackage(value);
         case REQUIRE_BUNDLE :
            return parseRequireBundle(value);
         case BUNDLE_CLASSPATH :
            return parseBundleClassPath(value);
         case BUNDLE_LICENSE :
            return parseBundleLicense(value);
         case FRAGMENT_HOST :
            return parseFragmentHost(value);
         case BUNDLE_REQUIREDEXECUTIONENVIRONMENT :
            return parseBundleRequiredExecutionEnvironment(value);
         default :
            return null;
      }
   }

   public EList<String> parseBundleRequiredExecutionEnvironment(String value) {
      final String[] execEnvs = value.split(",");
      final BasicEList<String> result = new BasicEList<String>(execEnvs.length);
      for (String execEnv : execEnvs) {
         result.add(execEnv.trim());
      }
      return result;
   }

   protected Object parseParameter(Parameter parameter) {
      final String name = parameter.getName();
      if ("version".equals(name) || "specification-version".equals(name)) {
         return parseParameterVersion(parameter);
      }
      else if ("singleton".equals(name)) {
         return parseParameterSingleton(parameter);
      }
      else if ("bundle-version".equals(name)) {
         return parseParameterBundleVersion(parameter);
      }
      return null;
   }

   protected Object parseParameterVersion(Parameter parameter) {
      final Parameterized parameterized = parameter.getParameterized();
      if (parameterized instanceof PackageImport || parameterized instanceof DynamicPackageImport) {
         return VersionRange.parse(parameter.getValue());
      }
      if (parameterized instanceof PackageExport) {
         return Version.parse(parameter.getValue());
      }
      return null;
   }

   protected Boolean parseParameterSingleton(Parameter parameter) {
      final Parameterized parameterized = parameter.getParameterized();
      if (parameterized instanceof BundleSymbolicName) {
         return Boolean.valueOf(parameter.getValue());
      }
      return null;
   }

   protected VersionRange parseParameterBundleVersion(Parameter parameter) {
      final Parameterized parameterized = parameter.getParameterized();
      if (parameterized instanceof FragmentHost || parameterized instanceof DynamicPackageImport
         || parameterized instanceof BundleRequirement) {
         return VersionRange.parse(parameter.getValue());
      }
      return null;
   }

   public BundleActivationPolicy parseBundleActivationPolicy(String value) {
      return new ParseOperation<BundleActivationPolicy>(value) {
         @Override
         protected BundleActivationPolicy doParse() throws RecognitionException {
            return newParser().activationPolicy();
         }
      }.parse();
   }

   public BundleSymbolicName parseBundleSymbolicName(String value) {
      return new ParseOperation<BundleSymbolicName>(value) {
         @Override
         protected BundleSymbolicName doParse() throws RecognitionException {
            return newParser().symbolicName();
         }
      }.parse();
   }

   public FragmentHost parseFragmentHost(String value) {
      return new ParseOperation<FragmentHost>(value) {
         @Override
         protected FragmentHost doParse() throws RecognitionException {
            return newParser().fragmentHost();
         }
      }.parse();
   }

   public EList<PackageExport> parseExportPackage(String value) {
      return new ParseOperation<EList<PackageExport>>(value) {
         @Override
         protected EList<PackageExport> doParse() throws RecognitionException {
            return newParser().exportPackage();
         }
      }.parse();
   }

   public EList<PackageImport> parseImportPackage(String value) {
      return new ParseOperation<EList<PackageImport>>(value) {
         @Override
         protected EList<PackageImport> doParse() throws RecognitionException {
            return newParser().importPackage();
         }
      }.parse();
   }

   public EList<DynamicPackageImport> parseDynamicImportPackage(String value) {
      return new ParseOperation<EList<DynamicPackageImport>>(value) {
         @Override
         protected EList<DynamicPackageImport> doParse() throws RecognitionException {
            return newParser().dynamicImportPackage();
         }
      }.parse();
   }

   public EList<BundleRequirement> parseRequireBundle(String value) {
      return new ParseOperation<EList<BundleRequirement>>(value) {
         @Override
         protected EList<BundleRequirement> doParse() throws RecognitionException {
            return newParser().requireBundle();
         }
      }.parse();
   }

   public EList<ClassPathEntry> parseBundleClassPath(String value) {
      return new ParseOperation<EList<ClassPathEntry>>(value) {
         @Override
         protected EList<ClassPathEntry> doParse() throws RecognitionException {
            return newParser().classPath();
         }
      }.parse();
   }

   public EList<BundleLicense> parseBundleLicense(String value) {
      return new ParseOperation<EList<BundleLicense>>(value) {
         @Override
         protected EList<BundleLicense> doParse() throws RecognitionException {
            return newParser().bundleLicense();
         }
      }.parse();
   }

   public String toString(Parseable parseable) {
      return toString(parseable, false);
   }

   public String toString(Parseable parseable, boolean prettyPrinting) {
      if (parseable instanceof Header) {
         return toString((Header) parseable, prettyPrinting);
      }
      if (parseable instanceof Parameter) {
         return toString((Parameter) parseable, prettyPrinting);
      }
      return null;
   }

   protected String toString(Header header, boolean prettyPrinting) {
      final StringBuilder sb = new StringBuilder();
      sb.append(header.getName());
      sb.append(':');
      sb.append(' ');
      sb.append(toValueString(header, prettyPrinting));
      return sb.toString();
   }

   protected String toString(Parameter parameter, boolean prettyPrinting) {
      final StringBuilder sb = new StringBuilder();
      sb.append(parameter.getName());
      switch (parameter.getType()) {
         case DIRECTIVE :
            sb.append(':');
         case ATTRIBUTE :
            sb.append('=');
            break;
         default :
            throw new IllegalStateException();
      }
      if (parameter.isQuoted()) {
         sb.append('"');
         sb.append(StringEscapeUtils.escapeJava(parameter.getValue()));
         sb.append('"');
      }
      else {
         sb.append(parameter.getValue());
      }
      return sb.toString();
   }

   public String toValueString(Parseable parseable) {
      return toValueString(parseable, false);
   }

   public String toValueString(Parseable parseable, boolean prettyPrinting) {
      if (parseable instanceof Header) {
         return toValueString((Header) parseable, prettyPrinting);
      }
      if (parseable instanceof Parameter) {
         return toValueString((Parameter) parseable, prettyPrinting);
      }
      return null;
   }

   protected String toValueString(Header header, boolean prettyPrinting) {
      final String name = header.getName();
      if (name != null) {
         final Object parsedValue = header.getParsedValue();
         final BundleHeaderName headerName = BundleHeaderName.get(name);
         if (headerName == null || parsedValue == null) {
            return header.getValue();
         }
         return toValueString(headerName, parsedValue, prettyPrinting);
      }
      return null;
   }

   @SuppressWarnings("unchecked")
   protected String toValueString(BundleHeaderName headerName, Object parsedValue, boolean prettyPrinting) {
      switch (headerName) {
         case BUNDLE_ACTIVATIONPOLICY :
            return toValueString((BundleActivationPolicy) parsedValue);
         case BUNDLE_VERSION :
            return ((Version) parsedValue).toMinimalString();
         case BUNDLE_SYMBOLICNAME :
            return toValueString((BundleSymbolicName) parsedValue);
         case EXPORT_PACKAGE :
            return toValueString((EList<PackageExport>) parsedValue, prettyPrinting);
         case IMPORT_PACKAGE :
            return toValueStringImportPackage((EList<PackageImport>) parsedValue, prettyPrinting);
         case DYNAMICIMPORT_PACKAGE :
            return toValueStringDynamicImportPackage((EList<DynamicPackageImport>) parsedValue, prettyPrinting);
         case REQUIRE_BUNDLE :
            return toValueStringRequireBundle((EList<BundleRequirement>) parsedValue, prettyPrinting);
         case BUNDLE_CLASSPATH :
            return toValueStringBundleClassPath((EList<ClassPathEntry>) parsedValue, prettyPrinting);
         case BUNDLE_LICENSE :
            return toValueStringBundleLicense((EList<BundleLicense>) parsedValue, prettyPrinting);
         case FRAGMENT_HOST :
            return toValueString((FragmentHost) parsedValue);
         case BUNDLE_REQUIREDEXECUTIONENVIRONMENT :
            return toBundleRequiredExecutionEnvironmentValueString((EList<String>) parsedValue);
         default :
            return null;
      }
   }

   protected String toBundleRequiredExecutionEnvironmentValueString(EList<String> parsedValue) {
      final StringBuilder sb = new StringBuilder();
      for (String string : parsedValue) {
         sb.append(string);
         sb.append(", ");
      }
      if (sb.length() > 0) {
         sb.deleteCharAt(sb.length() - 1);
         sb.deleteCharAt(sb.length() - 1);
      }
      return sb.toString();
   }

   protected String toValueString(FragmentHost fragmentHost) {
      final StringBuilder sb = new StringBuilder();
      final String name = fragmentHost.getSymbolicName();
      if (name != null) {
         sb.append(name);
         sb.append(';');
      }
      if (name != null && !appendParameterized(sb, fragmentHost)) {
         sb.deleteCharAt(sb.length() - 1);
      }
      return sb.toString();
   }

   protected String toValueStringBundleClassPath(EList<ClassPathEntry> classPathEntries, boolean prettyPrinting) {
      final String separator = getSeparator(prettyPrinting);

      final StringBuilder sb = new StringBuilder();
      for (ClassPathEntry classPathEntry : classPathEntries) {
         write(sb, classPathEntry);
         sb.append(separator);
      }
      if (!classPathEntries.isEmpty()) {
         sb.delete(sb.length() - separator.length(), sb.length());
      }
      return sb.toString();
   }

   protected void write(StringBuilder sb, ClassPathEntry classPathEntry) {
      final EList<String> paths = classPathEntry.getPaths();
      for (String packageName : paths) {
         sb.append(packageName);
         sb.append(';');
      }
      if (!paths.isEmpty() && !appendParameterized(sb, classPathEntry)) {
         sb.deleteCharAt(sb.length() - 1);
      }
   }

   protected String toValueStringBundleLicense(EList<BundleLicense> licenses, boolean prettyPrinting) {
      final String separator = getSeparator(prettyPrinting);

      final StringBuilder sb = new StringBuilder();

      for (BundleLicense license : licenses) {
         final String name = license.getName();
         sb.append(name);
         sb.append(';');
         if (!appendParameterized(sb, license)) {
            sb.deleteCharAt(sb.length() - 1);
         }
         sb.append(separator);
      }

      if (!licenses.isEmpty()) {
         sb.delete(sb.length() - separator.length(), sb.length());
      }

      return sb.toString();
   }

   protected String toValueStringRequireBundle(EList<BundleRequirement> bundleRequirements, boolean prettyPrinting) {
      final String separator = getSeparator(prettyPrinting);
      final StringBuilder sb = new StringBuilder();
      for (BundleRequirement bundleRequirement : bundleRequirements) {
         write(sb, bundleRequirement);
         sb.append(separator);
      }
      if (!bundleRequirements.isEmpty()) {
         sb.delete(sb.length() - separator.length(), sb.length());
      }
      return sb.toString();
   }

   protected void write(StringBuilder sb, BundleRequirement bundleRequirement) {
      final EList<String> symbolicNames = bundleRequirement.getSymbolicNames();
      for (String packageName : symbolicNames) {
         sb.append(packageName);
         sb.append(';');
      }
      if (!symbolicNames.isEmpty() && !appendParameterized(sb, bundleRequirement)) {
         sb.deleteCharAt(sb.length() - 1);
      }
   }

   protected String toValueStringDynamicImportPackage(EList<DynamicPackageImport> packageImports, boolean prettyPrinting) {
      return toValueStringImportPackage(packageImports, prettyPrinting);
   }

   protected String toValueStringImportPackage(EList<? extends PackagesDeclaration> packageImports,
      boolean prettyPrinting) {
      final String separator = getSeparator(prettyPrinting);
      final StringBuilder sb = new StringBuilder();
      for (PackagesDeclaration packageImport : packageImports) {
         write(sb, packageImport);
         sb.append(separator);
      }
      if (!packageImports.isEmpty()) {
         sb.delete(sb.length() - separator.length(), sb.length());
      }
      return sb.toString();
   }

   protected String toValueString(EList<PackageExport> packageExports, boolean prettyPrinting) {
      final String separator = getSeparator(prettyPrinting);

      final StringBuilder sb = new StringBuilder();
      for (PackageExport packageExport : packageExports) {
         write(sb, packageExport);
         sb.append(separator);
      }
      if (!packageExports.isEmpty()) {
         sb.delete(sb.length() - separator.length(), sb.length());
      }
      return sb.toString();
   }

   private String getSeparator(boolean prettyPrinting) {
      return prettyPrinting ? PRETTY_SEPARATOR : ",";
   }

   protected void write(StringBuilder sb, PackagesDeclaration packagesDeclaration) {
      final EList<String> packageNames = packagesDeclaration.getPackageNames();
      for (String packageName : packageNames) {
         sb.append(packageName);
         sb.append(';');
      }
      if (!packageNames.isEmpty() && !appendParameterized(sb, packagesDeclaration)) {
         sb.deleteCharAt(sb.length() - 1);
      }
   }

   protected boolean appendParameterized(StringBuilder sb, Parameterized parameterized) {
      final EList<Parameter> parameters = parameterized.getParameters();
      for (Parameter parameter : parameters) {
         sb.append(parameter.toString());
         sb.append(';');
      }
      final boolean modified = !parameters.isEmpty();
      if (modified) {
         sb.deleteCharAt(sb.length() - 1);
      }
      return modified;
   }

   protected String toValueString(BundleSymbolicName symbolicName) {
      final StringBuilder sb = new StringBuilder();
      final String name = symbolicName.getSymbolicName();
      if (name != null) {
         sb.append(name);
         sb.append(';');
      }
      if (name != null && !appendParameterized(sb, symbolicName)) {
         sb.deleteCharAt(sb.length() - 1);
      }
      return sb.toString();
   }

   protected String toValueString(BundleActivationPolicy activationPolicy) {
      final StringBuilder sb = new StringBuilder();
      final ActivationPolicy policy = activationPolicy.getPolicy();
      if (policy != null) {
         sb.append(policy.getLiteral());
         sb.append(';');
      }
      if (policy != null && !appendParameterized(sb, activationPolicy)) {
         sb.deleteCharAt(sb.length() - 1);
      }
      return sb.toString();
   }

   protected String toValueString(Parameter parameter, boolean prettyPrinting) {
      final Object parsedValue = parameter.getParsedValue();
      if (parsedValue instanceof Version) {
         return ((Version) parsedValue).toMinimalString();
      }
      if (parsedValue instanceof VersionRange) {
         return ((VersionRange) parsedValue).toString();
      }
      if (parsedValue instanceof Boolean) {
         return ((Boolean) parsedValue).toString();
      }
      return null;
   }

   private static abstract class ParseOperation<R> {
      private final String value;

      private BundleManifestParser parser;

      public ParseOperation(String value) {
         this.value = value;
      }

      public final R parse() {
         try {
            return doParse();
         }
         catch (RecognitionException e) {
            final String hdr = parser.getErrorHeader(e);
            final String msg = parser.getErrorMessage(e, parser.getTokenNames());
            throw new IllegalArgumentException(hdr + " " + msg, e);
         }
      }

      protected abstract R doParse() throws RecognitionException;

      protected BundleManifestParser newParser() {
         parser = new BundleManifestParser(
            new CommenTokenStream2(new BundleManifestLexer(new ANTLRStringStream(value))));
         return parser;
      }
   }
}
