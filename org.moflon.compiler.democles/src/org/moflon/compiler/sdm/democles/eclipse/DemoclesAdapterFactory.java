package org.moflon.compiler.sdm.democles.eclipse;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdapterFactory;
import org.moflon.compiler.sdm.democles.config.DefaultCodeGeneratorConfig;

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
		return new Class[] { DefaultCodeGeneratorConfig.class, EclipseErrorReporter.class };
	}
}
