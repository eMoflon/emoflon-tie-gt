package org.moflon.tie.gt.compiler.democles.searchplan;

import static org.moflon.tie.gt.compiler.democles.util.TemplateUtil.createChain;

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
import org.moflon.tie.gt.compiler.democles.pattern.Adornments;

public class ExpressionPatternMatcher extends SearchPlanAdapter {

	public ExpressionPatternMatcher(final String patternType, final CompilerPatternBody body, final Adornment adornment,
			final Chain<GeneratorOperation> searchPlan, final boolean multipleMatches) {
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
			if (Adornments.isFree(adornment, 0)) {
				templateChain = createChain("/expression/SingleMatch");
			}
			templateChain = operationSequenceCompiler.buildOperationChain(searchPlan, templateChain);
		}

		final List<GeneratorOperation> internalSymbolicParameters = body.getHeader().getInternalSymbolicParameters();
		final List<GeneratorOperation> boundInternalSymbolicParameters = new LinkedList<>();
		for (int i = 0; i < adornment.size(); i++) {
			if (Adornments.isBound(adornment, i)) {
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
