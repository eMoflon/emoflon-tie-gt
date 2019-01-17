package org.moflon.tie.gt.ide.core.patterns.util;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.moflon.core.utilities.UtilityClassNotInstantiableException;
import org.moflon.core.utilities.WorkspaceHelper;

public final class TransformationExceptions {

	private TransformationExceptions() {
		throw new UtilityClassNotInstantiableException();
	}

	public static void recordTransformationErrorMessage(final MultiStatus transformationStatus, final String message,
			final Object... arguments) {
		final String detailedMessage = String.format(message, arguments);
		transformationStatus.add(new Status(IStatus.ERROR,
				WorkspaceHelper.getPluginId(TransformationExceptions.class), detailedMessage));
	}

}
