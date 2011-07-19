/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.mf.internal.model;

import java.util.Map;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Abstract Entries Container</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sourcepit.common.mf.internal.model.AbstractEntriesContainer#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sourcepit.common.mf.internal.model.ManifestPackage#getAbstractEntriesContainer()
 * @model abstract="true"
 * @generated
 */
public interface AbstractEntriesContainer extends EObject
{
   /**
    * Returns the value of the '<em><b>Entries</b></em>' map.
    * The key is of type {@link K},
    * and the value is of type {@link V},
    * <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Entries</em>' map isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * @return the value of the '<em>Entries</em>' map.
    * @see org.sourcepit.common.mf.internal.model.ManifestPackage#getAbstractEntriesContainer_Entries()
    * @model mapType="org.sourcepit.common.mf.internal.model.EMapEntry<K, V>"
    * @generated
    */
   EMap<String, String> getEntries();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @model
    * @generated
    */
   void addEntries(Map<String, String> entries);

} // AbstractEntriesContainer
