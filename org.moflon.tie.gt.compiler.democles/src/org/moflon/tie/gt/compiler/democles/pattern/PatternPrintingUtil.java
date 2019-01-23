package org.moflon.tie.gt.compiler.democles.pattern;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.compiler.CompilerPatternBody;
import org.gervarro.democles.constraint.PatternInvocationConstraintType;
import org.gervarro.democles.plan.WeightedOperation;
import org.gervarro.democles.plan.common.SearchPlanOperationBuilder;
import org.gervarro.democles.specification.emf.Constant;
import org.gervarro.democles.specification.emf.Constraint;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.PatternInvocationConstraint;
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
import org.moflon.tie.gt.constraints.democles.AttributeValueConstraint;
import org.moflon.tie.gt.constraints.democles.AttributeVariableConstraint;
import org.moflon.tie.gt.constraints.democles.TypedConstant;
import org.moflon.tie.gt.constraints.operationspecification.ConstraintSpecification;

public final class PatternPrintingUtil {

	/**
	 * Newline token to use
	 */
	public static final String NL = "\n";
	private static final Adornment NO_ADORNMENT = null;

	private PatternPrintingUtil() {
		throw new UtilityClassNotInstantiableException();
	}

	public static String describe(final Pattern pattern, final CompilerPatternBody body, final Adornment adornment,
			final List<SearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, GeneratorOperation>> operationBuilders) {
		final StringBuilder sb = new StringBuilder();
		appendf(sb, "Pattern: %s%s", describePatternName(pattern), NL);
		appendf(sb, "Symbolic parameters: %s%s", describeSymbolicParameters(pattern, adornment), NL);
		appendf(sb, "Local variables:     %s%s", describeLocalVariables(pattern), NL);

		final PatternBody originalPattern = pattern.getBodies().get(0);

		appendf(sb, "Constraints%s", NL);
		for (final Constraint constraint : originalPattern.getConstraints()) {
			appendf(sb, "  %s%s", describe(constraint), NL);
		}

		appendf(sb, "Operations%s", NL);
		for (final GeneratorOperation operation : body.getOperations()) {
			appendf(sb, "  %s%s", describe(operation), NL);
		}

		appendf(sb, "Search plan operations%s", NL);
		for (final GeneratorOperation operation : body.getOperations()) {
			boolean foundSearchPlanOperation = false;
			for (final SearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, GeneratorOperation> builder : operationBuilders) {
				final WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer> weightedOperation = builder
						.createSearchPlanOperation(operation);
				if (weightedOperation != null) {
					appendf(sb, "  %s%s    [origin: %s]%s", describe(weightedOperation), NL, describe(operation), NL);
					foundSearchPlanOperation = true;
				}
			}
			if (!foundSearchPlanOperation) {
				appendf(sb, "  [Warning] No search plan operation for %s", describe(operation));
			}
		}

		final String formattedPattern = sb.toString();
		return formattedPattern;
	}

	public static String describe(final Constraint constraint) {
		final StringBuilder sb = new StringBuilder();
		sb.append(getName(constraint));
		sb.append("(");
		for (final ConstraintParameter parameter : constraint.getParameters()) {
			final ConstraintVariable reference = parameter.getReference();
			if (reference instanceof Variable) {
				final Variable variable = Variable.class.cast(reference);
				sb.append(variable.getName());
			} else if (reference instanceof TypedConstant) {
				final TypedConstant constant = TypedConstant.class.cast(reference);
				sb.append(constant.getValue()).append("::").append(constant.getEClassifier().getName());
			} else if (reference instanceof Constant) {
				final Constant constant = Constant.class.cast(reference);
				sb.append(constant.getValue());
			} else
				sb.append(parameter);
			sb.append(",");
		}
		sb.replace(sb.length() - 1, sb.length(), ")");
		appendf(sb, "%s        [class: %s]", NL, constraint.getClass().getName());
		return sb.toString();
	}

	public static String describe(final org.gervarro.democles.specification.Constraint constraint) {
		final StringBuilder sb = new StringBuilder();
		sb.append(getName(constraint));
		sb.append("(");
		for (final Object parameter : constraint.getParameters()) {
			appendf(sb, "%s[%x],", getName(parameter), parameter.hashCode());
		}
		sb.replace(sb.length() - 1, sb.length(), ")");
		appendf(sb, "%s        [class: %s]", NL, constraint.getClass().getName());
		return sb.toString();
	}

