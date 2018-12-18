package org.moflon.tie.gt.ide.core.patterns.util;

import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.SpecificationFactory;

//TODO@rkluge: Make utility class
public class PatternUtil {

	/**
	 * Creates a {@link Pattern} with a single empty {@link PatternBody}
	 * 
	 * @return an empty pattern
	 */
	public static Pattern createEmptyPattern() {
		final Pattern pattern = SpecificationFactory.eINSTANCE.createPattern();
		final PatternBody body = SpecificationFactory.eINSTANCE.createPatternBody();
		pattern.getBodies().add(body);
		return pattern;
	}

	/**
	 * Returns the first {@link PatternBody} of the given pattern.
	 * 
	 * By convention, a {@link Pattern} in TIE-GT has exactly one
	 * {@link PatternBody}.
	 * 
	 * @param pattern
	 * @return
	 */
	public static PatternBody getBody(final Pattern pattern) {
		return pattern.getBodies().get(0);
	}

}
