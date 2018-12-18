/**
 */
package SDMLanguage.activities.impl;

import SDMLanguage.activities.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivitiesFactoryImpl extends EFactoryImpl implements ActivitiesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivitiesFactory init() {
		try {
			ActivitiesFactory theActivitiesFactory = (ActivitiesFactory) EPackage.Registry.INSTANCE
					.getEFactory(ActivitiesPackage.eNS_URI);
			if (theActivitiesFactory != null) {
				return theActivitiesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActivitiesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitiesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ActivitiesPackage.ACTIVITY:
			return createActivity();
		case ActivitiesPackage.ACTIVITY_EDGE:
			return createActivityEdge();
		case ActivitiesPackage.MOFLON_EOPERATION:
			return createMoflonEOperation();
		case ActivitiesPackage.START_NODE:
			return createStartNode();
		case ActivitiesPackage.STATEMENT_NODE:
			return createStatementNode();
		case ActivitiesPackage.STOP_NODE:
			return createStopNode();
		case ActivitiesPackage.STORY_NODE:
			return createStoryNode();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ActivitiesPackage.EDGE_GUARD:
			return createEdgeGuardFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ActivitiesPackage.EDGE_GUARD:
			return convertEdgeGuardToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityEdge createActivityEdge() {
		ActivityEdgeImpl activityEdge = new ActivityEdgeImpl();
		return activityEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoflonEOperation createMoflonEOperation() {
		MoflonEOperationImpl moflonEOperation = new MoflonEOperationImpl();
		return moflonEOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartNode createStartNode() {
		StartNodeImpl startNode = new StartNodeImpl();
		return startNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementNode createStatementNode() {
		StatementNodeImpl statementNode = new StatementNodeImpl();
		return statementNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopNode createStopNode() {
		StopNodeImpl stopNode = new StopNodeImpl();
		return stopNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoryNode createStoryNode() {
		StoryNodeImpl storyNode = new StoryNodeImpl();
		return storyNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeGuard createEdgeGuardFromString(EDataType eDataType, String initialValue) {
		EdgeGuard result = EdgeGuard.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEdgeGuardToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitiesPackage getActivitiesPackage() {
		return (ActivitiesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActivitiesPackage getPackage() {
		return ActivitiesPackage.eINSTANCE;
	}

} //ActivitiesFactoryImpl
