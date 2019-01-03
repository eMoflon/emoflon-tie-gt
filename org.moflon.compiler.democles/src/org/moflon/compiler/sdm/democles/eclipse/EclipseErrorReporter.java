package org.moflon.compiler.sdm.democles.eclipse;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.moflon.codegen.eclipse.ValidationStatus;
import org.moflon.core.ui.errorhandling.MultiStatusAwareErrorReporter;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.core.utilities.eMoflonEMFUtil;
import org.moflon.sdm.compiler.democles.validation.result.ErrorMessage;
import org.moflon.sdm.compiler.democles.validation.result.Severity;

public class EclipseErrorReporter extends MultiStatusAwareErrorReporter {
	public EclipseErrorReporter(final IFile ecoreFile) {
		super(ecoreFile);
	}

	/**
	 * Reports a concrete status message (no {@link MultiStatus}. If the given
	 * {@link IStatus} is a {@link ValidationStatus},
	 * {@link #createMarker(String, ErrorMessage)} from this class is invoked. Else,
	 * the method delegates to the super class.
	 */
	@Override
	public void reportLeafStatus(final IStatus status) throws CoreException {
		if (status instanceof ValidationStatus) {
			final ErrorMessage errorMsg = ((ValidationStatus) status).getErrorMessage();
			createMarker(WorkspaceHelper.MOFLON_PROBLEM_MARKER_ID, errorMsg);
		} else {
			super.reportLeafStatus(status);
		}
	}

	/**
	 * Determines a human-readable description of the location of the given message
	 * 
	 * @param message the {@link ErrorMessage} to format
	 * @return the formatted message
	 * @see ErrorMessage#getLocation()
	 */
	private String getLocationDescription(final ErrorMessage message) {
		final String result;
		final EList<EObject> locations = message.getLocation();
		if (!locations.isEmpty()) {
			final EObject location = locations.get(0);
			result = "[" + eMoflonEMFUtil.getIdentifier(location) + "]" + " in " + getFQN(location.eContainer());
		} else {
			result = "";
		}
		return result;
	}

	private static String getFQN(final EObject eObject) {
		if (eObject == null)
			return "";
		else if (eObject instanceof ENamedElement)
			return getFQN(eObject.eContainer()) + ((ENamedElement) eObject).getName() + ".";
		else
			return getFQN(eObject.eContainer()) + eMoflonEMFUtil.getIdentifier(eObject) + ".";
	}

	private IMarker createMarker(final String markerId, final ErrorMessage message) throws CoreException {
		final IFile file = getFile();
		final IResource markedResource = file.exists() ? file : file.getProject();
		final IMarker validationMarker = markedResource.createMarker(markerId);
		validationMarker.setAttribute(IMarker.MESSAGE, message.getId());
		validationMarker.setAttribute(IMarker.LOCATION, getLocationDescription(message));
		validationMarker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
		validationMarker.setAttribute(IMarker.SEVERITY,
				convertValidationResultSeverityToEclipseMarkerSeverity(message.getSeverity()));
		return validationMarker;
	}

	/**
	 * Converts the given {@link Severity} to the corresponding value for
	 * {@link IMarker}
	 * 
	 * @param severity the {@link Severity}
	 * @return the severity level for {@link IMarker}
	 * @throws CoreException if the severity cannot be converted
	 */
	private static final int convertValidationResultSeverityToEclipseMarkerSeverity(final Severity severity)
			throws CoreException {
		final int value = severity.getValue();
		if (value >= Severity.ERROR_VALUE) {
			return IMarker.SEVERITY_ERROR;
		} else if (value >= Severity.WARNING_VALUE) {
			return IMarker.SEVERITY_WARNING;
		} else if (value >= Severity.INFO_VALUE) {
			return IMarker.SEVERITY_INFO;
		}

		final IStatus invalidSeverityConversion = new Status(IStatus.ERROR,
				WorkspaceHelper.getPluginId(EclipseErrorReporter.class),
				"Cannot convert " + severity.getLiteral() + " severity to a marker");
		throw new CoreException(invalidSeverityConversion);
	}
}
