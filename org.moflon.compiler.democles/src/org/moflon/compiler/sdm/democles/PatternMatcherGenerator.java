package org.moflon.compiler.sdm.democles;

import java.util.stream.Collectors;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.gervarro.democles.codegen.Chain;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.compiler.CompilerPattern;
import org.gervarro.democles.compiler.CompilerPatternBody;
import org.gervarro.democles.specification.emf.Constraint;
import org.gervarro.democles.specification.emf.ConstraintParameter;
import org.gervarro.democles.specification.emf.ConstraintVariable;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Attribute;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.Reference;
import org.gervarro.democles.specification.emf.constraint.relational.Equal;
import org.gervarro.democles.specification.emf.constraint.relational.Larger;
import org.gervarro.democles.specification.emf.constraint.relational.LargerOrEqual;
import org.gervarro.democles.specification.emf.constraint.relational.Smaller;
import org.gervarro.democles.specification.emf.constraint.relational.SmallerOrEqual;
import org.gervarro.democles.specification.emf.constraint.relational.Unequal;
import org.moflon.compiler.sdm.democles.eclipse.AdapterResource;
import org.moflon.core.preferences.EMoflonPreferencesStorage;
import org.moflon.core.utilities.LogUtils;
import org.moflon.democles.reachability.javabdd.BDDReachabilityAnalyzer;
import org.moflon.democles.reachability.javabdd.NullReachabilityAnalyzer;
import org.moflon.democles.reachability.javabdd.ReachabilityAnalyzer;
import org.moflon.sdm.compiler.democles.validation.result.ErrorMessage;
import org.moflon.sdm.compiler.democles.validation.result.ResultFactory;
import org.moflon.sdm.compiler.democles.validation.result.Severity;
import org.moflon.sdm.compiler.democles.validation.result.ValidationReport;
import org.moflon.sdm.compiler.democles.validation.scope.impl.PatternMatcherImpl;

/**
 * This class is responsible for generating a search plan for patterns
 *
 * @author Gergely Varró - Initial implementation
 * @author Roland Kluge - Integration of reachability analysis
 *
 */
public abstract class PatternMatcherGenerator extends PatternMatcherImpl {
	protected final PatternMatcherCompiler patternMatcher;

	protected final String patternType;

	private final EMoflonPreferencesStorage preferencesStorage;

	/**
	 * Configures which search plan generator to use
	 * ({@link PatternMatcherCompiler}) and which pattern type is supported
	 * 
	 * @param patternMatcher the search plan generator to use
	 * @param patternType    the pattern type to use (see e.g.,
	 *                       {@link DefaultCodeGeneratorConfig#BLACK_PATTERN_MATCHER_GENERATOR})
	 */
	public PatternMatcherGenerator(final PatternMatcherCompiler patternMatcher, final String patternType,
			final EMoflonPreferencesStorage preferencesStorage) {
		this.patternMatcher = patternMatcher;
		this.patternType = patternType;
		this.preferencesStorage = preferencesStorage;
	}

