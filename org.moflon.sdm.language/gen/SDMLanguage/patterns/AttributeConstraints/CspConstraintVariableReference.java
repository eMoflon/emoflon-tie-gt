/**
 */
package SDMLanguage.patterns.AttributeConstraints;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Csp Constraint Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.CspConstraintVariableReference#getCspConstraint <em>Csp Constraint</em>}</li>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.CspConstraintVariableReference#getAttributeConstraintVariable <em>Attribute Constraint Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage#getCspConstraintVariableReference()
 * @model
 * @generated
 */
public interface CspConstraintVariableReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Csp Constraint</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.patterns.AttributeConstraints.CspConstraint#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csp Constraint</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csp Constraint</em>' container reference.
	 * @see #setCspConstraint(CspConstraint)
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage#getCspConstraintVariableReference_CspConstraint()
	 * @see SDMLanguage.patterns.AttributeConstraints.CspConstraint#getParameters
	 * @model opposite="parameters" transient="false"
	 * @generated
	 */
	CspConstraint getCspConstraint();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.AttributeConstraints.CspConstraintVariableReference#getCspConstraint <em>Csp Constraint</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Csp Constraint</em>' container reference.
	 * @see #getCspConstraint()
	 * @generated
	 */
	void setCspConstraint(CspConstraint value);

	/**
	 * Returns the value of the '<em><b>Attribute Constraint Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Constraint Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Constraint Variable</em>' reference.
	 * @see #setAttributeConstraintVariable(AttributeConstraintVariable)
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage#getCspConstraintVariableReference_AttributeConstraintVariable()
	 * @model
	 * @generated
	 */
	AttributeConstraintVariable getAttributeConstraintVariable();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.AttributeConstraints.CspConstraintVariableReference#getAttributeConstraintVariable <em>Attribute Constraint Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Constraint Variable</em>' reference.
	 * @see #getAttributeConstraintVariable()
	 * @generated
	 */
	void setAttributeConstraintVariable(AttributeConstraintVariable value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // CspConstraintVariableReference
