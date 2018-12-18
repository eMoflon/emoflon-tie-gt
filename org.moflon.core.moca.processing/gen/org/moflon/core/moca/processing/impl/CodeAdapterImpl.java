/**
 */
package org.moflon.core.moca.processing.impl;

import MocaTree.Folder;

import java.io.File;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.moflon.core.moca.processing.CodeAdapter;
import org.moflon.core.moca.processing.Problem;
import org.moflon.core.moca.processing.ProcessingPackage;

import org.moflon.core.moca.processing.parser.Parser;
import org.moflon.core.moca.processing.parser.ParserPackage;

import org.moflon.core.moca.processing.unparser.Unparser;
import org.moflon.core.moca.processing.unparser.UnparserPackage;
// <-- [user defined imports]
import MocaTree.MocaTreeFactory;
import MocaTree.Node;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.log4j.Logger;
import org.moflon.core.utilities.LogUtils;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.moflon.core.moca.processing.impl.CodeAdapterImpl#getUnparser <em>Unparser</em>}</li>
 *   <li>{@link org.moflon.core.moca.processing.impl.CodeAdapterImpl#getProblems <em>Problems</em>}</li>
 *   <li>{@link org.moflon.core.moca.processing.impl.CodeAdapterImpl#getParser <em>Parser</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodeAdapterImpl extends EObjectImpl implements CodeAdapter {
	/**
	 * The cached value of the '{@link #getUnparser() <em>Unparser</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnparser()
	 * @generated
	 * @ordered
	 */
	protected EList<Unparser> unparser;

	/**
	 * The cached value of the '{@link #getProblems() <em>Problems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblems()
	 * @generated
	 * @ordered
	 */
	protected EList<Problem> problems;

	/**
	 * The cached value of the '{@link #getParser() <em>Parser</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParser()
	 * @generated
	 * @ordered
	 */
	protected EList<Parser> parser;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessingPackage.Literals.CODE_ADAPTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unparser> getUnparser() {
		if (unparser == null) {
			unparser = new EObjectContainmentWithInverseEList<Unparser>(Unparser.class, this,
					ProcessingPackage.CODE_ADAPTER__UNPARSER, UnparserPackage.UNPARSER__CODE_ADAPTER);
		}
		return unparser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Problem> getProblems() {
		if (problems == null) {
			problems = new EObjectContainmentWithInverseEList<Problem>(Problem.class, this,
					ProcessingPackage.CODE_ADAPTER__PROBLEMS, ProcessingPackage.PROBLEM__CODE_ADAPTER);
		}
		return problems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parser> getParser() {
		if (parser == null) {
			parser = new EObjectContainmentWithInverseEList<Parser>(Parser.class, this,
					ProcessingPackage.CODE_ADAPTER__PARSER, ParserPackage.PARSER__CODE_ADAPTER);
		}
		return parser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder parse(File dir) {
		// [user code injected with eMoflon]

		Folder folder = MocaTreeFactory.eINSTANCE.createFolder();

		// Ensure that dir is a directory
		if (dir.isDirectory()) {
			// Set the name for the new folder
			folder.setName(dir.getName());

			// Get files contained in dir
			java.io.File[] content = dir.listFiles();

			// Handle contents
			try {
				for (java.io.File child : content) {
					if (child.isDirectory()) {
						createSubFolder(child, folder);
					} else {
						parseFile(child, folder);
					}
				}
			} catch (Exception e) {
				LogUtils.error(logger, e, "Unable to handle contents in %s.", dir);
			}
		} else
			throw new IllegalArgumentException(dir + " must be a Directory!");

		return folder;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File unparse(String path, Folder folder) {
		// [user code injected with eMoflon]

		java.io.File dir = new java.io.File(path, folder.getName());
		try {
			createFolder(folder, dir);
		} catch (IOException e) {
			LogUtils.error(logger, e, "Unable to unparse %s.", folder);
		}
		return dir;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MocaTree.File parseFile(File file, Folder parent) {
		// [user code injected with eMoflon]

		// Create file and set parent
		MocaTree.File efile = MocaTreeFactory.eINSTANCE.createFile();
		efile.setName(file.getName());
		efile.setFolder(parent);

		// Determine appropriate parser to handle file
		EList<Parser> parsers = getParser();
		Parser foundParser = null;
		for (Parser parser : parsers) {
			if (parser.canParseFile(file.getName())) {
				if (foundParser == null)
					foundParser = parser;
				else
					// Complain if parser for file is not unique
					throw new IllegalStateException("Found multiple parsers for " + file.getName());
			}
		}

		if (foundParser == null) {
			// No appropriate parser found, switch to default handling of file
			Node content = MocaTreeFactory.eINSTANCE.createNode();
			content.setFile(efile);

			BufferedReader in = null;
			try {
				in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
				String fileContent = "";
				String str;
				while ((str = in.readLine()) != null)
					fileContent += str;

				content.setName(StringEscapeUtils.escapeXml(fileContent));
				in.close();
			} catch (Exception e) {
				LogUtils.error(logger, e, "Unable to extract content from " + file + ": " + e);
			}
		} else {
			try {
				// Found appropriate parser, delegate ...
				Node content = foundParser.parse(file, new FileReader(file.getAbsoluteFile()));
				content.setFile(efile);
			} catch (Exception e) {
				LogUtils.error(logger, e, "Parser is unable to handle " + file + ": " + e);
			}
		}

		return efile;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unparseFile(MocaTree.File eFile, File dir) {
		// [user code injected with eMoflon]

		java.io.File file = new java.io.File(dir, eFile.getName());
		try {
			unparseFileToStream(eFile, new FileWriter(file));
		} catch (IOException e) {
			LogUtils.error(logger, e);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProcessingPackage.CODE_ADAPTER__UNPARSER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUnparser()).basicAdd(otherEnd, msgs);
		case ProcessingPackage.CODE_ADAPTER__PROBLEMS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProblems()).basicAdd(otherEnd, msgs);
		case ProcessingPackage.CODE_ADAPTER__PARSER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getParser()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProcessingPackage.CODE_ADAPTER__UNPARSER:
			return ((InternalEList<?>) getUnparser()).basicRemove(otherEnd, msgs);
		case ProcessingPackage.CODE_ADAPTER__PROBLEMS:
			return ((InternalEList<?>) getProblems()).basicRemove(otherEnd, msgs);
		case ProcessingPackage.CODE_ADAPTER__PARSER:
			return ((InternalEList<?>) getParser()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProcessingPackage.CODE_ADAPTER__UNPARSER:
			return getUnparser();
		case ProcessingPackage.CODE_ADAPTER__PROBLEMS:
			return getProblems();
		case ProcessingPackage.CODE_ADAPTER__PARSER:
			return getParser();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ProcessingPackage.CODE_ADAPTER__UNPARSER:
			getUnparser().clear();
			getUnparser().addAll((Collection<? extends Unparser>) newValue);
			return;
		case ProcessingPackage.CODE_ADAPTER__PROBLEMS:
			getProblems().clear();
			getProblems().addAll((Collection<? extends Problem>) newValue);
			return;
		case ProcessingPackage.CODE_ADAPTER__PARSER:
			getParser().clear();
			getParser().addAll((Collection<? extends Parser>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ProcessingPackage.CODE_ADAPTER__UNPARSER:
			getUnparser().clear();
			return;
		case ProcessingPackage.CODE_ADAPTER__PROBLEMS:
			getProblems().clear();
			return;
		case ProcessingPackage.CODE_ADAPTER__PARSER:
			getParser().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ProcessingPackage.CODE_ADAPTER__UNPARSER:
			return unparser != null && !unparser.isEmpty();
		case ProcessingPackage.CODE_ADAPTER__PROBLEMS:
			return problems != null && !problems.isEmpty();
		case ProcessingPackage.CODE_ADAPTER__PARSER:
			return parser != null && !parser.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ProcessingPackage.CODE_ADAPTER___PARSE__FILE:
			return parse((File) arguments.get(0));
		case ProcessingPackage.CODE_ADAPTER___UNPARSE__STRING_FOLDER:
			return unparse((String) arguments.get(0), (Folder) arguments.get(1));
		case ProcessingPackage.CODE_ADAPTER___PARSE_FILE__FILE_FOLDER:
			return parseFile((File) arguments.get(0), (Folder) arguments.get(1));
		case ProcessingPackage.CODE_ADAPTER___UNPARSE_FILE__FILE_FILE:
			unparseFile((MocaTree.File) arguments.get(0), (File) arguments.get(1));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}
	// <-- [user code injected with eMoflon]

	private static final Logger logger = Logger.getLogger(CodeAdapterImpl.class);

	private void createSubFolder(java.io.File dir, Folder parent) throws IOException {
		// Skip svn metadata
		if (dir.getName().equals(".svn"))
			return;

		// Create subfolder and set parent
		Folder folder = MocaTreeFactory.eINSTANCE.createFolder();
		folder.setName(dir.getName());
		folder.setParentFolder(parent);

		// Handle contents in directory
		java.io.File[] content = dir.listFiles();
		for (java.io.File child : content) {
			if (child.isDirectory())
				createSubFolder(child, folder);
			else
				parseFile(child, folder);
		}
	}

	private void createFolder(Folder folder, java.io.File dir) throws IOException {
		dir.mkdirs();
		// Creates all files in the current folder
		for (MocaTree.File eFile : folder.getFile())
			unparseFile(eFile, dir);

		for (Folder subFolder : folder.getSubFolder()) {
			java.io.File subDir = new java.io.File(dir, subFolder.getName());
			createFolder(subFolder, subDir);
		}
	}

	public void unparseFileToStream(MocaTree.File eFile, Writer writer) {
		EList<Unparser> unparsers = getUnparser();
		Unparser foundUnparser = null;
		for (Unparser unparser : unparsers) {
			if (unparser.canUnparseFile(eFile.getName())) {
				if (foundUnparser == null)
					foundUnparser = unparser;
				else
					// Complain if unparser for file is not unique
					throw new IllegalStateException("Found multiple unparsers for " + eFile.getName());
			}
		}

		// Determined contents of file
		String fileContent = "";
		if (foundUnparser == null)
			// No appropriate unparser found, switch to default handling
			// Default handling can only unparse the single root
			fileContent = StringEscapeUtils.unescapeXml(eFile.getRootNode().getName());
		else
			// Found appropriate unparser, delegate ...
			fileContent = foundUnparser.unparse(eFile.getRootNode());

		try {
			Writer out = new BufferedWriter(writer);
			out.write(fileContent);
			out.close();
		} catch (Exception e) {
			LogUtils.error(logger, e, "Unparser is unable to handle " + eFile + ": " + e);
		}
	}

	// [user code injected with eMoflon] -->
} //CodeAdapterImpl
