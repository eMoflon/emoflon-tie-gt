package org.moflon.tie.gt.ide.core.patterns.util;

import org.eclipse.emf.ecore.EOperation;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Operation;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;
import org.moflon.tie.gt.controlflow.democles.CFNode;
import org.moflon.tie.gt.controlflow.democles.DemoclesFactory;
import org.moflon.tie.gt.controlflow.democles.PatternInvocation;
import org.moflon.tie.gt.controlflow.democles.RegularPatternInvocation;
import org.moflon.tie.gt.controlflow.democles.Scope;
import org.moflon.tie.gt.controlflow.democles.SingleResultPatternInvocation;

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

}
