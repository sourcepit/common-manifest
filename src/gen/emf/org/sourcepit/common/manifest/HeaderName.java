/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Header Name</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.common.manifest.ManifestPackage#getHeaderName()
 * @model
 * @generated
 */
public enum HeaderName implements Enumerator
{
   /**
    * The '<em><b>MANIFEST VERSION</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #MANIFEST_VERSION_VALUE
    * @generated
    * @ordered
    */
   MANIFEST_VERSION(0, "MANIFEST_VERSION", "Manifest-Version"),

   /**
    * The '<em><b>SIGNATURE VERSION</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #SIGNATURE_VERSION_VALUE
    * @generated
    * @ordered
    */
   SIGNATURE_VERSION(1, "SIGNATURE_VERSION", "Signature-Version"),

   /**
    * The '<em><b>CONTENT TYPE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #CONTENT_TYPE_VALUE
    * @generated
    * @ordered
    */
   CONTENT_TYPE(2, "CONTENT_TYPE", "Content-Type"),

   /**
    * The '<em><b>CLASS PATH</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #CLASS_PATH_VALUE
    * @generated
    * @ordered
    */
   CLASS_PATH(3, "CLASS_PATH", "Class-Path"),

   /**
    * The '<em><b>MAIN CLASS</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #MAIN_CLASS_VALUE
    * @generated
    * @ordered
    */
   MAIN_CLASS(4, "MAIN_CLASS", "Main-Class"),

   /**
    * The '<em><b>SEALED</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #SEALED_VALUE
    * @generated
    * @ordered
    */
   SEALED(5, "SEALED", "Sealed"),

   /**
    * The '<em><b>EXTENSION LIST</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #EXTENSION_LIST_VALUE
    * @generated
    * @ordered
    */
   EXTENSION_LIST(6, "EXTENSION_LIST", "Extension-List"),

   /**
    * The '<em><b>EXTENSION NAME</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #EXTENSION_NAME_VALUE
    * @generated
    * @ordered
    */
   EXTENSION_NAME(7, "EXTENSION_NAME", "Extension-Name"),

   /**
    * The '<em><b>EXTENSION INSTALLATION</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #EXTENSION_INSTALLATION_VALUE
    * @generated
    * @ordered
    */
   EXTENSION_INSTALLATION(8, "EXTENSION_INSTALLATION", "Extension-Installation"),

   /**
    * The '<em><b>IMPLEMENTATION TITLE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #IMPLEMENTATION_TITLE_VALUE
    * @generated
    * @ordered
    */
   IMPLEMENTATION_TITLE(9, "IMPLEMENTATION_TITLE", "Implementation-Title"),

   /**
    * The '<em><b>IMPLEMENTATION VERSION</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #IMPLEMENTATION_VERSION_VALUE
    * @generated
    * @ordered
    */
   IMPLEMENTATION_VERSION(10, "IMPLEMENTATION_VERSION", "Implementation-Version"),

   /**
    * The '<em><b>IMPLEMENTATION VENDOR</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #IMPLEMENTATION_VENDOR_VALUE
    * @generated
    * @ordered
    */
   IMPLEMENTATION_VENDOR(11, "IMPLEMENTATION_VENDOR", "Implementation-Vendor"),

   /**
    * The '<em><b>IMPLEMENTATION VENDOR ID</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #IMPLEMENTATION_VENDOR_ID_VALUE
    * @generated
    * @ordered
    */
   IMPLEMENTATION_VENDOR_ID(12, "IMPLEMENTATION_VENDOR_ID", "Implementation-Vendor-Id"),

   /**
    * The '<em><b>IMPLEMENTATION URL</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #IMPLEMENTATION_URL_VALUE
    * @generated
    * @ordered
    */
   IMPLEMENTATION_URL(13, "IMPLEMENTATION_URL", "Implementation-URL"),

   /**
    * The '<em><b>SPECIFICATION TITLE</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #SPECIFICATION_TITLE_VALUE
    * @generated
    * @ordered
    */
   SPECIFICATION_TITLE(14, "SPECIFICATION_TITLE", "Specification-Title"),

   /**
    * The '<em><b>SPECIFICATION VERSION</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #SPECIFICATION_VERSION_VALUE
    * @generated
    * @ordered
    */
   SPECIFICATION_VERSION(15, "SPECIFICATION_VERSION", "Specification-Version"),

