package org.moflon.tie.gt.compiler.democles.searchplan;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.gervarro.democles.codegen.Chain;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.compiler.CompilerPattern;
import org.gervarro.democles.compiler.CompilerPatternBody;
import org.gervarro.democles.specification.emf.EMFPatternBuilder;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.impl.DefaultPattern;
import org.gervarro.democles.specification.impl.DefaultPatternBody;

public class PatternMatcherCompiler extends PatternMatcher {
	private final EMFPatternBuilder<DefaultPattern, DefaultPatternBody> patternBuilder;
	private final TieGtCompilerPatternMatcherModule compilablePatternBuilder;

	public PatternMatcherCompiler(final EMFPatternBuilder<DefaultPattern, DefaultPatternBody> patternBuilder,
			final TieGtCompilerPatternMatcherModule CompilerPatternMatcherModule) {
		this.patternBuilder = patternBuilder;
		this.compilablePatternBuilder = CompilerPatternMatcherModule;
	}

	@Override
	public IStatus generateSearchPlan(final Pattern pattern, final Adornment adornment, final boolean isMultipleMatch) {
		try {
			generateSearchPlan(compilePattern(pattern, adornment), adornment);
			return Status.OK_STATUS;
		} catch (final RuntimeException e) {
			return createAndAddErrorMessage(pattern, e);
		}
	}

	public EMFPatternBuilder<DefaultPattern, DefaultPatternBody> getPatternBuilder() {
		return patternBuilder;
	}

	public TieGtCompilerPatternMatcherModule getCompilablePatternBuilder() {
		return compilablePatternBuilder;
	}

	protected CompilerPattern compilePattern(final Pattern pattern, final Adornment adornment) {
		final org.gervarro.democles.specification.impl.DefaultPattern patternRuntime = getPatternBuilder()
				.build(pattern);
		return getCompilablePatternBuilder().build(patternRuntime);
	}

	protected static Chain<GeneratorOperation> generateSearchPlan(final CompilerPatternBody body,
			final Adornment adornment) {
		final Adornment bodyAdornment = body.calculateAdornment(adornment);
		return body.getHeader().getBuilder().generateSearchPlan(body, bodyAdornment).getRoot();
	}

	private static Chain<GeneratorOperation> generateSearchPlan(final CompilerPattern pattern,
			final Adornment adornment) {
		final CompilerPatternBody body = pattern.getBodies().get(0);
		return generateSearchPlan(body, adornment);
	}
}
