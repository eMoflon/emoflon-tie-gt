package org.moflon.compiler.sdm.democles.searchplan;

import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.plan.WeightedOperation;
import org.gervarro.democles.plan.common.SearchPlanOperationBuilder;

/**
 * Implementation base interface for all search-plan weighted operation builders
 * in TIE-GT Serves to abbreviate the long tail of type names
 * 
 * @author Roland Kluge - Initial implementation
 *
 */
public interface TieGtWeightedOperationBuilder extends
// Output type parameter
		SearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>,
// Input type parameter
				SearchPlanOperation<GeneratorOperation>> {

}