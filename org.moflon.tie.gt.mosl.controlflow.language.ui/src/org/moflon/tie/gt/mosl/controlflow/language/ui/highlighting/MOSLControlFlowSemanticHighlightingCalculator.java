package org.moflon.tie.gt.mosl.controlflow.language.ui.highlighting;

import org.moflon.tie.gt.mosl.controlflow.language.services.MOSLControlFlowGrammarAccess;
import org.moflon.tie.gt.mosl.ide.ui.highlighting.AbstractSemanticHighlightingCalculator;

import com.google.inject.Inject;

public class MOSLControlFlowSemanticHighlightingCalculator extends AbstractSemanticHighlightingCalculator {

	@Inject
	MOSLControlFlowGrammarAccess ga;
}
