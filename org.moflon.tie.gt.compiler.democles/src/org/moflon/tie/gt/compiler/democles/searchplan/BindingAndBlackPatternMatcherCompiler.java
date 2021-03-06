package org.moflon.tie.gt.compiler.democles.searchplan;

import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.compiler.CompilerPattern;
import org.gervarro.democles.specification.emf.EMFPatternBuilder;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.impl.DefaultPattern;
import org.gervarro.democles.specification.impl.DefaultPatternBody;

public class BindingAndBlackPatternMatcherCompiler extends PatternMatcherCompiler {

	public BindingAndBlackPatternMatcherCompiler(
			final EMFPatternBuilder<DefaultPattern, DefaultPatternBody> patternBuilder,
			final TieGtCompilerPatternMatcherModule compilerPatternMatcherModule) {
		super(patternBuilder, compilerPatternMatcherModule);
	}

	protected CompilerPattern compilePattern(final Pattern pattern, final Adornment adornment) {
		final org.gervarro.democles.specification.impl.DefaultPattern patternRuntime = getPatternBuilder()
				.build(pattern);
		final TieGtOperationBuilder builder = new BindingAndBlackOperationBuilder(pattern, adornment);
		getCompilablePatternBuilder().addOperationBuilder(builder);
		try {
			final CompilerPattern compilerPattern = getCompilablePatternBuilder().build(patternRuntime);
			compilerPattern.getBodies().get(0).getOperations();
			return compilerPattern;
		} finally {
			getCompilablePatternBuilder().removeOperationBuilder(builder);
		}
	}
}
