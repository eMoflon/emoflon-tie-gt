package org.moflon.tie.gt.mosl.ide.ui.highlighting;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.tie.gt.mosl.ide.ui.highlighting.rules.AbstractHighlightingRule;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.wiring.BundleWiring;

/**
 *
 * The HighlightAutoFactory creates all implementations of
 * {@link AbstractHighlightingRule} which have the Annotation
 * {@link RegisterRule}. But there is one restriction only classes of the bundle
 * where the {@link AbstractHighlightProviderController} is can be loaded. If
 * Rules want to be used which are in a different bundle as the
 * {@link AbstractHighlightProviderController} then there must be create a
 * subclass from {@link HighlightAutoFactory} and override the method
 * manuallyLoadedClasses. The Subclass of the HighlightAutoFactory must then be
 * transfered to the {@link AbstractHighlightProviderController} Constructor.
 *
 * <h1>Example:</h1> <i>reuse or use {@link AbstractHighlightingRule}s from
 * other {@link Bundle}s</i>
 *
 * <pre>
 * <code>public class MyHighlightFactory extends HighlightAutoFactory{
 * 	{@literal @}Override
 *  	protected List<Class<? extends AbstractHighlightingRule>> manuallyLoadedClasses(){
 *  		return Arrays.asList(OtherRule1.class, ... );
 *  	}
 * }</code>
 * </pre>
 *
 * @see AbstractHighlightProviderController
 * @see AbstractHighlightingRule
 * @see RegisterRule
 *
 * @author SaschaEdwinZander
 *
 */
public class HighlightAutoFactory {
	private AbstractHighlightProviderController controller;

	private final Logger logger;

	public HighlightAutoFactory() {
		logger = Logger.getLogger(this.getClass());
	}

	void createAllInstances() {
		final String pluginName = WorkspaceHelper.getPluginId(controller.getClass());
		final Bundle bundle = FrameworkUtil.getBundle(controller.getClass());
		final BundleWiring bundleWiring = bundle.adapt(BundleWiring.class);
		final Collection<String> resources = bundleWiring.listResources(pluginName.replaceAll("\\.", "/"), "*.class",
				BundleWiring.LISTRESOURCES_RECURSE);
		final List<String> classNames = resources.parallelStream()
				.map(resource -> resource.replaceAll("/", "\\.").replace(".class", "")).collect(Collectors.toList());
		final List<Class<?>> classes = classNames.parallelStream().map(className -> loadClass(className, bundle))
				.collect(Collectors.toList());
		final List<Class<?>> ruleClasses = classes.parallelStream().filter(this::isExecutableAndRegisteredRule)
				.collect(Collectors.toList());
		ruleClasses.addAll(manuallyLoadedClasses().parallelStream().filter(this::isConcreteHighlightingRule)
				.map(classRule -> (Class<?>) classRule).collect(Collectors.toList()));
		createInstances(ruleClasses);
	}

	private boolean isExecutableAndRegisteredRule(final Class<?> ruleClass) {
		return isConcreteHighlightingRule(ruleClass) && ruleClass.isAnnotationPresent(RegisterRule.class);
	}

	private boolean isConcreteHighlightingRule(final Class<?> ruleClass) {
		return ruleClass != null && AbstractHighlightingRule.class.isAssignableFrom(ruleClass)
				&& !Modifier.isAbstract(ruleClass.getModifiers()) && hasCorrectConstructor(ruleClass);
	}

	private void createInstances(final List<Class<?>> classes) {
		classes.parallelStream().map(this::getConstructor).forEach(this::createInstance);
	}

	private void createInstance(final Constructor<?> constructor) {
		try {
			constructor.newInstance(controller);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			logger.error(e.getMessage(), e);
		}
	}

	private Constructor<?> getConstructor(final Class<?> clazz) {
		try {
			return clazz.getConstructor(AbstractHighlightProviderController.class);
		} catch (NoSuchMethodException | SecurityException e) {
			logger.error(e.getMessage(), e);
			return null;
		}
	}

	private boolean hasCorrectConstructor(final Class<?> clazz) {
		try {
			clazz.getConstructor(AbstractHighlightProviderController.class);
			return true;
		} catch (NoSuchMethodException | SecurityException e) {
			logger.error("Class " + clazz.getName() + " has no Constructor with only the Controller as argument");
			return false;
		}
	}

	void setController(final AbstractHighlightProviderController controller) {
		this.controller = controller;
	}

	/**
	 * Override this method to load classes from other bundles. The classes must be
	 * loaded in this method.
	 *
	 * @return the classes of implementation from AbstractHighlightingRules.
	 */
	protected List<Class<? extends AbstractHighlightingRule>> manuallyLoadedClasses() {
		return new ArrayList<>();
	}

	private Class<?> loadClass(final String className, final Bundle bundle) {
		try {
			return bundle.loadClass(className);
		} catch (final ClassNotFoundException e) {
			logger.error(e.getMessage(), e);
			return null;
		}
	}

}
