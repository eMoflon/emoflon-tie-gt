/**
 */
package org.moflon.core.moca.processing.parser.impl;

import MocaTree.Node;

import java.io.File;
import java.io.Reader;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.moflon.core.moca.processing.CodeAdapter;
import org.moflon.core.moca.processing.ProcessingPackage;

import org.moflon.core.moca.processing.parser.Parser;
import org.moflon.core.moca.processing.parser.ParserPackage;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parser</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.core.moca.processing.parser.impl.ParserImpl#getCodeAdapter <em>Code Adapter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ParserImpl extends EObjectImpl implements Parser {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParserPackage.Literals.PARSER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeAdapter getCodeAdapter() {
		if (eContainerFeatureID() != ParserPackage.PARSER__CODE_ADAPTER)
			return null;
		return (CodeAdapter) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeAdapter(CodeAdapter newCodeAdapter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newCodeAdapter, ParserPackage.PARSER__CODE_ADAPTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeAdapter(CodeAdapter newCodeAdapter) {
		if (newCodeAdapter != eInternalContainer()
				|| (eContainerFeatureID() != ParserPackage.PARSER__CODE_ADAPTER && newCodeAdapter != null)) {
			if (EcoreUtil.isAncestor(this, newCodeAdapter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCodeAdapter != null)
				msgs = ((InternalEObject) newCodeAdapter).eInverseAdd(this, ProcessingPackage.CODE_ADAPTER__PARSER,
						CodeAdapter.class, msgs);
			msgs = basicSetCodeAdapter(newCodeAdapter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParserPackage.PARSER__CODE_ADAPTER, newCodeAdapter,
					newCodeAdapter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean canParseFile(String fileName) {
		// [user code injected with eMoflon]

		throw new UnsupportedOperationException("Please provide a subclass to parse " + fileName);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node parse(Reader reader) {
		// [user code injected with eMoflon]

		throw new UnsupportedOperationException("Please provide a subclass for actual parsing!");

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node parse(File file, Reader reader) {
		// [user code injected with eMoflon]

		return parse(reader);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ParserPackage.PARSER__CODE_ADAPTER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetCodeAdapter((CodeAdapter) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ParserPackage.PARSER__CODE_ADAPTER:
			return basicSetCodeAdapter(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case ParserPackage.PARSER__CODE_ADAPTER:
			return eInternalContainer().eInverseRemove(this, ProcessingPackage.CODE_ADAPTER__PARSER, CodeAdapter.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ParserPackage.PARSER__CODE_ADAPTER:
			return getCodeAdapter();
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
		case ParserPackage.PARSER__CODE_ADAPTER:
			setCodeAdapter((CodeAdapter) newValue);
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
		case ParserPackage.PARSER__CODE_ADAPTER:
			setCodeAdapter((CodeAdapter) null);
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
		case ParserPackage.PARSER__CODE_ADAPTER:
			return getCodeAdapter() != null;
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
		case ParserPackage.PARSER___CAN_PARSE_FILE__STRING:
			return canParseFile((String) arguments.get(0));
		case ParserPackage.PARSER___PARSE__READER:
			return parse((Reader) arguments.get(0));
		case ParserPackage.PARSER___PARSE__FILE_READER:
			return parse((File) arguments.get(0), (Reader) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParserImpl
