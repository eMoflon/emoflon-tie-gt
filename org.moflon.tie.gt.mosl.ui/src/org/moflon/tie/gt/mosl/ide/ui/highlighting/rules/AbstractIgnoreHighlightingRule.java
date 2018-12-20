package org.moflon.tie.gt.mosl.ide.ui.highlighting.rules;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.moflon.tie.gt.mosl.ide.ui.highlighting.AbstractHighlightProviderController;

public abstract class AbstractIgnoreHighlightingRule extends AbstractHighlightingRule {

	public AbstractIgnoreHighlightingRule(AbstractHighlightProviderController controller) {
		super(controller);
		setPrio(Integer.MAX_VALUE);
	}

	@Override
	protected TextStyle getTextStyle() {
		return null;
	}

	protected void setHighlighting(INode node) {
		// do nothing
	}

	public void setHighlightingConfiguration(IHighlightingConfigurationAcceptor acceptor) {
		// do nothing
	}

	@Override
	protected boolean getHighlightingConditions(EObject moslObject, INode node) {
		return getIgnoreConditions(moslObject, node);
	}

	protected abstract boolean getIgnoreConditions(EObject moslObject, INode node);

}
