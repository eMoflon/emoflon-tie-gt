/**
 */
package org.moflon.sdm.runtime.democles;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>CF
 * Node</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.moflon.sdm.runtime.democles.CFNode#getScope
 * <em>Scope</em>}</li>
 * <li>{@link org.moflon.sdm.runtime.democles.CFNode#getMainAction <em>Main
 * Action</em>}</li>
 * <li>{@link org.moflon.sdm.runtime.democles.CFNode#getActions
 * <em>Actions</em>}</li>
 * <li>{@link org.moflon.sdm.runtime.democles.CFNode#getNext <em>Next</em>}</li>
 * <li>{@link org.moflon.sdm.runtime.democles.CFNode#getPrev <em>Prev</em>}</li>
 * <li>{@link org.moflon.sdm.runtime.democles.CFNode#getHeader
 * <em>Header</em>}</li>
 * <li>{@link org.moflon.sdm.runtime.democles.CFNode#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getCFNode()
 * @model
 * @generated
 */
public interface CFNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' container reference. It is
	 * bidirectional and its opposite is
	 * '{@link org.moflon.sdm.runtime.democles.Scope#getContents
	 * <em>Contents</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' container reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Scope</em>' container reference.
	 * @see #setScope(Scope)
	 * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getCFNode_Scope()
	 * @see org.moflon.sdm.runtime.democles.Scope#getContents
	 * @model opposite="contents" required="true" transient="false"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link org.moflon.sdm.runtime.democles.CFNode#getScope
	 * <em>Scope</em>}' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Scope</em>' container reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

	/**
	 * Returns the value of the '<em><b>Main Action</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Action</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Main Action</em>' reference.
	 * @see #setMainAction(Action)
	 * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getCFNode_MainAction()
	 * @model
	 * @generated
	 */
	Action getMainAction();

	/**
	 * Sets the value of the
	 * '{@link org.moflon.sdm.runtime.democles.CFNode#getMainAction <em>Main
	 * Action</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Main Action</em>' reference.
	 * @see #getMainAction()
	 * @generated
	 */
	void setMainAction(Action value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.moflon.sdm.runtime.democles.Action}. It is bidirectional and its
	 * opposite is '{@link org.moflon.sdm.runtime.democles.Action#getCfNode <em>Cf
	 * Node</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getCFNode_Actions()
	 * @see org.moflon.sdm.runtime.democles.Action#getCfNode
	 * @model opposite="cfNode" containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference. It is
	 * bidirectional and its opposite is
	 * '{@link org.moflon.sdm.runtime.democles.CFNode#getPrev <em>Prev</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(CFNode)
	 * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getCFNode_Next()
	 * @see org.moflon.sdm.runtime.democles.CFNode#getPrev
	 * @model opposite="prev"
	 * @generated
	 */
	CFNode getNext();

	/**
	 * Sets the value of the '{@link org.moflon.sdm.runtime.democles.CFNode#getNext
	 * <em>Next</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(CFNode value);

	/**
	 * Returns the value of the '<em><b>Prev</b></em>' reference. It is
	 * bidirectional and its opposite is
	 * '{@link org.moflon.sdm.runtime.democles.CFNode#getNext <em>Next</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prev</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Prev</em>' reference.
	 * @see #setPrev(CFNode)
	 * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getCFNode_Prev()
	 * @see org.moflon.sdm.runtime.democles.CFNode#getNext
	 * @model opposite="next"
	 * @generated
	 */
	CFNode getPrev();

	/**
	 * Sets the value of the '{@link org.moflon.sdm.runtime.democles.CFNode#getPrev
	 * <em>Prev</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Prev</em>' reference.
	 * @see #getPrev()
	 * @generated
	 */
	void setPrev(CFNode value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' reference. It is
	 * bidirectional and its opposite is
	 * '{@link org.moflon.sdm.runtime.democles.RepetitionNode#getLastNodes <em>Last
	 * Nodes</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Header</em>' reference.
	 * @see #setHeader(RepetitionNode)
	 * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getCFNode_Header()
	 * @see org.moflon.sdm.runtime.democles.RepetitionNode#getLastNodes
	 * @model opposite="lastNodes"
	 * @generated
	 */
	RepetitionNode getHeader();

	/**
	 * Sets the value of the
	 * '{@link org.moflon.sdm.runtime.democles.CFNode#getHeader <em>Header</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Header</em>' reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(RepetitionNode value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see org.moflon.sdm.runtime.democles.DemoclesPackage#getCFNode_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link org.moflon.sdm.runtime.democles.CFNode#getId
	 * <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated
	 */
	void accept(Visitor visitor);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	Scope getRelevantScope();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // CFNode
