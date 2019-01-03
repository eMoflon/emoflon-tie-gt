package org.moflon.compiler.sdm.democles;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.SimpleCombiner;
import org.gervarro.democles.codegen.emf.BasicEMFOperationBuilder;
import org.gervarro.democles.codegen.emf.EMFOperationBuilder;
import org.gervarro.democles.compiler.CompilerPatternBuilder;
import org.gervarro.democles.constraint.CoreConstraintModule;
import org.gervarro.democles.constraint.emf.EMFConstraintModule;
import org.gervarro.democles.emf.EMFWeightedOperationBuilder;
import org.gervarro.democles.plan.WeightedOperationBuilder;
import org.gervarro.democles.plan.common.DefaultAlgorithm;
import org.gervarro.democles.relational.RelationalOperationBuilder;
import org.gervarro.democles.specification.emf.EMFPatternBuilder;
import org.gervarro.democles.specification.emf.constraint.EMFTypeModule;
import org.gervarro.democles.specification.emf.constraint.PatternInvocationTypeModule;
import org.gervarro.democles.specification.emf.constraint.RelationalTypeModule;
import org.gervarro.democles.specification.impl.DefaultPattern;
import org.gervarro.democles.specification.impl.DefaultPatternBody;
import org.gervarro.democles.specification.impl.DefaultPatternFactory;
import org.gervarro.democles.specification.impl.PatternInvocationConstraintModule;
import org.moflon.codegen.PatternMatcher;
import org.moflon.core.preferences.EMoflonPreferencesStorage;

public class DefaultValidatorConfig implements CodeGenerationConfiguration {
	protected final ResourceSet resourceSet;

	private final WeightedOperationBuilder<GeneratorOperation> builder = new EMFWeightedOperationBuilder<>();
	private final DefaultAlgorithm<SimpleCombiner, GeneratorOperation> algorithm = new DefaultAlgorithm<>(builder);

	// Constraint modules
	final EMFConstraintModule emfTypeModule;
	final EMFTypeModule internalEMFTypeModule;
	final RelationalTypeModule internalRelationalTypeModule = new RelationalTypeModule(CoreConstraintModule.INSTANCE);
	protected final EMFPatternBuilder<DefaultPattern, DefaultPatternBody> bindingAndBlackPatternBuilder = new EMFPatternBuilder<>(
			new DefaultPatternFactory());
	final PatternInvocationConstraintModule<DefaultPattern, DefaultPatternBody> bindingAndBlackPatternInvocationTypeModule = new PatternInvocationConstraintModule<>(
			bindingAndBlackPatternBuilder);
	final PatternInvocationTypeModule<DefaultPattern, DefaultPatternBody> internalPatternInvocationTypeModule = new PatternInvocationTypeModule<>(
			bindingAndBlackPatternInvocationTypeModule);

	// Operation modules (constraint to operation (constraint + adornment) mappings)
	protected final RelationalOperationBuilder relationalOperationBuilder = new RelationalOperationBuilder();
	private final AssignmentOperationBuilder assignmentOperationBuilder = new AssignmentOperationBuilder();
	private final BindingAssignmentOperationBuilder bindingAssignmentOperationBuilder = new BindingAssignmentOperationBuilder();
	private final BasicEMFOperationBuilder basicOperationBuilder = new BasicEMFOperationBuilder();
	protected final EMFOperationBuilder emfBlackOperationBuilder = new EMFOperationBuilder();
	private final EMFRedOperationBuilder emfRedOperationBuilder = new EMFRedOperationBuilder();
	private final EMFGreenOperationBuilder emfGreenOperationBuilder = new EMFGreenOperationBuilder();

	private PatternMatcher bindingAndBlackPatternMatcher;

	private PatternMatcher bindingPatternMatcher;

	private PatternMatcher blackPatternMatcher;

	private PatternMatcher redPatternMatcher;