   /**
    * The '<em><b>SPECIFICATION VENDOR</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #SPECIFICATION_VENDOR_VALUE
    * @generated
    * @ordered
    */
   SPECIFICATION_VENDOR(16, "SPECIFICATION_VENDOR", "Specification-Vendor");

   /**
    * The '<em><b>MANIFEST VERSION</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>MANIFEST VERSION</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #MANIFEST_VERSION
    * @model literal="Manifest-Version"
    * @generated
    * @ordered
    */
   public static final int MANIFEST_VERSION_VALUE = 0;

   /**
    * The '<em><b>SIGNATURE VERSION</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>SIGNATURE VERSION</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #SIGNATURE_VERSION
    * @model literal="Signature-Version"
    * @generated
    * @ordered
    */
   public static final int SIGNATURE_VERSION_VALUE = 1;

   /**
    * The '<em><b>CONTENT TYPE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>CONTENT TYPE</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #CONTENT_TYPE
    * @model literal="Content-Type"
    * @generated
    * @ordered
    */
   public static final int CONTENT_TYPE_VALUE = 2;

   /**
    * The '<em><b>CLASS PATH</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>CLASS PATH</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #CLASS_PATH
    * @model literal="Class-Path"
    * @generated
    * @ordered
    */
   public static final int CLASS_PATH_VALUE = 3;

   /**
    * The '<em><b>MAIN CLASS</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>MAIN CLASS</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #MAIN_CLASS
    * @model literal="Main-Class"
    * @generated
    * @ordered
    */
   public static final int MAIN_CLASS_VALUE = 4;

   /**
    * The '<em><b>SEALED</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>SEALED</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #SEALED
    * @model literal="Sealed"
    * @generated
    * @ordered
    */
   public static final int SEALED_VALUE = 5;

   /**
    * The '<em><b>EXTENSION LIST</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>EXTENSION LIST</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #EXTENSION_LIST
    * @model literal="Extension-List"
    * @generated
    * @ordered
    */
   public static final int EXTENSION_LIST_VALUE = 6;

   /**
    * The '<em><b>EXTENSION NAME</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>EXTENSION NAME</b></em>' literal object isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #EXTENSION_NAME
    * @model literal="Extension-Name"
    * @generated
    * @ordered
    */
   public static final int EXTENSION_NAME_VALUE = 7;

   /**
    * The '<em><b>EXTENSION INSTALLATION</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>EXTENSION INSTALLATION</b></em>' literal object isn't clear, there really should be more
    * of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #EXTENSION_INSTALLATION
    * @model literal="Extension-Installation"
    * @generated
    * @ordered
    */
   public static final int EXTENSION_INSTALLATION_VALUE = 8;

   /**
    * The '<em><b>IMPLEMENTATION TITLE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>IMPLEMENTATION TITLE</b></em>' literal object isn't clear, there really should be more
    * of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #IMPLEMENTATION_TITLE
    * @model literal="Implementation-Title"
    * @generated
    * @ordered
    */
   public static final int IMPLEMENTATION_TITLE_VALUE = 9;

   /**
    * The '<em><b>IMPLEMENTATION VERSION</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>IMPLEMENTATION VERSION</b></em>' literal object isn't clear, there really should be more
    * of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #IMPLEMENTATION_VERSION
    * @model literal="Implementation-Version"
    * @generated
    * @ordered
    */
   public static final int IMPLEMENTATION_VERSION_VALUE = 10;

   /**
    * The '<em><b>IMPLEMENTATION VENDOR</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>IMPLEMENTATION VENDOR</b></em>' literal object isn't clear, there really should be more
    * of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #IMPLEMENTATION_VENDOR
    * @model literal="Implementation-Vendor"
    * @generated
    * @ordered
    */
   public static final int IMPLEMENTATION_VENDOR_VALUE = 11;

   /**
    * The '<em><b>IMPLEMENTATION VENDOR ID</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>IMPLEMENTATION VENDOR ID</b></em>' literal object isn't clear, there really should be
    * more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #IMPLEMENTATION_VENDOR_ID
    * @model literal="Implementation-Vendor-Id"
    * @generated
    * @ordered
    */
   public static final int IMPLEMENTATION_VENDOR_ID_VALUE = 12;

