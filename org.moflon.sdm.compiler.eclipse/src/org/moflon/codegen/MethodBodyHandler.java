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
package org.moflon.codegen;

import java.util.Map;

import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory.Descriptor;
import org.eclipse.emf.ecore.resource.Resource;
import org.moflon.emf.build.MoflonEmfCodeGenerator;
import org.moflon.sdm.compiler.democles.validation.scope.PatternMatcher;

public interface MethodBodyHandler {

	/**
	 * Initializes the available search plan algorithms (= pattern matchers)
	 */
	public void initializePatternMatchers();

	/**
	 * Creates a descriptor for code generator of the method bodies.
	 */
	public Descriptor createCodeGenerationEngine(MoflonEmfCodeGenerator codeGenerator, Resource resource);

	public Map<String, PatternMatcher> getPatternMatcherConfiguration();
}
