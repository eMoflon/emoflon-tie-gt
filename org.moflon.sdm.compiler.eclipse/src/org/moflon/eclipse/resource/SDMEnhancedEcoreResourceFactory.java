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
package org.moflon.eclipse.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.moflon.emf.codegen.dependency.SDMEnhancedEcoreResource;

public class SDMEnhancedEcoreResourceFactory extends XMIResourceFactoryImpl {

	public Resource createResource(URI uri) {
		return new SDMEnhancedEcoreResource(uri);
	}
}
