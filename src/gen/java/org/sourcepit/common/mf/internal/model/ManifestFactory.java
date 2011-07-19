/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.mf.internal.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * 
 * @see org.sourcepit.common.mf.internal.model.ManifestPackage
 * @generated
 */
public interface ManifestFactory extends EFactory
{
   /**
    * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   ManifestFactory eINSTANCE = org.sourcepit.common.mf.model.internal.impl.ManifestFactoryImpl.init();

   /**
    * Returns a new object of class '<em>Manifest</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Manifest</em>'.
    * @generated
    */
   Manifest createManifest();

   /**
    * Returns a new object of class '<em>Section</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return a new object of class '<em>Section</em>'.
    * @generated
    */
   Section createSection();

   /**
    * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the package supported by this factory.
    * @generated
    */
   ManifestPackage getManifestPackage();

} // ManifestFactory
