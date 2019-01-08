package org.moflon.compiler.sdm.democles.attributes;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.SimpleCombiner;
import org.gervarro.democles.compiler.CompilerPatternBuilder;
import org.gervarro.democles.plan.WeightedOperationBuilder;
import org.gervarro.democles.plan.common.DefaultAlgorithm;
import org.moflon.compiler.sdm.democles.DefaultCodeGeneratorConfig;
import org.moflon.compiler.sdm.democles.PatternMatcherCompiler;
import org.moflon.compiler.sdm.democles.TemplateConfigurationProvider;
import org.moflon.core.preferences.EMoflonPreferencesStorage;
import org.moflon.sdm.constraints.operationspecification.AttributeConstraintLibrary;
import org.moflon.sdm.constraints.operationspecification.constraint.AttributeVariableConstraintsTypeModule;
import org.moflon.sdm.constraints.operationspecification.constraint.util.AttributeVariableConstraintsModule;

public class AttributeConstraintCodeGeneratorConfig extends DefaultCodeGeneratorConfig {

	/**
	 * Calculates the search plan for a given pattern
	 */
	private final DefaultAlgorithm<SimpleCombiner, GeneratorOperation> algorithm;

	/**
	 * Maps constraints to operations (constraint + adornment)
	 */
	private final AttributeConstraintsOperationBuilder attributeConstraintsOperationBuilder = new AttributeConstraintsOperationBuilder();

	/**
	 * Maps operations to code fragments
	 */
	private final List<AttributeConstraintLibrary> attributeVariableConstraintLibraries = new LinkedList<>();

	public AttributeConstraintCodeGeneratorConfig(final ResourceSet resourceSet, final IProject project,
			final EMoflonPreferencesStorage preferencesStorage) {
		super(resourceSet, preferencesStorage);

		final WeightedOperationBuilder<GeneratorOperation> builder = new AttributeEnabledWeightedOperationBuilder();

		algorithm = new DefaultAlgorithm<>(builder);

		// create attribute variable constraints type module using constraint libraries
		final AttributeVariableConstraintsTypeModule attributeVariableConstraintsTypeModule = new AttributeVariableConstraintsTypeModule(
				attributeVariableConstraintLibraries);

		final AttributeVariableConstraintsModule attributeVariableConstraintsModule = new AttributeVariableConstraintsModule(
				attributeVariableConstraintsTypeModule);
		this.bindingAndBlackPatternBuilder
				.addConstraintTypeSwitch(attributeVariableConstraintsModule.getConstraintTypeSwitch());
	}

	@Override
	protected PatternMatcherCompiler configureBlackPatternMatcherCompiler() {
		final CompilerPatternBuilder blackCompilerPatternBuilder = new CompilerPatternBuilder();
		blackCompilerPatternBuilder.addOperationBuilder(emfBlackOperationBuilder);
		blackCompilerPatternBuilder.addOperationBuilder(relationalOperationBuilder);
		blackCompilerPatternBuilder.addOperationBuilder(attributeConstraintsOperationBuilder);
		blackCompilerPatternBuilder.setAlgorithm(algorithm);

		final PatternMatcherCompiler blackPatternMatcherCompiler = new PatternMatcherCompiler(
				bindingAndBlackPatternBuilder, blackCompilerPatternBuilder);
		return blackPatternMatcherCompiler;
	}

	@Override
	public TemplateConfigurationProvider createTemplateConfiguration(final GenModel genModel) {
		return new AttributeConstraintTemplateConfig(genModel, attributeVariableConstraintLibraries);
	}
}
