/**
 */
package org.moflon.core.moca.processing.unparser;

import MocaTree.Node;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Unparser</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.moflon.core.moca.processing.unparser.UnparserPackage#getXMLUnparser()
 * @model abstract="true"
 * @generated
 */
public interface XMLUnparser extends TemplateUnparser {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String unparse(Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean canUnparseFile(String fileName);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // XMLUnparser
