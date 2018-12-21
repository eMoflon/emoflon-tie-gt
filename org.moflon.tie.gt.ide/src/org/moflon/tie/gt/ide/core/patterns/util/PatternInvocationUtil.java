package org.moflon.tie.gt.ide.core.patterns.util;

import org.eclipse.emf.ecore.EOperation;
import org.emoflon.ibex.gt.editor.gT.EditorPattern;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Operation;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;
import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.DemoclesFactory;
import org.moflon.sdm.runtime.democles.PatternInvocation;
import org.moflon.sdm.runtime.democles.RegularPatternInvocation;
import org.moflon.sdm.runtime.democles.Scope;
import org.moflon.sdm.runtime.democles.SingleResultPatternInvocation;

public final class PatternInvocationUtil {
	private PatternInvocationUtil() {
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
			final EditorPattern pattern, final Pattern blackPattern) {
		final RegularPatternInvocation patternInvocation = DemoclesFactory.eINSTANCE.createRegularPatternInvocation();
		patternInvocation.setCfNode(cfNode);
		patternInvocation.setPattern(blackPattern);
		return patternInvocation;
	}

	public static Operation createOperationConstraint(final EOperation eOperation) {
		final Operation operationConstraint = EMFTypeFactory.eINSTANCE.createOperation();
		operationConstraint.setEModelElement(eOperation);
		return operationConstraint;
	}

}
