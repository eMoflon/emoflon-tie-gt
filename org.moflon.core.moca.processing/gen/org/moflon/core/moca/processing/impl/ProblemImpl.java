/**
 */
package org.moflon.core.moca.processing.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.moflon.core.moca.processing.CodeAdapter;
import org.moflon.core.moca.processing.Problem;
import org.moflon.core.moca.processing.ProblemType;
import org.moflon.core.moca.processing.ProcessingPackage;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Problem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.core.moca.processing.impl.ProblemImpl#getCodeAdapter <em>Code Adapter</em>}</li>
 *   <li>{@link org.moflon.core.moca.processing.impl.ProblemImpl#getCharacterPositionEnd <em>Character Position End</em>}</li>
 *   <li>{@link org.moflon.core.moca.processing.impl.ProblemImpl#getCharacterPositionStart <em>Character Position Start</em>}</li>
 *   <li>{@link org.moflon.core.moca.processing.impl.ProblemImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.moflon.core.moca.processing.impl.ProblemImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.moflon.core.moca.processing.impl.ProblemImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.moflon.core.moca.processing.impl.ProblemImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProblemImpl extends EObjectImpl implements Problem {
	/**
	 * The default value of the '{@link #getCharacterPositionEnd() <em>Character Position End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterPositionEnd()
	 * @generated
	 * @ordered
	 */
	protected static final int CHARACTER_POSITION_END_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCharacterPositionEnd() <em>Character Position End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterPositionEnd()
	 * @generated
	 * @ordered
	 */
	protected int characterPositionEnd = CHARACTER_POSITION_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharacterPositionStart() <em>Character Position Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterPositionStart()
	 * @generated
	 * @ordered
	 */
	protected static final int CHARACTER_POSITION_START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCharacterPositionStart() <em>Character Position Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterPositionStart()
	 * @generated
	 * @ordered
	 */
	protected int characterPositionStart = CHARACTER_POSITION_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected int line = LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ProblemType TYPE_EDEFAULT = ProblemType.ERROR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ProblemType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessingPackage.Literals.PROBLEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeAdapter getCodeAdapter() {
		if (eContainerFeatureID() != ProcessingPackage.PROBLEM__CODE_ADAPTER)
			return null;
		return (CodeAdapter) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeAdapter(CodeAdapter newCodeAdapter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newCodeAdapter, ProcessingPackage.PROBLEM__CODE_ADAPTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeAdapter(CodeAdapter newCodeAdapter) {
		if (newCodeAdapter != eInternalContainer()
				|| (eContainerFeatureID() != ProcessingPackage.PROBLEM__CODE_ADAPTER && newCodeAdapter != null)) {
			if (EcoreUtil.isAncestor(this, newCodeAdapter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCodeAdapter != null)
				msgs = ((InternalEObject) newCodeAdapter).eInverseAdd(this, ProcessingPackage.CODE_ADAPTER__PROBLEMS,
						CodeAdapter.class, msgs);
			msgs = basicSetCodeAdapter(newCodeAdapter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessingPackage.PROBLEM__CODE_ADAPTER,
					newCodeAdapter, newCodeAdapter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCharacterPositionEnd() {
		return characterPositionEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacterPositionEnd(int newCharacterPositionEnd) {
		int oldCharacterPositionEnd = characterPositionEnd;
		characterPositionEnd = newCharacterPositionEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessingPackage.PROBLEM__CHARACTER_POSITION_END,
					oldCharacterPositionEnd, characterPositionEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCharacterPositionStart() {
		return characterPositionStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacterPositionStart(int newCharacterPositionStart) {
		int oldCharacterPositionStart = characterPositionStart;
		characterPositionStart = newCharacterPositionStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessingPackage.PROBLEM__CHARACTER_POSITION_START,
					oldCharacterPositionStart, characterPositionStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(int newLine) {
		int oldLine = line;
		line = newLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessingPackage.PROBLEM__LINE, oldLine, line));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessingPackage.PROBLEM__MESSAGE, oldMessage,
					message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessingPackage.PROBLEM__SOURCE, oldSource,
					source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ProblemType newType) {
		ProblemType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessingPackage.PROBLEM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProcessingPackage.PROBLEM__CODE_ADAPTER:
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
		case ProcessingPackage.PROBLEM__CODE_ADAPTER:
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
		case ProcessingPackage.PROBLEM__CODE_ADAPTER:
			return eInternalContainer().eInverseRemove(this, ProcessingPackage.CODE_ADAPTER__PROBLEMS,
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
		case ProcessingPackage.PROBLEM__CODE_ADAPTER:
			return getCodeAdapter();
		case ProcessingPackage.PROBLEM__CHARACTER_POSITION_END:
			return getCharacterPositionEnd();
		case ProcessingPackage.PROBLEM__CHARACTER_POSITION_START:
			return getCharacterPositionStart();
		case ProcessingPackage.PROBLEM__LINE:
			return getLine();
		case ProcessingPackage.PROBLEM__MESSAGE:
			return getMessage();
		case ProcessingPackage.PROBLEM__SOURCE:
			return getSource();
		case ProcessingPackage.PROBLEM__TYPE:
			return getType();
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
		case ProcessingPackage.PROBLEM__CODE_ADAPTER:
			setCodeAdapter((CodeAdapter) newValue);
			return;
		case ProcessingPackage.PROBLEM__CHARACTER_POSITION_END:
			setCharacterPositionEnd((Integer) newValue);
			return;
		case ProcessingPackage.PROBLEM__CHARACTER_POSITION_START:
			setCharacterPositionStart((Integer) newValue);
			return;
		case ProcessingPackage.PROBLEM__LINE:
			setLine((Integer) newValue);
			return;
		case ProcessingPackage.PROBLEM__MESSAGE:
			setMessage((String) newValue);
			return;
		case ProcessingPackage.PROBLEM__SOURCE:
			setSource((String) newValue);
			return;
		case ProcessingPackage.PROBLEM__TYPE:
			setType((ProblemType) newValue);
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
		case ProcessingPackage.PROBLEM__CODE_ADAPTER:
			setCodeAdapter((CodeAdapter) null);
			return;
		case ProcessingPackage.PROBLEM__CHARACTER_POSITION_END:
			setCharacterPositionEnd(CHARACTER_POSITION_END_EDEFAULT);
			return;
		case ProcessingPackage.PROBLEM__CHARACTER_POSITION_START:
			setCharacterPositionStart(CHARACTER_POSITION_START_EDEFAULT);
			return;
		case ProcessingPackage.PROBLEM__LINE:
			setLine(LINE_EDEFAULT);
			return;
		case ProcessingPackage.PROBLEM__MESSAGE:
			setMessage(MESSAGE_EDEFAULT);
			return;
		case ProcessingPackage.PROBLEM__SOURCE:
			setSource(SOURCE_EDEFAULT);
			return;
		case ProcessingPackage.PROBLEM__TYPE:
			setType(TYPE_EDEFAULT);
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
		case ProcessingPackage.PROBLEM__CODE_ADAPTER:
			return getCodeAdapter() != null;
		case ProcessingPackage.PROBLEM__CHARACTER_POSITION_END:
			return characterPositionEnd != CHARACTER_POSITION_END_EDEFAULT;
		case ProcessingPackage.PROBLEM__CHARACTER_POSITION_START:
			return characterPositionStart != CHARACTER_POSITION_START_EDEFAULT;
		case ProcessingPackage.PROBLEM__LINE:
			return line != LINE_EDEFAULT;
		case ProcessingPackage.PROBLEM__MESSAGE:
			return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
		case ProcessingPackage.PROBLEM__SOURCE:
			return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
		case ProcessingPackage.PROBLEM__TYPE:
			return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (characterPositionEnd: ");
		result.append(characterPositionEnd);
		result.append(", characterPositionStart: ");
		result.append(characterPositionStart);
		result.append(", line: ");
		result.append(line);
		result.append(", message: ");
		result.append(message);
		result.append(", source: ");
		result.append(source);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + characterPositionEnd;
		result = prime * result + characterPositionStart;
		result = prime * result + line;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProblemImpl other = (ProblemImpl) obj;
		if (characterPositionEnd != other.characterPositionEnd)
			return false;
		if (characterPositionStart != other.characterPositionStart)
			return false;
		if (line != other.line)
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	// [user code injected with eMoflon] -->
} //ProblemImpl
