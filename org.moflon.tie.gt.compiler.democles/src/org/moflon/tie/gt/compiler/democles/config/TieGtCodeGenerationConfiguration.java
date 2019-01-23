package org.moflon.tie.gt.compiler.democles.config;

import static java.util.Arrays.asList;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Switch;
import org.gervarro.democles.codegen.CompilableAdornedOperation;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.emf.BasicEMFOperationBuilder;
import org.gervarro.democles.codegen.emf.EMFOperationBuilder;
import org.gervarro.democles.common.runtime.OperationBuilder;
import org.gervarro.democles.common.runtime.SearchPlanOperation;
import org.gervarro.democles.common.runtime.SpecificationExtendedVariableRuntime;
import org.gervarro.democles.compiler.CompilerSearchPlanAlgorithm;
import org.gervarro.democles.constraint.CoreConstraintModule;
import org.gervarro.democles.constraint.emf.EMFConstraintModule;
import org.gervarro.democles.plan.WeightedOperation;
import org.gervarro.democles.plan.common.CombinedSearchPlanOperationBuilder;
import org.gervarro.democles.plan.common.RelationalSearchPlanOperationBuilder;
import org.gervarro.democles.plan.common.RelationalWeightedOperationBuilder;
import org.gervarro.democles.plan.common.SearchPlanOperationBuilder;
import org.gervarro.democles.plan.emf.EMFSearchPlanOperationBuilder;
import org.gervarro.democles.plan.emf.EMFWeightedOperationBuilder;
import org.gervarro.democles.relational.RelationalOperationBuilder;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.emf.EMFPatternBuilder;
import org.gervarro.democles.specification.emf.constraint.EMFTypeModule;
import org.gervarro.democles.specification.emf.constraint.PatternInvocationTypeModule;
import org.gervarro.democles.specification.emf.constraint.RelationalTypeModule;
import org.gervarro.democles.specification.impl.DefaultPattern;
import org.gervarro.democles.specification.impl.DefaultPatternBody;
import org.gervarro.democles.specification.impl.DefaultPatternFactory;
import org.gervarro.democles.specification.impl.PatternInvocationConstraintModule;
import org.moflon.core.preferences.EMoflonPreferencesStorage;
import org.moflon.tie.gt.compiler.democles.codegen.template.TemplateConfigurationProvider;
import org.moflon.tie.gt.compiler.democles.codegen.template.TieGtTemplateConfiguration;
import org.moflon.tie.gt.compiler.democles.pattern.DemoclesPatternType;
import org.moflon.tie.gt.compiler.democles.searchplan.AssignmentOperationBuilder;
import org.moflon.tie.gt.compiler.democles.searchplan.AssignmentSearchPlanOperationBuilder;
import org.moflon.tie.gt.compiler.democles.searchplan.AssignmentWeightedOperationBuilder;
import org.moflon.tie.gt.compiler.democles.searchplan.AttributeConstraintOperationBuilder;
import org.moflon.tie.gt.compiler.democles.searchplan.AttributeConstraintSearchPlanOperationBuilder;
import org.moflon.tie.gt.compiler.democles.searchplan.AttributeConstraintWeightedOperationBuilder;
import org.moflon.tie.gt.compiler.democles.searchplan.BindingAndBlackPatternMatcherCompiler;
import org.moflon.tie.gt.compiler.democles.searchplan.BindingAssignmentOperationBuilder;
import org.moflon.tie.gt.compiler.democles.searchplan.EMFGreenOperationBuilder;
import org.moflon.tie.gt.compiler.democles.searchplan.EMFRedOperationBuilder;
import org.moflon.tie.gt.compiler.democles.searchplan.EmfGreenSearchPlanOperationBuilder;
import org.moflon.tie.gt.compiler.democles.searchplan.EmfGreenWeightedOperationBuilder;
import org.moflon.tie.gt.compiler.democles.searchplan.ExpressionPatternMatcherGenerator;
import org.moflon.tie.gt.compiler.democles.searchplan.PatternInvocationSearchPlanOperationBuilder;
import org.moflon.tie.gt.compiler.democles.searchplan.PatternInvocationWeightedOperationBuilder;
import org.moflon.tie.gt.compiler.democles.searchplan.PatternMatcher;
import org.moflon.tie.gt.compiler.democles.searchplan.PatternMatcherCompiler;
import org.moflon.tie.gt.compiler.democles.searchplan.PatternMatcherConfiguration;
import org.moflon.tie.gt.compiler.democles.searchplan.RegularPatternMatcherGenerator;
import org.moflon.tie.gt.compiler.democles.searchplan.TieGtCompilerPatternMatcherModule;
import org.moflon.tie.gt.compiler.democles.searchplan.TieGtCompilerSearchPlanAlgorithm;
import org.moflon.tie.gt.compiler.democles.searchplan.TieGtSearchPlanAlgorithm;
import org.moflon.tie.gt.constraints.operationspecification.AttributeConstraintsLibraryRegistry;
import org.moflon.tie.gt.constraints.operationspecification.constraint.AttributeVariableConstraintsTypeModule;
import org.moflon.tie.gt.constraints.operationspecification.constraint.util.AttributeVariableConstraintsModule;

