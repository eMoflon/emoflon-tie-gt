/**
 */
package org.moflon.sdm.compiler.democles.validation.scope.impl;

import java.lang.reflect.InvocationTargetException;
// <-- [user defined imports]
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.PatternInvocationConstraint;
// [user defined imports] -->
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;
import org.moflon.sdm.compiler.democles.validation.scope.PatternMatcher;
import org.moflon.sdm.compiler.democles.validation.scope.ScopePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Pattern
 * Matcher</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.moflon.sdm.compiler.democles.validation.scope.impl.PatternMatcherImpl#getValidationReport
 * <em>Validation Report</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PatternMatcherImpl extends EObjectImpl implements PatternMatcher {
	/**
	 * The cached value of the '{@link #getValidationReport() <em>Validation
	 * Report</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValidationReport()
	 * @generated
	 * @ordered
	 */
	protected ValidationReport validationReport;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PatternMatcherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScopePackage.Literals.PATTERN_MATCHER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValidationReport getValidationReport() {
		if (validationReport != null && validationReport.eIsProxy()) {
			final InternalEObject oldValidationReport = (InternalEObject) validationReport;
			validationReport = (ValidationReport) eResolveProxy(oldValidationReport);
			if (validationReport != oldValidationReport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ScopePackage.PATTERN_MATCHER__VALIDATION_REPORT, oldValidationReport, validationReport));
			}
		}
		return validationReport;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValidationReport basicGetValidationReport() {
		return validationReport;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValidationReport(final ValidationReport newValidationReport) {
		final ValidationReport oldValidationReport = validationReport;
		validationReport = newValidationReport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScopePackage.PATTERN_MATCHER__VALIDATION_REPORT,
					oldValidationReport, validationReport));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValidationReport generateSearchPlan(final Pattern pattern, final Adornment adornment,
			final boolean isMultipleMatch) {
		// [user code injected with eMoflon]

		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case ScopePackage.PATTERN_MATCHER__VALIDATION_REPORT:
			if (resolve)
				return getValidationReport();
			return basicGetValidationReport();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case ScopePackage.PATTERN_MATCHER__VALIDATION_REPORT:
			setValidationReport((ValidationReport) newValue);
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
		case ScopePackage.PATTERN_MATCHER__VALIDATION_REPORT:
			setValidationReport((ValidationReport) null);
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
		case ScopePackage.PATTERN_MATCHER__VALIDATION_REPORT:
			return validationReport != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(final int operationID, final EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ScopePackage.PATTERN_MATCHER___GENERATE_SEARCH_PLAN__PATTERN_ADORNMENT_BOOLEAN:
			return generateSearchPlan((Pattern) arguments.get(0), (Adornment) arguments.get(1),
					(Boolean) arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	private static final int determineParameterIndex(final Pattern pattern, final ConstraintParameter cp) {
		final PatternBody body = pattern.getBodies().get(0);
		final ConstraintVariable constraintVariable = cp.getReference();
		int index = pattern.getSymbolicParameters().indexOf(constraintVariable);
		if (index < 0) {
			index = body.getLocalVariables().indexOf(constraintVariable);
			if (index >= 0) {
				index += pattern.getSymbolicParameters().size();
			} else {
				index = body.getConstants().indexOf(constraintVariable);
				if (index >= 0) {
					index += pattern.getSymbolicParameters().size() + body.getLocalVariables().size();
				} else {
					throw new RuntimeException("Invalid constraint parameter");
				}
			}
		}
		return index;
	}

	public static final Adornment getBodyAdornment(final Pattern pattern, final Adornment adornment) {
		assert pattern.getSymbolicParameters().size() == adornment.size();
		final PatternBody body = pattern.getBodies().get(0);
		final int[] bindings = new int[pattern.getSymbolicParameters().size() + body.getLocalVariables().size()
				+ body.getConstants().size()];
		for (int i = 0; i < pattern.getSymbolicParameters().size(); i++) {
			bindings[i] = adornment.get(i);
		}
		int offset = pattern.getSymbolicParameters().size();
		for (int i = 0; i < body.getLocalVariables().size(); i++) {
			bindings[offset + i] = Adornment.FREE;
		}
		offset += body.getLocalVariables().size();
		for (int i = 0; i < body.getConstants().size(); i++) {
			bindings[offset + i] = Adornment.BOUND;
		}
		return new Adornment(bindings);
	}

	public static final Adornment getNextAdornment(final Pattern pattern, final Adornment adornment,
			final PatternInvocationConstraint patternInvocationConstraint) {
		final Adornment result = Adornment.create(adornment);
		final List<ConstraintParameter> constraintParameters = patternInvocationConstraint.getParameters();
		for (int operationIndex = 0; operationIndex < constraintParameters.size(); operationIndex++) {
			final ConstraintParameter cp = constraintParameters.get(operationIndex);
			final int index = determineParameterIndex(pattern, cp);
			if (adornment.get(index) > Adornment.BOUND) {
				result.set(index, Adornment.BOUND);
			}
		}
		return result;
	}

	public static final Adornment getOperationAdornment(final Pattern pattern, final Adornment adornment,
			final PatternInvocationConstraint patternInvocationConstraint) {
		final List<ConstraintParameter> constraintParameters = patternInvocationConstraint.getParameters();
		final int[] result = new int[constraintParameters.size()];
		for (int operationIndex = 0; operationIndex < constraintParameters.size(); operationIndex++) {
			final ConstraintParameter cp = constraintParameters.get(operationIndex);
			final int index = determineParameterIndex(pattern, cp);
			result[operationIndex] = adornment.get(index);
		}
		return new Adornment(result);
	}

	// [user code injected with eMoflon] -->
} // PatternMatcherImpl
