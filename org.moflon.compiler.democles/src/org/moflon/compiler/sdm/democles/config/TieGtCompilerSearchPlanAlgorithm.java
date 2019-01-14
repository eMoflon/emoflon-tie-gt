package org.moflon.compiler.sdm.democles.config;

import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.SimpleCombiner;
import org.gervarro.democles.common.runtime.LocalSearchPlanAlgorithm;
import org.gervarro.democles.compiler.CompilerSearchPlanAlgorithm;

/**
 * Same as {@link CompilerSearchPlanAlgorithm}, but provides access to the
 * configured search plan algorithm
 * 
 * @author Roland Kluge - Initial implementation
 *
 */
public class TieGtCompilerSearchPlanAlgorithm extends CompilerSearchPlanAlgorithm {

	private final TieGtSearchPlanAlgorithm accessibleSearchPlanAlgorithm;

	/**
	 * Delegates to
	 * {@link CompilerSearchPlanAlgorithm#CompilerSearchPlanAlgorithm(LocalSearchPlanAlgorithm)}
	 * and stores the search plan algorithm for access via
	 * {@link #getSearchPlanAlgorithm()}
	 * 
	 * @param searchPlanAlgorithm the search plan algorithm. Must be a subtype of
	 *                            {@link TieGtSearchPlanAlgorithm}
	 */
	public TieGtCompilerSearchPlanAlgorithm(
			final LocalSearchPlanAlgorithm<SimpleCombiner, GeneratorOperation> searchPlanAlgorithm) {
		super(searchPlanAlgorithm);

		this.accessibleSearchPlanAlgorithm = (TieGtSearchPlanAlgorithm) searchPlanAlgorithm;
	}

	/**
	 * @return the search plan algorithm configured via
	 *         {@link #TieGtCompilerSearchPlanAlgorithm(LocalSearchPlanAlgorithm)}
	 */
	public TieGtSearchPlanAlgorithm getSearchPlanAlgorithm() {
		return accessibleSearchPlanAlgorithm;
	}
}
