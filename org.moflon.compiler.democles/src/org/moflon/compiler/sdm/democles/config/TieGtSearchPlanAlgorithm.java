package org.moflon.compiler.sdm.democles.config;

import java.util.List;

import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.SimpleCombiner;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.plan.WeightedOperation;
import org.gervarro.democles.plan.common.DefaultAlgorithm;
import org.gervarro.democles.plan.common.SearchPlanOperationBuilder;

/**
 * Same as {@link DefaultAlgorithm}, but provides access to the configured
 * search plan operation builders
 * 
 * @author Roland Kluge - Initial implementation
 *
 */
public class TieGtSearchPlanAlgorithm
		extends DefaultAlgorithm<SimpleCombiner, SearchPlanOperation<GeneratorOperation>, GeneratorOperation> {

	private final List<SearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, GeneratorOperation>> accessibleSearchPlanOperationBuilders;

	public TieGtSearchPlanAlgorithm(
			final List<SearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, GeneratorOperation>> searchPlanOperationBuilders) {
		super(searchPlanOperationBuilders);

		this.accessibleSearchPlanOperationBuilders = searchPlanOperationBuilders;
	}

	/**
	 * @return the list of {@link SearchPlanOperationBuilder} objects configured via
	 *         {@link #TieGtSearchPlanAlgorithm(List)}
	 */
	public List<SearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, GeneratorOperation>> getOperationBuilders() {
		return accessibleSearchPlanOperationBuilders;
	}

}
