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
 * A representation of the model object '<em><b>Path Entry</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.common.manifest.osgi.ClassPathEntry#getPaths <em>Paths</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getClassPathEntry()
 * @model
 * @generated
 */
public interface ClassPathEntry extends Parameterized
{
   /**
    * Returns the value of the '<em><b>Paths</b></em>' attribute list.
    * The list contents are of type {@link java.lang.String}.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Paths</em>' attribute list isn't clear, there really should be more of a description
    * here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Paths</em>' attribute list.
    * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getClassPathEntry_Paths()
    * @model required="true"
    * @generated
    */
   EList<String> getPaths();

} // PathEntry
