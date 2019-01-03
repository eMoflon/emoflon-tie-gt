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
package org.gervarro.emoflon;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory.Descriptor.DelegatingRegistry;
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenModelPackageImpl;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.converter.util.ConverterUtil;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EcorePackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.moflon.core.utilities.LogUtils;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.emf.codegen.GeneratorAdapterFactory;

public class StandardCodeGenerationTest {
	private static final Logger logger = Logger.getLogger(StandardCodeGenerationTest.class);

	public static final String JAR_SEPARATOR = "!";

	// No referred projects
	// No subpackages
	// No nested GenPackages
	// No existing genmodel file

	@SuppressWarnings("unused")
	public static final void main(final String[] args) {
		final ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",
				new EcoreResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("genmodel",
				new EcoreResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		EcorePackageImpl.init();
		GenModelPackageImpl.init();

		final String installationRootAsURI = "file:/C:/Download/eclipse-galileo";
		final String installationRootAsFile = "C:\\Download\\eclipse-galileo";
		final String workspaceRootAsURI = "file:/C:/Dokumente und Einstellungen/varro/workspace";
		final String workspaceRootAsFile = "C:\\Dokumente und Einstellungen\\varro\\workspace";

		// Accessing the generated version of ECore.ecore:
		// "http://www.eclipse.org/emf/2002/Ecore" -> mapping to genmodel?
		// Accessing the file version of ECore.ecore in standalone mode
		final String ecoreJarLocation = installationRootAsURI
				+ "/plugins/org.eclipse.emf.ecore_2.5.0.v200906151043.jar";
		URI.createURI("archive:" + ecoreJarLocation + JAR_SEPARATOR + "/model/Ecore.ecore", true);
		URI.createURI("archive:" + ecoreJarLocation + JAR_SEPARATOR + "/model/Ecore.genmodel", true);
		// Accessing the file version of ECore.ecore in Eclipse mode
		URI.createPlatformPluginURI("/org.eclipse.emf.ecore" + "/model/Ecore.ecore", true);
		URI.createPlatformPluginURI("/org.eclipse.emf.ecore" + "/model/Ecore.genmodel", true);

		// Remappings for standalone mode
		resourceSet.getURIConverter().getURIMap().put(URI.createPlatformPluginURI("/org.eclipse.emf.ecore/", true),
				URI.createURI("archive:" + ecoreJarLocation + JAR_SEPARATOR + "/", true));
		resourceSet.getURIConverter().getURIMap().put(URI.createPlatformResourceURI("/", true),
				URI.createFileURI(workspaceRootAsFile + "\\"));

		// Only makes sense in Eclipse mode:
		// resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap());

		// (1) Load ECore file (platform:/plugin/projectName/model/file.ecore)
		final URI ecoreModelLocation = URI
				.createPlatformResourceURI("/org.gervarro.democles.emoflon/model/Moflon.ecore", true);
		final Resource ecoreModelResource = resourceSet.getResource(ecoreModelLocation, true);
		EcoreUtil.resolveAll(resourceSet);

		final List<EPackage> interestingRootEPackages = new ConverterUtil.EPackageList();
		interestingRootEPackages.addAll(
				EcoreUtil.<EPackage>getObjectsByType(ecoreModelResource.getContents(), EcorePackage.Literals.EPACKAGE));

		final List<EPackage> referencedRootEPackages = new ConverterUtil.EPackageList();
		for (final Resource resource : resourceSet.getResources()) {
			referencedRootEPackages.addAll(
					EcoreUtil.<EPackage>getObjectsByType(resource.getContents(), EcorePackage.Literals.EPACKAGE));
		}
		referencedRootEPackages.removeAll(interestingRootEPackages);

		// (2) Prepare GenModel file (platform:/plugin/projectName/model/file.genmodel)
		final GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();

		final URI genModelURI = URI.createPlatformResourceURI("/org.gervarro.democles.emoflon/model/Moflon.genmodel",
				true);
		final Resource genModelResource = resourceSet.createResource(genModelURI);
		genModelResource.getContents().add(genModel);

		// (3) Produce GenModel contents from scratch (GenPackages and referred
		// GenPackages)

		final List<GenPackage> referencedGenPackages = new ConverterUtil.GenPackageList();
		for (final EPackage ePackage : referencedRootEPackages) {
			final URI ecoreFileURI = ePackage.eResource().getURI();
			final URI genmodelFileURI = ecoreFileURI.trimFileExtension().appendFileExtension("genmodel");
			final Resource tempGenModelResource = resourceSet.getResource(genmodelFileURI, true);
			final GenModel tempGenModel = (GenModel) tempGenModelResource.getContents().get(0);
			final GenPackage tempGenPackage = tempGenModel.findGenPackage(ePackage);
			referencedGenPackages.add(tempGenPackage);
		}

		final Map<GenPackage, EPackage> genPackageToReferredEPackage = new LinkedHashMap<GenPackage, EPackage>();
		final Map<String, GenPackage> referredEPackageNSURIToGenPackage = new HashMap<String, GenPackage>();
		for (final GenPackage genPackage : referencedGenPackages) {
			final EPackage referredEPackage = genPackage.getEcorePackage();
			if (referredEPackage != null) {
				genPackageToReferredEPackage.put(genPackage, referredEPackage);
				referredEPackageNSURIToGenPackage.put(referredEPackage.getNsURI(), genPackage);
			}
		}

		// Create resources for all the referenced EPackages
		// The referencedEPackage is a "local" instance of the realEPackage. We
		// will add the former to a resource that has the same URI of the later.
		for (final Map.Entry<GenPackage, EPackage> entry : genPackageToReferredEPackage.entrySet()) {
			final GenPackage genPackage = entry.getKey();
			final EPackage referredEPackage = entry.getValue();
			final EPackage realEPackage = genPackage.getEcorePackage();

			if (referredEPackage != realEPackage) {
				final EPackage eSuperPackage = realEPackage.getESuperPackage();
				if (eSuperPackage == null) {
					final URI ecoreURI = realEPackage.eResource().getURI();
					final Resource resource = resourceSet.createResource(ecoreURI);
					resource.getContents().add(referredEPackage);
				} else {
					final GenPackage genSuperPackage = referredEPackageNSURIToGenPackage.get(eSuperPackage.getNsURI());
					if (genSuperPackage != null) {
						final EPackage referredESuperPackage = genSuperPackage.getEcorePackage();
						referredESuperPackage.getESubpackages().add(referredEPackage);
						referencedGenPackages.remove(genPackage);
					}
				}
			}
		}

		// Initialize the GenModel with all the computed data.
		genModel.initialize(interestingRootEPackages);
		genModel.getForeignModel().add("Moflon.ecore");
		genModel.getUsedGenPackages().addAll(referencedGenPackages);

		final String modelPluginID = genModel.eResource().getURI().segment(1);
		String modelName = genModel.eResource().getURI().trimFileExtension().lastSegment();
		modelName = CodeGenUtil.capName(modelName);
		genModel.setModelName(modelName);
		genModel.setModelPluginID(modelPluginID);
		genModel.setModelDirectory("/" + modelPluginID + "/src");
		genModel.setImporterID("org.eclipse.emf.importer.ecore");
		genModel.setComplianceLevel(GenJDKLevel.JDK60_LITERAL);
		genModel.reconcile();

		// (4) Save GenModel file
		final Map<Object, Object> genModelSaveOptions = new HashMap<Object, Object>();
		genModelSaveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
				Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		genModelSaveOptions.put(Resource.OPTION_LINE_DELIMITER, WorkspaceHelper.DEFAULT_RESOURCE_LINE_DELIMITER);
		try {
			genModelResource.save(genModelSaveOptions);
		} catch (final IOException e) {
			LogUtils.error(logger, e);
		}

		// (5) Compile template

		// (6) Invoke code generation
		final DelegatingRegistry generatorRegistry = new DelegatingRegistry();
		generatorRegistry.addDescriptor("http://www.eclipse.org/emf/2002/GenModel", GeneratorAdapterFactory.DESCRIPTOR);

		final Generator generator = new Generator(generatorRegistry);
		generator.setInput(genModel);

		generator.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, new BasicMonitor.Printing(System.out));
	}
}
