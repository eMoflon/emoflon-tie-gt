package org.moflon.compiler.sdm.democles.eclipse;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdapterFactory;

public class DemoclesAdapterFactory implements IAdapterFactory {

	@SuppressWarnings("unchecked")
	@Override
	public Object getAdapter(final Object adaptableObject, @SuppressWarnings("rawtypes") final Class adapterType) {
		if (adaptableObject instanceof IFile && EclipseErrorReporter.class == adapterType) {
			return new EclipseErrorReporter((IFile) adaptableObject);
		}
		return null;
	}

	@Override
	public Class<?>[] getAdapterList() {
		return new Class[] { EclipseErrorReporter.class };
	}
}
