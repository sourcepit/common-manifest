/**
 * <copyright>
 * </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.manifest.osgi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Symbolic Name</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.common.manifest.osgi.BundleSymbolicName#getSymbolicName <em>Symbolic Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getBundleSymbolicName()
 * @model
 * @generated
 */
public interface BundleSymbolicName extends Parameterized
{
   /**
    * Returns the value of the '<em><b>Symbolic Name</b></em>' attribute.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Symbolic Name</em>' attribute isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Symbolic Name</em>' attribute.
    * @see #setSymbolicName(String)
    * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getBundleSymbolicName_SymbolicName()
    * @model required="true"
    * @generated
    */
   String getSymbolicName();

   /**
    * Sets the value of the '{@link org.sourcepit.common.manifest.osgi.BundleSymbolicName#getSymbolicName
    * <em>Symbolic Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Symbolic Name</em>' attribute.
    * @see #getSymbolicName()
    * @generated
    */
   void setSymbolicName(String value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation"
    * @generated
    */
   boolean isSingleton();

} // BundleSymbolicName