public class TieGtCodeGenerationConfiguration implements CodeGenerationConfiguration {
	public static final String BINDING_AND_BLACK_PATTERN_MATCHER_GENERATOR = "BindingAndBlackPatternMatcherGenerator";

	public static final String BINDING_PATTERN_MATCHER_GENERATOR = "BindingPatternMatcherGenerator";

	public static final String BLACK_PATTERN_MATCHER_GENERATOR = "BlackPatternMatcherGenerator";

	public static final String RED_PATTERN_MATCHER_GENERATOR = "RedPatternMatcherGenerator";

	public static final String GREEN_PATTERN_MATCHER_GENERATOR = "GreenPatternMatcherGenerator";

	public static final String EXPRESSION_PATTERN_MATCHER_GENERATOR = "ExpressionPatternMatcherGenerator";

	// Constraint modules
	private final EMFConstraintModule emfTypeModule;
	private final EMFTypeModule internalEMFTypeModule;
	private final RelationalTypeModule internalRelationalTypeModule;
	private final EMFPatternBuilder<DefaultPattern, DefaultPatternBody> bindingAndBlackPatternBuilder;

	// Operation modules (constraint to operation (constraint + adornment) mappings)
	private final RelationalOperationBuilder relationalOperationBuilder = new RelationalOperationBuilder();
	private final AssignmentOperationBuilder assignmentOperationBuilder = new AssignmentOperationBuilder();
	private final BindingAssignmentOperationBuilder bindingAssignmentOperationBuilder = new BindingAssignmentOperationBuilder();
	private final BasicEMFOperationBuilder basicOperationBuilder = new BasicEMFOperationBuilder();
	private final EMFOperationBuilder emfBlackOperationBuilder = new EMFOperationBuilder();
	private final EMFRedOperationBuilder emfRedOperationBuilder = new EMFRedOperationBuilder();
	private final EMFGreenOperationBuilder emfGreenOperationBuilder = new EMFGreenOperationBuilder();

	private PatternMatcher bindingAndBlackPatternMatcher;

	private PatternMatcher bindingPatternMatcher;

	private PatternMatcher blackPatternMatcher;

	private PatternMatcher redPatternMatcher;

	private PatternMatcher greenPatternMatcher;

	private PatternMatcher expressionPatternMatcher;

	private final EMoflonPreferencesStorage preferencesStorage;

	/**
	 * Maps operations to code fragments
	 */
	private final AttributeConstraintsLibraryRegistry attributeConstraintLibraries;

	public TieGtCodeGenerationConfiguration(final ResourceSet resourceSet,
			final EMoflonPreferencesStorage preferencesStorage,
			final AttributeConstraintsLibraryRegistry attributeConstraintLibraries) {
		this.preferencesStorage = preferencesStorage;
		this.attributeConstraintLibraries = attributeConstraintLibraries;

		emfTypeModule = new EMFConstraintModule(resourceSet);
		internalEMFTypeModule = new EMFTypeModule(emfTypeModule);
		internalRelationalTypeModule = new RelationalTypeModule(CoreConstraintModule.INSTANCE);

		bindingAndBlackPatternBuilder = createEmfPatternBuilderWithRelationalConstraintSupport();
		bindingAndBlackPatternBuilder.addConstraintTypeSwitch(createPatternInvocationTypeSwitch());

		bindingAndBlackPatternBuilder.addConstraintTypeSwitch(
				createAttributeConstraintsTypeSwitch(resourceSet, attributeConstraintLibraries));

		initializePatternMatchers();

	}

