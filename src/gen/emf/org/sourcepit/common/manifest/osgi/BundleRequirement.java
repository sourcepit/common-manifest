/**
 * <copyright>
 * </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.manifest.osgi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Requirement</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.common.manifest.osgi.BundleRequirement#getSymbolicNames <em>Symbolic Names</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getBundleRequirement()
 * @model
 * @generated
 */
public interface BundleRequirement extends Parameterized
{
   /**
    * Returns the value of the '<em><b>Symbolic Names</b></em>' attribute list.
    * The list contents are of type {@link java.lang.String}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Symbolic Names</em>' attribute list isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Symbolic Names</em>' attribute list.
    * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getBundleRequirement_SymbolicNames()
    * @model required="true"
    * @generated
    */
   EList<String> getSymbolicNames();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation" dataType="org.sourcepit.common.manifest.osgi.VersionRange"
    * @generated
    */
   VersionRange getVersionRange();

} // BundleRequirement
