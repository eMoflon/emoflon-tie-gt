package org.moflon.tie.gt.compiler.democles.searchplan;

import org.gervarro.democles.common.SearchPlanAlgorithm;
import org.gervarro.democles.compiler.CompilerPatternMatcherModule;
import org.gervarro.democles.compiler.CompilerSearchPlanAlgorithm;

/**
 * Same as {@link CompilerPatternMatcherModule}, but provides access to the
 * configured algorithm
 * 
 * @author Roland Kluge - Initial implementation
 *
 */
public class TieGtCompilerPatternMatcherModule extends CompilerPatternMatcherModule {

	private TieGtCompilerSearchPlanAlgorithm accessibleAlgorithm;

	/**
	 * Stores the given algorithm via
	 * {@link #setSearchPlanAlgorithm(SearchPlanAlgorithm)} and makes it accessible
	 * via {@link #getAlgorithm()}
	 * 
	 * @param algorithm the compiler search plan algorithm. Must be a subtype of
	 *                  {@link TieGtCompilerSearchPlanAlgorithm}
	 */
	public void setAlgorithm(final CompilerSearchPlanAlgorithm algorithm) {
		this.setSearchPlanAlgorithm(algorithm);
		this.accessibleAlgorithm = (TieGtCompilerSearchPlanAlgorithm) algorithm;
	}

	/**
	 * @return the algorithm configured via
	 *         {@link #setAlgorithm(CompilerSearchPlanAlgorithm)}
	 */
	public TieGtCompilerSearchPlanAlgorithm getAlgorithm() {
		return accessibleAlgorithm;
	}
}
