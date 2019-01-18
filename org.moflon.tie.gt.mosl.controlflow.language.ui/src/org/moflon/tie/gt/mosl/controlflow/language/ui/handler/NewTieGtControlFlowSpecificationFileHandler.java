package org.moflon.tie.gt.mosl.controlflow.language.ui.handler;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.moflon.core.ui.AbstractCommandHandler;
import org.moflon.core.ui.UiUtilities;
import org.moflon.tie.gt.mosl.controlflow.language.ui.wizards.NewControlFlowFileWizard;

public class NewTieGtControlFlowSpecificationFileHandler extends AbstractCommandHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		final ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
		try {
			UiUtilities.openWizard(NewControlFlowFileWizard.WIZARD_ID, window, (IStructuredSelection) selection);
		} catch (final Exception e) {
			Logger.getRootLogger()
					.info(String.format("Cannot initialize wizard with ID %s", NewControlFlowFileWizard.WIZARD_ID));
		}
		return AbstractCommandHandler.DEFAULT_HANDLER_RESULT;
	}

}
