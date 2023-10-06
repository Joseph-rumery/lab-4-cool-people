package lab4;

import tester.BinaryTree;
import tester.E;
import tester.Node;

/**
 * searchBT encompasses contains() and getLevel methods()
 * 
 * @author Jonah
 * @version 10/4/2023
 */
public class searchBT extends BinaryTree {

	Node root;
	Node right;
	Node left;

	/**
	 * contains method which searches a binaryTree for a key item and returns a
	 * boolean true if the item is found, otherwise false
	 * 
	 * @param item the key item being search for
	 * @return boolean, true if the item is in the tree else false
	 */
	public boolean contains(int item) {
		return contains(root, item);
	}

	/**
	 * contains method which searches a binaryTree for a key item and returns a
	 * boolean true if the item is found, otherwise false
	 * 
	 * @param node the node to be searched through
	 * @param item the key item being search for
	 * @return boolean, true if the item is in the tree else false
	 */
	private boolean contains(Node<E> node, int item) {
		if (node == null) {
			return false;
		}

		if (contains(node, item) || contains(node.left, item) || contains(node.right, item)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * getLevel method returns the int level of the key item
	 * 
	 * @param item the key item being search for
	 * @return int, the level of the key item in the binaryTree
	 */
	public int getLevel(int item) {
		return getLevel(root, item);
	}

	private int getLevel(Node<E> node, int item) {
		int level = 0;
		if (node == null) {
			return -1;
		}
		if (getLevel(contains(node.left, item)) > getLevel(contains(node.right, item))) {
			return node.left + 1;
		} else
			return node.right + 1;

	}

}
