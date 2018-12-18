/**
 */
package SDMLanguage.expressions.impl;

import SDMLanguage.expressions.ComparingOperator;
import SDMLanguage.expressions.ComparisonExpression;
import SDMLanguage.expressions.Expression;
import SDMLanguage.expressions.ExpressionsPackage;
import SDMLanguage.expressions.LiteralExpression;
import SDMLanguage.expressions.TextualExpression;

import SDMLanguage.impl.CommentableElementImpl;

import SDMLanguage.patterns.ObjectVariable;

import SDMLanguage.patterns.patternExpressions.AttributeValueExpression;
import SDMLanguage.patterns.patternExpressions.ObjectVariableExpression;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ExpressionImpl extends CommentableElementImpl implements Expression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean compare(Expression expression) {

		Object[] result1_black = ExpressionImpl.pattern_Expression_0_1_prepare_blackBB(expression, this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[expression] = " + expression
					+ ", " + "[this] = " + this + ".");
		}
		// 
		Object[] result2_bindingAndBlack = ExpressionImpl
				.pattern_Expression_0_2_compareexp_bindingAndBlackFFFFFFBB(expression, this);
		if (result2_bindingAndBlack != null) {
			Expression expLeft = (Expression) result2_bindingAndBlack[0];
			Expression expRight = (Expression) result2_bindingAndBlack[1];
			ComparisonExpression expressionComp = (ComparisonExpression) result2_bindingAndBlack[2];
			ComparisonExpression thisComp = (ComparisonExpression) result2_bindingAndBlack[3];
			Expression thisLeft = (Expression) result2_bindingAndBlack[4];
			Expression thisRight = (Expression) result2_bindingAndBlack[5];
			// 
			Object[] result3_black = ExpressionImpl.pattern_Expression_0_3_compareoperator_blackBB(thisComp,
					expressionComp);
			if (result3_black != null) {
				// 
				if (ExpressionImpl.pattern_Expression_0_4_compareleftwithleft_expressionFBB(thisLeft, expLeft)) {
					// 
					if (ExpressionImpl.pattern_Expression_0_5_comparerightwithright_expressionFBB(thisRight,
							expRight)) {
						return ExpressionImpl.pattern_Expression_0_6_expressionF();
					} else {
						return ExpressionImpl.pattern_Expression_0_7_expressionF();
					}

				} else {
					return ExpressionImpl.pattern_Expression_0_8_expressionF();
				}

			} else {
				return ExpressionImpl.pattern_Expression_0_9_expressionF();
			}

		} else {
			// 
			Object[] result10_bindingAndBlack = ExpressionImpl
					.pattern_Expression_0_10_literalexp_bindingAndBlackFFBB(expression, this);
			if (result10_bindingAndBlack != null) {
				LiteralExpression expressionLit = (LiteralExpression) result10_bindingAndBlack[0];
				LiteralExpression thisLit = (LiteralExpression) result10_bindingAndBlack[1];
				// 
				Object[] result11_black = ExpressionImpl.pattern_Expression_0_11_comparevalue_blackBB(thisLit,
						expressionLit);
				if (result11_black != null) {
					return ExpressionImpl.pattern_Expression_0_12_expressionF();
				} else {
					return ExpressionImpl.pattern_Expression_0_13_expressionF();
				}

			} else {
				// 
				Object[] result14_bindingAndBlack = ExpressionImpl
						.pattern_Expression_0_14_textualexp_bindingAndBlackFFBB(expression, this);
				if (result14_bindingAndBlack != null) {
					TextualExpression expressionText = (TextualExpression) result14_bindingAndBlack[0];
					TextualExpression thisText = (TextualExpression) result14_bindingAndBlack[1];
					// 
					Object[] result15_black = ExpressionImpl.pattern_Expression_0_15_comparetext_blackBB(thisText,
							expressionText);
					if (result15_black != null) {
						return ExpressionImpl.pattern_Expression_0_16_expressionF();
					} else {
						return ExpressionImpl.pattern_Expression_0_17_expressionF();
					}

				} else {
					// 
					Object[] result18_bindingAndBlack = ExpressionImpl
							.pattern_Expression_0_18_attributeValueexp_bindingAndBlackFFFFBB(expression, this);
					if (result18_bindingAndBlack != null) {
						AttributeValueExpression expressionAttrExp = (AttributeValueExpression) result18_bindingAndBlack[0];
						AttributeValueExpression thisAttrExp = (AttributeValueExpression) result18_bindingAndBlack[1];
						EAttribute thisAttribute = (EAttribute) result18_bindingAndBlack[2];
						//nothing ObjectVariable thisOV = (ObjectVariable) result18_bindingAndBlack[3];

						Object[] result19_black = ExpressionImpl
								.pattern_Expression_0_19_getotherelements_blackFFB(expressionAttrExp);
						if (result19_black == null) {
							throw new RuntimeException("Pattern matching failed." + " Variables: "
									+ "[expressionAttrExp] = " + expressionAttrExp + ".");
						}
						EAttribute expAttribute = (EAttribute) result19_black[0];
						ObjectVariable expOV = (ObjectVariable) result19_black[1];
						// 
						Object[] result20_black = ExpressionImpl
								.pattern_Expression_0_20_attributeequals_blackBB(expAttribute, thisAttribute);
						if (result20_black != null) {
							return ExpressionImpl.pattern_Expression_0_21_expressionF();
						} else {
							// 
							Object[] result22_black = ExpressionImpl.pattern_Expression_0_22_blackBB(expOV,
									thisAttrExp);
							if (result22_black != null) {
								return ExpressionImpl.pattern_Expression_0_23_expressionF();
							} else {
								return ExpressionImpl.pattern_Expression_0_24_expressionF();
							}

						}

					} else {
						// 
						Object[] result25_bindingAndBlack = ExpressionImpl
								.pattern_Expression_0_25_objectValueexp_bindingAndBlackFFBB(expression, this);
						if (result25_bindingAndBlack != null) {
							ObjectVariableExpression expressionOVExp = (ObjectVariableExpression) result25_bindingAndBlack[0];
							ObjectVariableExpression thisOVExp = (ObjectVariableExpression) result25_bindingAndBlack[1];
							// 
							Object[] result26_black = ExpressionImpl
									.pattern_Expression_0_26_ovequals_blackFBB(expressionOVExp, thisOVExp);
							if (result26_black != null) {
								//nothing ObjectVariable expOV = (ObjectVariable) result26_black[0];
								return ExpressionImpl.pattern_Expression_0_27_expressionF();
							} else {
								return ExpressionImpl.pattern_Expression_0_28_expressionF();
							}

						} else {
							return ExpressionImpl.pattern_Expression_0_29_expressionF();
						}

					}

				}

			}

		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ExpressionsPackage.EXPRESSION___COMPARE__EXPRESSION:
			return compare((Expression) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Expression_0_1_prepare_blackBB(Expression expression, Expression _this) {
		if (!expression.equals(_this)) {
			return new Object[] { expression, _this };
		}
		return null;
	}

	public static final Object[] pattern_Expression_0_2_compareexp_bindingFFBB(Expression expression,
			Expression _this) {
		Expression tmpExpressionComp = expression;
		Expression tmpThisComp = _this;
		if (tmpExpressionComp instanceof ComparisonExpression) {
			ComparisonExpression expressionComp = (ComparisonExpression) tmpExpressionComp;
			if (tmpThisComp instanceof ComparisonExpression) {
				ComparisonExpression thisComp = (ComparisonExpression) tmpThisComp;
				return new Object[] { expressionComp, thisComp, expression, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Expression_0_2_compareexp_blackFFBBFF(ComparisonExpression expressionComp,
			ComparisonExpression thisComp) {
		if (!expressionComp.equals(thisComp)) {
			Expression expRight = expressionComp.getRightExpression();
			if (expRight != null) {
				if (!expRight.equals(expressionComp)) {
					if (!expRight.equals(thisComp)) {
						Expression expLeft = expressionComp.getLeftExpression();
						if (expLeft != null) {
							if (!expLeft.equals(expRight)) {
								if (!expLeft.equals(expressionComp)) {
									if (!expLeft.equals(thisComp)) {
										Expression thisRight = thisComp.getRightExpression();
										if (thisRight != null) {
											if (!expLeft.equals(thisRight)) {
												if (!expRight.equals(thisRight)) {
													if (!expressionComp.equals(thisRight)) {
														if (!thisComp.equals(thisRight)) {
															Expression thisLeft = thisComp.getLeftExpression();
															if (thisLeft != null) {
																if (!expLeft.equals(thisLeft)) {
																	if (!expRight.equals(thisLeft)) {
																		if (!expressionComp.equals(thisLeft)) {
																			if (!thisComp.equals(thisLeft)) {
																				if (!thisLeft.equals(thisRight)) {
																					return new Object[] { expLeft,
																							expRight, expressionComp,
																							thisComp, thisLeft,
																							thisRight };
																				}
																			}
																		}
																	}
																}
															}

														}
													}
												}
											}
										}

									}
								}
							}
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_Expression_0_2_compareexp_bindingAndBlackFFFFFFBB(Expression expression,
			Expression _this) {
		Object[] result_pattern_Expression_0_2_compareexp_binding = pattern_Expression_0_2_compareexp_bindingFFBB(
				expression, _this);
		if (result_pattern_Expression_0_2_compareexp_binding != null) {
			ComparisonExpression expressionComp = (ComparisonExpression) result_pattern_Expression_0_2_compareexp_binding[0];
			ComparisonExpression thisComp = (ComparisonExpression) result_pattern_Expression_0_2_compareexp_binding[1];

			Object[] result_pattern_Expression_0_2_compareexp_black = pattern_Expression_0_2_compareexp_blackFFBBFF(
					expressionComp, thisComp);
			if (result_pattern_Expression_0_2_compareexp_black != null) {
				Expression expLeft = (Expression) result_pattern_Expression_0_2_compareexp_black[0];
				Expression expRight = (Expression) result_pattern_Expression_0_2_compareexp_black[1];
				Expression thisLeft = (Expression) result_pattern_Expression_0_2_compareexp_black[4];
				Expression thisRight = (Expression) result_pattern_Expression_0_2_compareexp_black[5];

				return new Object[] { expLeft, expRight, expressionComp, thisComp, thisLeft, thisRight, expression,
						_this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Expression_0_3_compareoperator_blackBB(ComparisonExpression thisComp,
			ComparisonExpression expressionComp) {
		if (!expressionComp.equals(thisComp)) {
			ComparingOperator thisComp_operator = thisComp.getOperator();
			ComparingOperator expressionComp_operator = expressionComp.getOperator();
			if (thisComp_operator.equals(expressionComp_operator)) {
				return new Object[] { thisComp, expressionComp };
			}

		}
		return null;
	}

	public static final boolean pattern_Expression_0_4_compareleftwithleft_expressionFBB(Expression thisLeft,
			Expression expLeft) {
		boolean _localVariable_0 = thisLeft.compare(expLeft);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Expression_0_5_comparerightwithright_expressionFBB(Expression thisRight,
			Expression expRight) {
		boolean _localVariable_0 = thisRight.compare(expRight);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Expression_0_6_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Expression_0_7_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final boolean pattern_Expression_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final boolean pattern_Expression_0_9_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Expression_0_10_literalexp_bindingFFBB(Expression expression,
			Expression _this) {
		Expression tmpExpressionLit = expression;
		Expression tmpThisLit = _this;
		if (tmpExpressionLit instanceof LiteralExpression) {
			LiteralExpression expressionLit = (LiteralExpression) tmpExpressionLit;
			if (tmpThisLit instanceof LiteralExpression) {
				LiteralExpression thisLit = (LiteralExpression) tmpThisLit;
				return new Object[] { expressionLit, thisLit, expression, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Expression_0_10_literalexp_blackBB(LiteralExpression expressionLit,
			LiteralExpression thisLit) {
		if (!expressionLit.equals(thisLit)) {
			return new Object[] { expressionLit, thisLit };
		}
		return null;
	}

	public static final Object[] pattern_Expression_0_10_literalexp_bindingAndBlackFFBB(Expression expression,
			Expression _this) {
		Object[] result_pattern_Expression_0_10_literalexp_binding = pattern_Expression_0_10_literalexp_bindingFFBB(
				expression, _this);
		if (result_pattern_Expression_0_10_literalexp_binding != null) {
			LiteralExpression expressionLit = (LiteralExpression) result_pattern_Expression_0_10_literalexp_binding[0];
			LiteralExpression thisLit = (LiteralExpression) result_pattern_Expression_0_10_literalexp_binding[1];

			Object[] result_pattern_Expression_0_10_literalexp_black = pattern_Expression_0_10_literalexp_blackBB(
					expressionLit, thisLit);
			if (result_pattern_Expression_0_10_literalexp_black != null) {

				return new Object[] { expressionLit, thisLit, expression, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Expression_0_11_comparevalue_blackBB(LiteralExpression thisLit,
			LiteralExpression expressionLit) {
		if (!expressionLit.equals(thisLit)) {
			String thisLit_value = thisLit.getValue();
			String expressionLit_value = expressionLit.getValue();
			if (thisLit_value.equals(expressionLit_value)) {
				return new Object[] { thisLit, expressionLit };
			}

		}
		return null;
	}

	public static final boolean pattern_Expression_0_12_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Expression_0_13_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Expression_0_14_textualexp_bindingFFBB(Expression expression,
			Expression _this) {
		Expression tmpExpressionText = expression;
		Expression tmpThisText = _this;
		if (tmpExpressionText instanceof TextualExpression) {
			TextualExpression expressionText = (TextualExpression) tmpExpressionText;
			if (tmpThisText instanceof TextualExpression) {
				TextualExpression thisText = (TextualExpression) tmpThisText;
				return new Object[] { expressionText, thisText, expression, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Expression_0_14_textualexp_blackBB(TextualExpression expressionText,
			TextualExpression thisText) {
		if (!expressionText.equals(thisText)) {
			return new Object[] { expressionText, thisText };
		}
		return null;
	}

	public static final Object[] pattern_Expression_0_14_textualexp_bindingAndBlackFFBB(Expression expression,
			Expression _this) {
		Object[] result_pattern_Expression_0_14_textualexp_binding = pattern_Expression_0_14_textualexp_bindingFFBB(
				expression, _this);
		if (result_pattern_Expression_0_14_textualexp_binding != null) {
			TextualExpression expressionText = (TextualExpression) result_pattern_Expression_0_14_textualexp_binding[0];
			TextualExpression thisText = (TextualExpression) result_pattern_Expression_0_14_textualexp_binding[1];

			Object[] result_pattern_Expression_0_14_textualexp_black = pattern_Expression_0_14_textualexp_blackBB(
					expressionText, thisText);
			if (result_pattern_Expression_0_14_textualexp_black != null) {

				return new Object[] { expressionText, thisText, expression, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Expression_0_15_comparetext_blackBB(TextualExpression thisText,
			TextualExpression expressionText) {
		if (!expressionText.equals(thisText)) {
			String thisText_expressionText = thisText.getExpressionText();
			String expressionText_expressionText = expressionText.getExpressionText();
			if (thisText_expressionText.equals(expressionText_expressionText)) {
				return new Object[] { thisText, expressionText };
			}

		}
		return null;
	}

	public static final boolean pattern_Expression_0_16_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Expression_0_17_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Expression_0_18_attributeValueexp_bindingFFBB(Expression expression,
			Expression _this) {
		Expression tmpExpressionAttrExp = expression;
		Expression tmpThisAttrExp = _this;
		if (tmpExpressionAttrExp instanceof AttributeValueExpression) {
			AttributeValueExpression expressionAttrExp = (AttributeValueExpression) tmpExpressionAttrExp;
			if (tmpThisAttrExp instanceof AttributeValueExpression) {
				AttributeValueExpression thisAttrExp = (AttributeValueExpression) tmpThisAttrExp;
				return new Object[] { expressionAttrExp, thisAttrExp, expression, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Expression_0_18_attributeValueexp_blackBBFF(
			AttributeValueExpression expressionAttrExp, AttributeValueExpression thisAttrExp) {
		if (!expressionAttrExp.equals(thisAttrExp)) {
			ObjectVariable thisOV = thisAttrExp.getObject();
			if (thisOV != null) {
				EAttribute thisAttribute = thisAttrExp.getAttribute();
				if (thisAttribute != null) {
					return new Object[] { expressionAttrExp, thisAttrExp, thisAttribute, thisOV };
				}

			}

		}
		return null;
	}

	public static final Object[] pattern_Expression_0_18_attributeValueexp_bindingAndBlackFFFFBB(Expression expression,
			Expression _this) {
		Object[] result_pattern_Expression_0_18_attributeValueexp_binding = pattern_Expression_0_18_attributeValueexp_bindingFFBB(
				expression, _this);
		if (result_pattern_Expression_0_18_attributeValueexp_binding != null) {
			AttributeValueExpression expressionAttrExp = (AttributeValueExpression) result_pattern_Expression_0_18_attributeValueexp_binding[0];
			AttributeValueExpression thisAttrExp = (AttributeValueExpression) result_pattern_Expression_0_18_attributeValueexp_binding[1];

			Object[] result_pattern_Expression_0_18_attributeValueexp_black = pattern_Expression_0_18_attributeValueexp_blackBBFF(
					expressionAttrExp, thisAttrExp);
			if (result_pattern_Expression_0_18_attributeValueexp_black != null) {
				EAttribute thisAttribute = (EAttribute) result_pattern_Expression_0_18_attributeValueexp_black[2];
				ObjectVariable thisOV = (ObjectVariable) result_pattern_Expression_0_18_attributeValueexp_black[3];

				return new Object[] { expressionAttrExp, thisAttrExp, thisAttribute, thisOV, expression, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Expression_0_19_getotherelements_blackFFB(
			AttributeValueExpression expressionAttrExp) {
		ObjectVariable expOV = expressionAttrExp.getObject();
		if (expOV != null) {
			EAttribute expAttribute = expressionAttrExp.getAttribute();
			if (expAttribute != null) {
				return new Object[] { expAttribute, expOV, expressionAttrExp };
			}

		}

		return null;
	}

	public static final Object[] pattern_Expression_0_20_attributeequals_blackBB(EAttribute expAttribute,
			EAttribute thisAttribute) {
		if (!expAttribute.equals(thisAttribute)) {
			return new Object[] { expAttribute, thisAttribute };
		}
		return null;
	}

	public static final boolean pattern_Expression_0_21_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Expression_0_22_blackBB(ObjectVariable expOV,
			AttributeValueExpression thisAttrExp) {
		if (expOV.equals(thisAttrExp.getObject())) {
			return new Object[] { expOV, thisAttrExp };
		}
		return null;
	}

	public static final boolean pattern_Expression_0_23_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Expression_0_24_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Expression_0_25_objectValueexp_bindingFFBB(Expression expression,
			Expression _this) {
		Expression tmpExpressionOVExp = expression;
		Expression tmpThisOVExp = _this;
		if (tmpExpressionOVExp instanceof ObjectVariableExpression) {
			ObjectVariableExpression expressionOVExp = (ObjectVariableExpression) tmpExpressionOVExp;
			if (tmpThisOVExp instanceof ObjectVariableExpression) {
				ObjectVariableExpression thisOVExp = (ObjectVariableExpression) tmpThisOVExp;
				return new Object[] { expressionOVExp, thisOVExp, expression, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Expression_0_25_objectValueexp_blackBB(
			ObjectVariableExpression expressionOVExp, ObjectVariableExpression thisOVExp) {
		if (!expressionOVExp.equals(thisOVExp)) {
			return new Object[] { expressionOVExp, thisOVExp };
		}
		return null;
	}

	public static final Object[] pattern_Expression_0_25_objectValueexp_bindingAndBlackFFBB(Expression expression,
			Expression _this) {
		Object[] result_pattern_Expression_0_25_objectValueexp_binding = pattern_Expression_0_25_objectValueexp_bindingFFBB(
				expression, _this);
		if (result_pattern_Expression_0_25_objectValueexp_binding != null) {
			ObjectVariableExpression expressionOVExp = (ObjectVariableExpression) result_pattern_Expression_0_25_objectValueexp_binding[0];
			ObjectVariableExpression thisOVExp = (ObjectVariableExpression) result_pattern_Expression_0_25_objectValueexp_binding[1];

			Object[] result_pattern_Expression_0_25_objectValueexp_black = pattern_Expression_0_25_objectValueexp_blackBB(
					expressionOVExp, thisOVExp);
			if (result_pattern_Expression_0_25_objectValueexp_black != null) {

				return new Object[] { expressionOVExp, thisOVExp, expression, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Expression_0_26_ovequals_blackFBB(ObjectVariableExpression expressionOVExp,
			ObjectVariableExpression thisOVExp) {
		if (!expressionOVExp.equals(thisOVExp)) {
			ObjectVariable expOV = expressionOVExp.getObject();
			if (expOV != null) {
				if (expOV.equals(thisOVExp.getObject())) {
					return new Object[] { expOV, expressionOVExp, thisOVExp };
				}
			}

		}
		return null;
	}

	public static final boolean pattern_Expression_0_27_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Expression_0_28_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final boolean pattern_Expression_0_29_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ExpressionImpl
