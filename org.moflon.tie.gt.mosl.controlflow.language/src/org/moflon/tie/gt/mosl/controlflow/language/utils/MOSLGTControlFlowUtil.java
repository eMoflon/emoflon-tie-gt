package org.moflon.tie.gt.mosl.controlflow.language.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.emoflon.ibex.gt.editor.gT.EditorGTFile;
import org.moflon.core.xtext.exceptions.CannotFindScopeException;
import org.moflon.core.xtext.utils.ResourceUtil;
import org.moflon.tie.gt.mosl.controlflow.language.moslControlFlow.GraphTransformationControlFlowFile;

public class MOSLGTControlFlowUtil {
	public static IScope getScopeByPattern(final EObject context, final EReference reference,
			final Map<GraphTransformationControlFlowFile, List<EditorGTFile>> resolvingCache)
			throws CannotFindScopeException {
		final GraphTransformationControlFlowFile gtf = ResourceUtil.getRootObject(context,
				GraphTransformationControlFlowFile.class);
		final List<EditorGTFile> patternFiles = resolvingCache.getOrDefault(gtf, new ArrayList<>()).stream()
				.collect(Collectors.toList());
		final EClassifier type = reference.getEType();
		final List<? extends EObject> candidates = patternFiles.parallelStream()
				.map(ptFile -> getElements(ptFile.eAllContents(), type)).flatMap(lst -> lst.stream())
				.collect(Collectors.toList());
		return Scopes.scopeFor(candidates);
	}

	private static <O extends EObject> List<O> getElements(final Iterator<O> iterator, final EClassifier type) {
		final List<O> lst = new ArrayList<>();
		iterator.forEachRemaining(lst::add);
		return lst.stream().filter(o -> o.eClass().equals(type)).collect(Collectors.toList());
	}

	public static void resolvePatterns(final EObject context,
			final Map<GraphTransformationControlFlowFile, List<EditorGTFile>> resolvingCache,
			final ResourceSet resSet) {
		final GraphTransformationControlFlowFile cfFile = ResourceUtil.getRootObject(context,
				GraphTransformationControlFlowFile.class);
		final Resource cfFileRes = cfFile.eResource();
		final URI cfFileUri = cfFileRes.getURI();
		final List<String> cfFileUriParts = Arrays.asList(cfFileUri.toString().split("/"));
		final String cfFileURIStringPrefix = cfFileUriParts.stream().filter(part -> !part.endsWith(".mcf")).reduce("",
				(a, b) -> a + b + "/");

		final List<URI> patternUris = cfFile.getIncludedPatterns().stream()
				.map(pattern -> URI.createURI(cfFileURIStringPrefix + pattern.getImportURI()))
				.collect(Collectors.toList());
		final List<EditorGTFile> patternFiles = getAllExistingResources(resSet, patternUris);
		patternFiles.parallelStream().filter(EObject::eIsProxy).forEach(EcoreUtil::resolveAll);
		resolvingCache.put(cfFile, patternFiles);
	}

	private static List<EditorGTFile> getAllExistingResources(final ResourceSet resSet, final List<URI> uris) {
		final List<EditorGTFile> patternFiles = uris.stream()//
				.filter(uri -> hasValidResource(resSet, uri)) //
				.map(uri -> ResourceUtil.getObjectFromResourceSet(uri, resSet, EditorGTFile.class)) //
				.collect(Collectors.toList());
		return patternFiles;
	}

	private static boolean hasValidResource(final ResourceSet resSet, final URI uri) {
		final Resource resource = ResourceUtil.getResource(uri, resSet, true);
		return resource != null && !resource.getContents().isEmpty();
	}

}
