package org.moflon.tie.gt.ui.handler;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.moflon.core.ui.AbstractCommandHandler;
import org.moflon.core.ui.UiUtilities;
import org.moflon.tie.gt.ui.wizard.TieGtProjectWizard;

public class TieGtNewProjectHandler extends AbstractCommandHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {

		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		try {
			UiUtilities.openWizard(TieGtProjectWizard.WIZARD_ID, window);
		} catch (final Exception e) {
			Logger.getRootLogger()
					.info(String.format("Cannot initialize wizard with ID %s", TieGtProjectWizard.WIZARD_ID));
		}

		return AbstractCommandHandler.DEFAULT_HANDLER_RESULT;
	}

}
