/**
 * <copyright>
 * </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.manifest.osgi;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterized</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.common.manifest.osgi.Parameterized#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getParameterized()
 * @model abstract="true"
 * @generated
 */
public interface Parameterized extends EObject
{
   /**
    * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
    * The list contents are of type {@link org.sourcepit.common.manifest.osgi.Parameter}.
    * It is bidirectional and its opposite is '{@link org.sourcepit.common.manifest.osgi.Parameter#getParameterized
    * <em>Parameterized</em>}'.
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear, there really should be more of
    * a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Parameters</em>' containment reference list.
    * @see org.sourcepit.common.manifest.osgi.BundleManifestPackage#getParameterized_Parameters()
    * @see org.sourcepit.common.manifest.osgi.Parameter#getParameterized
    * @model opposite="parameterized" containment="true"
    * @generated
    */
   EList<Parameter> getParameters();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   Parameter getParameter(String name);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   String getParameterValue(String name);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   Object getParsedParameterValue(String name);

} // Parameterized
