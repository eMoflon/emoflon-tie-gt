/**
 */
package org.moflon.sdm.democles.literalexpressionsolver.impl;

import MocaTree.Node;
import MocaTree.Text;

import SDMLanguage.expressions.LiteralExpression;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.gervarro.democles.specification.emf.Constant;
import org.gervarro.democles.specification.emf.SpecificationFactory;

import org.moflon.sdm.democles.literalexpressionsolver.ConstantTransformer;
import org.moflon.sdm.democles.literalexpressionsolver.LiteralexpressionsolverPackage;
// <-- [user defined imports]
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.apache.log4j.Logger;
import org.moflon.core.utilities.LogUtils;
import org.moflon.moca.MocaUtil;
import org.moflon.moca.literalExpression.parser.LiteralExpressionLexer;
import org.moflon.moca.literalExpression.parser.LiteralExpressionParser;
import java.io.StringReader;
import java.io.IOException;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConstantTransformerImpl extends EObjectImpl implements ConstantTransformer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantTransformerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LiteralexpressionsolverPackage.Literals.CONSTANT_TRANSFORMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node parse(String string) {
		// [user code injected with eMoflon]

		try {
			LiteralExpressionLexer lexer = new LiteralExpressionLexer(new ANTLRReaderStream(new StringReader(string)));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			LiteralExpressionParser parser = new LiteralExpressionParser(tokens);
			CommonTree result = (CommonTree) parser.main().getTree();

			return MocaUtil.commonTreeToMocaTree(result);
		} catch (IOException | RecognitionException e) {
			LogUtils.error(logger, e);
		}
		return null;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant transformLiteralExpression(LiteralExpression literalExpression, EClassifier expectedType) {// 
		Object[] result1_bindingAndBlack = ConstantTransformerImpl
				.pattern_ConstantTransformer_1_1_EnsureNonNullParameters_bindingAndBlackFBBB(this, literalExpression,
						expectedType);
		if (result1_bindingAndBlack != null) {
			//nothing EClassifier tmpType = (EClassifier) result1_bindingAndBlack[0];

			Object[] result2_bindingAndBlack = ConstantTransformerImpl
					.pattern_ConstantTransformer_1_2_ParseLiteralExpressionString_bindingAndBlackFBB(this,
							literalExpression);
			if (result2_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[literalExpression] = " + literalExpression + ".");
			}
			Node rootNode = (Node) result2_bindingAndBlack[0];
			// 
			Object[] result3_black = ConstantTransformerImpl
					.pattern_ConstantTransformer_1_3_IsEnumLiteral_blackB(rootNode);
			if (result3_black != null) {
			} else {
				// 
				Object[] result4_black = ConstantTransformerImpl
						.pattern_ConstantTransformer_1_4_IsConstant_blackB(rootNode);
				if (result4_black != null) {
				} else {
					// 
					Object[] result5_black = ConstantTransformerImpl
							.pattern_ConstantTransformer_1_5_IsNumber_blackB(rootNode);
					if (result5_black != null) {
					} else {
						// 
						Object[] result6_black = ConstantTransformerImpl
								.pattern_ConstantTransformer_1_6_IsLiteral_blackB(rootNode);
						if (result6_black != null) {
						} else {
							return ConstantTransformerImpl.pattern_ConstantTransformer_1_7_expressionF();
						}

					}

				}

			}

			Object[] result8_black = ConstantTransformerImpl
					.pattern_ConstantTransformer_1_8_LookupChild_blackFB(rootNode);
			if (result8_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[rootNode] = " + rootNode + ".");
			}
			Node child = (Node) result8_black[0];
			// 
			Object[] result9_black = ConstantTransformerImpl
					.pattern_ConstantTransformer_1_9_LookupFactoryClass_blackFFB(expectedType);
			if (result9_black != null) {
				EPackage ePackage = (EPackage) result9_black[0];
				EFactory eFactory = (EFactory) result9_black[1];
				// 
				Object[] result10_black = ConstantTransformerImpl
						.pattern_ConstantTransformer_1_10_IsNull_blackBB(rootNode, child);
				if (result10_black != null) {
					// 
					Object[] result11_black = ConstantTransformerImpl
							.pattern_ConstantTransformer_1_11_IsJavaObject_blackBB(ePackage, expectedType);
					if (result11_black != null) {
					} else {
						// 
						Object[] result12_bindingAndBlack = ConstantTransformerImpl
								.pattern_ConstantTransformer_1_12_IsEClass_bindingAndBlackFB(expectedType);
						if (result12_bindingAndBlack != null) {
							//nothing EClass eClass = (EClass) result12_bindingAndBlack[0];
						} else {
							return ConstantTransformerImpl.pattern_ConstantTransformer_1_13_expressionF();
						}

					}

					Object[] result14_green = ConstantTransformerImpl
							.pattern_ConstantTransformer_1_14_CreateNullConstant_greenF();
					if (result14_green == null) {
						throw new RuntimeException("Pattern matching failed.");
					}
					Constant nullConstant = (Constant) result14_green[0];
					return ConstantTransformerImpl.pattern_ConstantTransformer_1_15_expressionFB(nullConstant);
				} else {
					// 
					Object[] result16_bindingAndBlack = ConstantTransformerImpl
							.pattern_ConstantTransformer_1_16_IsEnum_bindingAndBlackFB(expectedType);
					if (result16_bindingAndBlack != null) {
						EEnum eEnum = (EEnum) result16_bindingAndBlack[0];
						// 
						if (ConstantTransformerImpl
								.pattern_ConstantTransformer_1_17_CanCreateEnumLiteralFromString_expressionFBBB(this,
										eEnum, child)) {

							Object[] result18_green = ConstantTransformerImpl
									.pattern_ConstantTransformer_1_18_CreateEnumConstant_greenFBB(eEnum, child);
							if (result18_green == null) {
								throw new RuntimeException("Pattern matching failed." + " Variables: " + "[eEnum] = "
										+ eEnum + ", " + "[child] = " + child + ".");
							}
							Constant enumConstant = (Constant) result18_green[0];
							return ConstantTransformerImpl.pattern_ConstantTransformer_1_19_expressionFB(enumConstant);
						} else {
							return ConstantTransformerImpl.pattern_ConstantTransformer_1_20_expressionF();
						}

					} else {
						// 
						Object[] result21_bindingAndBlack = ConstantTransformerImpl
								.pattern_ConstantTransformer_1_21_IsDataType_bindingAndBlackFB(expectedType);
						if (result21_bindingAndBlack != null) {
							EDataType eDataType = (EDataType) result21_bindingAndBlack[0];
							// 
							if (ConstantTransformerImpl
									.pattern_ConstantTransformer_1_22_CanCreateDataTypeFromString_expressionFBBBB(this,
											eFactory, eDataType, child)) {

								Object[] result23_green = ConstantTransformerImpl
										.pattern_ConstantTransformer_1_23_CreateConstant_greenFBBB(eFactory, eDataType,
												child);
								if (result23_green == null) {
									throw new RuntimeException("Pattern matching failed." + " Variables: "
											+ "[eFactory] = " + eFactory + ", " + "[eDataType] = " + eDataType + ", "
											+ "[child] = " + child + ".");
								}
								Constant constant = (Constant) result23_green[0];
								return ConstantTransformerImpl.pattern_ConstantTransformer_1_24_expressionFB(constant);
							} else {
								return ConstantTransformerImpl.pattern_ConstantTransformer_1_25_expressionF();
							}

						} else {
							return ConstantTransformerImpl.pattern_ConstantTransformer_1_26_expressionF();
						}

					}

				}

			} else {
				return ConstantTransformerImpl.pattern_ConstantTransformer_1_27_expressionF();
			}

		} else {
			return ConstantTransformerImpl.pattern_ConstantTransformer_1_28_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canCreateDataTypeFromString(EFactory factory, EDataType dataType, String value) {
		// [user code injected with eMoflon]

		try {
			factory.createFromString(dataType, value);
			return true;
		} catch (IllegalArgumentException e) {
			return false;
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canCreateEnumLiteralFromString(EEnum eEnum, String value) {
		// [user code injected with eMoflon]

		return eEnum.getEEnumLiteralByLiteral(value) != null;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case LiteralexpressionsolverPackage.CONSTANT_TRANSFORMER___PARSE__STRING:
			return parse((String) arguments.get(0));
		case LiteralexpressionsolverPackage.CONSTANT_TRANSFORMER___TRANSFORM_LITERAL_EXPRESSION__LITERALEXPRESSION_ECLASSIFIER:
			return transformLiteralExpression((LiteralExpression) arguments.get(0), (EClassifier) arguments.get(1));
		case LiteralexpressionsolverPackage.CONSTANT_TRANSFORMER___CAN_CREATE_DATA_TYPE_FROM_STRING__EFACTORY_EDATATYPE_STRING:
			return canCreateDataTypeFromString((EFactory) arguments.get(0), (EDataType) arguments.get(1),
					(String) arguments.get(2));
		case LiteralexpressionsolverPackage.CONSTANT_TRANSFORMER___CAN_CREATE_ENUM_LITERAL_FROM_STRING__EENUM_STRING:
			return canCreateEnumLiteralFromString((EEnum) arguments.get(0), (String) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ConstantTransformer_1_1_EnsureNonNullParameters_bindingFB(
			EClassifier expectedType) {
		EClassifier tmpType = expectedType;
		if (tmpType != null) {
			return new Object[] { tmpType, expectedType };
		}
		return null;
	}

	public static final Object[] pattern_ConstantTransformer_1_1_EnsureNonNullParameters_blackBBB(EClassifier tmpType,
			ConstantTransformer _this, LiteralExpression literalExpression) {
		return new Object[] { tmpType, _this, literalExpression };
	}

	public static final Object[] pattern_ConstantTransformer_1_1_EnsureNonNullParameters_bindingAndBlackFBBB(
			ConstantTransformer _this, LiteralExpression literalExpression, EClassifier expectedType) {
		Object[] result_pattern_ConstantTransformer_1_1_EnsureNonNullParameters_binding = pattern_ConstantTransformer_1_1_EnsureNonNullParameters_bindingFB(
				expectedType);
		if (result_pattern_ConstantTransformer_1_1_EnsureNonNullParameters_binding != null) {
			EClassifier tmpType = (EClassifier) result_pattern_ConstantTransformer_1_1_EnsureNonNullParameters_binding[0];

			Object[] result_pattern_ConstantTransformer_1_1_EnsureNonNullParameters_black = pattern_ConstantTransformer_1_1_EnsureNonNullParameters_blackBBB(
					tmpType, _this, literalExpression);
			if (result_pattern_ConstantTransformer_1_1_EnsureNonNullParameters_black != null) {

				return new Object[] { tmpType, _this, literalExpression, expectedType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstantTransformer_1_2_ParseLiteralExpressionString_bindingFBB(
			ConstantTransformer _this, LiteralExpression literalExpression) {
		String literalExpression_value = literalExpression.getValue();
		Node _localVariable_0 = _this.parse(literalExpression_value);
		Node rootNode = _localVariable_0;
		if (rootNode != null) {
			return new Object[] { rootNode, _this, literalExpression };
		}

		return null;
	}

	public static final Object[] pattern_ConstantTransformer_1_2_ParseLiteralExpressionString_blackB(Node rootNode) {
		return new Object[] { rootNode };
	}

	public static final Object[] pattern_ConstantTransformer_1_2_ParseLiteralExpressionString_bindingAndBlackFBB(
			ConstantTransformer _this, LiteralExpression literalExpression) {
		Object[] result_pattern_ConstantTransformer_1_2_ParseLiteralExpressionString_binding = pattern_ConstantTransformer_1_2_ParseLiteralExpressionString_bindingFBB(
				_this, literalExpression);
		if (result_pattern_ConstantTransformer_1_2_ParseLiteralExpressionString_binding != null) {
			Node rootNode = (Node) result_pattern_ConstantTransformer_1_2_ParseLiteralExpressionString_binding[0];

			Object[] result_pattern_ConstantTransformer_1_2_ParseLiteralExpressionString_black = pattern_ConstantTransformer_1_2_ParseLiteralExpressionString_blackB(
					rootNode);
			if (result_pattern_ConstantTransformer_1_2_ParseLiteralExpressionString_black != null) {

				return new Object[] { rootNode, _this, literalExpression };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstantTransformer_1_3_IsEnumLiteral_blackB(Node rootNode) {
		String rootNode_name = rootNode.getName();
		if (rootNode_name.equals("ENUMLITERAL")) {
			return new Object[] { rootNode };
		}

		return null;
	}

	public static final Object[] pattern_ConstantTransformer_1_4_IsConstant_blackB(Node rootNode) {
		String rootNode_name = rootNode.getName();
		if (rootNode_name.equals("CONSTANT")) {
			return new Object[] { rootNode };
		}

		return null;
	}

	public static final Object[] pattern_ConstantTransformer_1_5_IsNumber_blackB(Node rootNode) {
		String rootNode_name = rootNode.getName();
		if (rootNode_name.equals("NUMBER")) {
			return new Object[] { rootNode };
		}

		return null;
	}

	public static final Object[] pattern_ConstantTransformer_1_6_IsLiteral_blackB(Node rootNode) {
		String rootNode_name = rootNode.getName();
		if (rootNode_name.equals("LITERAL")) {
			return new Object[] { rootNode };
		}

		return null;
	}

	public static final Constant pattern_ConstantTransformer_1_7_expressionF() {
		Constant _result = null;
		return _result;
	}

	public static final Object[] pattern_ConstantTransformer_1_8_LookupChild_blackFB(Node rootNode) {
		for (Text tmpChild : rootNode.getChildren()) {
			if (tmpChild instanceof Node) {
				Node child = (Node) tmpChild;
				if (!child.equals(rootNode)) {
					int child_index = child.getIndex();
					if (Integer.valueOf(child_index).equals(Integer.valueOf(0))) {
						return new Object[] { child, rootNode };
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstantTransformer_1_9_LookupFactoryClass_blackFFB(EClassifier expectedType) {
		EPackage ePackage = expectedType.getEPackage();
		if (ePackage != null) {
			EFactory eFactory = ePackage.getEFactoryInstance();
			if (eFactory != null) {
				return new Object[] { ePackage, eFactory, expectedType };
			}

		}

		return null;
	}

	public static final Object[] pattern_ConstantTransformer_1_10_IsNull_blackBB(Node rootNode, Node child) {
		if (!child.equals(rootNode)) {
			String rootNode_name = rootNode.getName();
			if (rootNode_name.equals("CONSTANT")) {
				String child_name = child.getName();
				if (child_name.equals("null")) {
					return new Object[] { rootNode, child };
				}

			}

		}
		return null;
	}

	public static final Object[] pattern_ConstantTransformer_1_11_IsJavaObject_blackBB(EPackage ePackage,
			EClassifier expectedType) {
		String ePackage_name = ePackage.getName();
		if (ePackage_name.equals("ecore")) {
			String ePackage_nsURI = ePackage.getNsURI();
			if (ePackage_nsURI.equals("http://www.eclipse.org/emf/2002/Ecore")) {
				String ePackage_nsPrefix = ePackage.getNsPrefix();
				if (ePackage_nsPrefix.equals("ecore")) {
					String expectedType_name = expectedType.getName();
					if (expectedType_name.equals("EJavaObject")) {
						return new Object[] { ePackage, expectedType };
					}

				}

			}

		}

		return null;
	}

	public static final Object[] pattern_ConstantTransformer_1_12_IsEClass_bindingFB(EClassifier expectedType) {
		EClassifier tmpEClass = expectedType;
		if (tmpEClass instanceof EClass) {
			EClass eClass = (EClass) tmpEClass;
			return new Object[] { eClass, expectedType };
		}
		return null;
	}

	public static final Object[] pattern_ConstantTransformer_1_12_IsEClass_blackB(EClass eClass) {
		return new Object[] { eClass };
	}

	public static final Object[] pattern_ConstantTransformer_1_12_IsEClass_bindingAndBlackFB(EClassifier expectedType) {
		Object[] result_pattern_ConstantTransformer_1_12_IsEClass_binding = pattern_ConstantTransformer_1_12_IsEClass_bindingFB(
				expectedType);
		if (result_pattern_ConstantTransformer_1_12_IsEClass_binding != null) {
			EClass eClass = (EClass) result_pattern_ConstantTransformer_1_12_IsEClass_binding[0];

			Object[] result_pattern_ConstantTransformer_1_12_IsEClass_black = pattern_ConstantTransformer_1_12_IsEClass_blackB(
					eClass);
			if (result_pattern_ConstantTransformer_1_12_IsEClass_black != null) {

				return new Object[] { eClass, expectedType };
			}
		}
		return null;
	}

	public static final Constant pattern_ConstantTransformer_1_13_expressionF() {
		Constant _result = null;
		return _result;
	}

	public static final Object[] pattern_ConstantTransformer_1_14_CreateNullConstant_greenF() {
		Constant nullConstant = SpecificationFactory.eINSTANCE.createConstant();
		Object nullConstant_value_prime = null;
		nullConstant.setValue(nullConstant_value_prime);
		return new Object[] { nullConstant };
	}

	public static final Constant pattern_ConstantTransformer_1_15_expressionFB(Constant nullConstant) {
		Constant _result = nullConstant;
		return _result;
	}

	public static final Object[] pattern_ConstantTransformer_1_16_IsEnum_bindingFB(EClassifier expectedType) {
		EClassifier tmpEEnum = expectedType;
		if (tmpEEnum instanceof EEnum) {
			EEnum eEnum = (EEnum) tmpEEnum;
			return new Object[] { eEnum, expectedType };
		}
		return null;
	}

	public static final Object[] pattern_ConstantTransformer_1_16_IsEnum_blackB(EEnum eEnum) {
		return new Object[] { eEnum };
	}

	public static final Object[] pattern_ConstantTransformer_1_16_IsEnum_bindingAndBlackFB(EClassifier expectedType) {
		Object[] result_pattern_ConstantTransformer_1_16_IsEnum_binding = pattern_ConstantTransformer_1_16_IsEnum_bindingFB(
				expectedType);
		if (result_pattern_ConstantTransformer_1_16_IsEnum_binding != null) {
			EEnum eEnum = (EEnum) result_pattern_ConstantTransformer_1_16_IsEnum_binding[0];

			Object[] result_pattern_ConstantTransformer_1_16_IsEnum_black = pattern_ConstantTransformer_1_16_IsEnum_blackB(
					eEnum);
			if (result_pattern_ConstantTransformer_1_16_IsEnum_black != null) {

				return new Object[] { eEnum, expectedType };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstantTransformer_1_17_CanCreateEnumLiteralFromString_expressionFBBB(
			ConstantTransformer _this, EEnum eEnum, Node child) {
		String child_name = child.getName();
		boolean _localVariable_0 = _this.canCreateEnumLiteralFromString(eEnum, child_name);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;

	}

	public static final Object[] pattern_ConstantTransformer_1_18_CreateEnumConstant_greenFBB(EEnum eEnum, Node child) {
		Constant enumConstant = SpecificationFactory.eINSTANCE.createConstant();
		String child_name = child.getName();
		EEnumLiteral _localVariable_0 = eEnum.getEEnumLiteralByLiteral(child_name);
		Object enumConstant_value_prime = _localVariable_0;
		enumConstant.setValue(enumConstant_value_prime);
		return new Object[] { enumConstant, eEnum, child };

	}

	public static final Constant pattern_ConstantTransformer_1_19_expressionFB(Constant enumConstant) {
		Constant _result = enumConstant;
		return _result;
	}

	public static final Constant pattern_ConstantTransformer_1_20_expressionF() {
		Constant _result = null;
		return _result;
	}

	public static final Object[] pattern_ConstantTransformer_1_21_IsDataType_bindingFB(EClassifier expectedType) {
		EClassifier tmpEDataType = expectedType;
		if (tmpEDataType instanceof EDataType) {
			EDataType eDataType = (EDataType) tmpEDataType;
			return new Object[] { eDataType, expectedType };
		}
		return null;
	}

	public static final Object[] pattern_ConstantTransformer_1_21_IsDataType_blackB(EDataType eDataType) {
		return new Object[] { eDataType };
	}

	public static final Object[] pattern_ConstantTransformer_1_21_IsDataType_bindingAndBlackFB(
			EClassifier expectedType) {
		Object[] result_pattern_ConstantTransformer_1_21_IsDataType_binding = pattern_ConstantTransformer_1_21_IsDataType_bindingFB(
				expectedType);
		if (result_pattern_ConstantTransformer_1_21_IsDataType_binding != null) {
			EDataType eDataType = (EDataType) result_pattern_ConstantTransformer_1_21_IsDataType_binding[0];

			Object[] result_pattern_ConstantTransformer_1_21_IsDataType_black = pattern_ConstantTransformer_1_21_IsDataType_blackB(
					eDataType);
			if (result_pattern_ConstantTransformer_1_21_IsDataType_black != null) {

				return new Object[] { eDataType, expectedType };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstantTransformer_1_22_CanCreateDataTypeFromString_expressionFBBBB(
			ConstantTransformer _this, EFactory eFactory, EDataType eDataType, Node child) {
		String child_name = child.getName();
		boolean _localVariable_0 = _this.canCreateDataTypeFromString(eFactory, eDataType, child_name);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;

	}

	public static final Object[] pattern_ConstantTransformer_1_23_CreateConstant_greenFBBB(EFactory eFactory,
			EDataType eDataType, Node child) {
		Constant constant = SpecificationFactory.eINSTANCE.createConstant();
		String child_name = child.getName();
		Object _localVariable_0 = eFactory.createFromString(eDataType, child_name);
		Object constant_value_prime = (Object) _localVariable_0;
		constant.setValue(constant_value_prime);
		return new Object[] { constant, eFactory, eDataType, child };

	}

	public static final Constant pattern_ConstantTransformer_1_24_expressionFB(Constant constant) {
		Constant _result = constant;
		return _result;
	}

	public static final Constant pattern_ConstantTransformer_1_25_expressionF() {
		Constant _result = null;
		return _result;
	}

	public static final Constant pattern_ConstantTransformer_1_26_expressionF() {
		Constant _result = null;
		return _result;
	}

	public static final Constant pattern_ConstantTransformer_1_27_expressionF() {
		Constant _result = null;
		return _result;
	}

	public static final Constant pattern_ConstantTransformer_1_28_expressionF() {
		Constant _result = null;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	private static final Logger logger = Logger.getLogger(ConstantTransformerImpl.class);

	// [user code injected with eMoflon] -->
} //ConstantTransformerImpl
