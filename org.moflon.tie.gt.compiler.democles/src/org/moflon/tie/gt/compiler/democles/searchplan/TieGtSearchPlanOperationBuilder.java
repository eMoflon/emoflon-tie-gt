package org.moflon.tie.gt.compiler.democles.searchplan;

import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.plan.common.SearchPlanOperationBuilder;

/**
 * Implementation base interface for all search-plan operation builders in
 * TIE-GT Serves to abbreviate the long tail of type names
 * 
 * @author Roland Kluge - Initial implementation
 *
 */
public interface TieGtSearchPlanOperationBuilder extends SearchPlanOperationBuilder<
		// Output type parameter
		SearchPlanOperation<GeneratorOperation>,
		// Input type parameter
		GeneratorOperation> {

}