	@Override
	public TemplateConfigurationProvider createTemplateConfiguration(final GenModel genModel) {
		return new TieGtTemplateConfiguration(genModel, attributeConstraintLibraries);
	}

	private CompilerSearchPlanAlgorithm createAlgorithm(final DemoclesPatternType patternType) {
		final LinkedList<SearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, GeneratorOperation>> builders = createSearchPlanOperationBuilders(
				patternType);

		final TieGtSearchPlanAlgorithm defaultAlgorithm = new TieGtSearchPlanAlgorithm(builders);
		final TieGtCompilerSearchPlanAlgorithm createdAlgorithm = new TieGtCompilerSearchPlanAlgorithm(
				defaultAlgorithm);
		return createdAlgorithm;
	}

	private LinkedList<SearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, GeneratorOperation>> createSearchPlanOperationBuilders(
			final DemoclesPatternType patternType) {

		final LinkedList<SearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, GeneratorOperation>> builders = new LinkedList<>();
		builders.add(createEmfSearchPlanOperationBuilder());
		builders.add(createRelationalConstraintsSearchPlanOperationBuilder());
		builders.add(createPatternInvocationSearchPlanOperationBuilder());

		switch (patternType) {
		case BLACK_PATTERN:
			builders.add(createAttributeConstraintSearchPlanOperationBuilder());
			break;
		case BINDING_PATTERN:
			builders.add(createAssignmentSearchPlanOperationBuilder());
			break;
		case EXPRESSION_PATTERN:
			builders.add(createAssignmentSearchPlanOperationBuilder());
			break;
		case GREEN_PATTERN:
			builders.add(createObjectCreatingSearchPlanOperationBuilder());
			builders.add(createAssignmentSearchPlanOperationBuilder());
			break;
		default:
			// Nothing to do
			break;
		}
		return builders;
	}

	private Switch<ConstraintType> createAttributeConstraintsTypeSwitch(final ResourceSet resourceSet,
			final AttributeConstraintsLibraryRegistry attributeConstraintLibraries) {
		final AttributeVariableConstraintsTypeModule attributeVariableConstraintsTypeModule = new AttributeVariableConstraintsTypeModule(
				attributeConstraintLibraries, resourceSet);
		final AttributeVariableConstraintsModule attributeVariableConstraintsModule = new AttributeVariableConstraintsModule(
				attributeVariableConstraintsTypeModule);
		return attributeVariableConstraintsModule.getConstraintTypeSwitch();
	}

	private SearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, GeneratorOperation> createAttributeConstraintSearchPlanOperationBuilder() {
		return new CombinedSearchPlanOperationBuilder<>(//
				new AttributeConstraintSearchPlanOperationBuilder(), new AttributeConstraintWeightedOperationBuilder());
	}

	private SearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, GeneratorOperation> createPatternInvocationSearchPlanOperationBuilder() {
		return new CombinedSearchPlanOperationBuilder<>(//
				new PatternInvocationSearchPlanOperationBuilder(), new PatternInvocationWeightedOperationBuilder());
	}

	private SearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, GeneratorOperation> createObjectCreatingSearchPlanOperationBuilder() {
		return new CombinedSearchPlanOperationBuilder<>(//
				new EmfGreenSearchPlanOperationBuilder(), new EmfGreenWeightedOperationBuilder());
	}

	private CombinedSearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, SearchPlanOperation<GeneratorOperation>, GeneratorOperation> createAssignmentSearchPlanOperationBuilder() {
		return new CombinedSearchPlanOperationBuilder<>(//
				new AssignmentSearchPlanOperationBuilder(), new AssignmentWeightedOperationBuilder());
	}

