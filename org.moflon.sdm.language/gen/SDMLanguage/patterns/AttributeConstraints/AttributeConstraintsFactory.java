/**
 */
package SDMLanguage.patterns.AttributeConstraints;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage
 * @generated
 */
public interface AttributeConstraintsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AttributeConstraintsFactory eINSTANCE = SDMLanguage.patterns.AttributeConstraints.impl.AttributeConstraintsFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Assignment Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Constraint</em>'.
	 * @generated
	 */
	AssignmentConstraint createAssignmentConstraint();

	/**
	 * Returns a new object of class '<em>Attribute Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Constraint</em>'.
	 * @generated
	 */
	AttributeConstraint createAttributeConstraint();

	/**
	 * Returns a new object of class '<em>Attribute Constraint Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Constraint Expression</em>'.
	 * @generated
	 */
	AttributeConstraintExpression createAttributeConstraintExpression();

	/**
	 * Returns a new object of class '<em>Attribute Constraint Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Constraint Variable</em>'.
	 * @generated
	 */
	AttributeConstraintVariable createAttributeConstraintVariable();

	/**
	 * Returns a new object of class '<em>Attribute Lookup Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Lookup Constraint</em>'.
	 * @generated
	 */
	AttributeLookupConstraint createAttributeLookupConstraint();

	/**
	 * Returns a new object of class '<em>Attribute Value Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Constraint</em>'.
	 * @generated
	 */
	AttributeValueConstraint createAttributeValueConstraint();

	/**
	 * Returns a new object of class '<em>Csp Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Csp Constraint</em>'.
	 * @generated
	 */
	CspConstraint createCspConstraint();

	/**
	 * Returns a new object of class '<em>Literal Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Variable</em>'.
	 * @generated
	 */
	LiteralVariable createLiteralVariable();

	/**
	 * Returns a new object of class '<em>Primitive Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Variable</em>'.
	 * @generated
	 */
	PrimitiveVariable createPrimitiveVariable();

	/**
	 * Returns a new object of class '<em>Csp Constraint Variable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Csp Constraint Variable Reference</em>'.
	 * @generated
	 */
	CspConstraintVariableReference createCspConstraintVariableReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AttributeConstraintsPackage getAttributeConstraintsPackage();

} //AttributeConstraintsFactory