	/**
	 * This method generates a search plan for the given pattern invocations
	 * (consisting of a {@link Pattern} and an input {@link Adornment})
	 * 
	 * @param pattern         the pattern of the pattern invocation
	 * @param adornment       the adornment of the pattern invocation
	 * @param isMultipleMatch if true, the search plan shall return all matches, if
	 *                        false the search plan shall return any match
	 * @return a validation report that may contain errors occurred during the
	 *         search plan generation
	 */
	@Override
	public ValidationReport generateSearchPlan(final Pattern pattern, final Adornment adornment,
			final boolean isMultipleMatch) {
		final ValidationReport report = ResultFactory.eINSTANCE.createValidationReport();
		final Logger logger = Logger.getLogger(getClass());
		LogUtils.debug(logger, "Generating search plan for '%s'.", pattern.getName());
		try {
			final EClass eClass = (EClass) ((AdapterResource) pattern.eResource()).getTarget();
			final CompilerPattern compilerPattern = patternMatcher.compilePattern(pattern, adornment);
			final CompilerPatternBody body = compilerPattern.getBodies().get(0);
			final ReachabilityAnalyzer reachabilityAnalyzer;
			if (preferencesStorage.getReachabilityEnabled()) {
				final int maximumAdornmentSize = preferencesStorage.getMaximumAdornmentSize();
				reachabilityAnalyzer = maximumAdornmentSize == EMoflonPreferencesStorage.REACHABILITY_MAX_ADORNMENT_SIZE_INFINITY //
						? new BDDReachabilityAnalyzer() //
						: new BDDReachabilityAnalyzer(maximumAdornmentSize);
			} else {
				reachabilityAnalyzer = new NullReachabilityAnalyzer();
			}
			final boolean isReachable = reachabilityAnalyzer.analyzeReachability(compilerPattern, adornment);
			if (isReachable) {
				final Chain<GeneratorOperation> searchPlan = PatternMatcherCompiler.generateSearchPlan(body, adornment);
				final SearchPlanAdapter adapter = createSearchPlanAdapter(body, adornment, searchPlan, isMultipleMatch);
				eClass.eAdapters().add(adapter);
			} else {
				createAndAddErrorMessage(pattern, report, "Reachability analysis was negative.");
			}
		} catch (final RuntimeException e) {
			if (exceptionMessageIndicatesThatNoSearchPlanExists(e)) {
				createAndAddErrorMessage(pattern, report, null);
			} else {
				final String shortMessage = String.format(
						"%s occured with error message: %s (see debug output for details)", e.getClass(),
						e.getMessage());
				createAndAddErrorMessage(pattern, report, shortMessage);
				final String stacktrace = ExceptionUtils.getStackTrace(e);
				LogUtils.debug(logger, "%s\nStack trace: %s", shortMessage, stacktrace);
			}

			LogUtils.debug(logger, "Adornment: %s", adornment);
			LogUtils.debug(logger, "Symbolic parameters: %s", pattern.getSymbolicParameters().stream()
					.map(parameter -> EMFVariable.class.cast(parameter).getName()).collect(Collectors.toList()));
			for (final PatternBody body : pattern.getBodies()) {
				for (final Constraint constraint : body.getConstraints()) {
					LogUtils.debug(logger, "  %s", describeConstraint(constraint));
				}
			}

		}
		return report;
	}

	private Object describeConstraint(final Constraint constraint) {
		final StringBuilder sb = new StringBuilder();
		sb.append(describeConstraintName(constraint));
		sb.append("(");
		for (final ConstraintParameter parameter : constraint.getParameters()) {
			final ConstraintVariable reference = parameter.getReference();
			final EMFVariable emfVariable = (EMFVariable) reference;
			sb.append(emfVariable.getName());
			sb.append(",");
		}
		sb.replace(sb.length() - 1, sb.length(), ")");
		sb.append("    [class: ").append(constraint).append("]");
		return sb.toString();
	}

	private String describeConstraintName(final Constraint constraint) {
		if (constraint instanceof Attribute) {
			final Attribute attribute = (Attribute) constraint;
			return attribute.getEModelElement().getName();
		} else if (constraint instanceof Reference) {
			final Reference reference = (Reference) constraint;
			return reference.getEModelElement().getName();
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

	/**
	 * Checks whether the message of the given {@link RuntimeException} indicates
	 * that the search plan algorithm could not find a result
	 * 
	 * @param e the exception
	 * @return whether the exception indicates that the search plan generation
	 *         failed
	 */
	private boolean exceptionMessageIndicatesThatNoSearchPlanExists(final RuntimeException e) {
		final String magicKeyword = "No valid search plan is available";
		return e.getMessage() != null && e.getMessage().contains(magicKeyword);
	}

	/**
	 * Search plan adapter generation strategy to be implemented by subclasses.
	 * 
	 * @param body            the body of the processed {@link Pattern}
	 * @param adornment       the input {@link Adornment}
	 * @param searchPlan      the search plan generated from the
	 *                        {@link CompilerPatternBody} and the {@link Adornment}
	 * @param multipleMatches (see isMultipleMatch in
	 *                        {@link #generateSearchPlan(Pattern, Adornment, boolean)})
	 * @return
	 */
	public abstract SearchPlanAdapter createSearchPlanAdapter(final CompilerPatternBody body, final Adornment adornment,
			final Chain<GeneratorOperation> searchPlan, final boolean multipleMatches);

	/**
	 * Creates a 'no search plan found' error for the given {@link Pattern} and
	 * attaches it to the {@link ValidationReport}.
	 * 
	 * @param pattern the pattern
	 * @param report  the report
	 * @param details details about the error message
	 */
	static void createAndAddErrorMessage(final Pattern pattern, final ValidationReport report, final String details) {
		final ErrorMessage error = ResultFactory.eINSTANCE.createErrorMessage();
		report.getErrorMessages().add(error);
		final String detailsFragment = details != null ? String.format(" Details: '%s'.", details) : "";
		error.setId(String.format(
				"No search plan found for pattern '%s'. Please ensure that your patterns are not disjunct.%s",
				pattern.getName(), detailsFragment));
		error.setSeverity(Severity.ERROR);
	}

}
