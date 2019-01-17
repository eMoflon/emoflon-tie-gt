package org.moflon.tie.gt.compiler.democles.searchplan;

import java.util.HashMap;
import java.util.Map;

import org.moflon.tie.gt.compiler.democles.pattern.DemoclesPatternType;

/**
 * Stores a mapping from {@link DemoclesPatternType} to {@link PatternMatcher}
 * 
 * @author Roland Kluge - Initial implementation
 */
public class PatternMatcherConfiguration {

	private final Map<DemoclesPatternType, PatternMatcher> fileExtensionToPatternMatcher;

	public PatternMatcherConfiguration(final Map<DemoclesPatternType, PatternMatcher> patternMatcherConfiguration) {
		fileExtensionToPatternMatcher = new HashMap<>(patternMatcherConfiguration);
	}

	/**
	 * Returns the pattern matcher associated with the given
	 * {@link DemoclesPatternType}
	 * 
	 * @param patternType the pattern type
	 * @return the {@link PatternMatcher}. May be <code>null</code> is no pattern
	 *         matcher is registered for the given {@link DemoclesPatternType}
	 */
	public PatternMatcher getPatternMatcher(final DemoclesPatternType patternType) {
		return fileExtensionToPatternMatcher.get(patternType);
	}

}