	private CombinedSearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, SearchPlanOperation<GeneratorOperation>, GeneratorOperation> createRelationalConstraintsSearchPlanOperationBuilder() {
		return new CombinedSearchPlanOperationBuilder<>(//
				new RelationalSearchPlanOperationBuilder<>(), new RelationalWeightedOperationBuilder<>());
	}

	private CombinedSearchPlanOperationBuilder<WeightedOperation<SearchPlanOperation<GeneratorOperation>, Integer>, SearchPlanOperation<GeneratorOperation>, GeneratorOperation> createEmfSearchPlanOperationBuilder() {
		return new CombinedSearchPlanOperationBuilder<>(//
				new EMFSearchPlanOperationBuilder<>(), new EMFWeightedOperationBuilder<>());
	}

	@Override
	public PatternMatcherConfiguration getSearchPlanGenerators() {
		final Map<DemoclesPatternType, PatternMatcher> searchPlanGenerators = new HashMap<>();
		searchPlanGenerators.put(DemoclesPatternType.GREEN_PATTERN, getGreenPatternSearchPlanGenerator());
		searchPlanGenerators.put(DemoclesPatternType.RED_PATTERN, getRedPatternSearchPlanGenerator());
		searchPlanGenerators.put(DemoclesPatternType.BLACK_PATTERN, getBlackPatternSearchPlanGenerator());
		searchPlanGenerators.put(DemoclesPatternType.BINDING_PATTERN, getBindingPatternSearchPlanGenerator());
		searchPlanGenerators.put(DemoclesPatternType.BINDING_AND_BLACK_PATTERN,
				getBindingAndBlackPatternSearchPlanGenerator());
		searchPlanGenerators.put(DemoclesPatternType.EXPRESSION_PATTERN, getExpressionPatternSearchPlanGenerator());
		return new PatternMatcherConfiguration(searchPlanGenerators);
	}

	private void initializePatternMatchers() {
		try {
			setBindingAndBlackPatternMatcher(configureBindingAndBlackPatternMatcher());
			setBindingPatternMatcher(configureBindingPatternMatcher());
			setBlackPatternMatcher(configureBlackPatternMatcher());
			setRedPatternMatcher(configureRedPatternMatcher());
			setGreenPatternMatcher(configureGreenPatternMatcher());
			setExpressionPatternMatcher(configureExpressionPatternMatcher());
		} catch (final IOException e) {
			// Do nothing
		}
	}

	public EMoflonPreferencesStorage getPreferencesStorage() {
		return preferencesStorage;
	}

	private PatternMatcher getBindingAndBlackPatternSearchPlanGenerator() {
		return bindingAndBlackPatternMatcher;
	}

	private PatternMatcher getBindingPatternSearchPlanGenerator() {
		return bindingPatternMatcher;
	}

	private PatternMatcher getBlackPatternSearchPlanGenerator() {
		return blackPatternMatcher;
	}

	private PatternMatcher getRedPatternSearchPlanGenerator() {
		return redPatternMatcher;
	}

	private PatternMatcher getGreenPatternSearchPlanGenerator() {
		return greenPatternMatcher;
	}

	private PatternMatcher getExpressionPatternSearchPlanGenerator() {
		return expressionPatternMatcher;
	}

	private void setBindingAndBlackPatternMatcher(final PatternMatcher bindingAndBlackPatternMatcher) {
		this.bindingAndBlackPatternMatcher = bindingAndBlackPatternMatcher;
	}

	private void setBindingPatternMatcher(final PatternMatcher bindingPatternMatcher) {
		this.bindingPatternMatcher = bindingPatternMatcher;
	}

	private void setBlackPatternMatcher(final PatternMatcher blackPatternMatcher) {
		this.blackPatternMatcher = blackPatternMatcher;
	}

	private void setRedPatternMatcher(final PatternMatcher redPatternMatcher) {
		this.redPatternMatcher = redPatternMatcher;
	}

	private void setGreenPatternMatcher(final PatternMatcher greenPatternMatcher) {
		this.greenPatternMatcher = greenPatternMatcher;
	}

