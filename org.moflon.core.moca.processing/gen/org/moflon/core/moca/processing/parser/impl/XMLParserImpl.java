/**
 */
package org.moflon.core.moca.processing.parser.impl;

import MocaTree.Node;

import java.io.Reader;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.moflon.core.moca.processing.parser.ParserPackage;
import org.moflon.core.moca.processing.parser.XMLParser;
// <-- [user defined imports]
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
import org.apache.log4j.Logger;
import org.moflon.core.utilities.LogUtils;
import org.moflon.moca.xml.XMLHandler;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Parser</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.core.moca.processing.parser.impl.XMLParserImpl#isIgnoreWhitespaces <em>Ignore Whitespaces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XMLParserImpl extends ParserImpl implements XMLParser {
	/**
	 * The default value of the '{@link #isIgnoreWhitespaces() <em>Ignore Whitespaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreWhitespaces()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_WHITESPACES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIgnoreWhitespaces() <em>Ignore Whitespaces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreWhitespaces()
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreWhitespaces = IGNORE_WHITESPACES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLParserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParserPackage.Literals.XML_PARSER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIgnoreWhitespaces() {
		return ignoreWhitespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreWhitespaces(boolean newIgnoreWhitespaces) {
		boolean oldIgnoreWhitespaces = ignoreWhitespaces;
		ignoreWhitespaces = newIgnoreWhitespaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserPackage.XML_PARSER__IGNORE_WHITESPACES,
					oldIgnoreWhitespaces, ignoreWhitespaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canParseFile(String fileName) {
		// [user code injected with eMoflon]

		return fileName.endsWith(".xml") || fileName.endsWith(".xmi");

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node parse(Reader reader) {
		// [user code injected with eMoflon]

		try {
			// Create XML reader, uses XMLHandler to build MocaTree
			XMLReader xmlReader = XMLReaderFactory.createXMLReader();
			XMLHandler handler = new XMLHandler();
			handler.setIgnoreWhitespaces(isIgnoreWhitespaces());
			xmlReader.setContentHandler(handler);
			xmlReader.parse(new InputSource(reader));
			return handler.getRoot();
		} catch (Exception e) {
			LogUtils.error(logger, e, "Unable to parse xml file: " + e);
		}

		return null;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ParserPackage.XML_PARSER__IGNORE_WHITESPACES:
			return isIgnoreWhitespaces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ParserPackage.XML_PARSER__IGNORE_WHITESPACES:
			setIgnoreWhitespaces((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ParserPackage.XML_PARSER__IGNORE_WHITESPACES:
			setIgnoreWhitespaces(IGNORE_WHITESPACES_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ParserPackage.XML_PARSER__IGNORE_WHITESPACES:
			return ignoreWhitespaces != IGNORE_WHITESPACES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ParserPackage.XML_PARSER___CAN_PARSE_FILE__STRING:
			return canParseFile((String) arguments.get(0));
		case ParserPackage.XML_PARSER___PARSE__READER:
			return parse((Reader) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ignoreWhitespaces: ");
		result.append(ignoreWhitespaces);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	private static final Logger logger = Logger.getLogger(XMLParserImpl.class);

	// [user code injected with eMoflon] -->
} //XMLParserImpl
