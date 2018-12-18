/**
 */
package SDMLanguage.sdmUtil.impl;

import SDMLanguage.activities.ActivitiesFactory;
import SDMLanguage.activities.Activity;
import SDMLanguage.activities.ActivityEdge;
import SDMLanguage.activities.ActivityNode;
import SDMLanguage.activities.EdgeGuard;
import SDMLanguage.activities.StopNode;
import SDMLanguage.activities.StoryNode;

import SDMLanguage.expressions.ExpressionsFactory;
import SDMLanguage.expressions.LiteralExpression;

import SDMLanguage.patterns.ObjectVariable;
import SDMLanguage.patterns.StoryPattern;

import SDMLanguage.sdmUtil.SDMPrecompiler;
import SDMLanguage.sdmUtil.SdmUtilPackage;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SDM Precompiler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SDMPrecompilerImpl extends EObjectImpl implements SDMPrecompiler {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SDMPrecompilerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdmUtilPackage.Literals.SDM_PRECOMPILER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void processActivity(Activity activity) {// ForEach 
		for (Object[] result1_black : SDMPrecompilerImpl.pattern_SDMPrecompiler_0_1_blackBFF(activity)) {
			StoryNode storyNode = (StoryNode) result1_black[1];
			ActivityEdge withoutGuard = (ActivityEdge) result1_black[2];
			// 
			Object[] result2_black = SDMPrecompilerImpl
					.pattern_SDMPrecompiler_0_2_handleoptimization_blackBFF(storyNode);
			if (result2_black != null) {
				//nothing StoryPattern storyPattern = (StoryPattern) result2_black[1];
				//nothing ObjectVariable thisOV = (ObjectVariable) result2_black[2];
			} else {

				Object[] result3_black = SDMPrecompilerImpl
						.pattern_SDMPrecompiler_0_3_Createstopnodetohandlecasewhenpatternfails_blackBBB(activity,
								storyNode, withoutGuard);
				if (result3_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[activity] = " + activity
							+ ", " + "[storyNode] = " + storyNode + ", " + "[withoutGuard] = " + withoutGuard + ".");
				}
				SDMPrecompilerImpl.pattern_SDMPrecompiler_0_3_Createstopnodetohandlecasewhenpatternfails_greenBFFFBB(
						activity, storyNode, withoutGuard);
				//nothing LiteralExpression exceptionExpr = (LiteralExpression) result3_green[1];
				//nothing ActivityEdge failureEdge = (ActivityEdge) result3_green[2];
				//nothing StopNode newStop = (StopNode) result3_green[3];

			}

		}
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SdmUtilPackage.SDM_PRECOMPILER___PROCESS_ACTIVITY__ACTIVITY:
			processActivity((Activity) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Iterable<Object[]> pattern_SDMPrecompiler_0_1_blackBFF(Activity activity) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ActivityEdge withoutGuard : activity.getOwnedActivityEdge()) {
			ActivityNode tmpStoryNode = withoutGuard.getSource();
			if (tmpStoryNode instanceof StoryNode) {
				StoryNode storyNode = (StoryNode) tmpStoryNode;
				if (activity.equals(storyNode.getOwningActivity())) {
					EdgeGuard withoutGuard_guard = withoutGuard.getGuard();
					if (withoutGuard_guard.equals(EdgeGuard.NONE)) {
						_result.add(new Object[] { activity, storyNode, withoutGuard });
					}

				}
			}

		}
		return _result;
	}

	public static final Object[] pattern_SDMPrecompiler_0_2_handleoptimization_black_nac_0BB(StoryPattern storyPattern,
			ObjectVariable thisOV) {
		for (ObjectVariable other : storyPattern.getObjectVariable()) {
			if (!thisOV.equals(other)) {
				return new Object[] { storyPattern, thisOV };
			}
		}
		return null;
	}

	public static final Object[] pattern_SDMPrecompiler_0_2_handleoptimization_blackBFF(StoryNode storyNode) {
		StoryPattern storyPattern = storyNode.getStoryPattern();
		if (storyPattern != null) {
			for (ObjectVariable thisOV : storyPattern.getObjectVariable()) {
				String thisOV_name = thisOV.getName();
				if (thisOV_name.equals("this")) {
					if (pattern_SDMPrecompiler_0_2_handleoptimization_black_nac_0BB(storyPattern, thisOV) == null) {
						return new Object[] { storyNode, storyPattern, thisOV };
					}
				}

			}
		}

		return null;
	}

	public static final Object[] pattern_SDMPrecompiler_0_3_Createstopnodetohandlecasewhenpatternfails_blackBBB(
			Activity activity, StoryNode storyNode, ActivityEdge withoutGuard) {
		if (storyNode.getOutgoing().contains(withoutGuard)) {
			return new Object[] { activity, storyNode, withoutGuard };
		}
		return null;
	}

	public static final Object[] pattern_SDMPrecompiler_0_3_Createstopnodetohandlecasewhenpatternfails_greenBFFFBB(
			Activity activity, StoryNode storyNode, ActivityEdge withoutGuard) {
		LiteralExpression exceptionExpr = ExpressionsFactory.eINSTANCE.createLiteralExpression();
		ActivityEdge failureEdge = ActivitiesFactory.eINSTANCE.createActivityEdge();
		StopNode newStop = ActivitiesFactory.eINSTANCE.createStopNode();
		String exceptionExpr_value_prime = "throw new IllegalStateException()";
		EdgeGuard failureEdge_guard_prime = EdgeGuard.FAILURE;
		EdgeGuard withoutGuard_guard_prime = EdgeGuard.SUCCESS;
		storyNode.getOutgoing().add(failureEdge);
		failureEdge.setOwningActivity(activity);
		newStop.getIncoming().add(failureEdge);
		newStop.setReturnValue(exceptionExpr);
		newStop.setOwningActivity(activity);
		exceptionExpr.setValue(exceptionExpr_value_prime);
		failureEdge.setGuard(failureEdge_guard_prime);
		withoutGuard.setGuard(withoutGuard_guard_prime);
		return new Object[] { activity, exceptionExpr, failureEdge, newStop, storyNode, withoutGuard };
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SDMPrecompilerImpl
