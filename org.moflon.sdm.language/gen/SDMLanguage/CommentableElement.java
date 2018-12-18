/**
 */
package SDMLanguage;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commentable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SDMLanguage.CommentableElement#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see SDMLanguage.SDMLanguagePackage#getCommentableElement()
 * @model abstract="true"
 * @generated
 */
public interface CommentableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * The default value is <code>"\"\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see SDMLanguage.SDMLanguagePackage#getCommentableElement_Comment()
	 * @model default="\"\"" required="true" ordered="false"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link SDMLanguage.CommentableElement#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // CommentableElement
