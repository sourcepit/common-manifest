/**
 * <copyright>
 * </copyright>
 * 
 * $Id$
 */

package org.sourcepit.common.manifest.util;

import java.util.Map.Entry;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.sourcepit.common.manifest.AbstractSection;
import org.sourcepit.common.manifest.Header;
import org.sourcepit.common.manifest.Manifest;
import org.sourcepit.common.manifest.ManifestPackage;
import org.sourcepit.common.manifest.ManifestSection;
import org.sourcepit.common.manifest.Parseable;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each
 * class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see org.sourcepit.common.manifest.ManifestPackage
 * @generated
 */
public class ManifestSwitch<T> extends Switch<T>
{
   /**
    * The cached model package
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected static ManifestPackage modelPackage;

   /**
    * Creates an instance of the switch.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
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
    * Checks whether this is a switch for the given package.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
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
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
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
               result = caseAbstractSection(manifest);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ManifestPackage.MANIFEST_SECTION :
         {
            ManifestSection manifestSection = (ManifestSection) theEObject;
            T result = caseManifestSection(manifestSection);
            if (result == null)
               result = caseAbstractSection(manifestSection);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ManifestPackage.HEADER :
         {
            Header header = (Header) theEObject;
            T result = caseHeader(header);
            if (result == null)
               result = caseParseable(header);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ManifestPackage.SECTION_ENTRY :
         {
            @SuppressWarnings("unchecked")
            Entry<String, EMap<String, String>> sectionEntry = (Entry<String, EMap<String, String>>) theEObject;
            T result = caseSectionEntry(sectionEntry);
            if (result == null)
               result = caseManifestSection((ManifestSection) sectionEntry);
            if (result == null)
               result = caseAbstractSection((AbstractSection) sectionEntry);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ManifestPackage.HEADER_ENTRY :
         {
            @SuppressWarnings("unchecked")
            Entry<String, String> headerEntry = (Entry<String, String>) theEObject;
            T result = caseHeaderEntry(headerEntry);
            if (result == null)
               result = caseHeader((Header) headerEntry);
            if (result == null)
               result = caseParseable((Parseable) headerEntry);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ManifestPackage.ABSTRACT_SECTION :
         {
            AbstractSection abstractSection = (AbstractSection) theEObject;
            T result = caseAbstractSection(abstractSection);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         case ManifestPackage.PARSEABLE :
         {
            Parseable parseable = (Parseable) theEObject;
            T result = caseParseable(parseable);
            if (result == null)
               result = defaultCase(theEObject);
            return result;
         }
         default :
            return defaultCase(theEObject);
      }
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Manifest</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
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
    * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Section</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseManifestSection(ManifestSection object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Header</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseHeader(Header object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Section Entry</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Section Entry</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseSectionEntry(Entry<String, EMap<String, String>> object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Header Entry</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Header Entry</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseHeaderEntry(Entry<String, String> object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Abstract Section</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Abstract Section</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseAbstractSection(AbstractSection object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>Parseable</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch.
    * <!-- end-user-doc -->
    * 
    * @param object the target of the switch.
    * @return the result of interpreting the object as an instance of '<em>Parseable</em>'.
    * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
    * @generated
    */
   public T caseParseable(Parseable object)
   {
      return null;
   }

   /**
    * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
    * <!-- begin-user-doc -->
    * This implementation returns null;
    * returning a non-null result will terminate the switch, but this is the last case anyway.
    * <!-- end-user-doc -->
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
