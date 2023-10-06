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
	private boolean contains(Node node, int item) {
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
		return getLevel(root, item, 0); // Start with level 0 for the root node
	}

	/**
	 * Private recursive method to find the level of the key item
	 * 
	 * @param node  the current node being examined
	 * @param item  the key item being searched for
	 * @param level the current level in the tree
	 * @return int, the level of the key item in the binaryTree, -1 if not found
	 */
	private int getLevel(Node node, int item, int level) {
		if (node == null) {
			return -1; // Item not found in the tree
		}

		if (node.data == item) {
			return level; // Item found, return the current level
		}

		// Recursively search in the left and right subtrees, incrementing the level
		int leftLevel = getLevel(node.left, item, level + 1);
		int rightLevel = getLevel(node.right, item, level + 1);

		// Return the maximum of leftLevel and rightLevel, or -1 if both are -1 (item
		// not found)
		return Math.max(leftLevel, rightLevel);
	}

	public void searchTest() {
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		System.out.println("Output of contains(): ");
		contains(tree.root, 3);
		System.out.println("\nOutput of getLevel: ");
		getLevel(tree.root, 2, 0);
	}

}
