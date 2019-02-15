package org.moflon.tie.gt.ide.core.patterns.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.ecore.EClassifier;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.Variable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;

/**
 * Convenience functions for working with {@link Variable} objects
 * 
 * @author Roland Kluge - Initial implementation
 *
 */
public final class Variables {

	private Variables() {
		throw new UtilityClassNotInstantiableException();
	}

	public static List<Variable> collectVariables(final Pattern democlesPattern) {
		final List<Variable> variables = new ArrayList<>(democlesPattern.getSymbolicParameters());
		variables.addAll(Patterns.getBody(democlesPattern).getLocalVariables());
		return variables;
	}

	public static Optional<Variable> findVariableByName(final List<Variable> variables, final String keyVariableName) {
		return variables.stream().filter(variable -> variable.getName().equals(keyVariableName)).findAny();
	}

	public static Optional<EClassifier> getType(final Variable var, final MultiStatus transformationStatus) {
		final Optional<EClassifier> editorObjectVariableType = Optional.of(((EMFVariable) var).getEClassifier());
		return editorObjectVariableType;
	}
}
