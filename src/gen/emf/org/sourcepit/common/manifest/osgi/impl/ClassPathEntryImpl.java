/**
 * <copyright>
 * </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.manifest.osgi.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.sourcepit.common.manifest.osgi.BundleManifestPackage;
import org.sourcepit.common.manifest.osgi.ClassPathEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Path Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.common.manifest.osgi.impl.ClassPathEntryImpl#getPaths <em>Paths</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ClassPathEntryImpl extends ParameterizedImpl implements ClassPathEntry
{
   /**
    * The cached value of the '{@link #getPaths() <em>Paths</em>}' attribute list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getPaths()
    * @generated
    * @ordered
    */
   protected EList<String> paths;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected ClassPathEntryImpl()
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
      return BundleManifestPackage.Literals.CLASS_PATH_ENTRY;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public EList<String> getPaths()
   {
      if (paths == null)
      {
         paths = new EDataTypeUniqueEList<String>(String.class, this, BundleManifestPackage.CLASS_PATH_ENTRY__PATHS);
      }
      return paths;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
         case BundleManifestPackage.CLASS_PATH_ENTRY__PATHS :
            return getPaths();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
         case BundleManifestPackage.CLASS_PATH_ENTRY__PATHS :
            getPaths().clear();
            getPaths().addAll((Collection<? extends String>) newValue);
            return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public void eUnset(int featureID)
   {
      switch (featureID)
      {
         case BundleManifestPackage.CLASS_PATH_ENTRY__PATHS :
            getPaths().clear();
            return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID)
   {
      switch (featureID)
      {
         case BundleManifestPackage.CLASS_PATH_ENTRY__PATHS :
            return paths != null && !paths.isEmpty();
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public String toString()
   {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (paths: ");
      result.append(paths);
      result.append(')');
      return result.toString();
   }

} // ClassPathEntryImpl
