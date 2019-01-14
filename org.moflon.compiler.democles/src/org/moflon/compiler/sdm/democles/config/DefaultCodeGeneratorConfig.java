package org.moflon.compiler.sdm.democles.config;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.moflon.codegen.PatternMatcher;
import org.moflon.compiler.sdm.democles.searchplan.ExpressionPatternMatcherGenerator;
import org.moflon.compiler.sdm.democles.searchplan.PatternMatcherCompiler;
import org.moflon.compiler.sdm.democles.searchplan.RegularPatternMatcherGenerator;
import org.moflon.core.preferences.EMoflonPreferencesStorage;

public class DefaultCodeGeneratorConfig extends DefaultValidatorConfig {
	public static final String BINDING_AND_BLACK_PATTERN_MATCHER_GENERATOR = "BindingAndBlackPatternMatcherGenerator";
	public static final String BINDING_PATTERN_MATCHER_GENERATOR = "BindingPatternMatcherGenerator";
	public static final String BLACK_PATTERN_MATCHER_GENERATOR = "BlackPatternMatcherGenerator";
	public static final String RED_PATTERN_MATCHER_GENERATOR = "RedPatternMatcherGenerator";
	public static final String GREEN_PATTERN_MATCHER_GENERATOR = "GreenPatternMatcherGenerator";
	public static final String EXPRESSION_PATTERN_MATCHER_GENERATOR = "ExpressionPatternMatcherGenerator";

	public DefaultCodeGeneratorConfig(final ResourceSet resourceSet,
			final EMoflonPreferencesStorage preferencesStorage) {
		super(resourceSet, preferencesStorage);
	}

	@Override
	protected PatternMatcher configureBindingAndBlackPatternMatcher() throws IOException {
		final PatternMatcherCompiler bindingAndBlackPatternMatcherCompiler = configureBindingAndBlackPatternMatcherCompiler();
		return createAndRegisterRegularPatternMatcherGenerator(bindingAndBlackPatternMatcherCompiler,
				BINDING_AND_BLACK_PATTERN_MATCHER_GENERATOR);
	}

	@Override
	protected PatternMatcher configureBindingPatternMatcher() throws IOException {
		final PatternMatcherCompiler bindingPatternMatcherCompiler = configureBindingPatternMatcherCompiler();
		return createAndRegisterRegularPatternMatcherGenerator(bindingPatternMatcherCompiler,
				BINDING_PATTERN_MATCHER_GENERATOR);
	}

	@Override
	protected PatternMatcher configureBlackPatternMatcher() throws IOException {
		final PatternMatcherCompiler blackPatternMatcherCompiler = configureBlackPatternMatcherCompiler();
		return createAndRegisterRegularPatternMatcherGenerator(blackPatternMatcherCompiler,
				BLACK_PATTERN_MATCHER_GENERATOR);
	}

	@Override
	protected PatternMatcher configureRedPatternMatcher() throws IOException {
		final PatternMatcherCompiler redPatternMatcherCompiler = configureRedPatternMatcherCompiler();
		return createAndRegisterRegularPatternMatcherGenerator(redPatternMatcherCompiler,
				RED_PATTERN_MATCHER_GENERATOR);
	}

	@Override
	protected PatternMatcher configureGreenPatternMatcher() throws IOException {
		final PatternMatcherCompiler greenPatternMatcherCompiler = configureGreenPatternMatcherCompiler();
		return createAndRegisterRegularPatternMatcherGenerator(greenPatternMatcherCompiler,
				GREEN_PATTERN_MATCHER_GENERATOR);
	}

	@Override
	protected PatternMatcher configureExpressionPatternMatcher() throws IOException {
		final PatternMatcherCompiler expressionPatternMatcherCompiler = configureExpressionPatternMatcherCompiler();
		final ExpressionPatternMatcherGenerator expressionPatternMatcherGenerator = new ExpressionPatternMatcherGenerator(
				expressionPatternMatcherCompiler, EXPRESSION_PATTERN_MATCHER_GENERATOR, getPreferencesStorage());
		return expressionPatternMatcherGenerator;
	}

	/**
	 * Creates a {@link RegularPatternMatcherGenerator} from the given
	 * {@link PatternMatcherCompiler} and registers it a the {@link Resource}
	 *
	 * @param patternMatcherCompiler
	 * @param generatorName
	 * @param resource
	 * @return
	 */
	private PatternMatcher createAndRegisterRegularPatternMatcherGenerator(
			final PatternMatcherCompiler patternMatcherCompiler, final String generatorName) {
		final RegularPatternMatcherGenerator bindingAndBlackPatternMatcherGenerator = new RegularPatternMatcherGenerator(
				patternMatcherCompiler, generatorName, getPreferencesStorage());
		return bindingAndBlackPatternMatcherGenerator;
	}
}
