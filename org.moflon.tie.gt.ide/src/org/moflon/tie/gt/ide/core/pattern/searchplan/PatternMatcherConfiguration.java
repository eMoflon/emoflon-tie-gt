package org.moflon.tie.gt.ide.core.pattern.searchplan;

import java.util.HashMap;
import java.util.Map;

import org.moflon.codegen.PatternMatcher;
import org.moflon.compiler.sdm.democles.DemoclesPatternType;

/**
 * Stores a mapping from {@link DemoclesPatternType} to {@link PatternMatcher}
 * 
 * @author Roland Kluge - Initial implementation
 */
public class PatternMatcherConfiguration {

	private final Map<String, PatternMatcher> fileExtensionToPatternMatcher;

	public PatternMatcherConfiguration(final Map<String, PatternMatcher> patternMatcherConfiguration) {
		this.fileExtensionToPatternMatcher = new HashMap<>(patternMatcherConfiguration);
	}

	/**
	 * Returns the pattern matcher associated with the given {@link DemoclesPatternType}
	 * 
	 * @param patternType the pattern type
	 * @return the {@link PatternMatcher}. May be <code>null</code>
	 */
	public PatternMatcher getPatternMatcher(final DemoclesPatternType patternType) {
		final String key = patternType.getSuffix();
		return this.fileExtensionToPatternMatcher.get(key);
	}

}
