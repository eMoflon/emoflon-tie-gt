/**
 */
package SDMLanguage.patterns;

import SDMLanguage.NamedElement;
import SDMLanguage.TypedElement;

import SDMLanguage.expressions.Expression;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.patterns.ObjectVariable#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link SDMLanguage.patterns.ObjectVariable#getBindingExpression <em>Binding Expression</em>}</li>
 *   <li>{@link SDMLanguage.patterns.ObjectVariable#getPattern <em>Pattern</em>}</li>
 *   <li>{@link SDMLanguage.patterns.ObjectVariable#getIncomingLink <em>Incoming Link</em>}</li>
 *   <li>{@link SDMLanguage.patterns.ObjectVariable#getOutgoingLink <em>Outgoing Link</em>}</li>
 *   <li>{@link SDMLanguage.patterns.ObjectVariable#getAttributeAssignment <em>Attribute Assignment</em>}</li>
 *   <li>{@link SDMLanguage.patterns.ObjectVariable#getBindingOperator <em>Binding Operator</em>}</li>
 *   <li>{@link SDMLanguage.patterns.ObjectVariable#getBindingSemantics <em>Binding Semantics</em>}</li>
 *   <li>{@link SDMLanguage.patterns.ObjectVariable#getBindingState <em>Binding State</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.patterns.PatternsPackage#getObjectVariable()
 * @model
 * @generated
 */
public interface ObjectVariable extends TypedElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link SDMLanguage.patterns.Constraint}.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.patterns.Constraint#getObjectVariable <em>Object Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see SDMLanguage.patterns.PatternsPackage#getObjectVariable_Constraint()
	 * @see SDMLanguage.patterns.Constraint#getObjectVariable
	 * @model opposite="objectVariable" containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Binding Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Expression</em>' containment reference.
	 * @see #setBindingExpression(Expression)
	 * @see SDMLanguage.patterns.PatternsPackage#getObjectVariable_BindingExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getBindingExpression();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.ObjectVariable#getBindingExpression <em>Binding Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Expression</em>' containment reference.
	 * @see #getBindingExpression()
	 * @generated
	 */
	void setBindingExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.patterns.StoryPattern#getObjectVariable <em>Object Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' container reference.
	 * @see #setPattern(StoryPattern)
	 * @see SDMLanguage.patterns.PatternsPackage#getObjectVariable_Pattern()
	 * @see SDMLanguage.patterns.StoryPattern#getObjectVariable
	 * @model opposite="objectVariable" required="true" transient="false"
	 * @generated
	 */
	StoryPattern getPattern();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.ObjectVariable#getPattern <em>Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' container reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(StoryPattern value);

	/**
	 * Returns the value of the '<em><b>Incoming Link</b></em>' reference list.
	 * The list contents are of type {@link SDMLanguage.patterns.LinkVariable}.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.patterns.LinkVariable#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Link</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Link</em>' reference list.
	 * @see SDMLanguage.patterns.PatternsPackage#getObjectVariable_IncomingLink()
	 * @see SDMLanguage.patterns.LinkVariable#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<LinkVariable> getIncomingLink();

	/**
	 * Returns the value of the '<em><b>Outgoing Link</b></em>' reference list.
	 * The list contents are of type {@link SDMLanguage.patterns.LinkVariable}.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.patterns.LinkVariable#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Link</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Link</em>' reference list.
	 * @see SDMLanguage.patterns.PatternsPackage#getObjectVariable_OutgoingLink()
	 * @see SDMLanguage.patterns.LinkVariable#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<LinkVariable> getOutgoingLink();

	/**
	 * Returns the value of the '<em><b>Attribute Assignment</b></em>' containment reference list.
	 * The list contents are of type {@link SDMLanguage.patterns.AttributeAssignment}.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.patterns.AttributeAssignment#getObjectVariable <em>Object Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Assignment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Assignment</em>' containment reference list.
	 * @see SDMLanguage.patterns.PatternsPackage#getObjectVariable_AttributeAssignment()
	 * @see SDMLanguage.patterns.AttributeAssignment#getObjectVariable
	 * @model opposite="objectVariable" containment="true"
	 * @generated
	 */
	EList<AttributeAssignment> getAttributeAssignment();

	/**
	 * Returns the value of the '<em><b>Binding Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link SDMLanguage.patterns.BindingOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Operator</em>' attribute.
	 * @see SDMLanguage.patterns.BindingOperator
	 * @see #setBindingOperator(BindingOperator)
	 * @see SDMLanguage.patterns.PatternsPackage#getObjectVariable_BindingOperator()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BindingOperator getBindingOperator();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.ObjectVariable#getBindingOperator <em>Binding Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Operator</em>' attribute.
	 * @see SDMLanguage.patterns.BindingOperator
	 * @see #getBindingOperator()
	 * @generated
	 */
	void setBindingOperator(BindingOperator value);

	/**
	 * Returns the value of the '<em><b>Binding Semantics</b></em>' attribute.
	 * The literals are from the enumeration {@link SDMLanguage.patterns.BindingSemantics}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding Semantics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding Semantics</em>' attribute.
	 * @see SDMLanguage.patterns.BindingSemantics
	 * @see #setBindingSemantics(BindingSemantics)
	 * @see SDMLanguage.patterns.PatternsPackage#getObjectVariable_BindingSemantics()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BindingSemantics getBindingSemantics();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.ObjectVariable#getBindingSemantics <em>Binding Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Semantics</em>' attribute.
	 * @see SDMLanguage.patterns.BindingSemantics
	 * @see #getBindingSemantics()
	 * @generated
	 */
	void setBindingSemantics(BindingSemantics value);

	/**
	 * Returns the value of the '<em><b>Binding State</b></em>' attribute.
	 * The literals are from the enumeration {@link SDMLanguage.patterns.BindingState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding State</em>' attribute.
	 * @see SDMLanguage.patterns.BindingState
	 * @see #setBindingState(BindingState)
	 * @see SDMLanguage.patterns.PatternsPackage#getObjectVariable_BindingState()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BindingState getBindingState();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.ObjectVariable#getBindingState <em>Binding State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding State</em>' attribute.
	 * @see SDMLanguage.patterns.BindingState
	 * @see #getBindingState()
	 * @generated
	 */
	void setBindingState(BindingState value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ObjectVariable
