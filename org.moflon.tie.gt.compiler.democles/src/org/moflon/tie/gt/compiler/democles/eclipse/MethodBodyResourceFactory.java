/*
 * Copyright (c) 2010-2012 Gergely Varro
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gergely Varro - Initial API and implementation
 */
package org.moflon.tie.gt.compiler.democles.eclipse;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.moflon.core.utilities.EcoreUtils;

public class MethodBodyResourceFactory extends AdapterResourceFactory<EOperation> {

	public MethodBodyResourceFactory(final String extensionName) {
		super(extensionName, EcorePackage.eINSTANCE.getEOperation());
	}

	@Override
	protected final URI getURI(final EOperation eOperation, final String type) {
		return getOperationURI(eOperation).appendFileExtension(type);
	}

	private static final URI getOperationURI(final EOperation eOperation) {
		return eOperation.eResource().getURI().trimSegments(1).appendSegment(getOperationID(eOperation));
	}

	private static final String getOperationID(final EOperation eOperation) {
		String signature = EcoreUtils.getFQN(eOperation.getEContainingClass()) + "_" + eOperation.getName();
		for (final EParameter param : eOperation.getEParameters()) {
			signature += "_" + param.getName() + "_" + getNameOfClassifier(param);
		}
		return signature;
	}

	/**
	 * Returns the name of the associated Java class of the given type.
	 */
	private static final String getNameOfClassifier(final EParameter param) {
		final EClassifier eType = param.getEType();
		if (eType == null)
			throw new IllegalArgumentException(String.format("Type of %s is null.", param));
		return eType.getInstanceTypeName() != null ? eType.getInstanceTypeName() : eType.getName();
	}
}