	private PatternMatcher greenPatternMatcher;

	private PatternMatcher expressionPatternMatcher;

	private final EMoflonPreferencesStorage preferencesStorage;

	public DefaultValidatorConfig(final ResourceSet resourceSet, final EMoflonPreferencesStorage preferencesStorage) {
		this.resourceSet = resourceSet;
		this.preferencesStorage = preferencesStorage;

		this.emfTypeModule = new EMFConstraintModule(this.resourceSet);
		this.internalEMFTypeModule = new EMFTypeModule(emfTypeModule);
		this.bindingAndBlackPatternBuilder
				.addConstraintTypeSwitch(internalPatternInvocationTypeModule.getConstraintTypeSwitch());
		this.bindingAndBlackPatternBuilder
				.addConstraintTypeSwitch(internalRelationalTypeModule.getConstraintTypeSwitch());
		this.bindingAndBlackPatternBuilder.addConstraintTypeSwitch(internalEMFTypeModule.getConstraintTypeSwitch());
		this.bindingAndBlackPatternBuilder.addVariableTypeSwitch(internalEMFTypeModule.getVariableTypeSwitch());
	}

	// TODO@rkluge: Switch to PatternType
	@Override
	public Map<String, PatternMatcher> getSearchPlanGenerators() {
		final Map<String, PatternMatcher> searchPlanGenerators = new HashMap<>();
		searchPlanGenerators.put(DemoclesMethodBodyHandler.GREEN_FILE_EXTENSION, getGreenPatternSearchPlanGenerator());
		searchPlanGenerators.put(DemoclesMethodBodyHandler.RED_FILE_EXTENSION, getRedPatternSearchPlanGenerator());
		searchPlanGenerators.put(DemoclesMethodBodyHandler.BLACK_FILE_EXTENSION, getBlackPatternSearchPlanGenerator());
		searchPlanGenerators.put(DemoclesMethodBodyHandler.BINDING_FILE_EXTENSION,
				getBindingPatternSearchPlanGenerator());
		searchPlanGenerators.put(DemoclesMethodBodyHandler.BINDING_AND_BLACK_FILE_EXTENSION,
				getBindingAndBlackPatternSearchPlanGenerator());
		searchPlanGenerators.put(DemoclesMethodBodyHandler.EXPRESSION_FILE_EXTENSION,
				getExpressionPatternSearchPlanGenerator());
		return searchPlanGenerators;
	}

	@Override
	public void initializePatternMatchers() {
		try {
			this.setBindingAndBlackPatternMatcher(configureBindingAndBlackPatternMatcher());
			this.setBindingPatternMatcher(configureBindingPatternMatcher());
			this.setBlackPatternMatcher(configureBlackPatternMatcher());
			this.setRedPatternMatcher(configureRedPatternMatcher());
			this.setGreenPatternMatcher(configureGreenPatternMatcher());
			this.setExpressionPatternMatcher(configureExpressionPatternMatcher());
		} catch (final IOException e) {
			// Do nothing
		}
	}

	public EMoflonPreferencesStorage getPreferencesStorage() {
		return this.preferencesStorage;
	}

	protected PatternMatcher getBindingAndBlackPatternSearchPlanGenerator() {
		return bindingAndBlackPatternMatcher;
	}

	protected PatternMatcher getBindingPatternSearchPlanGenerator() {
		return bindingPatternMatcher;
	}

	protected PatternMatcher getBlackPatternSearchPlanGenerator() {
		return blackPatternMatcher;
	}

	protected PatternMatcher getRedPatternSearchPlanGenerator() {
		return redPatternMatcher;
	}

	protected PatternMatcher getGreenPatternSearchPlanGenerator() {
		return greenPatternMatcher;
	}

	protected PatternMatcher getExpressionPatternSearchPlanGenerator() {
		return expressionPatternMatcher;
	}

