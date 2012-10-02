/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.osgi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.sourcepit.common.manifest.impl.ParseableImpl;
import org.sourcepit.common.manifest.osgi.BundleManifestPackage;
import org.sourcepit.common.manifest.osgi.Parameter;
import org.sourcepit.common.manifest.osgi.ParameterType;
import org.sourcepit.common.manifest.osgi.Parameterized;
import org.sourcepit.common.manifest.parser.HeaderParser;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.common.manifest.osgi.impl.ParameterImpl#getName <em>Name</em>}</li>
 * <li>{@link org.sourcepit.common.manifest.osgi.impl.ParameterImpl#isQuoted <em>Quoted</em>}</li>
 * <li>{@link org.sourcepit.common.manifest.osgi.impl.ParameterImpl#getType <em>Type</em>}</li>
 * <li>{@link org.sourcepit.common.manifest.osgi.impl.ParameterImpl#getParameterized <em>Parameterized</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ParameterImpl extends ParseableImpl implements Parameter
{
   /**
    * The default value of the '{@link #getName() <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getName()
    * @generated
    * @ordered
    */
   protected static final String NAME_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getName()
    * @generated
    * @ordered
    */
   protected String name = NAME_EDEFAULT;

   /**
    * The default value of the '{@link #isQuoted() <em>Quoted</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #isQuoted()
    * @generated
    * @ordered
    */
   protected static final boolean QUOTED_EDEFAULT = false;

   /**
    * The cached value of the '{@link #isQuoted() <em>Quoted</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #isQuoted()
    * @generated
    * @ordered
    */
   protected boolean quoted = QUOTED_EDEFAULT;

   /**
    * The default value of the '{@link #getType() <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getType()
    * @generated
    * @ordered
    */
   protected static final ParameterType TYPE_EDEFAULT = ParameterType.ATTRIBUTE;

   /**
    * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getType()
    * @generated
    * @ordered
    */
   protected ParameterType type = TYPE_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   protected ParameterImpl()
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
      return BundleManifestPackage.Literals.PARAMETER;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getName()
   {
      return name;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setName(String newName)
   {
      String oldName = name;
      name = newName;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, BundleManifestPackage.PARAMETER__NAME, oldName, name));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public boolean isQuoted()
   {
      return quoted;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setQuoted(boolean newQuoted)
   {
      boolean oldQuoted = quoted;
      quoted = newQuoted;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, BundleManifestPackage.PARAMETER__QUOTED, oldQuoted,
            quoted));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public ParameterType getType()
   {
      return type;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setType(ParameterType newType)
   {
      ParameterType oldType = type;
      type = newType == null ? TYPE_EDEFAULT : newType;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, BundleManifestPackage.PARAMETER__TYPE, oldType, type));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public Parameterized getParameterized()
   {
      if (eContainerFeatureID() != BundleManifestPackage.PARAMETER__PARAMETERIZED)
         return null;
      return (Parameterized) eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public NotificationChain basicSetParameterized(Parameterized newParameterized, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newParameterized, BundleManifestPackage.PARAMETER__PARAMETERIZED,
         msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public void setParameterized(Parameterized newParameterized)
   {
      if (newParameterized != eInternalContainer()
         || (eContainerFeatureID() != BundleManifestPackage.PARAMETER__PARAMETERIZED && newParameterized != null))
      {
         if (EcoreUtil.isAncestor(this, newParameterized))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newParameterized != null)
            msgs = ((InternalEObject) newParameterized).eInverseAdd(this,
               BundleManifestPackage.PARAMETERIZED__PARAMETERS, Parameterized.class, msgs);
         msgs = basicSetParameterized(newParameterized, msgs);
         if (msgs != null)
            msgs.dispatch();
      }
      else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, BundleManifestPackage.PARAMETER__PARAMETERIZED,
            newParameterized, newParameterized));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case BundleManifestPackage.PARAMETER__PARAMETERIZED :
            if (eInternalContainer() != null)
               msgs = eBasicRemoveFromContainer(msgs);
            return basicSetParameterized((Parameterized) otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
         case BundleManifestPackage.PARAMETER__PARAMETERIZED :
            return basicSetParameterized(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
   {
      switch (eContainerFeatureID())
      {
         case BundleManifestPackage.PARAMETER__PARAMETERIZED :
            return eInternalContainer().eInverseRemove(this, BundleManifestPackage.PARAMETERIZED__PARAMETERS,
               Parameterized.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
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
         case BundleManifestPackage.PARAMETER__NAME :
            return getName();
         case BundleManifestPackage.PARAMETER__QUOTED :
            return isQuoted();
         case BundleManifestPackage.PARAMETER__TYPE :
            return getType();
         case BundleManifestPackage.PARAMETER__PARAMETERIZED :
            return getParameterized();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
         case BundleManifestPackage.PARAMETER__NAME :
            setName((String) newValue);
            return;
         case BundleManifestPackage.PARAMETER__QUOTED :
            setQuoted((Boolean) newValue);
            return;
         case BundleManifestPackage.PARAMETER__TYPE :
            setType((ParameterType) newValue);
            return;
         case BundleManifestPackage.PARAMETER__PARAMETERIZED :
            setParameterized((Parameterized) newValue);
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
         case BundleManifestPackage.PARAMETER__NAME :
            setName(NAME_EDEFAULT);
            return;
         case BundleManifestPackage.PARAMETER__QUOTED :
            setQuoted(QUOTED_EDEFAULT);
            return;
         case BundleManifestPackage.PARAMETER__TYPE :
            setType(TYPE_EDEFAULT);
            return;
         case BundleManifestPackage.PARAMETER__PARAMETERIZED :
            setParameterized((Parameterized) null);
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
         case BundleManifestPackage.PARAMETER__NAME :
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
         case BundleManifestPackage.PARAMETER__QUOTED :
            return quoted != QUOTED_EDEFAULT;
         case BundleManifestPackage.PARAMETER__TYPE :
            return type != TYPE_EDEFAULT;
         case BundleManifestPackage.PARAMETER__PARAMETERIZED :
            return getParameterized() != null;
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   @Override
   public String toString()
   {
      final String string = HeaderParser.INSTANCE.toString(this);
      if (string != null)
      {
         return string;
      }

      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (name: ");
      result.append(name);
      result.append(", value: ");
      result.append(value);
      result.append(", quoted: ");
      result.append(quoted);
      result.append(", type: ");
      result.append(type);
      result.append(')');
      return result.toString();
   }

} // ParameterImpl
