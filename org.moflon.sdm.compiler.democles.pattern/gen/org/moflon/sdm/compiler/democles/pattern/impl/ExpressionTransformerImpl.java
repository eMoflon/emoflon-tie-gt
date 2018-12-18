/**
 */
package org.moflon.sdm.compiler.democles.pattern.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.Variable;
import org.gervarro.democles.specification.emf.constraint.relational.Equal;
import org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintFactory;
import org.moflon.sdm.compiler.democles.pattern.Errors;
import org.moflon.sdm.compiler.democles.pattern.ExpressionTransformer;
import org.moflon.sdm.compiler.democles.pattern.PatternPackage;
import org.moflon.sdm.compiler.democles.pattern.PatternVariableHandler;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;
// <-- [user defined imports]
// [user defined imports] -->

import SDMLanguage.expressions.Expression;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Expression Transformer</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.moflon.sdm.compiler.democles.pattern.impl.ExpressionTransformerImpl#getDelegate
 * <em>Delegate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ExpressionTransformerImpl extends EObjectImpl implements ExpressionTransformer {
	/**
	 * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected ExpressionTransformer delegate;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ExpressionTransformerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternPackage.Literals.EXPRESSION_TRANSFORMER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExpressionTransformer getDelegate() {
		if (delegate != null && delegate.eIsProxy()) {
			final InternalEObject oldDelegate = (InternalEObject) delegate;
			delegate = (ExpressionTransformer) eResolveProxy(oldDelegate);
			if (delegate != oldDelegate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PatternPackage.EXPRESSION_TRANSFORMER__DELEGATE, oldDelegate, delegate));
			}
		}
		return delegate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExpressionTransformer basicGetDelegate() {
		return delegate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDelegate(final ExpressionTransformer newDelegate) {
		final ExpressionTransformer oldDelegate = delegate;
		delegate = newDelegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternPackage.EXPRESSION_TRANSFORMER__DELEGATE,
					oldDelegate, delegate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String lookupErrorMessage(final Errors errorID) {
		// [user code injected with eMoflon]

		if (Errors.MISSING_DELEGATE == errorID) {
			return "Missing delegate expression transformer";
		} else if (Errors.UNHANDLED_EXPRESSION == errorID) {
			return "Unable to handle expression";
		} else if (Errors.MISSING_PARAMETER_BINDING == errorID) {
			return "Missing parameter binding";
		} else if (Errors.INCOMPATIBLE_TYPE == errorID) {
			return "Incompatible type in expression";
		}
		return "Unknown error";

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void transformAndAssignExpression(final ValidationReport report,
			final PatternVariableHandler patternVariableHandler, final Expression expression, final Pattern pattern,
			final Variable variable, final EClassifier expectedType) {

		final Object[] result1_black = ExpressionTransformerImpl
				.pattern_ExpressionTransformer_1_1_LookupThisObject_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		//
		final Object[] result2_bindingAndBlack = ExpressionTransformerImpl
				.pattern_ExpressionTransformer_1_2_TransformExpression_bindingAndBlackFBBBBBB(this, report,
						patternVariableHandler, expression, pattern, expectedType);
		if (result2_bindingAndBlack != null) {
			final ConstraintVariable expressionResult = (ConstraintVariable) result2_bindingAndBlack[0];

			final Object[] result3_black = ExpressionTransformerImpl
					.pattern_ExpressionTransformer_1_3_CreateAssignmentConstraint_blackFB(pattern);
			if (result3_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[pattern] = " + pattern + ".");
			}
			final PatternBody body = (PatternBody) result3_black[0];
			final Object[] result3_green = ExpressionTransformerImpl
					.pattern_ExpressionTransformer_1_3_CreateAssignmentConstraint_greenBF(body);
			final Equal constraint = (Equal) result3_green[1];

			final Object[] result4_black = ExpressionTransformerImpl
					.pattern_ExpressionTransformer_1_4_AddFirstParameter_blackBB(constraint, variable);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[constraint] = " + constraint
						+ ", " + "[variable] = " + variable + ".");
			}
			ExpressionTransformerImpl.pattern_ExpressionTransformer_1_4_AddFirstParameter_greenFBB(constraint,
					variable);
			// nothing ConstraintParameter firstParameter = (ConstraintParameter)
			// result4_green[0];

			final Object[] result5_black = ExpressionTransformerImpl
					.pattern_ExpressionTransformer_1_5_AddSecondParameter_blackBB(expressionResult, constraint);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[expressionResult] = "
						+ expressionResult + ", " + "[constraint] = " + constraint + ".");
			}
			ExpressionTransformerImpl.pattern_ExpressionTransformer_1_5_AddSecondParameter_greenBFB(expressionResult,
					constraint);
			// nothing ConstraintParameter secondParameter = (ConstraintParameter)
			// result5_green[1];

		} else {
		}
		return;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ConstraintVariable transformExpression(final ValidationReport report,
			final PatternVariableHandler patternVariableHandler, final Expression expression, final Pattern pattern,
			final EClassifier expectedType) {
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
		case PatternPackage.EXPRESSION_TRANSFORMER__DELEGATE:
			if (resolve)
				return getDelegate();
			return basicGetDelegate();
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
		case PatternPackage.EXPRESSION_TRANSFORMER__DELEGATE:
			setDelegate((ExpressionTransformer) newValue);
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
		case PatternPackage.EXPRESSION_TRANSFORMER__DELEGATE:
			setDelegate((ExpressionTransformer) null);
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
		case PatternPackage.EXPRESSION_TRANSFORMER__DELEGATE:
			return delegate != null;
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
		case PatternPackage.EXPRESSION_TRANSFORMER___LOOKUP_ERROR_MESSAGE__ERRORS:
			return lookupErrorMessage((Errors) arguments.get(0));
		case PatternPackage.EXPRESSION_TRANSFORMER___TRANSFORM_AND_ASSIGN_EXPRESSION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_EXPRESSION_PATTERN_VARIABLE_ECLASSIFIER:
			transformAndAssignExpression((ValidationReport) arguments.get(0), (PatternVariableHandler) arguments.get(1),
					(Expression) arguments.get(2), (Pattern) arguments.get(3), (Variable) arguments.get(4),
					(EClassifier) arguments.get(5));
			return null;
		case PatternPackage.EXPRESSION_TRANSFORMER___TRANSFORM_EXPRESSION__VALIDATIONREPORT_PATTERNVARIABLEHANDLER_EXPRESSION_PATTERN_ECLASSIFIER:
			return transformExpression((ValidationReport) arguments.get(0), (PatternVariableHandler) arguments.get(1),
					(Expression) arguments.get(2), (Pattern) arguments.get(3), (EClassifier) arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ExpressionTransformer_1_1_LookupThisObject_blackB(
			final ExpressionTransformer _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ExpressionTransformer_1_2_TransformExpression_bindingFBBBBBB(
			final ExpressionTransformer _this, final ValidationReport report,
			final PatternVariableHandler patternVariableHandler, final Expression expression, final Pattern pattern,
			final EClassifier expectedType) {
		final ConstraintVariable _localVariable_0 = _this.transformExpression(report, patternVariableHandler,
				expression, pattern, expectedType);
		final ConstraintVariable expressionResult = _localVariable_0;
		if (expressionResult != null) {
			return new Object[] { expressionResult, _this, report, patternVariableHandler, expression, pattern,
					expectedType };
		}
		return null;
	}

	public static final Object[] pattern_ExpressionTransformer_1_2_TransformExpression_blackB(
			final ConstraintVariable expressionResult) {
		return new Object[] { expressionResult };
	}

	public static final Object[] pattern_ExpressionTransformer_1_2_TransformExpression_bindingAndBlackFBBBBBB(
			final ExpressionTransformer _this, final ValidationReport report,
			final PatternVariableHandler patternVariableHandler, final Expression expression, final Pattern pattern,
			final EClassifier expectedType) {
		final Object[] result_pattern_ExpressionTransformer_1_2_TransformExpression_binding = pattern_ExpressionTransformer_1_2_TransformExpression_bindingFBBBBBB(
				_this, report, patternVariableHandler, expression, pattern, expectedType);
		if (result_pattern_ExpressionTransformer_1_2_TransformExpression_binding != null) {
			final ConstraintVariable expressionResult = (ConstraintVariable) result_pattern_ExpressionTransformer_1_2_TransformExpression_binding[0];

			final Object[] result_pattern_ExpressionTransformer_1_2_TransformExpression_black = pattern_ExpressionTransformer_1_2_TransformExpression_blackB(
					expressionResult);
			if (result_pattern_ExpressionTransformer_1_2_TransformExpression_black != null) {

				return new Object[] { expressionResult, _this, report, patternVariableHandler, expression, pattern,
						expectedType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ExpressionTransformer_1_3_CreateAssignmentConstraint_blackFB(
			final Pattern pattern) {
		for (final PatternBody body : pattern.getBodies()) {
			return new Object[] { body, pattern };
		}
		return null;
	}

	public static final Object[] pattern_ExpressionTransformer_1_3_CreateAssignmentConstraint_greenBF(
			final PatternBody body) {
		final Equal constraint = RelationalConstraintFactory.eINSTANCE.createEqual();
		body.getConstraints().add(constraint);
		return new Object[] { body, constraint };
	}

	public static final Object[] pattern_ExpressionTransformer_1_4_AddFirstParameter_blackBB(final Equal constraint,
			final Variable variable) {
		return new Object[] { constraint, variable };
	}

	public static final Object[] pattern_ExpressionTransformer_1_4_AddFirstParameter_greenFBB(final Equal constraint,
			final Variable variable) {
		final ConstraintParameter firstParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
		firstParameter.setReference(variable);
		constraint.getParameters().add(firstParameter);
		return new Object[] { firstParameter, constraint, variable };
	}

	public static final Object[] pattern_ExpressionTransformer_1_5_AddSecondParameter_blackBB(
			final ConstraintVariable expressionResult, final Equal constraint) {
		return new Object[] { expressionResult, constraint };
	}

	public static final Object[] pattern_ExpressionTransformer_1_5_AddSecondParameter_greenBFB(
			final ConstraintVariable expressionResult, final Equal constraint) {
		final ConstraintParameter secondParameter = SpecificationFactory.eINSTANCE.createConstraintParameter();
		secondParameter.setReference(expressionResult);
		constraint.getParameters().add(secondParameter);
		return new Object[] { expressionResult, secondParameter, constraint };
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ExpressionTransformerImpl