	protected void setBindingAndBlackPatternMatcher(final PatternMatcher bindingAndBlackPatternMatcher) {
		this.bindingAndBlackPatternMatcher = bindingAndBlackPatternMatcher;
	}

	protected void setBindingPatternMatcher(final PatternMatcher bindingPatternMatcher) {
		this.bindingPatternMatcher = bindingPatternMatcher;
	}

	protected void setBlackPatternMatcher(final PatternMatcher blackPatternMatcher) {
		this.blackPatternMatcher = blackPatternMatcher;
	}

	protected void setRedPatternMatcher(final PatternMatcher redPatternMatcher) {
		this.redPatternMatcher = redPatternMatcher;
	}

	protected void setGreenPatternMatcher(final PatternMatcher greenPatternMatcher) {
		this.greenPatternMatcher = greenPatternMatcher;
	}

	protected void setExpressionPatternMatcher(final PatternMatcher expressionPatternMatcher) {
		this.expressionPatternMatcher = expressionPatternMatcher;
	}

	protected PatternMatcher configureBindingAndBlackPatternMatcher() throws IOException {
		return configureBindingAndBlackPatternMatcherCompiler();
	}

	protected PatternMatcherCompiler configureBindingAndBlackPatternMatcherCompiler() {
		// Configuring binding & black pattern matcher
		final CompilerPatternBuilder bindingAndBlackCompilerPatternBuilder = new CompilerPatternBuilder();
		bindingAndBlackCompilerPatternBuilder.addOperationBuilder(basicOperationBuilder);
		bindingAndBlackCompilerPatternBuilder.setAlgorithm(algorithm);

		final PatternMatcherCompiler bindingAndBlackPatternMatcherCompiler = new BindingAndBlackPatternMatcherCompiler(
				bindingAndBlackPatternBuilder, bindingAndBlackCompilerPatternBuilder);
		return bindingAndBlackPatternMatcherCompiler;
	}

	protected PatternMatcher configureBindingPatternMatcher() throws IOException {
		return configureBindingPatternMatcherCompiler();
	}

	protected PatternMatcherCompiler configureBindingPatternMatcherCompiler() {
		final CompilerPatternBuilder bindingCompilerPatternBuilder = new CompilerPatternBuilder();
		bindingCompilerPatternBuilder.addOperationBuilder(basicOperationBuilder);
		bindingCompilerPatternBuilder.addOperationBuilder(bindingAssignmentOperationBuilder);
		bindingCompilerPatternBuilder.setAlgorithm(algorithm);

		final PatternMatcherCompiler bindingPatternMatcherCompiler = new PatternMatcherCompiler(
				bindingAndBlackPatternBuilder, bindingCompilerPatternBuilder);
		return bindingPatternMatcherCompiler;
	}

	protected PatternMatcher configureBlackPatternMatcher() throws IOException {
		return configureBlackPatternMatcherCompiler();
	}

	protected PatternMatcherCompiler configureBlackPatternMatcherCompiler() {
		final CompilerPatternBuilder blackCompilerPatternBuilder = new CompilerPatternBuilder();
		blackCompilerPatternBuilder.addOperationBuilder(emfBlackOperationBuilder);
		blackCompilerPatternBuilder.addOperationBuilder(relationalOperationBuilder);
		blackCompilerPatternBuilder.setAlgorithm(algorithm);

		final PatternMatcherCompiler blackPatternMatcherCompiler = new PatternMatcherCompiler(
				bindingAndBlackPatternBuilder, blackCompilerPatternBuilder);
		return blackPatternMatcherCompiler;
	}

	protected PatternMatcher configureRedPatternMatcher() throws IOException {
		return configureRedPatternMatcherCompiler();
	}

