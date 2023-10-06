
/**
 * searchBT encompasses contains() and getLevel methods()
 * 
 * @author Jonah
 * @version 10/4/2023
 */
public class searchBT extends BinaryTree {

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

		if (node.data == item) {
			return true;
		}

		return contains(node.left, item) || contains(node.right, item);
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

	/**
	 * Private recursive method to find the level of the key item
	 * 
	 * @param node  the current node being examined
	 * @param item  the key item being searched for
	 * @param level the current level in the tree
	 * @return int, the level of the key item in the binaryTree, -1 if not found
	 */
	private int getLevel(Node node, int item) {
		if (node == null) {
			return -1;
		}
		if (node.data == item) {
			return 0;
		}
		int leftLevel = getLevel(node.left, item);
		if (leftLevel != -1) {
			return leftLevel + 1;
		}
		int rightLevel = getLevel(node.right, item);

		if (rightLevel != -1) {
			return rightLevel + 1;
		}
		return -1;
	}

	public void searchTest() {
		searchBT tree = new searchBT();

		tree.root = tree.new Node(1);
		tree.root.left = tree.new Node(2);
		tree.root.right = tree.new Node(3);
		tree.root.left.left = tree.new Node(4);
		tree.root.left.right = tree.new Node(5);
		tree.root.right.left = tree.new Node(6);
		tree.root.right.right = tree.new Node(7);

		int item = 7;
		int l = tree.getLevel(item);
		boolean c = tree.contains(item);

		System.out.println("Testing for getLevel: " + l);
		System.out.println("Testing for contains: " + c);

	}

}
