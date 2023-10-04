public class BTPrinting extends BinaryTree {
	protected BinaryTree treeTest;
	
	public void preOrder(Node node) {
		if (node==null)
			return;
		System.out.println(node.data);
		preOrderPrint(node.left);
		preOrderPrint(node.right);
	}
	
	private void preOrderPrint(Node node) {
		preOrderPrint(root);
	}
	
    private void printLeftRecursive(Node node) {
        if (node == null) 
            return;
        
        printLeftRecursive(node.left);
        System.out.print(node.data + " ");
        printLeftRecursive(node.right);
    }

    public void printLeft() {
        printLeftRecursive(root);
    }


	@Override
	public void testing() {
	    BinaryTree tree = new BinaryTree();       

	    tree.root = new Node(1);
	    tree.root.left = new Node(2);
	    tree.root.right = new Node(3);
	    tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
	    tree.root.right.right = new Node(7);
	    
	    preOrder(tree.root);
	    printLeftRecursive(tree.root);

		
	}

}