	private void setExpressionPatternMatcher(final PatternMatcher expressionPatternMatcher) {
		this.expressionPatternMatcher = expressionPatternMatcher;
	}

	private PatternMatcher configureBindingAndBlackPatternMatcher() throws IOException {
		final PatternMatcherCompiler compiler = configureBindingAndBlackPatternMatcherCompiler();
		return createAndRegisterRegularPatternMatcherGenerator(compiler, BINDING_AND_BLACK_PATTERN_MATCHER_GENERATOR);
	}

	private PatternMatcherCompiler configureBindingAndBlackPatternMatcherCompiler() {

		final TieGtCompilerPatternMatcherModule matcherModule = createPatternMatcherModule(
				DemoclesPatternType.BINDING_AND_BLACK_PATTERN,
				asList(basicOperationBuilder, emfBlackOperationBuilder, relationalOperationBuilder));

		final PatternMatcherCompiler bindingAndBlackPatternMatcherCompiler = new BindingAndBlackPatternMatcherCompiler(
				bindingAndBlackPatternBuilder, matcherModule);
		return bindingAndBlackPatternMatcherCompiler;
	}

	public TieGtCompilerPatternMatcherModule createPatternMatcherModule(final DemoclesPatternType patternType,
			final List<OperationBuilder<CompilableAdornedOperation, List<CompilableAdornedOperation>, SpecificationExtendedVariableRuntime>> operationBuilders) {
		final TieGtCompilerPatternMatcherModule matcherModule = new TieGtCompilerPatternMatcherModule();
		matcherModule.setAlgorithm(createAlgorithm(patternType));
		operationBuilders.forEach(builder -> matcherModule.addOperationBuilder(builder));
		return matcherModule;
	}

	private PatternMatcher configureBindingPatternMatcher() throws IOException {
		final PatternMatcherCompiler compiler = configureBindingPatternMatcherCompiler();
		return createAndRegisterRegularPatternMatcherGenerator(compiler, BINDING_PATTERN_MATCHER_GENERATOR);
	}

	private PatternMatcherCompiler configureBindingPatternMatcherCompiler() {
		final TieGtCompilerPatternMatcherModule matcherModule = createPatternMatcherModule(
				DemoclesPatternType.BINDING_PATTERN, asList(basicOperationBuilder, bindingAssignmentOperationBuilder));

		final PatternMatcherCompiler compiler = new PatternMatcherCompiler(bindingAndBlackPatternBuilder,
				matcherModule);
		return compiler;
	}

	private PatternMatcher configureBlackPatternMatcher() throws IOException {
		final PatternMatcherCompiler compiler = configureBlackPatternMatcherCompiler();
		return createAndRegisterRegularPatternMatcherGenerator(compiler, BLACK_PATTERN_MATCHER_GENERATOR);
	}

	private PatternMatcherCompiler configureBlackPatternMatcherCompiler() {
		final TieGtCompilerPatternMatcherModule matcherModule = createPatternMatcherModule(
				DemoclesPatternType.BLACK_PATTERN, asList(emfBlackOperationBuilder, relationalOperationBuilder,
						new AttributeConstraintOperationBuilder()));

		final PatternMatcherCompiler compiler = new PatternMatcherCompiler(bindingAndBlackPatternBuilder,
				matcherModule);
		return compiler;
	}

	private PatternMatcher configureRedPatternMatcher() throws IOException {
		final PatternMatcherCompiler compiler = configureRedPatternMatcherCompiler();
		return createAndRegisterRegularPatternMatcherGenerator(compiler, RED_PATTERN_MATCHER_GENERATOR);
	}

	private PatternMatcherCompiler configureRedPatternMatcherCompiler() {
		final EMFPatternBuilder<DefaultPattern, DefaultPatternBody> patternBuilder = createEmfPatternBuilder();

		final TieGtCompilerPatternMatcherModule matcherModule = createPatternMatcherModule(
				DemoclesPatternType.RED_PATTERN, asList(emfRedOperationBuilder));

		final PatternMatcherCompiler compiler = new PatternMatcherCompiler(patternBuilder, matcherModule);
		return compiler;
	}

