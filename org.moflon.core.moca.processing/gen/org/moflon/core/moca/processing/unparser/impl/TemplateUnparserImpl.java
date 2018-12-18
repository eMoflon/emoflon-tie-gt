/**
 */
package org.moflon.core.moca.processing.unparser.impl;

import MocaTree.Node;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.moflon.core.moca.processing.unparser.TemplateUnparser;
import org.moflon.core.moca.processing.unparser.UnparserPackage;
// <-- [user defined imports]
import org.eclipse.emf.ecore.EObject;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.log4j.Logger;
import org.moflon.core.utilities.LogUtils;
import org.moflon.moca.MocaUtil;
import org.moflon.moca.xml.XMLHandler;
import org.moflon.moca.xml.XMLTreeGrammar;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.antlr.runtime.RecognitionException;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Unparser</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class TemplateUnparserImpl extends UnparserImpl implements TemplateUnparser {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateUnparserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnparserPackage.Literals.TEMPLATE_UNPARSER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String unparse(Node node) {
		// [user code injected with eMoflon]

		try {
			// Create Tree
			CommonTree tree = MocaUtil.mocaTreeToCommonTree(node, getTokenNames(), applySortingBeforeUnparsing());

			// Load templates
			StringTemplateGroup stGroup = getStringTemplateGroup();

			// Create and return result
			return callMainRule(new CommonTreeNodeStream(tree), stGroup);
		} catch (Exception e) {
			LogUtils.error(logger, e, "Unable to unparse " + node + ": " + e);
		}

		return null;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canUnparseFile(String fileName) {
		// [user code injected with eMoflon]

		throw new UnsupportedOperationException();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case UnparserPackage.TEMPLATE_UNPARSER___UNPARSE__NODE:
			return unparse((Node) arguments.get(0));
		case UnparserPackage.TEMPLATE_UNPARSER___CAN_UNPARSE_FILE__STRING:
			return canUnparseFile((String) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	private static final Logger logger = Logger.getLogger(TemplateUnparserImpl.class);

	protected abstract String[] getTokenNames();

	protected abstract StringTemplateGroup getStringTemplateGroup() throws FileNotFoundException;

	protected abstract String callMainRule(CommonTreeNodeStream tree, StringTemplateGroup stGroup)
			throws RecognitionException;

	/**
	* Override to control if the tree is to be sorted before unparsing or not
	* 
	* @return
	*/
	protected boolean applySortingBeforeUnparsing() {
		return true;
	}

	// [user code injected with eMoflon] -->
} //TemplateUnparserImpl
