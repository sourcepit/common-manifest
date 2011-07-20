/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.mf.internal.model;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Abstract Section</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.common.mf.internal.model.AbstractSection#getHeaders <em>Headers</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.common.mf.internal.model.ManifestPackage#getAbstractSection()
 * @model abstract="true"
 * @generated
 */
public interface AbstractSection extends EObject
{
   /**
    * Returns the value of the '<em><b>Headers</b></em>' map. The key is of type {@link K}, and the value is of type
    * {@link V}, <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Headers</em>' map isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Headers</em>' map.
    * @see org.sourcepit.common.mf.internal.model.ManifestPackage#getAbstractSection_Headers()
    * @model mapType="org.sourcepit.common.mf.internal.model.EMapEntry<K, V>"
    * @generated
    */
   EMap<String, String> getHeaders();

} // AbstractSection
