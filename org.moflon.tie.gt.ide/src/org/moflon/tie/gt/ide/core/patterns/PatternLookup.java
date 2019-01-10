package org.moflon.tie.gt.ide.core.patterns;

import java.util.HashMap;
import java.util.Map;

import org.gervarro.democles.specification.emf.Pattern;
import org.moflon.compiler.sdm.democles.DemoclesPatternType;
import org.moflon.tie.gt.ide.core.patterns.util.Patterns;

public class PatternLookup {

	private final Map<DemoclesPatternType, Pattern> lookupData = new HashMap<>();

	public boolean hasPatternForType(final DemoclesPatternType type) {
		return lookupData.containsKey(type);
	}

	public Pattern getPattern(final DemoclesPatternType patternType) {
		return lookupData.get(patternType);
	}

	public Pattern registerPattern(final DemoclesPatternType patternType, final Pattern pattern) {
		return lookupData.put(patternType, pattern);
	}

	public Pattern getBlackPattern() {
		return getPattern(DemoclesPatternType.BLACK_PATTERN);
	}

	public Pattern getBindingPattern() {
		return getPattern(DemoclesPatternType.BINDING_PATTERN);
	}

	@Override
	public String toString() {
		return String.format("PatternLookup: %s", lookupData.toString());
	}

	Pattern createAndRegisterPattern(final DemoclesPatternType patternType) {
		final Pattern pattern = Patterns.createEmptyPattern();
		registerPattern(patternType, pattern);
		return pattern;
	}

	Pattern createAndRegisterExpressionPattern() {
		return createAndRegisterPattern(DemoclesPatternType.EXPRESSION_PATTERN);
	}
}
