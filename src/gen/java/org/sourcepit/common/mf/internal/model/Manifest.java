/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.mf.internal.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Manifest</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.common.mf.internal.model.Manifest#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.common.mf.internal.model.ManifestPackage#getManifest()
 * @model
 * @generated
 */
public interface Manifest extends AbstractSection
{
   /**
    * Returns the value of the '<em><b>Sections</b></em>' containment reference list. The list contents are of type
    * {@link org.sourcepit.common.mf.internal.model.Section}. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Sections</em>' containment reference list isn't clear, there really should be more of a
    * description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Sections</em>' containment reference list.
    * @see org.sourcepit.common.mf.internal.model.ManifestPackage#getManifest_Sections()
    * @model containment="true"
    * @generated
    */
   EList<Section> getSections();

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @model kind="operation"
    * @generated
    */
   String getVersion();

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   Section getSection(String name);

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   Section getSection(String name, boolean createOnDemand);

   /**
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   void setVersion(String version);

} // Manifest
