package org.moflon.compiler.sdm.democles;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.gervarro.democles.codegen.Chain;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.compiler.CompilerPattern;
import org.gervarro.democles.compiler.CompilerPatternBody;
import org.gervarro.democles.specification.emf.Constraint;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.moflon.codegen.PatternMatcher;
import org.moflon.codegen.preferences.TieGtCodeGenerationPreferences;
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

/**
 * This class is responsible for generating a search plan for patterns
 *
 * @author Gergely Varró - Initial implementation
 * @author Roland Kluge - Integration of reachability analysis
 *
 */
public abstract class PatternMatcherGenerator extends PatternMatcher {
	protected final PatternMatcherCompiler patternMatcher;

	protected final String patternType;

	private final Logger logger = Logger.getLogger(getClass());

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
		LogUtils.debug(logger, "Generating search plan for '%s'.", pattern.getName());
		final EClass eClass = (EClass) ((AdapterResource) pattern.eResource()).getTarget();
		final CompilerPattern compilerPattern = patternMatcher.compilePattern(pattern, adornment);
		final CompilerPatternBody body = compilerPattern.getBodies().get(0);
		try {

			final ReachabilityAnalyzer reachabilityAnalyzer;
			if (TieGtCodeGenerationPreferences.getReachabilityEnabled()) {
				final int maximumAdornmentSize = TieGtCodeGenerationPreferences.getMaximumAdornmentSize();
				reachabilityAnalyzer = maximumAdornmentSize == TieGtCodeGenerationPreferences.REACHABILITY_MAX_ADORNMENT_SIZE_INFINITY //
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
			handleExceptionDuringSearchPlanGeneration(pattern, body, adornment, report, e);

		}
		return report;
	}

	private void handleExceptionDuringSearchPlanGeneration(final Pattern pattern, final CompilerPatternBody body,
			final Adornment adornment, final ValidationReport report, final RuntimeException exception) {
		if (exceptionMessageIndicatesThatNoSearchPlanExists(exception)) {
			createAndAddErrorMessage(pattern, report, null);
		} else {
			final String shortMessage = String.format(
					"%s occured with error message: %s (see debug output for details)", exception.getClass(),
					exception.getMessage());
			createAndAddErrorMessage(pattern, report, shortMessage);
			final String stacktrace = ExceptionUtils.getStackTrace(exception);
			LogUtils.debug(logger, "%s\nStack trace: %s", shortMessage, stacktrace);
		}

		LogUtils.debug(logger, "Symbolic parameters: %s", PatternUtils.describeSymbolicParameters(pattern, adornment));
		final PatternBody originalPattern = pattern.getBodies().get(0);
		LogUtils.debug(logger, "Constraints");
		for (final Constraint constraint : originalPattern.getConstraints()) {
			LogUtils.debug(logger, "  %s", PatternUtils.describeConstraint(constraint));
		}
		LogUtils.debug(logger, "Operations");
		for (final GeneratorOperation operation : body.getOperations()) {
			LogUtils.debug(logger, "  %s", PatternUtils.describeOperation(operation));
		}

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
