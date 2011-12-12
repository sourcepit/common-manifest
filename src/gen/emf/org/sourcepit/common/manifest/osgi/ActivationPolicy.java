/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Activation Policy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getActivationPolicy()
 * @model
 * @generated
 */
public enum ActivationPolicy implements Enumerator {
   /**
    * The '<em><b>EAGER</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #EAGER_VALUE
    * @generated
    * @ordered
    */
   EAGER(0, "EAGER", "eager"),

   /**
    * The '<em><b>LAZY</b></em>' literal object.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #LAZY_VALUE
    * @generated
    * @ordered
    */
   LAZY(1, "LAZY", "lazy");

   /**
    * The '<em><b>EAGER</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>EAGER</b></em>' literal object isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #EAGER
    * @model literal="eager"
    * @generated
    * @ordered
    */
   public static final int EAGER_VALUE = 0;

   /**
    * The '<em><b>LAZY</b></em>' literal value.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of '<em><b>LAZY</b></em>' literal object isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @see #LAZY
    * @model literal="lazy"
    * @generated
    * @ordered
    */
   public static final int LAZY_VALUE = 1;

   /**
    * An array of all the '<em><b>Activation Policy</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   private static final ActivationPolicy[] VALUES_ARRAY = new ActivationPolicy[] {EAGER, LAZY,};

   /**
    * A public read-only list of all the '<em><b>Activation Policy</b></em>' enumerators.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static final List<ActivationPolicy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

   /**
    * Returns the '<em><b>Activation Policy</b></em>' literal with the specified literal value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static ActivationPolicy get(String literal)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         ActivationPolicy result = VALUES_ARRAY[i];
         if (result.toString().equals(literal))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Activation Policy</b></em>' literal with the specified name.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static ActivationPolicy getByName(String name)
   {
      for (int i = 0; i < VALUES_ARRAY.length; ++i)
      {
         ActivationPolicy result = VALUES_ARRAY[i];
         if (result.getName().equals(name))
         {
            return result;
         }
      }
      return null;
   }

   /**
    * Returns the '<em><b>Activation Policy</b></em>' literal with the specified integer value.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public static ActivationPolicy get(int value)
   {
      switch (value)
      {
         case EAGER_VALUE :
            return EAGER;
         case LAZY_VALUE :
            return LAZY;
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
   private ActivationPolicy(int value, String name, String literal)
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

} // ActivationPolicy