   /**
    * The '<em><b>IMPLEMENTATION URL</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>IMPLEMENTATION URL</b></em>' literal object isn't clear, there really should be more of
    * a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #IMPLEMENTATION_URL
    * @model literal="Implementation-URL"
    * @generated
    * @ordered
    */
   public static final int IMPLEMENTATION_URL_VALUE = 13;

   /**
    * The '<em><b>SPECIFICATION TITLE</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>SPECIFICATION TITLE</b></em>' literal object isn't clear, there really should be more of
    * a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #SPECIFICATION_TITLE
    * @model literal="Specification-Title"
    * @generated
    * @ordered
    */
   public static final int SPECIFICATION_TITLE_VALUE = 14;

   /**
    * The '<em><b>SPECIFICATION VERSION</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>SPECIFICATION VERSION</b></em>' literal object isn't clear, there really should be more
    * of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #SPECIFICATION_VERSION
    * @model literal="Specification-Version"
    * @generated
    * @ordered
    */
   public static final int SPECIFICATION_VERSION_VALUE = 15;

   /**
    * The '<em><b>SPECIFICATION VENDOR</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>SPECIFICATION VENDOR</b></em>' literal object isn't clear, there really should be more
    * of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #SPECIFICATION_VENDOR
    * @model literal="Specification-Vendor"
    * @generated
    * @ordered
    */
   public static final int SPECIFICATION_VENDOR_VALUE = 16;

   /**
    * An array of all the '<em><b>Header Name</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private static final HeaderName[] VALUES_ARRAY = new HeaderName[] { MANIFEST_VERSION, SIGNATURE_VERSION,
      CONTENT_TYPE, CLASS_PATH, MAIN_CLASS, SEALED, EXTENSION_LIST, EXTENSION_NAME, EXTENSION_INSTALLATION,
      IMPLEMENTATION_TITLE, IMPLEMENTATION_VERSION, IMPLEMENTATION_VENDOR, IMPLEMENTATION_VENDOR_ID,
      IMPLEMENTATION_URL, SPECIFICATION_TITLE, SPECIFICATION_VERSION, SPECIFICATION_VENDOR, };

   /**
    * A public read-only list of all the '<em><b>Header Name</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static final List<HeaderName> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>Header Name</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static HeaderName get(String literal)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         HeaderName result = VALUES_ARRAY[i];
         if (result.toString().equals(literal))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Header Name</b></em>' literal with the specified name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static HeaderName getByName(String name)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         HeaderName result = VALUES_ARRAY[i];
         if (result.getName().equals(name))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Header Name</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static HeaderName get(int value)
   {
      switch (value)
      {
         case MANIFEST_VERSION_VALUE :
            return MANIFEST_VERSION;
         case SIGNATURE_VERSION_VALUE :
            return SIGNATURE_VERSION;
         case CONTENT_TYPE_VALUE :
            return CONTENT_TYPE;
         case CLASS_PATH_VALUE :
            return CLASS_PATH;
         case MAIN_CLASS_VALUE :
            return MAIN_CLASS;
         case SEALED_VALUE :
            return SEALED;
         case EXTENSION_LIST_VALUE :
            return EXTENSION_LIST;
         case EXTENSION_NAME_VALUE :
            return EXTENSION_NAME;
         case EXTENSION_INSTALLATION_VALUE :
            return EXTENSION_INSTALLATION;
         case IMPLEMENTATION_TITLE_VALUE :
            return IMPLEMENTATION_TITLE;
         case IMPLEMENTATION_VERSION_VALUE :
            return IMPLEMENTATION_VERSION;
         case IMPLEMENTATION_VENDOR_VALUE :
            return IMPLEMENTATION_VENDOR;
         case IMPLEMENTATION_VENDOR_ID_VALUE :
            return IMPLEMENTATION_VENDOR_ID;
         case IMPLEMENTATION_URL_VALUE :
            return IMPLEMENTATION_URL;
         case SPECIFICATION_TITLE_VALUE :
            return SPECIFICATION_TITLE;
         case SPECIFICATION_VERSION_VALUE :
            return SPECIFICATION_VERSION;
         case SPECIFICATION_VENDOR_VALUE :
            return SPECIFICATION_VENDOR;
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
   private HeaderName(int value, String name, String literal)
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

} // HeaderName
