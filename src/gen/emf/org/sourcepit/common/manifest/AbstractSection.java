/**
 * <copyright>
 * </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.manifest;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Section</b></em>'.
 * <!-- end-user-doc -->
 * 
 * 
 * @see org.sourcepit.common.manifest.ManifestPackage#getAbstractSection()
 * @model abstract="true"
 * @generated
 */
public interface AbstractSection extends EObject
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model kind="operation"
    *        dataType=
    *        "org.sourcepit.common.manifest.EEMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
    *        required="true"
    * @generated
    */
   EMap<String, String> getHeaders();

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model nameRequired="true"
    * @generated
    */
   Header getHeader(String name);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   void setHeader(String name, String value);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   String getHeaderValue(String name);

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @model
    * @generated
    */
   Object getParsedHeaderValue(String name);

} // AbstractSection
