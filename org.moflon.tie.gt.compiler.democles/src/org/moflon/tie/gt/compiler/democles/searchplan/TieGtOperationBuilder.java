package org.moflon.tie.gt.compiler.democles.searchplan;

import java.util.List;

import org.gervarro.democles.codegen.CompilableAdornedOperation;
import org.gervarro.democles.common.runtime.OperationBuilder;
import org.gervarro.democles.common.runtime.SpecificationExtendedVariableRuntime;

/**
 * Implementation base interface for all operation builders in TIE-GT Serves to
 * abbreviate the long tail of type names
 * 
 * @author Roland Kluge - Initial implementation
 *
 */
public interface TieGtOperationBuilder extends
		OperationBuilder<CompilableAdornedOperation, List<CompilableAdornedOperation>, SpecificationExtendedVariableRuntime> {

}