	private PatternMatcher configureGreenPatternMatcher() throws IOException {
		final PatternMatcherCompiler compiler = configureGreenPatternMatcherCompiler();
		return createAndRegisterRegularPatternMatcherGenerator(compiler, GREEN_PATTERN_MATCHER_GENERATOR);
	}

	private PatternMatcherCompiler configureGreenPatternMatcherCompiler() {
		final EMFPatternBuilder<DefaultPattern, DefaultPatternBody> patternBuilder = createEmfPatternBuilderWithRelationalConstraintSupport();

		final TieGtCompilerPatternMatcherModule matcherModule = createPatternMatcherModule(
				DemoclesPatternType.GREEN_PATTERN, asList(assignmentOperationBuilder, emfGreenOperationBuilder));

		final PatternMatcherCompiler compiler = new PatternMatcherCompiler(patternBuilder, matcherModule);
		return compiler;
	}

	private PatternMatcher configureExpressionPatternMatcher() throws IOException {
		final PatternMatcherCompiler compiler = configureExpressionPatternMatcherCompiler();
		final ExpressionPatternMatcherGenerator generator = new ExpressionPatternMatcherGenerator(compiler,
				EXPRESSION_PATTERN_MATCHER_GENERATOR, getPreferencesStorage());
		return generator;
	}

	private PatternMatcherCompiler configureExpressionPatternMatcherCompiler() {
		final EMFPatternBuilder<DefaultPattern, DefaultPatternBody> patternBuilder = createEmfPatternBuilderWithRelationalConstraintSupport();

		final TieGtCompilerPatternMatcherModule matcherModule = createPatternMatcherModule(
				DemoclesPatternType.EXPRESSION_PATTERN, asList(assignmentOperationBuilder, basicOperationBuilder));

		final PatternMatcherCompiler compiler = new PatternMatcherCompiler(patternBuilder, matcherModule);
		return compiler;
	}

	/**
	 * Creates a {@link RegularPatternMatcherGenerator} from the given
	 * {@link PatternMatcherCompiler} and registers it a the {@link Resource}
	 *
	 * @param compiler
	 * @param generatorName
	 * @param resource
	 * @return
	 */
	private PatternMatcher createAndRegisterRegularPatternMatcherGenerator(final PatternMatcherCompiler compiler,
			final String generatorName) {
		final RegularPatternMatcherGenerator generator = new RegularPatternMatcherGenerator(compiler, generatorName,
				getPreferencesStorage());
		return generator;
	}

	private EMFPatternBuilder<DefaultPattern, DefaultPatternBody> createEmfPatternBuilder() {
		final EMFPatternBuilder<DefaultPattern, DefaultPatternBody> patternBuilder = new EMFPatternBuilder<>(
				new DefaultPatternFactory());
		patternBuilder.addConstraintTypeSwitch(internalEMFTypeModule.getConstraintTypeSwitch());
		patternBuilder.addVariableTypeSwitch(internalEMFTypeModule.getVariableTypeSwitch());
		return patternBuilder;
	}

	private EMFPatternBuilder<DefaultPattern, DefaultPatternBody> createEmfPatternBuilderWithRelationalConstraintSupport() {
		final EMFPatternBuilder<DefaultPattern, DefaultPatternBody> patternBuilder = createEmfPatternBuilder();
		patternBuilder.addConstraintTypeSwitch(internalRelationalTypeModule.getConstraintTypeSwitch());
		return patternBuilder;
	}

	private Switch<ConstraintType> createPatternInvocationTypeSwitch() {
		final PatternInvocationConstraintModule<DefaultPattern, DefaultPatternBody> bindingAndBlackPatternInvocationTypeModule = new PatternInvocationConstraintModule<>(
				bindingAndBlackPatternBuilder);
		final PatternInvocationTypeModule<DefaultPattern, DefaultPatternBody> internalPatternInvocationTypeModule = new PatternInvocationTypeModule<>(
				bindingAndBlackPatternInvocationTypeModule);
		return internalPatternInvocationTypeModule.getConstraintTypeSwitch();
	}
}
