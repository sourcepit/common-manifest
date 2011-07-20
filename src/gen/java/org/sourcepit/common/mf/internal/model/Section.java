/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.mf.internal.model;


/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Section</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.sourcepit.common.mf.internal.model.Section#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.sourcepit.common.mf.internal.model.ManifestPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends AbstractSection
{
   /**
    * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
    * <p>
    * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
    * </p>
    * <!-- end-user-doc -->
    * 
    * @return the value of the '<em>Name</em>' attribute.
    * @see #setName(String)
    * @see org.sourcepit.common.mf.internal.model.ManifestPackage#getSection_Name()
    * @model
    * @generated
    */
   String getName();

   /**
    * Sets the value of the '{@link org.sourcepit.common.mf.internal.model.Section#getName <em>Name</em>}' attribute.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @param value the new value of the '<em>Name</em>' attribute.
    * @see #getName()
    * @generated
    */
   void setName(String value);

} // Section
