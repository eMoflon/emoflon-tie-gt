package org.moflon.tie.gt.ide.core.patterns.util;

import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.Variable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Operation;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;
import org.moflon.tie.gt.compiler.democles.pattern.Adornments;
import org.moflon.tie.gt.compiler.democles.pattern.DemoclesPatternType;
import org.moflon.tie.gt.compiler.democles.util.ExceptionUtil;
import org.moflon.tie.gt.controlflow.democles.Action;
import org.moflon.tie.gt.controlflow.democles.CFNode;
import org.moflon.tie.gt.controlflow.democles.DemoclesFactory;
import org.moflon.tie.gt.controlflow.democles.PatternInvocation;
import org.moflon.tie.gt.controlflow.democles.RegularPatternInvocation;
import org.moflon.tie.gt.controlflow.democles.Scope;
import org.moflon.tie.gt.controlflow.democles.SingleResultPatternInvocation;
import org.moflon.tie.gt.controlflow.democles.VariableReference;

public final class PatternInvocationActions {
	private PatternInvocationActions() {
		throw new UtilityClassNotInstantiableException();
	}

	public static SingleResultPatternInvocation createSingleResultPatternInvocation(final CFNode cfNode) {
		final SingleResultPatternInvocation invocation = DemoclesFactory.eINSTANCE
				.createSingleResultPatternInvocation();
		invocation.setCfNode(cfNode);
		cfNode.setMainAction(invocation);
		return invocation;
	}

	public static PatternInvocation createPatternInvocation(final Scope rootscope, final CFNode cfNode,
			final Pattern pattern) {
		final RegularPatternInvocation patternInvocation = DemoclesFactory.eINSTANCE.createRegularPatternInvocation();
		patternInvocation.setCfNode(cfNode);
		patternInvocation.setPattern(pattern);
		return patternInvocation;
	}

	public static Operation createOperationConstraint(final EOperation eOperation) {
		final Operation operationConstraint = EMFTypeFactory.eINSTANCE.createOperation();
		operationConstraint.setEModelElement(eOperation);
		return operationConstraint;
	}

	public static Adornment getAdornment(final PatternInvocation invocation, final DemoclesPatternType patternType) {
		int adornmentIndex = 0;
		final Pattern pattern = invocation.getPattern();
		final EList<Variable> symbolicParameters = pattern.getSymbolicParameters();
		final Adornment adornment = new Adornment(symbolicParameters.size());
		for (final Variable symbolicParameter : symbolicParameters) {
			final Optional<VariableReference> maybeVariableRef = invocation.getParameters().stream()
					.filter(invocationParameter -> invocationParameter.getTo().equals(symbolicParameter)).findAny();
			if (maybeVariableRef.isPresent()) {
				final VariableReference variableReference = maybeVariableRef.get();
				final int value = Adornments.getAdornmentValue(variableReference);
				adornment.set(adornmentIndex, value);
				adornmentIndex++;
			} else
				throw ExceptionUtil.createIllegalArgumentException(
						"No binding for symbolic parameter %s of %s in invocation %s has ", symbolicParameter, pattern,
						invocation.toString());

		}
		return adornment;
	}

	public static void appendPatternInvocation(final CFNode parentControlFlowNode, final Action previousAction,
			final PatternInvocation patternInvocation) {
		if (previousAction == null)
			parentControlFlowNode.setMainAction(patternInvocation);
		else {
			previousAction.setNext(patternInvocation);
			patternInvocation.setPrev(previousAction);
		}
	}

}
