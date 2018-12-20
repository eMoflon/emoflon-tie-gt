/**
 */
package SDMLanguage.patterns.AttributeConstraints;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Csp Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.CspConstraint#getParameters <em>Parameters</em>}</li>
 *   <li>{@link SDMLanguage.patterns.AttributeConstraints.CspConstraint#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage#getCspConstraint()
 * @model
 * @generated
 */
public interface CspConstraint extends AttributeConstraint {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link SDMLanguage.patterns.AttributeConstraints.CspConstraintVariableReference}.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.patterns.AttributeConstraints.CspConstraintVariableReference#getCspConstraint <em>Csp Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage#getCspConstraint_Parameters()
	 * @see SDMLanguage.patterns.AttributeConstraints.CspConstraintVariableReference#getCspConstraint
	 * @model opposite="cspConstraint" containment="true"
	 * @generated
	 */
	EList<CspConstraintVariableReference> getParameters();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SDMLanguage.patterns.AttributeConstraints.AttributeConstraintsPackage#getCspConstraint_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.AttributeConstraints.CspConstraint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // CspConstraint