	protected PatternMatcherCompiler configureRedPatternMatcherCompiler() {
		// Configuring red pattern matcher
		final EMFPatternBuilder<DefaultPattern, DefaultPatternBody> redPatternBuilder = new EMFPatternBuilder<DefaultPattern, DefaultPatternBody>(
				new DefaultPatternFactory());
		redPatternBuilder.addConstraintTypeSwitch(internalEMFTypeModule.getConstraintTypeSwitch());
		redPatternBuilder.addVariableTypeSwitch(internalEMFTypeModule.getVariableTypeSwitch());

		final CompilerPatternBuilder redCompilerPatternBuilder = new CompilerPatternBuilder();
		redCompilerPatternBuilder.addOperationBuilder(emfRedOperationBuilder);
		redCompilerPatternBuilder.setAlgorithm(algorithm);

		final PatternMatcherCompiler redPatternMatcherCompiler = new PatternMatcherCompiler(redPatternBuilder,
				redCompilerPatternBuilder);
		return redPatternMatcherCompiler;
	}

	protected PatternMatcher configureGreenPatternMatcher() throws IOException {
		return configureGreenPatternMatcherCompiler();
	}

	protected PatternMatcherCompiler configureGreenPatternMatcherCompiler() {
		// Configuring green pattern matcher
		final EMFPatternBuilder<DefaultPattern, DefaultPatternBody> greenPatternBuilder = new EMFPatternBuilder<DefaultPattern, DefaultPatternBody>(
				new DefaultPatternFactory());
		greenPatternBuilder.addConstraintTypeSwitch(internalRelationalTypeModule.getConstraintTypeSwitch());
		greenPatternBuilder.addConstraintTypeSwitch(internalEMFTypeModule.getConstraintTypeSwitch());
		greenPatternBuilder.addVariableTypeSwitch(internalEMFTypeModule.getVariableTypeSwitch());

		final CompilerPatternBuilder greenCompilerPatternBuilder = new CompilerPatternBuilder();
		greenCompilerPatternBuilder.addOperationBuilder(assignmentOperationBuilder);
		greenCompilerPatternBuilder.addOperationBuilder(emfGreenOperationBuilder);
		greenCompilerPatternBuilder.setAlgorithm(algorithm);

		final PatternMatcherCompiler greenPatternMatcherCompiler = new PatternMatcherCompiler(greenPatternBuilder,
				greenCompilerPatternBuilder);
		return greenPatternMatcherCompiler;
	}

	protected PatternMatcher configureExpressionPatternMatcher() throws IOException {
		return configureExpressionPatternMatcherCompiler();
	}

	protected PatternMatcherCompiler configureExpressionPatternMatcherCompiler() {
		// Configuring expression pattern matcher
		final EMFPatternBuilder<DefaultPattern, DefaultPatternBody> expressionPatternBuilder = new EMFPatternBuilder<DefaultPattern, DefaultPatternBody>(
				new DefaultPatternFactory());
		expressionPatternBuilder.addConstraintTypeSwitch(internalRelationalTypeModule.getConstraintTypeSwitch());
		expressionPatternBuilder.addVariableTypeSwitch(internalEMFTypeModule.getVariableTypeSwitch());
		expressionPatternBuilder.addConstraintTypeSwitch(internalEMFTypeModule.getConstraintTypeSwitch());

		final CompilerPatternBuilder expressionCompilerPatternBuilder = new CompilerPatternBuilder();
		expressionCompilerPatternBuilder.addOperationBuilder(assignmentOperationBuilder);
		expressionCompilerPatternBuilder.addOperationBuilder(basicOperationBuilder);
		expressionCompilerPatternBuilder.setAlgorithm(algorithm);

		final PatternMatcherCompiler expressionPatternMatcherCompiler = new PatternMatcherCompiler(
				expressionPatternBuilder, expressionCompilerPatternBuilder);
		return expressionPatternMatcherCompiler;
	}

	@Override
	public TemplateConfigurationProvider createTemplateConfiguration(final GenModel genModel) {
		return new DefaultTemplateConfiguration(genModel);
	}
}
