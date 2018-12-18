/**
 */
package org.moflon.core.moca.processing.unparser.impl;

import MocaTree.Node;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.moflon.core.moca.processing.unparser.UnparserPackage;
import org.moflon.core.moca.processing.unparser.XMLUnparser;
// <-- [user defined imports]
import org.moflon.moca.xml.XMLTreeGrammar;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplateGroup;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Unparser</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class XMLUnparserImpl extends TemplateUnparserImpl implements XMLUnparser {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLUnparserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnparserPackage.Literals.XML_UNPARSER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String unparse(Node node) {
		// [user code injected with eMoflon]

		return super.unparse(node);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canUnparseFile(String fileName) {
		// [user code injected with eMoflon]

		return fileName.endsWith(".xml") || fileName.endsWith(".xmi");

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case UnparserPackage.XML_UNPARSER___UNPARSE__NODE:
			return unparse((Node) arguments.get(0));
		case UnparserPackage.XML_UNPARSER___CAN_UNPARSE_FILE__STRING:
			return canUnparseFile((String) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	@Override
	protected String[] getTokenNames() {
		return XMLTreeGrammar.tokenNames;
	}

	@Override
	protected String callMainRule(CommonTreeNodeStream treeNodeStream, StringTemplateGroup stGroup)
			throws RecognitionException {
		XMLTreeGrammar treeParser = new XMLTreeGrammar(treeNodeStream);
		treeParser.setTemplateLib(stGroup);

		return treeParser.prog().st.toString().replaceAll("&(?!amp;)", "&amp;");
	}

	// [user code injected with eMoflon] -->
} //XMLUnparserImpl
