package org.moflon.tie.gt.compiler.democles.searchplan;

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

public class RegularPatternMatcher extends SearchPlanAdapter {

	public RegularPatternMatcher(final String patternType, final CompilerPatternBody body, final Adornment adornment,
			final Chain<GeneratorOperation> searchPlan, final boolean multipleMatches) {
		super(patternType, body, adornment, searchPlan, multipleMatches);
	}

	@Override
	public TemplateInvocation prepareTemplateInvocation(final OperationSequenceCompiler operationSequenceCompiler,
			final ImportManager importManager) {
		final Adornment adornment = getAdornment();
		final Chain<GeneratorOperation> searchPlan = getSearchPlan();
		final CompilerPatternBody body = getBody();
		final Chain<TemplateController> templateChain = createTemplateChain(operationSequenceCompiler, searchPlan);

		final List<GeneratorOperation> internalSymbolicParameters = body.getHeader().getInternalSymbolicParameters();
		final List<GeneratorOperation> boundInternalSymbolicParameters = new LinkedList<>();
		for (int i = 0; i < adornment.size(); i++) {
			if (Adornments.isBound(adornment, i)) {
				boundInternalSymbolicParameters.add(internalSymbolicParameters.get(i));
			}
		}

		return new TemplateInvocation(getInvocationName(),
				new String[] { "engine", "importManager", "body", "adornment", "boundSymbolicParameters", "chain",
						"alwaysSuccessful" },
				new Object[] { operationSequenceCompiler, importManager, body, adornment,
						boundInternalSymbolicParameters, templateChain, isAlwaysSuccessful() });
	}

	public Chain<TemplateController> createTemplateChain(final OperationSequenceCompiler operationSequenceCompiler,
			final Chain<GeneratorOperation> searchPlan) {
		if (searchPlan != null) {
			final Chain<TemplateController> head = new Chain<>(new TemplateController(getTemplateName()));
			return operationSequenceCompiler.buildOperationChain(searchPlan, head);
		} else {
			return null;
		}
	}

	public String getTemplateName() {
		return isMultiMatch() ? "/regular/AllMatches" : "/regular/SingleMatch";
	}

	public String getInvocationName() {
		return isMultiMatch() ? "/regular/MatchAllMethod" : "/regular/MatchSingleMethod";
	}
}
