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
import org.moflon.sdm.constraints.constraintstodemocles.impl.AttributeConstraintLibUtilImpl;
import org.moflon.sdm.constraints.operationspecification.AttributeConstraintLibrary;
import org.moflon.sdm.constraints.operationspecification.constraint.AttributeVariableConstraintsTypeModule;
import org.moflon.sdm.constraints.operationspecification.constraint.util.AttributeVariableConstraintsModule;

public class AttributeConstraintCodeGeneratorConfig extends DefaultCodeGeneratorConfig {
	protected final WeightedOperationBuilder<GeneratorOperation> builder = new AttributeEnabledWeightedOperationBuilder<>();

	protected final DefaultAlgorithm<SimpleCombiner, GeneratorOperation> algorithm = new DefaultAlgorithm<>(builder);

	// Constraint modules
	final AttributeVariableConstraintsModule attributeVariableConstraintsModule;

	// Operation modules (constraint to operation (constraint + adornment) mappings)
	private final AttributeConstraintsOperationBuilder attributeConstraintsOperationBuilder = new AttributeConstraintsOperationBuilder();

	// Constraint libraries
	private final List<AttributeConstraintLibrary> attributeVariableConstraintLibraries = new LinkedList<AttributeConstraintLibrary>();

	// Constraint type module
	private final AttributeVariableConstraintsTypeModule attributeVariableConstraintsTypeModule;

	protected AttributeConstraintLibUtilImpl attributeConstraintLibUtil = new AttributeConstraintLibUtilImpl();

	public AttributeConstraintCodeGeneratorConfig(final ResourceSet resourceSet, final IProject project,
			final EMoflonPreferencesStorage preferencesStorage) {
		super(resourceSet, preferencesStorage);
		if (project == null) {
			throw new RuntimeException(
					"Parameter ecoreResource must be defined for AttributeConstraintCodeGeneratorConfig");
		}

		// load attribute constraint libraries first loaded has higher priority
		attributeConstraintLibUtil.init(resourceSet, project);
		if (attributeConstraintLibUtil.getUserDefinedAttributeConstraintLibrary() != null) {
			attributeVariableConstraintLibraries
					.add(attributeConstraintLibUtil.getUserDefinedAttributeConstraintLibrary());
		}
		attributeVariableConstraintLibraries.add(attributeConstraintLibUtil.getBuildInAttributeConstraintLibrary());

		// create attribute variable constraints type module using constraint libraries
		attributeVariableConstraintsTypeModule = new AttributeVariableConstraintsTypeModule(
				attributeVariableConstraintLibraries);

		this.attributeVariableConstraintsModule = new AttributeVariableConstraintsModule(
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
