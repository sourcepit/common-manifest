/**
 * <copyright>
 * </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.manifest.osgi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Bundle Header Name</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getBundleHeaderName()
 * @model
 * @generated
 */
public enum BundleHeaderName implements Enumerator {
   /**
    * The '<em><b>BUNDLE ACTIVATIONPOLICY</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_ACTIVATIONPOLICY_VALUE
    * @generated
    * @ordered
    */
   BUNDLE_ACTIVATIONPOLICY(0, "BUNDLE_ACTIVATIONPOLICY", "Bundle-ActivationPolicy"),

   /**
    * The '<em><b>BUNDLE ACTIVATOR</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_ACTIVATOR_VALUE
    * @generated
    * @ordered
    */
   BUNDLE_ACTIVATOR(1, "BUNDLE_ACTIVATOR", "Bundle-Activator"),

   /**
    * The '<em><b>BUNDLE CATEGORY</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_CATEGORY_VALUE
    * @generated
    * @ordered
    */
   BUNDLE_CATEGORY(2, "BUNDLE_CATEGORY", "Bundle-Category"),

   /**
    * The '<em><b>BUNDLE CLASSPATH</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_CLASSPATH_VALUE
    * @generated
    * @ordered
    */
   BUNDLE_CLASSPATH(3, "BUNDLE_CLASSPATH", "Bundle-ClassPath"),

   /**
    * The '<em><b>BUNDLE CONTACTADRESS</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_CONTACTADRESS_VALUE
    * @generated
    * @ordered
    */
   BUNDLE_CONTACTADRESS(4, "BUNDLE_CONTACTADRESS", "Bundle-ContactAddress"),

   /**
    * The '<em><b>BUNDLE COPYRIGHT</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_COPYRIGHT_VALUE
    * @generated
    * @ordered
    */
   BUNDLE_COPYRIGHT(5, "BUNDLE_COPYRIGHT", "Bundle-Copyright"),

   /**
    * The '<em><b>BUNDLE DESCRIPTION</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_DESCRIPTION_VALUE
    * @generated
    * @ordered
    */
   BUNDLE_DESCRIPTION(6, "BUNDLE_DESCRIPTION", "Bundle-Description"),

   /**
    * The '<em><b>BUNDLE DOCURL</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_DOCURL_VALUE
    * @generated
    * @ordered
    */
   BUNDLE_DOCURL(7, "BUNDLE_DOCURL", "Bundle-DocURL"),

   /**
    * The '<em><b>BUNDLE ICON</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_ICON_VALUE
    * @generated
    * @ordered
    */
   BUNDLE_ICON(8, "BUNDLE_ICON", "Bundle-Icon"),

   /**
    * The '<em><b>BUNDLE LICENSE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_LICENSE_VALUE
    * @generated
    * @ordered
    */
   BUNDLE_LICENSE(9, "BUNDLE_LICENSE", "Bundle-License"),

   /**
    * The '<em><b>BUNDLE LOCALIZATION</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_LOCALIZATION_VALUE
    * @generated
    * @ordered
    */
   BUNDLE_LOCALIZATION(10, "BUNDLE_LOCALIZATION", "Bundle-Localization"),

   /**
    * The '<em><b>BUNDLE MANIFESTVERSION</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_MANIFESTVERSION_VALUE
    * @generated
    * @ordered
    */
   BUNDLE_MANIFESTVERSION(11, "BUNDLE_MANIFESTVERSION", "Bundle-ManifestVersion"),

   /**
    * The '<em><b>BUNDLE NAME</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_NAME_VALUE
    * @generated
    * @ordered
    */
   BUNDLE_NAME(12, "BUNDLE_NAME", "Bundle-Name"),

   /**
    * The '<em><b>BUNDLE NATIVECODE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_NATIVECODE_VALUE
    * @generated
    * @ordered
    */
   BUNDLE_NATIVECODE(13, "BUNDLE_NATIVECODE", "Bundle-NativeCode"),

   /**
    * The '<em><b>BUNDLE REQUIREDEXECUTIONENVIRONMENT</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_REQUIREDEXECUTIONENVIRONMENT_VALUE
    * @generated
    * @ordered
    */
   BUNDLE_REQUIREDEXECUTIONENVIRONMENT(14, "BUNDLE_REQUIREDEXECUTIONENVIRONMENT", "Bundle-RequiredExecutionEnvironment"),

