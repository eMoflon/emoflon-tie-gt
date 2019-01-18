package org.moflon.tie.gt.compiler.democles.searchplan;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.gervarro.democles.codegen.Chain;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.compiler.CompilerPattern;
import org.gervarro.democles.compiler.CompilerPatternBody;
import org.gervarro.democles.plan.WeightedOperation;
import org.gervarro.democles.plan.common.SearchPlanOperationBuilder;
import org.gervarro.democles.specification.emf.Pattern;
import org.moflon.core.preferences.EMoflonPreferencesStorage;
import org.moflon.core.utilities.LogUtils;
import org.moflon.tie.gt.compiler.democles.eclipse.AdapterResource;
import org.moflon.tie.gt.compiler.democles.pattern.PatternPrintingUtil;
import org.moflon.tie.gt.reachability.BDDReachabilityAnalyzer;
import org.moflon.tie.gt.reachability.NullReachabilityAnalyzer;
import org.moflon.tie.gt.reachability.ReachabilityAnalyzer;

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
	public IStatus generateSearchPlan(final Pattern pattern, final Adornment adornment, final boolean isMultipleMatch) {
		LogUtils.debug(logger, "Generating search plan for '%s'.", pattern.getName());
		final EClass eClass = (EClass) ((AdapterResource) pattern.eResource()).getTarget();
		final CompilerPattern compilerPattern = patternMatcher.compilePattern(pattern, adornment);
		final CompilerPatternBody body = compilerPattern.getBodies().get(0);
		try {

			final ReachabilityAnalyzer reachabilityAnalyzer = initializeReachabilityAnalyzer();
			final boolean isReachable = reachabilityAnalyzer.analyzeReachability(compilerPattern, adornment);
			if (isReachable) {
				final Chain<GeneratorOperation> searchPlan = PatternMatcherCompiler.generateSearchPlan(body, adornment);
				final SearchPlanAdapter adapter = createSearchPlanAdapter(body, adornment, searchPlan, isMultipleMatch);
				eClass.eAdapters().add(adapter);
			} else {
				return createAndAddErrorMessage(pattern,
						new IllegalArgumentException("Reachability analysis was negative."));
			}
		} catch (final RuntimeException e) {
			return handleExceptionDuringSearchPlanGeneration(pattern, body, adornment, e);
		}
		return Status.OK_STATUS;
	}

	public ReachabilityAnalyzer initializeReachabilityAnalyzer() {
		final ReachabilityAnalyzer reachabilityAnalyzer;
		if (CodeGenerationPreferences.getReachabilityEnabled()) {
			final int maximumAdornmentSize = CodeGenerationPreferences.getMaximumAdornmentSize();
			reachabilityAnalyzer = maximumAdornmentSize == CodeGenerationPreferences.REACHABILITY_MAX_ADORNMENT_SIZE_INFINITY //
					? new BDDReachabilityAnalyzer() //
					: new BDDReachabilityAnalyzer(maximumAdornmentSize);
		} else {
			reachabilityAnalyzer = new NullReachabilityAnalyzer();
		}
		return reachabilityAnalyzer;
	}

	private Status handleExceptionDuringSearchPlanGeneration(final Pattern pattern, final CompilerPatternBody body,
			final Adornment adornment, final RuntimeException exception) {
		final Status status;
		if (exceptionMessageIndicatesThatNoSearchPlanExists(exception)) {
			status = createAndAddErrorMessage(pattern, null);
		} else {
			status = createAndAddErrorMessage(pattern, exception);
		}

		if (logger.isDebugEnabled()) {
			final List<SearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, GeneratorOperation>> compilerSearchPlanAlgorithm = this.patternMatcher
					.getCompilablePatternBuilder().getAlgorithm().getSearchPlanAlgorithm().getOperationBuilders();
			final String formattedPattern = PatternPrintingUtil.describe(pattern, body, adornment,
					compilerSearchPlanAlgorithm);
			LogUtils.debug(logger, "Debug information of search plan generation%s%s", PatternPrintingUtil.NL,
					formattedPattern);
		}
		return status;
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

}
