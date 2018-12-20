/**
 */
package org.moflon.sdm.compiler.democles.validation.result.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.moflon.sdm.compiler.democles.validation.result.ErrorMessage;
import org.moflon.sdm.compiler.democles.validation.result.ResultPackage;
import org.moflon.sdm.compiler.democles.validation.result.Severity;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.result.impl.ErrorMessageImpl#getValidationReport <em>Validation Report</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.result.impl.ErrorMessageImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.result.impl.ErrorMessageImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.result.impl.ErrorMessageImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.moflon.sdm.compiler.democles.validation.result.impl.ErrorMessageImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorMessageImpl extends EObjectImpl implements ErrorMessage
{
   /**
    * The cached value of the '{@link #getLocation() <em>Location</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getLocation()
    * @generated
    * @ordered
    */
   protected EList<EObject> location;

   /**
    * The cached value of the '{@link #getContext() <em>Context</em>}' reference list.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getContext()
    * @generated
    * @ordered
    */
   protected EList<EObject> context;

   /**
    * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSeverity()
    * @generated
    * @ordered
    */
   protected static final Severity SEVERITY_EDEFAULT = Severity.OK;

   /**
    * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getSeverity()
    * @generated
    * @ordered
    */
   protected Severity severity = SEVERITY_EDEFAULT;

   /**
    * The default value of the '{@link #getId() <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getId()
    * @generated
    * @ordered
    */
   protected static final String ID_EDEFAULT = null;

   /**
    * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @see #getId()
    * @generated
    * @ordered
    */
   protected String id = ID_EDEFAULT;

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   protected ErrorMessageImpl()
   {
      super();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   protected EClass eStaticClass()
   {
      return ResultPackage.Literals.ERROR_MESSAGE;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public ValidationReport getValidationReport()
   {
      if (eContainerFeatureID() != ResultPackage.ERROR_MESSAGE__VALIDATION_REPORT)
         return null;
      return (ValidationReport) eContainer();
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public NotificationChain basicSetValidationReport(ValidationReport newValidationReport, NotificationChain msgs)
   {
      msgs = eBasicSetContainer((InternalEObject) newValidationReport, ResultPackage.ERROR_MESSAGE__VALIDATION_REPORT, msgs);
      return msgs;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setValidationReport(ValidationReport newValidationReport)
   {
      if (newValidationReport != eInternalContainer()
            || (eContainerFeatureID() != ResultPackage.ERROR_MESSAGE__VALIDATION_REPORT && newValidationReport != null))
      {
         if (EcoreUtil.isAncestor(this, newValidationReport))
            throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
         NotificationChain msgs = null;
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         if (newValidationReport != null)
            msgs = ((InternalEObject) newValidationReport).eInverseAdd(this, ResultPackage.VALIDATION_REPORT__ERROR_MESSAGES, ValidationReport.class, msgs);
         msgs = basicSetValidationReport(newValidationReport, msgs);
         if (msgs != null)
            msgs.dispatch();
      } else if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.ERROR_MESSAGE__VALIDATION_REPORT, newValidationReport, newValidationReport));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<EObject> getLocation()
   {
      if (location == null)
      {
         location = new EObjectResolvingEList<EObject>(EObject.class, this, ResultPackage.ERROR_MESSAGE__LOCATION);
      }
      return location;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public EList<EObject> getContext()
   {
      if (context == null)
      {
         context = new EObjectResolvingEList<EObject>(EObject.class, this, ResultPackage.ERROR_MESSAGE__CONTEXT);
      }
      return context;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public Severity getSeverity()
   {
      return severity;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setSeverity(Severity newSeverity)
   {
      Severity oldSeverity = severity;
      severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.ERROR_MESSAGE__SEVERITY, oldSeverity, severity));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public String getId()
   {
      return id;
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   public void setId(String newId)
   {
      String oldId = id;
      id = newId;
      if (eNotificationRequired())
         eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.ERROR_MESSAGE__ID, oldId, id));
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
      case ResultPackage.ERROR_MESSAGE__VALIDATION_REPORT:
         if (eInternalContainer() != null)
            msgs = eBasicRemoveFromContainer(msgs);
         return basicSetValidationReport((ValidationReport) otherEnd, msgs);
      }
      return super.eInverseAdd(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
   {
      switch (featureID)
      {
      case ResultPackage.ERROR_MESSAGE__VALIDATION_REPORT:
         return basicSetValidationReport(null, msgs);
      }
      return super.eInverseRemove(otherEnd, featureID, msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
   {
      switch (eContainerFeatureID())
      {
      case ResultPackage.ERROR_MESSAGE__VALIDATION_REPORT:
         return eInternalContainer().eInverseRemove(this, ResultPackage.VALIDATION_REPORT__ERROR_MESSAGES, ValidationReport.class, msgs);
      }
      return super.eBasicRemoveFromContainerFeature(msgs);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public Object eGet(int featureID, boolean resolve, boolean coreType)
   {
      switch (featureID)
      {
      case ResultPackage.ERROR_MESSAGE__VALIDATION_REPORT:
         return getValidationReport();
      case ResultPackage.ERROR_MESSAGE__LOCATION:
         return getLocation();
      case ResultPackage.ERROR_MESSAGE__CONTEXT:
         return getContext();
      case ResultPackage.ERROR_MESSAGE__SEVERITY:
         return getSeverity();
      case ResultPackage.ERROR_MESSAGE__ID:
         return getId();
      }
      return super.eGet(featureID, resolve, coreType);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @SuppressWarnings("unchecked")
   @Override
   public void eSet(int featureID, Object newValue)
   {
      switch (featureID)
      {
      case ResultPackage.ERROR_MESSAGE__VALIDATION_REPORT:
         setValidationReport((ValidationReport) newValue);
         return;
      case ResultPackage.ERROR_MESSAGE__LOCATION:
         getLocation().clear();
         getLocation().addAll((Collection<? extends EObject>) newValue);
         return;
      case ResultPackage.ERROR_MESSAGE__CONTEXT:
         getContext().clear();
         getContext().addAll((Collection<? extends EObject>) newValue);
         return;
      case ResultPackage.ERROR_MESSAGE__SEVERITY:
         setSeverity((Severity) newValue);
         return;
      case ResultPackage.ERROR_MESSAGE__ID:
         setId((String) newValue);
         return;
      }
      super.eSet(featureID, newValue);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public void eUnset(int featureID)
   {
      switch (featureID)
      {
      case ResultPackage.ERROR_MESSAGE__VALIDATION_REPORT:
         setValidationReport((ValidationReport) null);
         return;
      case ResultPackage.ERROR_MESSAGE__LOCATION:
         getLocation().clear();
         return;
      case ResultPackage.ERROR_MESSAGE__CONTEXT:
         getContext().clear();
         return;
      case ResultPackage.ERROR_MESSAGE__SEVERITY:
         setSeverity(SEVERITY_EDEFAULT);
         return;
      case ResultPackage.ERROR_MESSAGE__ID:
         setId(ID_EDEFAULT);
         return;
      }
      super.eUnset(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public boolean eIsSet(int featureID)
   {
      switch (featureID)
      {
      case ResultPackage.ERROR_MESSAGE__VALIDATION_REPORT:
         return getValidationReport() != null;
      case ResultPackage.ERROR_MESSAGE__LOCATION:
         return location != null && !location.isEmpty();
      case ResultPackage.ERROR_MESSAGE__CONTEXT:
         return context != null && !context.isEmpty();
      case ResultPackage.ERROR_MESSAGE__SEVERITY:
         return severity != SEVERITY_EDEFAULT;
      case ResultPackage.ERROR_MESSAGE__ID:
         return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      }
      return super.eIsSet(featureID);
   }

   /**
    * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
    * @generated
    */
   @Override
   public String toString()
   {
      if (eIsProxy())
         return super.toString();

      StringBuffer result = new StringBuffer(super.toString());
      result.append(" (severity: ");
      result.append(severity);
      result.append(", id: ");
      result.append(id);
      result.append(')');
      return result.toString();
   }
   // <-- [user code injected with eMoflon]

   // [user code injected with eMoflon] -->
} //ErrorMessageImpl
