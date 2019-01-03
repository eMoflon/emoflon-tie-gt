package org.moflon.tie.gt.ide.core.patterns;

import java.util.HashMap;
import java.util.Map;

import org.gervarro.democles.specification.emf.Pattern;
import org.moflon.compiler.sdm.democles.DemoclesPatternType;

public class PatternLookup {

	private final Map<DemoclesPatternType, Pattern> lookupData = new HashMap<>();

	public boolean hasPatternForType(final DemoclesPatternType type) {
		return lookupData.containsKey(type);
	}

	public Pattern getPatternForType(final DemoclesPatternType patternType) {
		return lookupData.get(patternType);
	}

	public Pattern registerPattern(final DemoclesPatternType patternType, final Pattern pattern) {
		return lookupData.put(patternType, pattern);
	}

	public Pattern getBlackPattern() {
		return getPatternForType(DemoclesPatternType.BLACK_PATTERN);
	}

	public Pattern getBindingPattern() {
		return getPatternForType(DemoclesPatternType.BINDING_PATTERN);
	}
}
