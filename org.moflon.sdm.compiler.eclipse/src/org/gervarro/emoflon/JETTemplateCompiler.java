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

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.apache.log4j.Logger;
import org.eclipse.emf.codegen.CodeGenPlugin;
import org.eclipse.emf.codegen.jet.JETCompiler;
import org.eclipse.emf.codegen.jet.JETException;
import org.eclipse.emf.codegen.jet.JETMark;
import org.eclipse.emf.codegen.jet.JETSkeleton;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.moflon.core.utilities.LogUtils;

public class JETTemplateCompiler extends JETCompiler {
	private static final Logger logger = Logger.getLogger(JETTemplateCompiler.class);

	/**
	 * A stack of sections and whether to start skipping, one from each include with
	 * alternative encountered.
	 */
	protected Stack<SkipSection> overriddenSkipSections = new Stack<SkipSection>();

	private final List<URIHandler> uriHandlers;

	public JETTemplateCompiler(final String[] templateURIPath, final String relativeTemplateURI) throws JETException {
		super(templateURIPath, relativeTemplateURI);
		this.uriHandlers = URIHandler.DEFAULT_HANDLERS;
	}

	/**
	 * A skip section entry, records the depth of the section and whether to start
	 * skipping there.
	 */
	private static class SkipSection {
		int depth;

		boolean skip;

		private SkipSection(final int depth, final boolean skip) {
			this.depth = depth;
			this.skip = skip;
		}
	}

	protected void handleIncludeFailure(final String failType, final String uriString, final JETMark start,
			final Exception exception) throws JETException {
		// The include failed, so if there is an alternative, we don't skip it.
		if ("alternative".equals(failType)) {
			overriddenSkipSections.push(new SkipSection(sectionDepth + 1, false));
		} else if (!"silent".equals(failType)) {
			throw new JETException(CodeGenPlugin.getPlugin().getString("jet.error.file.cannot.read",
					new Object[] { uriString, start.format("jet.mark.file.line.column") }), exception);
		}
	}

	@Override
	public void handleDirective(final String directive, final JETMark start, final JETMark stop,
			final Map<String, String> attributes) throws JETException {
		if (directive.equals("include")) {
			final String fileURIString = attributes.get("file");
			final String failAttribute = attributes.get("fail");
			if (fileURIString != null) {
				final URI currentRelative = URI.createURI(start.getFile(), true);
				final URI fileRelative = URI.createURI(fileURIString, true);
				final HashMap<Object, Object> options = new HashMap<Object, Object>();

				for (int i = 0; i < templateURIPath.length; i++) {
					final URI templateBase = URI.createURI(templateURIPath[i], true);
					final URI currentResolved = currentRelative.resolve(templateBase);
					final URI fileResolved = fileRelative.resolve(currentResolved);

					for (final URIHandler handler : uriHandlers) {
						if (handler.canHandle(fileResolved)) {
							if (handler.exists(fileResolved, options)) {
								final URI fileRelativeResolved = fileResolved.deresolve(templateBase);
								if (fileRelativeResolved.equals(currentRelative)) {
									// Loop has been found
									// baseURI information is ignored
									return;
								}
								try {
									final BufferedInputStream bufferedInputStream = new BufferedInputStream(
											handler.createInputStream(fileResolved, options));
									reader.stackStream(templateBase.toString(), fileRelativeResolved.toString(),
											bufferedInputStream, null);
									// The include succeeded, so if there is an alternative and we're not skipping,
									// we need to
									// start.
									if ("alternative".equals(attributes.get("fail"))) {
										overriddenSkipSections.push(new SkipSection(sectionDepth + 1, !skipping));
									}

									// If a newline from the previous character data remains, leave it around to be
									// processed as
									// if it appeared in the included file.
									if (fSavedLine != null) {
										return;
									}
								} catch (final IOException exception) {
									handleIncludeFailure(failAttribute, fileResolved.toString(), start, exception);
								} catch (final JETException exception) {
									handleIncludeFailure(failAttribute, fileResolved.toString(), start, exception);
								}
							} else {
								break;
							}
						}
					}
				}
				final FileNotFoundException fileNotFoundException = new FileNotFoundException(
						fileRelative.toFileString());
				final JETException exception = new JETException(fileNotFoundException.getLocalizedMessage(),
						fileNotFoundException);
				handleIncludeFailure(failAttribute, fileRelative.toString(), start, exception);
			} else {
				throw new JETException(CodeGenPlugin.getPlugin().getString("jet.error.missing.attribute",
						new Object[] { "file", start.format("jet.mark.file.line.column") }));
			}
		} else if (directive.equals("start")) {
			sectionDepth++;

			// A section is not allowed without a preceding include with alternative.
			final SkipSection skipSection = overriddenSkipSections.isEmpty() ? null
					: (SkipSection) overriddenSkipSections.peek();
			if (skipSection == null || skipSection.depth != sectionDepth) {
				throw new JETException(CodeGenPlugin.getPlugin().getString("jet.error.section.noinclude",
						new Object[] { start.format("jet.mark.file.line.column") }));
			} else if (skipSection.skip) {
				skipping = true;
			}
		} else if (directive.equals("end")) {
			if (sectionDepth == 0) {
				throw new JETException(CodeGenPlugin.getPlugin().getString("jet.error.unmatched.directive",
						new Object[] { "start", "end", start.format("jet.mark.file.line.column") }));
			}
			sectionDepth--;

			// This pop is safe because a section couldn't have been started without an
			// include that pushed.
			if (overriddenSkipSections.pop().skip) {
				skipping = false;
			}
		} else if (directive.equals("jet")) {
			if (skeleton != null) {
				// Multiple jet directives.
			} else {
				skeleton = new JETSkeleton();
				// Process this first.
				final String skeletonURI = attributes.get("skeleton");
				if (skeletonURI != null) {
					try {
						final BufferedInputStream bufferedInputStream = new BufferedInputStream(
								openStream(resolveLocation(templateURIPath, templateURI, skeletonURI)[1]));
						final byte[] input = new byte[bufferedInputStream.available()];
						bufferedInputStream.read(input);
						bufferedInputStream.close();
						skeleton.setCompilationUnitContents(new String(input));
					} catch (final IOException exception) {
						throw new JETException(exception);
					}
				}

				for (final Map.Entry<String, String> entry : attributes.entrySet()) {
					// Ignore this now
					if (entry.getKey().equals("skeleton")) {
						// Ignore
					} else if (entry.getKey().equals("package")) {
						skeleton.setPackageName(entry.getValue());
					} else if (entry.getKey().equals("imports")) {
						skeleton.addImports(entry.getValue());
					} else if (entry.getKey().equals("class")) {
						skeleton.setClassName(entry.getValue());
					} else if (entry.getKey().equals("nlString")) {
						skeleton.setNLString(entry.getValue());
					} else if (entry.getKey().equals("startTag")) {
						parser.setStartTag(entry.getValue());
					} else if (entry.getKey().equals("endTag")) {
						parser.setEndTag(entry.getValue());
					} else if (entry.getKey().equals("version")) {
						// Ignore the version
					} else {
						throw new JETException(CodeGenPlugin.getPlugin().getString("jet.error.bad.attribute",
								new Object[] { entry.getKey(), start.format("jet.mark.file.line.column") }));
					}
				}
				handleNewSkeleton();
			}
		}
		fSavedLine = null;
	}

