package org.moflon.compiler.sdm.democles.searchplan;

import java.util.LinkedList;
import java.util.List;

import org.gervarro.democles.codegen.Chain;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.ImportManager;
import org.gervarro.democles.codegen.OperationSequenceCompiler;
import org.gervarro.democles.codegen.TemplateController;
import org.gervarro.democles.codegen.TemplateInvocation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.compiler.CompilerPatternBody;

public class ExpressionPatternMatcher extends SearchPlanAdapter {

	public ExpressionPatternMatcher(String patternType, CompilerPatternBody body, Adornment adornment,
			Chain<GeneratorOperation> searchPlan, boolean multipleMatches) {
		super(patternType, body, adornment, searchPlan, multipleMatches);
	}

	@Override
	public TemplateInvocation prepareTemplateInvocation(final OperationSequenceCompiler operationSequenceCompiler,
			final ImportManager importManager) {
		final Adornment adornment = getAdornment();
		final Chain<GeneratorOperation> searchPlan = getSearchPlan();
		final CompilerPatternBody body = getBody();
		Chain<TemplateController> templateChain = null;
		if (searchPlan != null) {
			if (adornment.get(0) == Adornment.FREE) {
				templateChain = new Chain<TemplateController>(new TemplateController("/expression/SingleMatch"));
			}
			templateChain = operationSequenceCompiler.buildOperationChain(searchPlan, templateChain);
		}

		List<GeneratorOperation> internalSymbolicParameters = body.getHeader().getInternalSymbolicParameters();
		List<GeneratorOperation> boundInternalSymbolicParameters = new LinkedList<GeneratorOperation>();
		for (int i = 0; i < adornment.size(); i++) {
			if (adornment.get(i) == Adornment.BOUND) {
				boundInternalSymbolicParameters.add(internalSymbolicParameters.get(i));
			}
		}

		return new TemplateInvocation("/expression/MatchSingleMethod",
				new String[] { "engine", "importManager", "body", "adornment", "boundSymbolicParameters", "chain",
						"alwaysSuccessful" },
				new Object[] { operationSequenceCompiler, importManager, body, adornment,
						boundInternalSymbolicParameters, templateChain, isAlwaysSuccessful() });
	}

}
