/**
 * <copyright>
 * </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.manifest.osgi;

import org.sourcepit.common.manifest.Parseable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.common.manifest.osgi.Parameter#getName <em>Name</em>}</li>
 * <li>{@link org.sourcepit.common.manifest.osgi.Parameter#getValue <em>Value</em>}</li>
 * <li>{@link org.sourcepit.common.manifest.osgi.Parameter#isQuoted <em>Quoted</em>}</li>
 * <li>{@link org.sourcepit.common.manifest.osgi.Parameter#getType <em>Type</em>}</li>
 * <li>{@link org.sourcepit.common.manifest.osgi.Parameter#getParameterized <em>Parameterized</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Parseable
{
   /**
    * Returns the value of the '<em><b>Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Name</em>' attribute.
    * @see #setName(String)
    * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getParameter_Name()
    * @model required="true"
    * @generated
    */
   String getName();

   /**
    * Sets the value of the '{@link org.sourcepit.common.manifest.osgi.Parameter#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   void setName(String value);

   /**
    * Returns the value of the '<em><b>Value</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Value</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Value</em>' attribute.
    * @see #setValue(String)
    * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getParameter_Value()
    * @model required="true"
    * @generated
    */
   String getValue();

   /**
    * Sets the value of the '{@link org.sourcepit.common.manifest.osgi.Parameter#getValue <em>Value</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Value</em>' attribute.
    * @see #getValue()
    * @generated
    */
   void setValue(String value);

   /**
    * Returns the value of the '<em><b>Quoted</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Quoted</em>' attribute isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Quoted</em>' attribute.
    * @see #setQuoted(boolean)
    * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getParameter_Quoted()
    * @model
    * @generated
    */
   boolean isQuoted();

   /**
    * Sets the value of the '{@link org.sourcepit.common.manifest.osgi.Parameter#isQuoted <em>Quoted</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Quoted</em>' attribute.
    * @see #isQuoted()
    * @generated
    */
   void setQuoted(boolean value);

   /**
    * Returns the value of the '<em><b>Type</b></em>' attribute.
    * The literals are from the enumeration {@link org.sourcepit.common.manifest.osgi.ParameterType}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Type</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Type</em>' attribute.
    * @see org.sourcepit.common.manifest.osgi.ParameterType
    * @see #setType(ParameterType)
    * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getParameter_Type()
    * @model required="true"
    * @generated
    */
   ParameterType getType();

   /**
    * Sets the value of the '{@link org.sourcepit.common.manifest.osgi.Parameter#getType <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Type</em>' attribute.
    * @see org.sourcepit.common.manifest.osgi.ParameterType
    * @see #getType()
    * @generated
    */
   void setType(ParameterType value);

   /**
    * Returns the value of the '<em><b>Parameterized</b></em>' container reference.
    * It is bidirectional and its opposite is '{@link org.sourcepit.common.manifest.osgi.Parameterized#getParameters
    * <em>Parameters</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parameterized</em>' container reference isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Parameterized</em>' container reference.
    * @see #setParameterized(Parameterized)
    * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getParameter_Parameterized()
    * @see org.sourcepit.common.manifest.osgi.Parameterized#getParameters
    * @model opposite="parameters" transient="false"
    * @generated
    */
   Parameterized getParameterized();

   /**
    * Sets the value of the '{@link org.sourcepit.common.manifest.osgi.Parameter#getParameterized
    * <em>Parameterized</em>}' container reference.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Parameterized</em>' container reference.
    * @see #getParameterized()
    * @generated
    */
   void setParameterized(Parameterized value);

} // Parameter
