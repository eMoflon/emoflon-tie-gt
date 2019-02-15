package org.moflon.tie.gt.mosl.controlflow.language.ui.handler;

import org.moflon.core.ui.AbstractOpenWizardHandler;
import org.moflon.tie.gt.mosl.controlflow.language.ui.wizards.NewControlFlowFileWizard;

/**
 * Opens a {@link NewControlFlowFileWizard}
 * 
 * @author Roland Kluge - Initial implementation
 */
public class NewTieGtControlFlowSpecificationFileHandler extends AbstractOpenWizardHandler {

	@Override
	protected String getWizardId() {
		return NewControlFlowFileWizard.WIZARD_ID;
	}

}
