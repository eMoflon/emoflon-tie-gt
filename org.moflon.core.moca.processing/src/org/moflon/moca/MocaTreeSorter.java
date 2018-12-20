package org.moflon.moca;

import java.util.LinkedList;
import java.util.List;

import MocaTree.Attribute;
import MocaTree.File;
import MocaTree.Folder;
import MocaTree.Node;
import MocaTree.Text;

/**
 * Utility class for sorting MocaTree elements (Attributes, Text/Node children)
 *
 * @author david
 * @author (last editor) $Author$
 * @version $Revision$ $Date$
 */
public class MocaTreeSorter {

	public void applyIndices(final Node node) {
		sortAttributes(node);
		sortChildren(node);
	}

	private void sortAttributes(final Node node) {
		final List<Attribute> elements = new LinkedList<Attribute>();
		elements.addAll(node.getAttribute());
		elements.sort(new MocaTreeComparator());
		node.getAttribute().clear();
		node.getAttribute().addAll(elements);
	}

	private void sortChildren(final Node node) {
		final List<Text> elements = new LinkedList<Text>();
		elements.addAll(node.getChildren());
		elements.sort(new MocaTreeComparator());
		node.getChildren().clear();
		node.getChildren().addAll(elements);
	}

	/**
	 * Applies indices in the given MocaTree node. Indices will also be applied
	 * during MocaTree->CommonTree transformation, use this method to explicitly
	 * sort the MocaTree.
	 * 
	 * @param node
	 */
	public static void sort(final Node node) {
		new MocaTreeSorter().applyIndices(node);
		for (final Text child : node.getChildren()) {
			if (child instanceof Node) {
				sort((Node) child);
			}
		}
	}

	/**
	 * Applies indices in the given MocaTree. Indices will also be applied during
	 * MocaTree->CommonTree transformation, use this method to explicitly sort the
	 * MocaTree.
	 * 
	 * @param node
	 */
	public static void sort(final Folder folder) {
		for (final File file : folder.getFile()) {
			sort(file);
		}
		for (final Folder subFolder : folder.getSubFolder()) {
			sort(subFolder);
		}
	}

	/**
	 * Applies indices in the given MocaTree file. Indices will also be applied
	 * during MocaTree->CommonTree transformation, use this method to explicitly
	 * sort the MocaTree.
	 * 
	 * @param node
	 */
	public static void sort(final File file) {
		sort(file.getRootNode());
	}

}
