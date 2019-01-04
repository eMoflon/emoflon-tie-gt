package org.moflon.compiler.sdm.democles;

import org.eclipse.emf.common.util.EList;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.compiler.CompilerPatternBody;
import org.gervarro.democles.specification.emf.Constraint;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.Variable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Attribute;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Operation;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Reference;
import org.gervarro.democles.specification.emf.constraint.relational.Equal;
import org.gervarro.democles.specification.emf.constraint.relational.Larger;
import org.gervarro.democles.specification.emf.constraint.relational.LargerOrEqual;
import org.gervarro.democles.specification.emf.constraint.relational.Smaller;
import org.gervarro.democles.specification.emf.constraint.relational.SmallerOrEqual;
import org.gervarro.democles.specification.emf.constraint.relational.Unequal;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;

public final class PatternUtils {

	/**
	 * Newline token to use
	 */
	private static final String NL = "\n";

	private PatternUtils() {
		throw new UtilityClassNotInstantiableException();
	}

	public static String describeSymbolicParameters(final Pattern pattern, final Adornment adornment) {
		final StringBuilder sb = new StringBuilder();
		sb.append("[");
		final EList<Variable> parameters = pattern.getSymbolicParameters();
		for (int i = 0; i < parameters.size(); ++i) {
			final Variable parameter = parameters.get(i);
			if (parameter instanceof EMFVariable)
				sb.append(EMFVariable.class.cast(parameter).getName());
			else
				sb.append(parameter);
			appendf(sb, "^%s,", describeAdornment(adornment.get(i)));
		}
		sb.replace(sb.length() - 1, sb.length(), "]");
		return sb.toString();
	}

	public static String describeLocalVariables(final Pattern pattern) {
		final StringBuilder sb = new StringBuilder();
		sb.append("[");
		final EList<Variable> localVariables = pattern.getBodies().get(0).getLocalVariables();
		for (int i = 0; i < localVariables.size(); ++i) {
			final Variable parameter = localVariables.get(i);
			if (parameter instanceof EMFVariable)
				sb.append(EMFVariable.class.cast(parameter).getName());
			else
				sb.append(parameter);
			sb.append("^F,");
		}
		sb.replace(sb.length() - 1, sb.length(), "]");
		return sb.toString();
	}

	public static String describeAdornment(final int adornment) {
		switch (adornment) {
		case Adornment.BOUND:
			return "B";
		case Adornment.NOT_TYPECHECKED:
			return "U";
		case Adornment.FREE:
			return "F";
		default:
			return "?";
		}
	}

	public static String describeConstraint(final Constraint constraint) {
		final StringBuilder sb = new StringBuilder();
		sb.append(describeConstraintName(constraint));
		sb.append("(");
		for (final ConstraintParameter parameter : constraint.getParameters()) {
			final ConstraintVariable reference = parameter.getReference();
			if (reference instanceof EMFVariable)
				sb.append(EMFVariable.class.cast(reference).getName());
			else
				sb.append(parameter);
			appendf(sb, "[%x],", reference.hashCode());
		}
		sb.replace(sb.length() - 1, sb.length(), ")");
		appendf(sb, "    [class: %s]", constraint);
		return sb.toString();
	}

	public static String describeConstraintName(final Constraint constraint) {
		if (constraint instanceof Attribute) {
			final Attribute attribute = (Attribute) constraint;
			return attribute.getEModelElement().getName();
		} else if (constraint instanceof Reference) {
			final Reference reference = (Reference) constraint;
			return reference.getEModelElement().getName();
		} else if (constraint instanceof Operation) {
			final Operation operation = (Operation) constraint;
			return operation.getEModelElement().getName();
		} else if (constraint instanceof Smaller) {
			return "<";
		} else if (constraint instanceof SmallerOrEqual) {
			return "<=";
		} else if (constraint instanceof Equal) {
			return "==";
		} else if (constraint instanceof Unequal) {
			return "!=";
		} else if (constraint instanceof LargerOrEqual) {
			return ">=";
		} else if (constraint instanceof Larger) {
			return ">";
		}
		return constraint.toString();
	}

	public static Object describeOperation(final GeneratorOperation operation) {
		final StringBuilder sb = new StringBuilder();
		sb.append(operation.toString());
		sb.append(" [origin:");
		final Object origin = operation.getOrigin();
		if (origin instanceof Constraint) {
			final Constraint constraint = (Constraint) origin;
			sb.append(describeConstraintName(constraint));
		} else {
			sb.append(origin.toString());
		}
		sb.append("]");
		return sb.toString();
	}

	public static String describePattern(final Pattern pattern, final CompilerPatternBody body,
			final Adornment adornment) {
		final StringBuilder sb = new StringBuilder();
		appendf(sb, "Pattern:%s", NL);
		appendf(sb, "Symbolic parameters: %s%s", describeSymbolicParameters(pattern, adornment), NL);
		appendf(sb, "Local variables:     %s%s", describeLocalVariables(pattern), NL);

		final PatternBody originalPattern = pattern.getBodies().get(0);

		sb.append("Constraints").append(NL);
		for (final Constraint constraint : originalPattern.getConstraints()) {
			appendf(sb, "  %s%s", describeConstraint(constraint), NL);
		}

		sb.append("Operations");
		for (final GeneratorOperation operation : body.getOperations()) {
			appendf(sb, "  %s%s", describeOperation(operation), NL);
		}
		final String formattedPattern = sb.toString();
		return formattedPattern;
	}

	private static StringBuilder appendf(final StringBuilder sb, final String formatString, final Object... args) {
		sb.append(String.format(formatString, args));
		return sb;
	}

}