   /**
    * The '<em><b>BUNDLE SYMBOLICNAME</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_SYMBOLICNAME_VALUE
    * @generated
    * @ordered
    */
   BUNDLE_SYMBOLICNAME(15, "BUNDLE_SYMBOLICNAME", "Bundle-SymbolicName"),

   /**
    * The '<em><b>BUNDLE UPDATELOCATION</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_UPDATELOCATION_VALUE
    * @generated
    * @ordered
    */
   BUNDLE_UPDATELOCATION(16, "BUNDLE_UPDATELOCATION", "Bundle-UpdateLocation"),

   /**
    * The '<em><b>BUNDLE VENDOR</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_VENDOR_VALUE
    * @generated
    * @ordered
    */
   BUNDLE_VENDOR(17, "BUNDLE_VENDOR", "Bundle-Vendor"),

   /**
    * The '<em><b>BUNDLE VERSION</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_VERSION_VALUE
    * @generated
    * @ordered
    */
   BUNDLE_VERSION(18, "BUNDLE_VERSION", "Bundle-Version"),

   /**
    * The '<em><b>DYNAMICIMPORT PACKAGE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #DYNAMICIMPORT_PACKAGE_VALUE
    * @generated
    * @ordered
    */
   DYNAMICIMPORT_PACKAGE(19, "DYNAMICIMPORT_PACKAGE", "DynamicImport-Package"),

   /**
    * The '<em><b>EXPORT PACKAGE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #EXPORT_PACKAGE_VALUE
    * @generated
    * @ordered
    */
   EXPORT_PACKAGE(20, "EXPORT_PACKAGE", "Export-Package"),

   /**
    * The '<em><b>EXPORT SERVICE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #EXPORT_SERVICE_VALUE
    * @generated
    * @ordered
    */
   EXPORT_SERVICE(21, "EXPORT_SERVICE", "Export-Service"),

   /**
    * The '<em><b>FRAGMENT HOST</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #FRAGMENT_HOST_VALUE
    * @generated
    * @ordered
    */
   FRAGMENT_HOST(22, "FRAGMENT_HOST", "Fragment-Host"),

   /**
    * The '<em><b>IMPORT PACKAGE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #IMPORT_PACKAGE_VALUE
    * @generated
    * @ordered
    */
   IMPORT_PACKAGE(23, "IMPORT_PACKAGE", "Import-Package"),

   /**
    * The '<em><b>IMPORT SERVICE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #IMPORT_SERVICE_VALUE
    * @generated
    * @ordered
    */
   IMPORT_SERVICE(24, "IMPORT_SERVICE", "Import-Service"),

   /**
    * The '<em><b>PROVIDED CAPABILITY</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #PROVIDED_CAPABILITY_VALUE
    * @generated
    * @ordered
    */
   PROVIDED_CAPABILITY(25, "PROVIDED_CAPABILITY", "Provided-Capability"),

   /**
    * The '<em><b>REQUIRE BUNDLE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #REQUIRE_BUNDLE_VALUE
    * @generated
    * @ordered
    */
   REQUIRE_BUNDLE(26, "REQUIRE_BUNDLE", "Require-Bundle"),

   /**
    * The '<em><b>REQUIRE CAPABILITY</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #REQUIRE_CAPABILITY_VALUE
    * @generated
    * @ordered
    */
   REQUIRE_CAPABILITY(27, "REQUIRE_CAPABILITY", "Require-Capability");

   /**
    * The '<em><b>BUNDLE ACTIVATIONPOLICY</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BUNDLE ACTIVATIONPOLICY</b></em>' literal object isn't clear, there really should be
    * more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_ACTIVATIONPOLICY
    * @model literal="Bundle-ActivationPolicy"
    * @generated
    * @ordered
    */
   public static final int BUNDLE_ACTIVATIONPOLICY_VALUE = 0;

   /**
    * The '<em><b>BUNDLE ACTIVATOR</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BUNDLE ACTIVATOR</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_ACTIVATOR
    * @model literal="Bundle-Activator"
    * @generated
    * @ordered
    */
   public static final int BUNDLE_ACTIVATOR_VALUE = 1;

   /**
    * The '<em><b>BUNDLE CATEGORY</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BUNDLE CATEGORY</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_CATEGORY
    * @model literal="Bundle-Category"
    * @generated
    * @ordered
    */
   public static final int BUNDLE_CATEGORY_VALUE = 2;

