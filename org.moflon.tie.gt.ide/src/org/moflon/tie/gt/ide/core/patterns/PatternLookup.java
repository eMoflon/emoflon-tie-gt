package org.moflon.tie.gt.ide.core.patterns;

import java.util.HashMap;
import java.util.Map;

import org.gervarro.democles.specification.emf.Pattern;
import org.moflon.tie.gt.compiler.democles.pattern.DemoclesPatternType;
import org.moflon.tie.gt.ide.core.patterns.util.Patterns;

public class PatternLookup {

	private final Map<DemoclesPatternType, Pattern> lookupData = new HashMap<>();

	public boolean hasBindingAndBlack() {
		return contains(DemoclesPatternType.BINDING_AND_BLACK_PATTERN);
	}

	public boolean contains(final DemoclesPatternType type) {
		return lookupData.containsKey(type);
	}

	public Pattern get(final DemoclesPatternType patternType) {
		if (!contains(patternType))
			add(patternType);
		return lookupData.get(patternType);
	}

	public Pattern getBlackPattern() {
		return get(DemoclesPatternType.BLACK_PATTERN);
	}

	public Pattern getBindingPattern() {
		return get(DemoclesPatternType.BINDING_PATTERN);
	}

	public Pattern getBindingAndBlackPattern() {
		return get(DemoclesPatternType.BINDING_AND_BLACK_PATTERN);
	}

	private Pattern add(final DemoclesPatternType patternType) {
		if (contains(patternType))
			return get(patternType);
		else {
			final Pattern pattern = Patterns.createEmptyPattern();
			add(patternType, pattern);
			return pattern;
		}
	}

	public Pattern add(final DemoclesPatternType patternType, final Pattern pattern) {
		return lookupData.put(patternType, pattern);
	}

	public Pattern addExpressionPattern() {
		return add(DemoclesPatternType.EXPRESSION_PATTERN);
	}

	public Pattern addBindingAndBlackPattern() {
		return add(DemoclesPatternType.BINDING_AND_BLACK_PATTERN);
	}

	public Pattern addBindingPattern() {
		return add(DemoclesPatternType.BINDING_PATTERN);
	}

	@Override
	public String toString() {
		return String.format("PatternLookup: %s", lookupData.toString());
	}

}
