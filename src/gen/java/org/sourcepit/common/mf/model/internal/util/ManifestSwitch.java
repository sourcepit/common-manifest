/**
 * <copyright> </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.mf.model.internal.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.sourcepit.common.mf.internal.model.AbstractEntriesContainer;
import org.sourcepit.common.mf.internal.model.Manifest;
import org.sourcepit.common.mf.internal.model.ManifestPackage;
import org.sourcepit.common.mf.internal.model.Section;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * 
 * @see org.sourcepit.common.mf.internal.model.ManifestPackage
 * @generated
 */
public class ManifestSwitch<T> extends Switch<T>
{
   /**
    * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   protected static ManifestPackage modelPackage;

   /**
    * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @generated
    */
   public ManifestSwitch()
   {
      if (modelPackage == null)
      {
         modelPackage = ManifestPackage.eINSTANCE;
      }
   }

   /**
    * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @parameter ePackage the package in question.
    * @return whether this is a switch for the given package.
    * @generated
    */
   @Override
   protected boolean isSwitchFor(EPackage ePackage)
   {
      return ePackage == modelPackage;
   }

   /**
    * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
    * <!-- begin-user-doc --> <!-- end-user-doc -->
    * 
    * @return the first non-null result returned by a <code>caseXXX</code> call.
    * @generated
    */
   @Override
   protected T doSwitch(int classifierID, EObject theEObject)
   {
      switch (classifierID)
      {
         case ManifestPackage.MANIFEST :
         {
            Manifest manifest = (Manifest) theEObject;
            T result = caseManifest(manifest);
            if (result == null)
               result = caseAbstractEntriesContainer(manifest);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ManifestPackage.EMAP_ENTRY :
         {
            Map.Entry<?, ?> eMapEntry = (Map.Entry<?, ?>) theEObject;
            T result = caseEMapEntry(eMapEntry);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ManifestPackage.SECTION :
         {
            Section section = (Section) theEObject;
            T result = caseSection(section);
            if (result == null)
               result = caseAbstractEntriesContainer(section);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ManifestPackage.ABSTRACT_ENTRIES_CONTAINER :
         {
            AbstractEntriesContainer abstractEntriesContainer = (AbstractEntriesContainer) theEObject;
            T result = caseAbstractEntriesContainer(abstractEntriesContainer);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         default :
            return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Manifest</em>'. <!-- begin-user-doc --> This
    * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Manifest</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseManifest(Manifest object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EMap Entry</em>'. <!-- begin-user-doc -->
    * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EMap Entry</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public <K, V> T caseEMapEntry(Map.Entry<K, V> object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Section</em>'. <!-- begin-user-doc --> This
    * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Section</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseSection(Section object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Abstract Entries Container</em>'. <!--
    * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
    * end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Abstract Entries Container</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAbstractEntriesContainer(AbstractEntriesContainer object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!-- begin-user-doc --> This
    * implementation returns null; returning a non-null result will terminate the switch, but this is the last case
    * anyway. <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject)
    * @generated
    */
   @Override
   public T defaultCase(EObject object)
   {
      return null;
   }

} // ManifestSwitch