   /**
    * The '<em><b>BUNDLE CLASSPATH</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BUNDLE CLASSPATH</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_CLASSPATH
    * @model literal="Bundle-ClassPath"
    * @generated
    * @ordered
    */
   public static final int BUNDLE_CLASSPATH_VALUE = 3;

   /**
    * The '<em><b>BUNDLE CONTACTADRESS</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BUNDLE CONTACTADRESS</b></em>' literal object isn't clear, there really should be more
    * of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_CONTACTADRESS
    * @model literal="Bundle-ContactAddress"
    * @generated
    * @ordered
    */
   public static final int BUNDLE_CONTACTADRESS_VALUE = 4;

   /**
    * The '<em><b>BUNDLE COPYRIGHT</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BUNDLE COPYRIGHT</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_COPYRIGHT
    * @model literal="Bundle-Copyright"
    * @generated
    * @ordered
    */
   public static final int BUNDLE_COPYRIGHT_VALUE = 5;

   /**
    * The '<em><b>BUNDLE DESCRIPTION</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BUNDLE DESCRIPTION</b></em>' literal object isn't clear, there really should be more of
    * a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_DESCRIPTION
    * @model literal="Bundle-Description"
    * @generated
    * @ordered
    */
   public static final int BUNDLE_DESCRIPTION_VALUE = 6;

   /**
    * The '<em><b>BUNDLE DOCURL</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BUNDLE DOCURL</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_DOCURL
    * @model literal="Bundle-DocURL"
    * @generated
    * @ordered
    */
   public static final int BUNDLE_DOCURL_VALUE = 7;

   /**
    * The '<em><b>BUNDLE ICON</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BUNDLE ICON</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_ICON
    * @model literal="Bundle-Icon"
    * @generated
    * @ordered
    */
   public static final int BUNDLE_ICON_VALUE = 8;

   /**
    * The '<em><b>BUNDLE LICENSE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BUNDLE LICENSE</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_LICENSE
    * @model literal="Bundle-License"
    * @generated
    * @ordered
    */
   public static final int BUNDLE_LICENSE_VALUE = 9;

   /**
    * The '<em><b>BUNDLE LOCALIZATION</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BUNDLE LOCALIZATION</b></em>' literal object isn't clear, there really should be more of
    * a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_LOCALIZATION
    * @model literal="Bundle-Localization"
    * @generated
    * @ordered
    */
   public static final int BUNDLE_LOCALIZATION_VALUE = 10;

   /**
    * The '<em><b>BUNDLE MANIFESTVERSION</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BUNDLE MANIFESTVERSION</b></em>' literal object isn't clear, there really should be more
    * of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_MANIFESTVERSION
    * @model literal="Bundle-ManifestVersion"
    * @generated
    * @ordered
    */
   public static final int BUNDLE_MANIFESTVERSION_VALUE = 11;

   /**
    * The '<em><b>BUNDLE NAME</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BUNDLE NAME</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_NAME
    * @model literal="Bundle-Name"
    * @generated
    * @ordered
    */
   public static final int BUNDLE_NAME_VALUE = 12;

   /**
    * The '<em><b>BUNDLE NATIVECODE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BUNDLE NATIVECODE</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_NATIVECODE
    * @model literal="Bundle-NativeCode"
    * @generated
    * @ordered
    */
   public static final int BUNDLE_NATIVECODE_VALUE = 13;

   /**
    * The '<em><b>BUNDLE REQUIREDEXECUTIONENVIRONMENT</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BUNDLE REQUIREDEXECUTIONENVIRONMENT</b></em>' literal object isn't clear, there really
    * should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_REQUIREDEXECUTIONENVIRONMENT
    * @model literal="Bundle-RequiredExecutionEnvironment"
    * @generated
    * @ordered
    */
   public static final int BUNDLE_REQUIREDEXECUTIONENVIRONMENT_VALUE = 14;

   /**
    * The '<em><b>BUNDLE SYMBOLICNAME</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BUNDLE SYMBOLICNAME</b></em>' literal object isn't clear, there really should be more of
    * a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_SYMBOLICNAME
    * @model literal="Bundle-SymbolicName"
    * @generated
    * @ordered
    */
   public static final int BUNDLE_SYMBOLICNAME_VALUE = 15;

