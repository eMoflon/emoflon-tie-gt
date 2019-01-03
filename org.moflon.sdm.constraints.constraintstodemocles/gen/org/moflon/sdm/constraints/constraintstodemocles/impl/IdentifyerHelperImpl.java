/**
 */
package org.moflon.sdm.constraints.constraintstodemocles.impl;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.moflon.sdm.constraints.constraintstodemocles.IdentifyerHelper;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Identifyer Helper</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IdentifyerHelperImpl extends EObjectImpl implements IdentifyerHelper {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IdentifyerHelperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getNextIdentifyer() {
		// [user code injected with eMoflon]

		final char x = (char) (identCnt % 26 + 97);
		String indentifier;
		indentifier = (identCnt / 26 > 0) ? x + Integer.toString(identCnt / 26) : Character.toString(x);
		identCnt++;
		return indentifier;

	}
	// <-- [user code injected with eMoflon]

	private int identCnt = 0;

	// [user code injected with eMoflon] -->
} // IdentifyerHelperImpl
