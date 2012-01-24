/**
 * Copyright (c) 2011 Sourcepit.org contributors and others. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.sourcepit.common.manifest.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.DelegatingNotifyingInternalEListImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.sourcepit.common.manifest.ManifestPackage;
import org.sourcepit.common.manifest.Parseable;
import org.sourcepit.common.manifest.parser.HeaderParser;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parseable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.sourcepit.common.manifest.impl.ParseableImpl#getParsedValue <em>Parsed Value</em>}</li>
 * <li>{@link org.sourcepit.common.manifest.impl.ParseableImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class ParseableImpl extends EObjectImpl implements Parseable
{
   /**
    * The default value of the '{@link #getParsedValue() <em>Parsed Value</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getParsedValue()
    * @generated
    * @ordered
    */
   protected static final Object PARSED_VALUE_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getParsedValue() <em>Parsed Value</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getParsedValue()
    * @generated
    * @ordered
    */
   protected Object parsedValue = PARSED_VALUE_EDEFAULT;

   /**
    * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getValue()
    * @generated
    * @ordered
    */
   protected static final String VALUE_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @see #getValue()
    * @generated
    * @ordered
    */
   protected String value = VALUE_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   protected ParseableImpl()
   {
      super();
      eAdapters().add(new EContentAdapter()
      {
         private boolean on = true;

         public void notifyChanged(Notification notification)
         {
            super.notifyChanged(notification);
            if (on)
            {
               try
               {
                  on = false;
                  final Object feature = notification.getFeature();
                  if (ManifestPackage.eINSTANCE.getParseable_Value().equals(feature))
                  {
                     setParsedValue(notification.getNewStringValue() == null ? null : HeaderParser.INSTANCE
                        .parse(ParseableImpl.this));
                  }
                  else if (ManifestPackage.eINSTANCE.getParseable_ParsedValue().equals(feature)
                     || isFeatureFromParsedValue(notification))
                  {
                     setValue(notification.getNewValue() == null ? null : HeaderParser.INSTANCE
                        .toValueString(ParseableImpl.this));
                  }
               }
               finally
               {
                  on = true;
               }
            }
         }

         protected boolean isFeatureFromParsedValue(Notification notification)
         {
            return notification.getFeature() != null && ParseableImpl.this != notification.getNotifier()
               && !eClass().getEAllStructuralFeatures().contains(notification.getFeature());
         };

         @Override
         protected void selfAdapt(Notification notification)
         {
            final Object notifier = notification.getNotifier();
            if (notifier instanceof EObject)
            {
               final Object feature = notification.getFeature();
               if (ManifestPackage.eINSTANCE.getParseable_ParsedValue().equals(feature))
               {
                  if (notification.getEventType() == Notification.SET
                     || notification.getEventType() == Notification.REMOVE
                     || notification.getEventType() == Notification.ADD
                     || notification.getEventType() == Notification.REMOVE_MANY
                     || notification.getEventType() == Notification.ADD_MANY)
                  {
                     final Object oldValue = notification.getOldValue();
                     if (oldValue != null)
                     {
                        if (oldValue instanceof Collection)
                        {
                           Collection<?> oldCollection = (Collection<?>) oldValue;
                           for (Object oldElement : oldCollection)
                           {
                              if (oldElement instanceof Notifier)
                              {
                                 removeAdapter((Notifier) oldElement);
                              }
                           }
                        }
                        else if (oldValue instanceof Notifier)
                        {
                           removeAdapter((Notifier) oldValue);
                        }
                     }

                     final Object newValue = notification.getNewValue();
                     if (newValue != null)
                     {
                        if (newValue instanceof Collection)
                        {
                           Collection<?> newCollection = (Collection<?>) newValue;
                           for (Object newElement : newCollection)
                           {
                              if (newElement instanceof Notifier)
                              {
                                 addAdapter((Notifier) newElement);
                              }
                           }
                        }
                        else if (newValue instanceof Notifier)
                        {
                           addAdapter((Notifier) newValue);
                        }
                     }
                  }
               }
            }
            super.selfAdapt(notification);
         }
      });
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
      return ManifestPackage.Literals.PARSEABLE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public Object getParsedValue()
   {
      return parsedValue;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public void setParsedValue(Object newParsedValue)
   {
      Object oldParsedValue = parsedValue;
      parsedValue = wrapParsedValue(newParsedValue);
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.PARSEABLE__PARSED_VALUE, oldParsedValue,
            parsedValue));
   }


   protected Object wrapParsedValue(final Object value)
   {
      if (value instanceof List)
      {
         return new DelegatingNotifyingInternalEListImpl<Object>()
         {
            private static final long serialVersionUID = 1L;

            @Override
            public Object getNotifier()
            {
               return ParseableImpl.this;
            }

            @Override
            public int getFeatureID()
            {
               return ManifestPackage.PARSEABLE__PARSED_VALUE;
            }

            @Override
            public Object getFeature()
            {
               return ManifestPackage.eINSTANCE.getParseable_ParsedValue();
            }

            @Override
            protected boolean isNotificationRequired()
            {
               return ParseableImpl.this.eNotificationRequired();
            }

            @SuppressWarnings("unchecked")
            @Override
            protected List<Object> delegateList()
            {
               return (List<Object>) value;
            }
         };
      }
      return value;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated
    */
   public String getValue()
   {
      return value;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * 
    * @generated NOT
    */
   public String setValue(String newValue)
   {
      String oldValue = value;
      value = newValue;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ManifestPackage.PARSEABLE__VALUE, oldValue, value));
      return oldValue;
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
         case ManifestPackage.PARSEABLE__PARSED_VALUE :
            return getParsedValue();
         case ManifestPackage.PARSEABLE__VALUE :
            return getValue();
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
         case ManifestPackage.PARSEABLE__PARSED_VALUE :
            setParsedValue(newValue);
            return;
         case ManifestPackage.PARSEABLE__VALUE :
            setValue((String) newValue);
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
         case ManifestPackage.PARSEABLE__PARSED_VALUE :
            setParsedValue(PARSED_VALUE_EDEFAULT);
            return;
         case ManifestPackage.PARSEABLE__VALUE :
            setValue(VALUE_EDEFAULT);
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
         case ManifestPackage.PARSEABLE__PARSED_VALUE :
            return PARSED_VALUE_EDEFAULT == null ? parsedValue != null : !PARSED_VALUE_EDEFAULT.equals(parsedValue);
         case ManifestPackage.PARSEABLE__VALUE :
            return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
      result.append(" (parsedValue: ");
      result.append(parsedValue);
      result.append(", value: ");
      result.append(value);
      result.append(')');
      return result.toString();
   }

} // ParseableImpl
