/**
 * <copyright>
 * </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.manifest.impl;

import org.eclipse.emf.ecore.EClass;
import org.sourcepit.common.manifest.ManifestPackage;
import org.sourcepit.common.manifest.ManifestSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public abstract class ManifestSectionImpl extends AbstractSectionImpl implements ManifestSection
{
   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected ManifestSectionImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   protected EClass eStaticClass()
   {
      return ManifestPackage.Literals.MANIFEST_SECTION;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getName()
   {
      // TODO: implement this method
      // Ensure that you remove @generated or mark it @generated NOT
      throw new UnsupportedOperationException();
   }

} // ManifestSectionImpl