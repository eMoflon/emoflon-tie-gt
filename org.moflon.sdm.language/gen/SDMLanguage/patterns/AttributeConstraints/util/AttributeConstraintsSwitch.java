/**
 */
package SDMLanguage.patterns.AttributeConstraints.util;

import SDMLanguage.CommentableElement;

import SDMLanguage.expressions.Expression;

import SDMLanguage.patterns.AttributeConstraints.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage
 * @generated
 */
public class AttributeConstraintsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AttributeConstraintsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsSwitch() {
		if (modelPackage == null) {
			modelPackage = AttributeConstraintsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case AttributeConstraintsPackage.ASSIGNMENT_CONSTRAINT: {
			AssignmentConstraint assignmentConstraint = (AssignmentConstraint) theEObject;
			T result = caseAssignmentConstraint(assignmentConstraint);
			if (result == null)
				result = caseAttributeValueConstraint(assignmentConstraint);
			if (result == null)
				result = caseAttributeConstraint(assignmentConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT: {
			AttributeConstraint attributeConstraint = (AttributeConstraint) theEObject;
			T result = caseAttributeConstraint(attributeConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_EXPRESSION: {
			AttributeConstraintExpression attributeConstraintExpression = (AttributeConstraintExpression) theEObject;
			T result = caseAttributeConstraintExpression(attributeConstraintExpression);
			if (result == null)
				result = caseExpression(attributeConstraintExpression);
			if (result == null)
				result = caseCommentableElement(attributeConstraintExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributeConstraintsPackage.ATTRIBUTE_CONSTRAINT_VARIABLE: {
			AttributeConstraintVariable attributeConstraintVariable = (AttributeConstraintVariable) theEObject;
			T result = caseAttributeConstraintVariable(attributeConstraintVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributeConstraintsPackage.ATTRIBUTE_LOOKUP_CONSTRAINT: {
			AttributeLookupConstraint attributeLookupConstraint = (AttributeLookupConstraint) theEObject;
			T result = caseAttributeLookupConstraint(attributeLookupConstraint);
			if (result == null)
				result = caseAttributeValueConstraint(attributeLookupConstraint);
			if (result == null)
				result = caseAttributeConstraint(attributeLookupConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributeConstraintsPackage.ATTRIBUTE_VALUE_CONSTRAINT: {
			AttributeValueConstraint attributeValueConstraint = (AttributeValueConstraint) theEObject;
			T result = caseAttributeValueConstraint(attributeValueConstraint);
			if (result == null)
				result = caseAttributeConstraint(attributeValueConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributeConstraintsPackage.CSP_CONSTRAINT: {
			CspConstraint cspConstraint = (CspConstraint) theEObject;
			T result = caseCspConstraint(cspConstraint);
			if (result == null)
				result = caseAttributeConstraint(cspConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributeConstraintsPackage.LITERAL_VARIABLE: {
			LiteralVariable literalVariable = (LiteralVariable) theEObject;
			T result = caseLiteralVariable(literalVariable);
			if (result == null)
				result = caseAttributeConstraintVariable(literalVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributeConstraintsPackage.PRIMITIVE_VARIABLE: {
			PrimitiveVariable primitiveVariable = (PrimitiveVariable) theEObject;
			T result = casePrimitiveVariable(primitiveVariable);
			if (result == null)
				result = caseAttributeConstraintVariable(primitiveVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AttributeConstraintsPackage.CSP_CONSTRAINT_VARIABLE_REFERENCE: {
			CspConstraintVariableReference cspConstraintVariableReference = (CspConstraintVariableReference) theEObject;
			T result = caseCspConstraintVariableReference(cspConstraintVariableReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignmentConstraint(AssignmentConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeConstraint(AttributeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Constraint Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Constraint Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeConstraintExpression(AttributeConstraintExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Constraint Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Constraint Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeConstraintVariable(AttributeConstraintVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Lookup Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Lookup Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeLookupConstraint(AttributeLookupConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValueConstraint(AttributeValueConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Csp Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Csp Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCspConstraint(CspConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralVariable(LiteralVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveVariable(PrimitiveVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Csp Constraint Variable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Csp Constraint Variable Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCspConstraintVariableReference(CspConstraintVariableReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commentable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentableElement(CommentableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AttributeConstraintsSwitch
