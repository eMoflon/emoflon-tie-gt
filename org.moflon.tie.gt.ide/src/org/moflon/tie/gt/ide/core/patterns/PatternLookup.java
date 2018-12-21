package org.moflon.tie.gt.ide.core.patterns;

import java.util.HashMap;
import java.util.Map;

import org.gervarro.democles.specification.emf.Pattern;

public class PatternLookup {

	private final Map<PatternType, Pattern> lookupData = new HashMap<>();

	public boolean hasPatternForType(final PatternType type) {
		return lookupData.containsKey(type);
	}

	public Pattern getPatternForType(final PatternType patternType) {
		return lookupData.get(patternType);
	}

	public Pattern registerPattern(final PatternType patternType, final Pattern pattern) {
		return lookupData.put(patternType, pattern);
	}

	public Pattern getBlackPattern() {
		return getPatternForType(PatternType.BLACK_PATTERN);
	}

	public Pattern getBindingPattern() {
		return getPatternForType(PatternType.BINDING_PATTERN);
	}
}
