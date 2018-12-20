/**
 */
package SDMLanguage.patterns.patternExpressions.impl;

import SDMLanguage.patterns.patternExpressions.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternExpressionsFactoryImpl extends EFactoryImpl implements PatternExpressionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PatternExpressionsFactory init() {
		try {
			PatternExpressionsFactory thePatternExpressionsFactory = (PatternExpressionsFactory) EPackage.Registry.INSTANCE
					.getEFactory(PatternExpressionsPackage.eNS_URI);
			if (thePatternExpressionsFactory != null) {
				return thePatternExpressionsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PatternExpressionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternExpressionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PatternExpressionsPackage.ATTRIBUTE_VALUE_EXPRESSION:
			return createAttributeValueExpression();
		case PatternExpressionsPackage.OBJECT_VARIABLE_EXPRESSION:
			return createObjectVariableExpression();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueExpression createAttributeValueExpression() {
		AttributeValueExpressionImpl attributeValueExpression = new AttributeValueExpressionImpl();
		return attributeValueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectVariableExpression createObjectVariableExpression() {
		ObjectVariableExpressionImpl objectVariableExpression = new ObjectVariableExpressionImpl();
		return objectVariableExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternExpressionsPackage getPatternExpressionsPackage() {
		return (PatternExpressionsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PatternExpressionsPackage getPackage() {
		return PatternExpressionsPackage.eINSTANCE;
	}

} //PatternExpressionsFactoryImpl
