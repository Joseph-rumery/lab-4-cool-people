/**
 * BTPrinting - A class to print a BinaryTree
 * @author Nathaniel Serrano
 * @version 4 October 2023
 *
 */
public class BTPrinting extends BinaryTree {
		
	/**
	 * Constructor--Uses BinaryTree's constructor
	 */
	public BTPrinting() {
		super();
	}
	
	/**
	 * preOrderRecursive() - Helper method for preOrder()
	 * Prints items in pre-order using recursion.
	 * @param node
	 */
	private void preOrderRecursive(Node node) {
		if (node==null)
			return;
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
		
	/**
	 * preOrder() - Prints items in binary tree in pre-order
	 * (Root, left, right).
	 * @param node
	 */
	public void preOrder(Node node) {
		preOrderRecursive(node);
	}
		
	/**
	 * printLeftRecursive - Helper method for printLeft()
	 * Uses recursion to print items left to right
	 * @param node
	 */
    private void printLeftRecursive(Node node) {
    	if (node == null) 
    		return;
	      
	    printLeftRecursive(node.left);
        System.out.print(node.data + " ");
        printLeftRecursive(node.right);
	}
    /**
     * Prints the items in a tree from 
     * left to right, regardless of level.
     */
    public void printLeft(Node node) {
    	printLeftRecursive(node);
	}

        
    /**
     * testing() - A method to test preOrder() and printLeft(). The method creates the 
     * tree depicted below.
     *
     *          1
     *         / \
     *        2   3
     *       / \ / \
     *      4  5 6  7
     */
//		@Override
	public void testing() {
		BinaryTree tree = new BinaryTree();       

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
	    tree.root.left.right = new Node(5);
	    tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);   
		System.out.println("Output of preOrder(): ");
		preOrder(tree.root);
		System.out.println("\nOutput of printLeft(): ");
		printLeft(tree.root);
		}

}


