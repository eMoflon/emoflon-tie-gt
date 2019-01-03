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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.moflon.sdm.compiler.democles.validation.result.ErrorMessage;
import org.moflon.sdm.compiler.democles.validation.result.ResultPackage;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Validation Report</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.moflon.sdm.compiler.democles.validation.result.impl.ValidationReportImpl#getErrorMessages
 * <em>Error Messages</em>}</li>
 * <li>{@link org.moflon.sdm.compiler.democles.validation.result.impl.ValidationReportImpl#getResult
 * <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValidationReportImpl extends EObjectImpl implements ValidationReport {
	/**
	 * The cached value of the '{@link #getErrorMessages() <em>Error Messages</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getErrorMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorMessage> errorMessages;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected EObject result;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ValidationReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.VALIDATION_REPORT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ErrorMessage> getErrorMessages() {
		if (errorMessages == null) {
			errorMessages = new EObjectContainmentWithInverseEList<ErrorMessage>(ErrorMessage.class, this,
					ResultPackage.VALIDATION_REPORT__ERROR_MESSAGES, ResultPackage.ERROR_MESSAGE__VALIDATION_REPORT);
		}
		return errorMessages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EObject getResult() {
		if (result != null && result.eIsProxy()) {
			final InternalEObject oldResult = (InternalEObject) result;
			result = eResolveProxy(oldResult);
			if (result != oldResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultPackage.VALIDATION_REPORT__RESULT,
							oldResult, result));
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EObject basicGetResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setResult(final EObject newResult) {
		final EObject oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.VALIDATION_REPORT__RESULT, oldResult,
					result));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID,
			final NotificationChain msgs) {
		switch (featureID) {
		case ResultPackage.VALIDATION_REPORT__ERROR_MESSAGES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getErrorMessages()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
			final NotificationChain msgs) {
		switch (featureID) {
		case ResultPackage.VALIDATION_REPORT__ERROR_MESSAGES:
			return ((InternalEList<?>) getErrorMessages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case ResultPackage.VALIDATION_REPORT__ERROR_MESSAGES:
			return getErrorMessages();
		case ResultPackage.VALIDATION_REPORT__RESULT:
			if (resolve)
				return getResult();
			return basicGetResult();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case ResultPackage.VALIDATION_REPORT__ERROR_MESSAGES:
			getErrorMessages().clear();
			getErrorMessages().addAll((Collection<? extends ErrorMessage>) newValue);
			return;
		case ResultPackage.VALIDATION_REPORT__RESULT:
			setResult((EObject) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(final int featureID) {
		switch (featureID) {
		case ResultPackage.VALIDATION_REPORT__ERROR_MESSAGES:
			getErrorMessages().clear();
			return;
		case ResultPackage.VALIDATION_REPORT__RESULT:
			setResult((EObject) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
		case ResultPackage.VALIDATION_REPORT__ERROR_MESSAGES:
			return errorMessages != null && !errorMessages.isEmpty();
		case ResultPackage.VALIDATION_REPORT__RESULT:
			return result != null;
		}
		return super.eIsSet(featureID);
	}

} // ValidationReportImpl
