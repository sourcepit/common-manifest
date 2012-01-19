/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.sourcepit.common.manifest.osgi.parser.BundleVersionLexer;
import org.sourcepit.common.manifest.osgi.parser.BundleVersionParser;

/**
 * Version identifier for bundles and packages.
 * 
 * <p>
 * Version identifiers have four components.
 * <ol>
 * <li>Major version. A non-negative integer.</li>
 * <li>Minor version. A non-negative integer.</li>
 * <li>Micro version. A non-negative integer.</li>
 * <li>Qualifier. A text string. See {@code Version(String)} for the format of the qualifier string.</li>
 * </ol>
 * 
 * <p>
 * {@code Version} objects are immutable.
 */

public class Version implements Comparable<Version>
{
   private final boolean isMinorSet;
   private final boolean isMicroSet;
   private final int major;
   private final int minor;
   private final int micro;
   private final String qualifier;
   private static final String SEPARATOR = ".";
   private transient String minimalString, fullString;

   /**
    * The empty version "0.0.0".
    */
   public static final Version EMPTY_VERSION = new Version(0, 0, 0);

   /**
    * Created a version identifier from the specified string.
    * 
    * <p>
    * Here is the grammar for version strings.
    * 
    * <pre>
    * version ::= major('.'minor('.'micro('.'qualifier)?)?)?
    * major ::= digit+
    * minor ::= digit+
    * micro ::= digit+
    * qualifier ::= (alpha|digit|'_'|'-')+
    * digit ::= [0..9]
    * alpha ::= [a..zA..Z]
    * </pre>
    * 
    * There must be no whitespace in version.
    * 
    * @param version String representation of the version identifier. Leading and trailing whitespace will be ignored.
    * @return A {@code Version} object representing the version identifier. If {@code version} is {@code null} or the
    *         empty string then {@code emptyVersion} will be returned.
    * @throws IllegalArgumentException If {@code version} is improperly formatted.
    */
   public static Version parse(String version)
   {
      return parseVersion(version, true);
   }

   private static Version parseVersion(String version, boolean validate)
   {
      if (version == null)
      {
         return EMPTY_VERSION;
      }

      version = version.trim();
      if (version.length() == 0)
      {
         return EMPTY_VERSION;
      }

      final BundleVersionParser parser = new BundleVersionParser(new CommonTokenStream(new BundleVersionLexer(
         new ANTLRStringStream(version))));
      try
      {
         final Version versionObj = parser.version();
         if (validate)
         {
            versionObj.validate();
         }
         return versionObj;
      }
      catch (RecognitionException e)
      {
         String hdr = parser.getErrorHeader(e);
         String msg = parser.getErrorMessage(e, parser.getTokenNames());
         throw new IllegalArgumentException(hdr + " " + msg, e);
      }
   }

   /**
    * Creates a version identifier from the specified numerical components.
    * 
    * <p>
    * The qualifier is set to the empty string.
    * 
    * @param major Major component of the version identifier.
    * @param minor Minor component of the version identifier.
    * @param micro Micro component of the version identifier.
    * @throws IllegalArgumentException If the numerical components are negative.
    */
   public Version(int major, int minor, int micro)
   {
      this(major, minor, micro, null);
   }

   /**
    * Creates a version identifier from the specified components.
    * 
    * @param major Major component of the version identifier.
    * @param minor Minor component of the version identifier.
    * @param micro Micro component of the version identifier.
    * @param qualifier Qualifier component of the version identifier. If {@code null} is specified, then the qualifier
    *           will be set to the empty string.
    * @throws IllegalArgumentException If the numerical components are negative or the qualifier string is invalid.
    */
   public Version(int major, int minor, int micro, String qualifier)
   {
      if (qualifier == null)
      {
         qualifier = "";
      }

      isMinorSet = minor > -1;

      isMicroSet = micro > -1;

      this.major = major;
      this.minor = isMinorSet ? minor : 0;
      this.micro = isMicroSet ? micro : 0;
      this.qualifier = qualifier;
      fullString = null;
      validate();
   }

   /**
    * Called by the Version constructors to validate the version components.
    * 
    * @throws IllegalArgumentException If the numerical components are negative or the qualifier string is invalid.
    */
   private void validate()
   {
      validateNumbers();
      validateQualifier();
   }

   private void validateNumbers()
   {
      if (major < 0)
      {
         throw new IllegalArgumentException("negative major");
      }
      if (minor < 0)
      {
         throw new IllegalArgumentException("negative minor");
      }
      if (micro < 0)
      {
         throw new IllegalArgumentException("negative minor");
      }
      if (!isMinorSet && (isMicroSet || qualifier.length() > 0))
      {
         throw new IllegalArgumentException("negative minor");
      }
      if (!isMicroSet && qualifier.length() > 0)
      {
         throw new IllegalArgumentException("negative minor");
      }
   }

   private void validateQualifier()
   {
      char[] chars = qualifier.toCharArray();
      for (int i = 0, length = chars.length; i < length; i++)
      {
         char ch = chars[i];
         if (('A' <= ch) && (ch <= 'Z'))
         {
            continue;
         }
         if (('a' <= ch) && (ch <= 'z'))
         {
            continue;
         }
         if (('0' <= ch) && (ch <= '9'))
         {
            continue;
         }
         if ((ch == '_') || (ch == '-'))
         {
            continue;
         }
         throw new IllegalArgumentException("invalid qualifier: " + qualifier);
      }
   }