   /**
    * The '<em><b>BUNDLE UPDATELOCATION</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BUNDLE UPDATELOCATION</b></em>' literal object isn't clear, there really should be more
    * of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_UPDATELOCATION
    * @model literal="Bundle-UpdateLocation"
    * @generated
    * @ordered
    */
   public static final int BUNDLE_UPDATELOCATION_VALUE = 16;

   /**
    * The '<em><b>BUNDLE VENDOR</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BUNDLE VENDOR</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_VENDOR
    * @model literal="Bundle-Vendor"
    * @generated
    * @ordered
    */
   public static final int BUNDLE_VENDOR_VALUE = 17;

   /**
    * The '<em><b>BUNDLE VERSION</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>BUNDLE VERSION</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #BUNDLE_VERSION
    * @model literal="Bundle-Version"
    * @generated
    * @ordered
    */
   public static final int BUNDLE_VERSION_VALUE = 18;

   /**
    * The '<em><b>DYNAMICIMPORT PACKAGE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>DYNAMICIMPORT PACKAGE</b></em>' literal object isn't clear, there really should be more
    * of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #DYNAMICIMPORT_PACKAGE
    * @model literal="DynamicImport-Package"
    * @generated
    * @ordered
    */
   public static final int DYNAMICIMPORT_PACKAGE_VALUE = 19;

   /**
    * The '<em><b>EXPORT PACKAGE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>EXPORT PACKAGE</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #EXPORT_PACKAGE
    * @model literal="Export-Package"
    * @generated
    * @ordered
    */
   public static final int EXPORT_PACKAGE_VALUE = 20;

   /**
    * The '<em><b>EXPORT SERVICE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>EXPORT SERVICE</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #EXPORT_SERVICE
    * @model literal="Export-Service"
    * @generated
    * @ordered
    */
   public static final int EXPORT_SERVICE_VALUE = 21;

   /**
    * The '<em><b>FRAGMENT HOST</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>FRAGMENT HOST</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #FRAGMENT_HOST
    * @model literal="Fragment-Host"
    * @generated
    * @ordered
    */
   public static final int FRAGMENT_HOST_VALUE = 22;

   /**
    * The '<em><b>IMPORT PACKAGE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>IMPORT PACKAGE</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #IMPORT_PACKAGE
    * @model literal="Import-Package"
    * @generated
    * @ordered
    */
   public static final int IMPORT_PACKAGE_VALUE = 23;

   /**
    * The '<em><b>IMPORT SERVICE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>IMPORT SERVICE</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #IMPORT_SERVICE
    * @model literal="Import-Service"
    * @generated
    * @ordered
    */
   public static final int IMPORT_SERVICE_VALUE = 24;

   /**
    * The '<em><b>PROVIDED CAPABILITY</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>PROVIDED CAPABILITY</b></em>' literal object isn't clear, there really should be more of
    * a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #PROVIDED_CAPABILITY
    * @model literal="Provided-Capability"
    * @generated
    * @ordered
    */
   public static final int PROVIDED_CAPABILITY_VALUE = 25;

   /**
    * The '<em><b>REQUIRE BUNDLE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>REQUIRE BUNDLE</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #REQUIRE_BUNDLE
    * @model literal="Require-Bundle"
    * @generated
    * @ordered
    */
   public static final int REQUIRE_BUNDLE_VALUE = 26;

   /**
    * The '<em><b>REQUIRE CAPABILITY</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>REQUIRE CAPABILITY</b></em>' literal object isn't clear, there really should be more of
    * a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #REQUIRE_CAPABILITY
    * @model literal="Require-Capability"
    * @generated
    * @ordered
    */
   public static final int REQUIRE_CAPABILITY_VALUE = 27;

