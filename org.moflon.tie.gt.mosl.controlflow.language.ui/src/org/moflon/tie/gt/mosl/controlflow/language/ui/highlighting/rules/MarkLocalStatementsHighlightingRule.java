package org.moflon.tie.gt.mosl.controlflow.language.ui.highlighting.rules;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.CalledParameter;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.MethodParameter;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.ObjectVariableStatement;
import org.moflon.tie.gt.mosl.ide.ui.highlighting.AbstractHighlightProviderController;
import org.moflon.tie.gt.mosl.ide.ui.highlighting.RegisterRule;
import org.moflon.tie.gt.mosl.ide.ui.highlighting.rules.AbstractHighlightingRule;
import org.moflon.tie.gt.mosl.ide.ui.highlighting.utils.XtextColor;

@RegisterRule
public class MarkLocalStatementsHighlightingRule extends AbstractHighlightingRule {

	public MarkLocalStatementsHighlightingRule(final AbstractHighlightProviderController controller) {
		super(controller);
	}

	@Override
	protected String id() {
		return "MarkLocalStatement";
	}

	@Override
	protected String description() {
		return "Local Statements are brown";
	}

	@Override
	protected TextStyle getTextStyle() {
		final TextStyle ts = new TextStyle();
		ts.setColor(controller.getColorManager().getColor(XtextColor.BROWN));
		return ts;
	}

	@Override
	protected boolean getHighlightingConditions(final EObject moslObject, final INode node) {
		final String text = node.getText();
		if (moslObject instanceof ObjectVariableStatement) {

			final ObjectVariableStatement objectVariableStatement = ObjectVariableStatement.class.cast(moslObject);
			return objectVariableStatement.getName().equals(text);
		} else if (moslObject instanceof CalledParameter) {
			final CalledParameter calledParameter = CalledParameter.class.cast(moslObject);
			final boolean hasMatchingText = calledParameter.getObject() != null
					&& calledParameter.getObject() instanceof ETypedElement
					&& ETypedElement.class.cast(calledParameter.getObject()).getName().equals(text);
			final boolean hasMatchingText2 = calledParameter.getCreate() != null
					&& calledParameter.getCreate().getName().equals(text);
			return hasMatchingText || hasMatchingText2;
		} else if (moslObject instanceof MethodParameter) {
			final MethodParameter methodParameter = MethodParameter.class.cast(moslObject);
			return methodParameter.getName().equals(text);
		}
		return false;
	}

}
