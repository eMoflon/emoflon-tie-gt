package org.moflon.compiler.sdm.democles;

import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.compiler.CompilerPattern;
import org.gervarro.democles.compiler.CompilerPatternMatcherModule;
import org.gervarro.democles.specification.emf.EMFPatternBuilder;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.impl.DefaultPattern;
import org.gervarro.democles.specification.impl.DefaultPatternBody;

public class BindingAndBlackPatternMatcherCompiler extends PatternMatcherCompiler {

	public BindingAndBlackPatternMatcherCompiler(
			final EMFPatternBuilder<DefaultPattern, DefaultPatternBody> patternBuilder,
			final CompilerPatternMatcherModule CompilerPatternMatcherModule) {
		super(patternBuilder, CompilerPatternMatcherModule);
	}

	protected CompilerPattern compilePattern(final Pattern pattern, final Adornment adornment) {
		final org.gervarro.democles.specification.impl.DefaultPattern patternRuntime = patternBuilder.build(pattern);
		final TieGtOperationBuilder builder = new BindingAndBlackOperationBuilder(pattern, adornment);
		compilablePatternBuilder.addOperationBuilder(builder);
		try {
			final CompilerPattern compilerPattern = compilablePatternBuilder.build(patternRuntime);
			compilerPattern.getBodies().get(0).getOperations();
			return compilerPattern;
		} finally {
			compilablePatternBuilder.removeOperationBuilder(builder);
		}
	}
}
