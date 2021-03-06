package org.moflon.tie.gt.ide.core.patterns.util;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.EClassifier;
import org.gervarro.democles.specification.emf.Variable;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;
import org.moflon.tie.gt.controlflow.democles.Action;
import org.moflon.tie.gt.controlflow.democles.CFNode;
import org.moflon.tie.gt.controlflow.democles.CFVariable;
import org.moflon.tie.gt.controlflow.democles.CompoundNode;
import org.moflon.tie.gt.controlflow.democles.DemoclesFactory;
import org.moflon.tie.gt.controlflow.democles.ForEach;
import org.moflon.tie.gt.controlflow.democles.HeadControlledLoop;
import org.moflon.tie.gt.controlflow.democles.IfStatement;
import org.moflon.tie.gt.controlflow.democles.PatternInvocation;
import org.moflon.tie.gt.controlflow.democles.Scope;
import org.moflon.tie.gt.controlflow.democles.TailControlledLoop;
import org.moflon.tie.gt.controlflow.democles.VariableReference;

public final class ControlFlowUtil {
	private ControlFlowUtil() {
		throw new UtilityClassNotInstantiableException();
	}

	/**
	 * Returns a {@link CFVariable} that has the name in the given start
	 * {@link Scope} or any higher scope (if exists)
	 * 
	 * @param startScope the start {@link Scope}
	 * @param name       the name of the {@link CFVariable} to find
	 * @return the {@link CFVariable} (if exists)
	 */
	public static Optional<CFVariable> findControlFlowVariableByName(final Scope startScope, final String name) {
		final List<String> names = Arrays.asList(name);
		return findControlFlowVariableByNames(startScope, names);
	}

	/**
	 * Returns a {@link CFVariable} that has one of several possible names in the
	 * given start {@link Scope} or any higher scope (if exists).
	 * 
	 * Within each {@link Scope}, all given names are tried before continuing with
	 * the next higher scope.
	 * 
	 * @param startScope the start {@link Scope}
	 * @param names      list of possible names of the {@link CFVariable} to find
	 * @return the {@link CFVariable} (if exists)
	 */
	public static Optional<CFVariable> findControlFlowVariableByNames(final Scope startScope,
			final List<String> names) {
		Scope currentScope = startScope;
		while (currentScope != null) {
			final Optional<CFVariable> searchResult = currentScope.getVariables().stream()
					.filter(variable -> names.contains(variable.getName())).findFirst();
			if (searchResult.isPresent()) {
				return searchResult;
			}

			currentScope = Scopes.getParent(currentScope);
		}
		return Optional.empty();
	}

	public static VariableReference createVariableReference(final CFVariable from, final Variable to,
			final PatternInvocation invocation) {
		final VariableReference varRef = DemoclesFactory.eINSTANCE.createVariableReference();
		varRef.setFrom(from);
		varRef.setTo(to);
		varRef.setInvocation(invocation);
		return varRef;
	}

	public static CFVariable createLocalControlFlowVariable(final String name, final EClassifier type,
			final Action constructor, final Scope scope) {
		final CFVariable variable = CFVariables.create(name, type, constructor, scope);
		variable.setLocal(true);
		return variable;
	}

	public static org.moflon.tie.gt.controlflow.democles.ReturnStatement createReturnStatement(final int id,
			final Scope scope, final CFNode previousNode) {
		final org.moflon.tie.gt.controlflow.democles.ReturnStatement returnStmtDemocles = DemoclesFactory.eINSTANCE
				.createReturnStatement();
		returnStmtDemocles.setId(id);
		returnStmtDemocles.setPrev(previousNode);
		returnStmtDemocles.setScope(scope);
		return returnStmtDemocles;
	}

	public static IfStatement createIfStatement(final int id, final Scope scope, final CFNode previousNode) {
		final IfStatement ifStmtDemocles = DemoclesFactory.eINSTANCE.createIfStatement();
		ifStmtDemocles.setPrev(previousNode);
		ifStmtDemocles.setScope(scope);
		ifStmtDemocles.setId(id);
		return ifStmtDemocles;
	}

	public static HeadControlledLoop createHeadControlledLoop(final int id, final Scope scope,
			final CFNode previousNode) {
		final HeadControlledLoop whileLoopDemocles = DemoclesFactory.eINSTANCE.createHeadControlledLoop();
		whileLoopDemocles.setPrev(previousNode);
		whileLoopDemocles.setScope(scope);
		whileLoopDemocles.setLoopAlongTrue(true);
		whileLoopDemocles.setId(id);
		return whileLoopDemocles;
	}

	public static Scope createScope(final CompoundNode parent) {
		final Scope nextScope = DemoclesFactory.eINSTANCE.createScope();
		nextScope.setParent(parent);
		return nextScope;
	}

	public static void moveVariablesToScope(final List<CFVariable> variables, final Scope oldScope,
			final Scope nextScope) {
		variables.forEach(variable -> {
			oldScope.getVariables().remove(variable);
			nextScope.getVariables().add(variable);
		});
	}

	public static ForEach createForEachStatement(final int id, final Scope scope, final CFNode previousNode) {
		final ForEach forLoopDemocles = DemoclesFactory.eINSTANCE.createForEach();
		forLoopDemocles.setPrev(previousNode);
		forLoopDemocles.setScope(scope);
		forLoopDemocles.setId(id);
		return forLoopDemocles;
	}

	public static TailControlledLoop createTailControlledLoop(final int id, final Scope scope,
			final CFNode previousNode) {
		final TailControlledLoop doLoopDemocles = DemoclesFactory.eINSTANCE.createTailControlledLoop();
		doLoopDemocles.setPrev(previousNode);
		doLoopDemocles.setScope(scope);
		doLoopDemocles.setLoopAlongTrue(true);
		doLoopDemocles.setId(id);
		return doLoopDemocles;
	}

	public static CFNode createControlFlowNode(final int id, final Scope scope, final CFNode previousNode) {
		final CFNode cfNode = DemoclesFactory.eINSTANCE.createCFNode();
		cfNode.setId(id);
		cfNode.setScope(scope);
		cfNode.setPrev(previousNode);
		return cfNode;
	}

}