	public static String getName(final Object object) {
		if (object instanceof EMFVariable) {
			final EMFVariable emfVariable = EMFVariable.class.cast(object);
			return emfVariable.getName();
		} else if (object instanceof org.gervarro.democles.constraint.emf.EMFVariable) {
			final org.gervarro.democles.constraint.emf.EMFVariable emfVariable = org.gervarro.democles.constraint.emf.EMFVariable.class
					.cast(object);
			return emfVariable.toString();
		} else if (object instanceof org.gervarro.democles.specification.Variable) {
			final org.gervarro.democles.specification.Variable variable = org.gervarro.democles.specification.Variable.class
					.cast(object);
			return variable.getName();
		} else if (object instanceof Variable) {
			final Variable variable = Variable.class.cast(object);
			return variable.getName();
		} else if (object instanceof TypedConstant) {
			final TypedConstant constant = TypedConstant.class.cast(object);
			return constant.getValue() + "::" + constant.getEClassifier().getName();
		} else if (object instanceof Constant) {
			final Constant constant = Constant.class.cast(object);
			return constant.getValue().toString();
		} else if (object instanceof org.gervarro.democles.specification.impl.Constraint) {
			final org.gervarro.democles.specification.impl.Constraint constraint = org.gervarro.democles.specification.impl.Constraint.class
					.cast(object);
			return getName(constraint.getType());
		} else if (object instanceof org.gervarro.democles.constraint.emf.Attribute) {
			final org.gervarro.democles.constraint.emf.Attribute attribute = org.gervarro.democles.constraint.emf.Attribute.class
					.cast(object);
			return attribute.getLinkedElement().getName();
		} else if (object instanceof Attribute) {
			final Attribute attribute = (Attribute) object;
			return attribute.getEModelElement().getName();
		} else if (object instanceof AttributeValueConstraint) {
			final AttributeValueConstraint attribute = (AttributeValueConstraint) object;
			return attribute.getEModelElement().getName();
		} else if (object instanceof AttributeVariableConstraint) {
			final AttributeVariableConstraint attribute = (AttributeVariableConstraint) object;
			return attribute.getPredicateSymbol();
		} else if (object instanceof Reference) {
			final Reference reference = (Reference) object;
			return reference.getEModelElement().getName();
		} else if (object instanceof org.gervarro.democles.constraint.emf.Reference) {
			final org.gervarro.democles.constraint.emf.Reference reference = org.gervarro.democles.constraint.emf.Reference.class
					.cast(object);
			return reference.getLinkedElement().getName();
		} else if (object instanceof Operation) {
			final Operation operation = (Operation) object;
			return operation.getEModelElement().getName();
		} else if (object instanceof org.gervarro.democles.constraint.PatternInvocationConstraintType) {
			final PatternInvocationConstraintType invocationConstraintType = org.gervarro.democles.constraint.PatternInvocationConstraintType.class
					.cast(object);
			final String modality = invocationConstraintType.isPositive() ? "exists" : "not exists";
			final org.gervarro.democles.specification.impl.Pattern invokedPattern = invocationConstraintType
					.getInvokedPattern();
			return String.format("%s %s", modality, describePatternName(invokedPattern));
		} else if (object instanceof PatternInvocationConstraint) {
			final PatternInvocationConstraint invocationConstraint = (PatternInvocationConstraint) object;
			final Pattern invokedPattern = invocationConstraint.getInvokedPattern();
			final String modality = invocationConstraint.isPositive() ? "exists" : "not exists";
			return String.format("%s %s", modality, describePatternName(invokedPattern));
		} else if (object instanceof org.gervarro.democles.specification.Constraint) {
			return org.gervarro.democles.specification.Constraint.class.cast(object).getType().toString();
		} else if (object instanceof Smaller) {
			return "<";
		} else if (object instanceof SmallerOrEqual) {
			return "<=";
		} else if (object instanceof Equal) {
			return "==";
		} else if (object instanceof Unequal) {
			return "!=";
		} else if (object instanceof LargerOrEqual) {
			return ">=";
		} else if (object instanceof Larger) {
			return ">";
		} else if (object instanceof ConstraintSpecification) {
			final ConstraintSpecification constraint = ConstraintSpecification.class.cast(object);
			return constraint.getSymbol();
		}
		return object.toString();
	}

	public static Object describe(final GeneratorOperation operation) {
		final StringBuilder sb = new StringBuilder();
		appendf(sb, "%s%s        [origin:%s]", operation.toString(), NL, describe(operation.getOrigin()));
		return sb.toString();
	}

	public static String describePatternName(final Pattern pattern) {
		return pattern == null ? "null" : pattern.getName();
	}

	private static Object describePatternName(final org.gervarro.democles.specification.Pattern pattern) {
		return pattern == null ? "null" : pattern.getName();
	}

	public static Object describeSymbolicParameters(final Pattern pattern) {
		return describeSymbolicParameters(pattern, NO_ADORNMENT);
	}

	public static String describeSymbolicParameters(final Pattern pattern, final Adornment adornment) {
		final StringBuilder sb = new StringBuilder();
		sb.append("[");
		final EList<Variable> parameters = pattern.getSymbolicParameters();
		for (int i = 0; i < parameters.size(); ++i) {
			final Variable parameter = parameters.get(i);
			sb.append(getName(parameter));

			if (adornment != NO_ADORNMENT)
				appendf(sb, "^%s", Adornments.describe(adornment.get(i)));
			if (i < parameters.size() - 1)
				sb.append(",");
		}
		sb.append("]");
		return sb.toString();
	}

	public static String describeLocalVariables(final Pattern pattern) {
		final StringBuilder sb = new StringBuilder();
		sb.append("[");
		final EList<Variable> localVariables = pattern.getBodies().get(0).getLocalVariables();
		for (int i = 0; i < localVariables.size(); ++i) {
			sb.append(getName(localVariables.get(i)));
			sb.append("^F");
			if (i < localVariables.size() - 1)
				sb.append(",");
		}
		sb.append("]");
		return sb.toString();
	}

	public static Object describe(final Object object) {
		if (object instanceof Constraint)
			return describe(Constraint.class.cast(object));
		if (object instanceof org.gervarro.democles.specification.Constraint)
			return describe(org.gervarro.democles.specification.Constraint.class.cast(object));
		else
			return object.toString();
	}

	/**
	 * Convenience function that uses {@link String#format(String, Object...)} for
	 * formatting the given format string and arguments and appending the result to
	 * the given {@link StringBuilder}
	 * 
	 * @param sb           the string builder
	 * @param formatString the format string
	 * @param args         the format string arguments
	 * @return sb (for chaining)
	 */
	private static StringBuilder appendf(final StringBuilder sb, final String formatString, final Object... args) {
		sb.append(String.format(formatString, args));
		return sb;
	}

}