   /**
    * An array of all the '<em><b>Bundle Header Name</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private static final BundleHeaderName[] VALUES_ARRAY = new BundleHeaderName[] {BUNDLE_ACTIVATIONPOLICY,
      BUNDLE_ACTIVATOR, BUNDLE_CATEGORY, BUNDLE_CLASSPATH, BUNDLE_CONTACTADRESS, BUNDLE_COPYRIGHT, BUNDLE_DESCRIPTION,
      BUNDLE_DOCURL, BUNDLE_ICON, BUNDLE_LICENSE, BUNDLE_LOCALIZATION, BUNDLE_MANIFESTVERSION, BUNDLE_NAME,
      BUNDLE_NATIVECODE, BUNDLE_REQUIREDEXECUTIONENVIRONMENT, BUNDLE_SYMBOLICNAME, BUNDLE_UPDATELOCATION,
      BUNDLE_VENDOR, BUNDLE_VERSION, DYNAMICIMPORT_PACKAGE, EXPORT_PACKAGE, EXPORT_SERVICE, FRAGMENT_HOST,
      IMPORT_PACKAGE, IMPORT_SERVICE, PROVIDED_CAPABILITY, REQUIRE_BUNDLE, REQUIRE_CAPABILITY,};

   /**
    * A public read-only list of all the '<em><b>Bundle Header Name</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static final List<BundleHeaderName> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>Bundle Header Name</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static BundleHeaderName get(String literal)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         BundleHeaderName result = VALUES_ARRAY[i];
         if (result.toString().equals(literal))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Bundle Header Name</b></em>' literal with the specified name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static BundleHeaderName getByName(String name)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         BundleHeaderName result = VALUES_ARRAY[i];
         if (result.getName().equals(name))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Bundle Header Name</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static BundleHeaderName get(int value)
   {
      switch (value)
      {
         case BUNDLE_ACTIVATIONPOLICY_VALUE :
            return BUNDLE_ACTIVATIONPOLICY;
         case BUNDLE_ACTIVATOR_VALUE :
            return BUNDLE_ACTIVATOR;
         case BUNDLE_CATEGORY_VALUE :
            return BUNDLE_CATEGORY;
         case BUNDLE_CLASSPATH_VALUE :
            return BUNDLE_CLASSPATH;
         case BUNDLE_CONTACTADRESS_VALUE :
            return BUNDLE_CONTACTADRESS;
         case BUNDLE_COPYRIGHT_VALUE :
            return BUNDLE_COPYRIGHT;
         case BUNDLE_DESCRIPTION_VALUE :
            return BUNDLE_DESCRIPTION;
         case BUNDLE_DOCURL_VALUE :
            return BUNDLE_DOCURL;
         case BUNDLE_ICON_VALUE :
            return BUNDLE_ICON;
         case BUNDLE_LICENSE_VALUE :
            return BUNDLE_LICENSE;
         case BUNDLE_LOCALIZATION_VALUE :
            return BUNDLE_LOCALIZATION;
         case BUNDLE_MANIFESTVERSION_VALUE :
            return BUNDLE_MANIFESTVERSION;
         case BUNDLE_NAME_VALUE :
            return BUNDLE_NAME;
         case BUNDLE_NATIVECODE_VALUE :
            return BUNDLE_NATIVECODE;
         case BUNDLE_REQUIREDEXECUTIONENVIRONMENT_VALUE :
            return BUNDLE_REQUIREDEXECUTIONENVIRONMENT;
         case BUNDLE_SYMBOLICNAME_VALUE :
            return BUNDLE_SYMBOLICNAME;
         case BUNDLE_UPDATELOCATION_VALUE :
            return BUNDLE_UPDATELOCATION;
         case BUNDLE_VENDOR_VALUE :
            return BUNDLE_VENDOR;
         case BUNDLE_VERSION_VALUE :
            return BUNDLE_VERSION;
         case DYNAMICIMPORT_PACKAGE_VALUE :
            return DYNAMICIMPORT_PACKAGE;
         case EXPORT_PACKAGE_VALUE :
            return EXPORT_PACKAGE;
         case EXPORT_SERVICE_VALUE :
            return EXPORT_SERVICE;
         case FRAGMENT_HOST_VALUE :
            return FRAGMENT_HOST;
         case IMPORT_PACKAGE_VALUE :
            return IMPORT_PACKAGE;
         case IMPORT_SERVICE_VALUE :
            return IMPORT_SERVICE;
         case PROVIDED_CAPABILITY_VALUE :
            return PROVIDED_CAPABILITY;
         case REQUIRE_BUNDLE_VALUE :
            return REQUIRE_BUNDLE;
         case REQUIRE_CAPABILITY_VALUE :
            return REQUIRE_CAPABILITY;
      }
      return null;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private final int value;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private final String name;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private final String literal;

   /**
    * Only this class can construct instances.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private BundleHeaderName(int value, String name, String literal)
   {
      this.value = value;
      this.name = name;
      this.literal = literal;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public int getValue()
   {
      return value;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getName()
   {
      return name;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getLiteral()
   {
      return literal;
   }

   /**
    * Returns the literal value of the enumerator, which is its string representation.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public String toString()
   {
      return literal;
   }

} // BundleHeaderName
