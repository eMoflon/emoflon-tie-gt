package org.moflon.tie.gt.ide.core.pattern.searchplan;

import java.util.HashMap;
import java.util.Map;

import org.moflon.sdm.compiler.democles.validation.scope.PatternMatcher;
import org.moflon.tie.gt.ide.core.patterns.PatternBuilderVisitor.PatternType;

/**
 * Stores a mapping from {@link PatternType} to {@link PatternMatcher}
 * 
 * @author Roland Kluge - Initial implementation
 */
public class PatternMatcherConfiguration {

	private final Map<String, PatternMatcher> fileExtensionToPatternMatcher;

	public PatternMatcherConfiguration(final Map<String, PatternMatcher> patternMatcherConfiguration) {
		this.fileExtensionToPatternMatcher = new HashMap<>(patternMatcherConfiguration);
	}

	/**
	 * Returns the pattern matcher associated with the given {@link PatternType}
	 * 
	 * @param patternType
	 *            the pattern type
	 * @return the {@link PatternMatcher}. May be <code>null</code>
	 */
	public PatternMatcher getPatternMatcher(final PatternType patternType) {
		final String key = patternType.getSuffix();
		return this.fileExtensionToPatternMatcher.get(key);
	}

}
