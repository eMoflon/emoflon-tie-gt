package org.moflon.compiler.sdm.democles;

import org.gervarro.democles.common.OperationRuntime;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.plan.WeightedOperation;
import org.gervarro.democles.plan.common.SearchPlanOperationBuilder;

/**
 * Implementation base interface for all search-plan operation builders in
 * TIE-GT Serves to abbreviate the long tail of type names
 * 
 * @author Roland Kluge - Initial implementation
 *
 */
public interface TieGtSearchPlanOperationBuilder extends
		SearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<OperationRuntime>, Integer>, SearchPlanOperation<OperationRuntime>> {

}