/**
 */
package SDMLanguage.patterns;

import SDMLanguage.NamedElement;

import org.eclipse.emf.ecore.EReference;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.patterns.LinkVariable#getTarget <em>Target</em>}</li>
 *   <li>{@link SDMLanguage.patterns.LinkVariable#getSource <em>Source</em>}</li>
 *   <li>{@link SDMLanguage.patterns.LinkVariable#getPattern <em>Pattern</em>}</li>
 *   <li>{@link SDMLanguage.patterns.LinkVariable#getType <em>Type</em>}</li>
 *   <li>{@link SDMLanguage.patterns.LinkVariable#getBindingOperator <em>Binding Operator</em>}</li>
 *   <li>{@link SDMLanguage.patterns.LinkVariable#getBindingSemantics <em>Binding Semantics</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.patterns.PatternsPackage#getLinkVariable()
 * @model
 * @generated
 */
public interface LinkVariable extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.patterns.ObjectVariable#getIncomingLink <em>Incoming Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ObjectVariable)
	 * @see SDMLanguage.patterns.PatternsPackage#getLinkVariable_Target()
	 * @see SDMLanguage.patterns.ObjectVariable#getIncomingLink
	 * @model opposite="incomingLink" required="true"
	 * @generated
	 */
	ObjectVariable getTarget();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.LinkVariable#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ObjectVariable value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.patterns.ObjectVariable#getOutgoingLink <em>Outgoing Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ObjectVariable)
	 * @see SDMLanguage.patterns.PatternsPackage#getLinkVariable_Source()
	 * @see SDMLanguage.patterns.ObjectVariable#getOutgoingLink
	 * @model opposite="outgoingLink" required="true"
	 * @generated
	 */
	ObjectVariable getSource();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.LinkVariable#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ObjectVariable value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SDMLanguage.patterns.StoryPattern#getLinkVariable <em>Link Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' container reference.
	 * @see #setPattern(StoryPattern)
	 * @see SDMLanguage.patterns.PatternsPackage#getLinkVariable_Pattern()
	 * @see SDMLanguage.patterns.StoryPattern#getLinkVariable
	 * @model opposite="linkVariable" required="true" transient="false"
	 * @generated
	 */
	StoryPattern getPattern();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.LinkVariable#getPattern <em>Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' container reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(StoryPattern value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EReference)
	 * @see SDMLanguage.patterns.PatternsPackage#getLinkVariable_Type()
	 * @model
	 * @generated
	 */
	EReference getType();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.LinkVariable#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EReference value);

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
	 * @see SDMLanguage.patterns.PatternsPackage#getLinkVariable_BindingOperator()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BindingOperator getBindingOperator();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.LinkVariable#getBindingOperator <em>Binding Operator</em>}' attribute.
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
	 * @see SDMLanguage.patterns.PatternsPackage#getLinkVariable_BindingSemantics()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BindingSemantics getBindingSemantics();

	/**
	 * Sets the value of the '{@link SDMLanguage.patterns.LinkVariable#getBindingSemantics <em>Binding Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding Semantics</em>' attribute.
	 * @see SDMLanguage.patterns.BindingSemantics
	 * @see #getBindingSemantics()
	 * @generated
	 */
	void setBindingSemantics(BindingSemantics value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // LinkVariable