   /**
    * Returns the major component of this version identifier.
    * 
    * @return The major component.
    */
   public int getMajor()
   {
      return major;
   }

   /**
    * Returns the minor component of this version identifier.
    * 
    * @return The minor component.
    */
   public int getMinor()
   {
      return minor;
   }

   /**
    * Returns the micro component of this version identifier.
    * 
    * @return The micro component.
    */
   public int getMicro()
   {
      return micro;
   }

   /**
    * Returns the qualifier component of this version identifier.
    * 
    * @return The qualifier component.
    */
   public String getQualifier()
   {
      return qualifier;
   }

   /**
    * Returns the string representation of this version identifier.
    * 
    * <p>
    * The format of the version string will be {@code major.minor.micro} if qualifier is the empty string or
    * {@code major.minor.micro.qualifier} otherwise.
    * 
    * <p>
    * This method is equivalent to {@link #toString()} and {@link #toString(boolean)} with <code>true</code>.
    * 
    * @return The string representation of this version identifier.
    * 
    * @see #toString(boolean)
    * @see #toFullString()
    * @see #toMinimalString()
    */
   public String toString()
   {
      return toFullString();
   }

   /**
    * Returns the string representation of this version identifier.
    * 
    * <p>
    * The format of the version string will be {@code major.minor.micro} if qualifier is the empty string or
    * {@code major.minor.micro.qualifier} otherwise.
    * 
    * <p>
    * This method is equivalent to {@link #toString()} and {@link #toString(boolean)} with <code>true</code>.
    * 
    * @return The string representation of this version identifier.
    * 
    * @see #toString()
    * @see #toString(boolean)
    * @see #toMinimalString()
    */
   public String toFullString()
   {
      if (fullString != null)
      {
         return fullString;
      }
      fullString = toString(true);
      return fullString;
   }

   /**
    * Returns the compressed string representation of this version identifier.
    * 
    * <p>
    * 
    * This method differs from {@link #toFullString()} in that not-set version segments won't be included in the
    * returned string (unless the qualifier is present).
    * 
    * <p>
    * This method is equivalent to {@link #toString(boolean)} with <code>false</code>.
    * 
    * @return The string representation of this version identifier.
    * 
    * @see #toString()
    * @see #toString(boolean)
    * @see #toMinimalString()
    */
   public String toMinimalString()
   {
      if (minimalString != null)
      {
         return minimalString;
      }
      minimalString = toString(false);
      return minimalString;
   }

   public String toString(boolean expand)
   {
      int q = qualifier.length();
      StringBuilder result = new StringBuilder(20 + q);
      result.append(major);
      if (expand || isMinorSet)
      {
         result.append(SEPARATOR);
         result.append(minor);
      }
      if (expand || isMicroSet)
      {
         result.append(SEPARATOR);
         result.append(micro);
      }
      if (q > 0)
      {
         result.append(SEPARATOR);
         result.append(qualifier);
      }
      return result.toString();
   }

   /**
    * Returns a hash code value for the object.
    * 
    * @return An integer which is a hash code value for this object.
    */
   public int hashCode()
   {
      return (major << 24) + (minor << 16) + (micro << 8) + qualifier.hashCode();
   }

   /**
    * Compares this {@code Version} object to another object.
    * 
    * <p>
    * A version is considered to be <b>equal to </b> another version if the major, minor and micro components are equal
    * and the qualifier component is equal (using {@code String.equals}).
    * 
    * @param object The {@code Version} object to be compared.
    * @return {@code true} if {@code object} is a {@code Version} and is equal to this object; {@code false} otherwise.
    */
   public boolean equals(Object object)
   {
      if (object == this)
      { // quicktest
         return true;
      }

      if (!(object instanceof Version))
      {
         return false;
      }

      Version other = (Version) object;
      return (major == other.major) && (minor == other.minor) && (micro == other.micro)
         && qualifier.equals(other.qualifier);
   }

   /**
    * Compares this {@code Version} object to another {@code Version}.
    * 
    * <p>
    * A version is considered to be <b>less than </b> another version if its major component is less than the other
    * version's major component, or the major components are equal and its minor component is less than the other
    * version's minor component, or the major and minor components are equal and its micro component is less than the
    * other version's micro component, or the major, minor and micro components are equal and it's qualifier component
    * is less than the other version's qualifier component (using {@code String.compareTo}).
    * 
    * <p>
    * A version is considered to be <b>equal to</b> another version if the major, minor and micro components are equal
    * and the qualifier component is equal (using {@code String.compareTo}).
    * 
    * @param other The {@code Version} object to be compared.
    * @return A negative integer, zero, or a positive integer if this version is less than, equal to, or greater than
    *         the specified {@code Version} object.
    * @throws ClassCastException If the specified object is not a {@code Version} object.
    */
   public int compareTo(Version other)
   {
      if (other == this)
      { // quicktest
         return 0;
      }

      int result = major - other.major;
      if (result != 0)
      {
         return result;
      }

      result = minor - other.minor;
      if (result != 0)
      {
         return result;
      }

      result = micro - other.micro;
      if (result != 0)
      {
         return result;
      }

      return qualifier.compareTo(other.qualifier);
   }
}
