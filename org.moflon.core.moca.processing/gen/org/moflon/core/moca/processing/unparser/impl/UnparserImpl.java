/**
 */
package org.moflon.core.moca.processing.unparser.impl;

import MocaTree.Node;

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

import org.moflon.core.moca.processing.unparser.Unparser;
import org.moflon.core.moca.processing.unparser.UnparserPackage;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unparser</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.core.moca.processing.unparser.impl.UnparserImpl#getCodeAdapter <em>Code Adapter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UnparserImpl extends EObjectImpl implements Unparser {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnparserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnparserPackage.Literals.UNPARSER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeAdapter getCodeAdapter() {
		if (eContainerFeatureID() != UnparserPackage.UNPARSER__CODE_ADAPTER)
			return null;
		return (CodeAdapter) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeAdapter(CodeAdapter newCodeAdapter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newCodeAdapter, UnparserPackage.UNPARSER__CODE_ADAPTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeAdapter(CodeAdapter newCodeAdapter) {
		if (newCodeAdapter != eInternalContainer()
				|| (eContainerFeatureID() != UnparserPackage.UNPARSER__CODE_ADAPTER && newCodeAdapter != null)) {
			if (EcoreUtil.isAncestor(this, newCodeAdapter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCodeAdapter != null)
				msgs = ((InternalEObject) newCodeAdapter).eInverseAdd(this, ProcessingPackage.CODE_ADAPTER__UNPARSER,
						CodeAdapter.class, msgs);
			msgs = basicSetCodeAdapter(newCodeAdapter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnparserPackage.UNPARSER__CODE_ADAPTER,
					newCodeAdapter, newCodeAdapter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String unparse(Node node) {
		// [user code injected with eMoflon]

		throw new UnsupportedOperationException();

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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UnparserPackage.UNPARSER__CODE_ADAPTER:
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
		case UnparserPackage.UNPARSER__CODE_ADAPTER:
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
		case UnparserPackage.UNPARSER__CODE_ADAPTER:
			return eInternalContainer().eInverseRemove(this, ProcessingPackage.CODE_ADAPTER__UNPARSER,
					CodeAdapter.class, msgs);
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
		case UnparserPackage.UNPARSER__CODE_ADAPTER:
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
		case UnparserPackage.UNPARSER__CODE_ADAPTER:
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
		case UnparserPackage.UNPARSER__CODE_ADAPTER:
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
		case UnparserPackage.UNPARSER__CODE_ADAPTER:
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
		case UnparserPackage.UNPARSER___UNPARSE__NODE:
			return unparse((Node) arguments.get(0));
		case UnparserPackage.UNPARSER___CAN_UNPARSE_FILE__STRING:
			return canUnparseFile((String) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UnparserImpl