	void code() {
		final EcorePackage ep = EcorePackage.eINSTANCE;
		final String c = ep.getClass().getName().replace('.', '/').concat(".class");
		final URL url = ep.getClass().getClassLoader().getResource(c);
		final URI eFile = URI.createURI("model/Ecore.ecore", true);
		final URI clazz = URI.createURI(c);
		final URI u = URI.createURI(url.toString());
		final URI base = u.trimSegments(clazz.segmentCount());
		if (clazz.resolve(base).equals(u)) {
			final URI ecore = eFile.resolve(base);
			for (final URIHandler handler : URIHandler.DEFAULT_HANDLERS) {
				if (handler.canHandle(u)) {
					try {
						handler.createInputStream(ecore, Collections.EMPTY_MAP);
						System.out.println("OK");
					} catch (final IOException e) {
						LogUtils.error(logger, e);
					}
				}
			}
		}
		// Development and runtime versions of
		final Map<String, URI> ePackageNsURItoGenModelLocationMap = EcorePlugin
				.getEPackageNsURIToGenModelLocationMap(false);
		ePackageNsURItoGenModelLocationMap.keySet().toArray(new Object[ePackageNsURItoGenModelLocationMap.size()]);
		EPackage.Registry.INSTANCE.keySet().toArray(new Object[EPackage.Registry.INSTANCE.size()]);
	}

	/**
	 * @param args
	 */
	public static void main(final String[] args) throws JETException, FileNotFoundException {
		// The original program started here
		if (args != null && args.length == 2) {
			final String eclipseInstallDirectory = args[1];
			final String workspaceLocation = args[0] + (args[0].endsWith("\\") ? "" : "\\");

			final URI eclipseInstallDirURI = URI.createFileURI(eclipseInstallDirectory);
			final URI workspaceRootURI = URI.createFileURI(workspaceLocation);
			final URI projectDir = URI.createURI("SDMCompiler/", true).resolve(workspaceRootURI);
			final URI srcDir = URI.createURI("gen/").resolve(projectDir);
			final URI templateDir = URI.createURI("templates/emf/").resolve(projectDir);
			final String[] templateURIPath = new String[] { templateDir.toString(),
					"archive:" + eclipseInstallDirURI.toString()
							+ "/plugins/org.eclipse.emf.codegen.ecore_2.9.1.v20130902-0605.jar!/templates/" };
			final String relativeTemplateURI = "model/JavaClassGenerator.javajet";

			final JETCompiler jetCompiler = new JETTemplateCompiler(templateURIPath, relativeTemplateURI);

			jetCompiler.parse();

			final String packageName = jetCompiler.getSkeleton().getPackageName();
			final String className = jetCompiler.getSkeleton().getClassName();

			String fileName = packageName + "." + className;
			fileName = fileName.replace('.', '/');
			URI uri = URI.createURI(fileName + ".java");
			uri = uri.resolve(srcDir);

			final File file = new File(uri.toFileString());
			final String parent = file.getParent();
			if (parent != null) {
				new File(parent).mkdirs();
			}
			final OutputStream outputStream = new FileOutputStream(file);

			jetCompiler.generate(outputStream);
		} else {
			System.out.println("\"${eclipse_home}\" \"${workspace_loc}\"");
		}
	}
}
