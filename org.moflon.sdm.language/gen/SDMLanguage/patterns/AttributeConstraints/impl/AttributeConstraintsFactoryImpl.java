/**
 */
package SDMLanguage.patterns.AttributeConstraints.impl;

import SDMLanguage.patterns.AttributeConstraints.*;

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
public class AttributeConstraintsFactoryImpl extends EFactoryImpl implements AttributeConstraintsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AttributeConstraintsFactory init() {
		try {
			AttributeConstraintsFactory theAttributeConstraintsFactory = (AttributeConstraintsFactory) EPackage.Registry.INSTANCE
					.getEFactory(AttributeConstraintsPackage.eNS_URI);
			if (theAttributeConstraintsFactory != null) {
				return theAttributeConstraintsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AttributeConstraintsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsFactoryImpl() {
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
		case AttributeConstraintsPackage.ASSIGNMENT_CONSTRAINT:
			return createAssignmentConstraint();
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT:
			return createAttributeConstraint();
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_EXPRESSION:
			return createAttributeConstraintExpression();
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE:
			return createAttributeConstraintVariable();
		case AttributeConstraintsPackage.ATTRIBUTE_LOOKUP_CONSTRAINT:
			return createAttributeLookupConstraint();
		case AttributeConstraintsPackage.ATTRIBUTE_VALUE_CONSTRAINT:
			return createAttributeValueConstraint();
		case AttributeConstraintsPackage.CSP_CONSTRAINT:
			return createCspConstraint();
		case AttributeConstraintsPackage.LITERAL_VARIABLE:
			return createLiteralVariable();
		case AttributeConstraintsPackage.PRIMITIVE_VARIABLE:
			return createPrimitiveVariable();
		case AttributeConstraintsPackage.CSP_CONSTRAINT_VARIABLE_REFERENCE:
			return createCspConstraintVariableReference();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentConstraint createAssignmentConstraint() {
		AssignmentConstraintImpl assignmentConstraint = new AssignmentConstraintImpl();
		return assignmentConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraint createAttributeConstraint() {
		AttributeConstraintImpl attributeConstraint = new AttributeConstraintImpl();
		return attributeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintExpression createAttributeConstraintExpression() {
		AttributeConstraintExpressionImpl attributeConstraintExpression = new AttributeConstraintExpressionImpl();
		return attributeConstraintExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintVariable createAttributeConstraintVariable() {
		AttributeConstraintVariableImpl attributeConstraintVariable = new AttributeConstraintVariableImpl();
		return attributeConstraintVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeLookupConstraint createAttributeLookupConstraint() {
		AttributeLookupConstraintImpl attributeLookupConstraint = new AttributeLookupConstraintImpl();
		return attributeLookupConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueConstraint createAttributeValueConstraint() {
		AttributeValueConstraintImpl attributeValueConstraint = new AttributeValueConstraintImpl();
		return attributeValueConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CspConstraint createCspConstraint() {
		CspConstraintImpl cspConstraint = new CspConstraintImpl();
		return cspConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralVariable createLiteralVariable() {
		LiteralVariableImpl literalVariable = new LiteralVariableImpl();
		return literalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveVariable createPrimitiveVariable() {
		PrimitiveVariableImpl primitiveVariable = new PrimitiveVariableImpl();
		return primitiveVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CspConstraintVariableReference createCspConstraintVariableReference() {
		CspConstraintVariableReferenceImpl cspConstraintVariableReference = new CspConstraintVariableReferenceImpl();
		return cspConstraintVariableReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsPackage getAttributeConstraintsPackage() {
		return (AttributeConstraintsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AttributeConstraintsPackage getPackage() {
		return AttributeConstraintsPackage.eINSTANCE;
	}

} //AttributeConstraintsFactoryImpl
