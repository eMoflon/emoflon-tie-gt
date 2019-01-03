/**
 */
package org.moflon.sdm.compiler.democles.validation.scope.impl;

// <-- [user defined imports]
import java.util.List;

import org.eclipse.emf.ecore.InternalEObject;
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
	public ValidationReport getValidationReport() {
		if (validationReport != null && validationReport.eIsProxy()) {
			final InternalEObject oldValidationReport = (InternalEObject) validationReport;
			validationReport = (ValidationReport) eResolveProxy(oldValidationReport);
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
