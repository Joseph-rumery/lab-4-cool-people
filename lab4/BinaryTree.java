
public class BinaryTree {

	Node root;
	
	public BinaryTree() {
		root = null;
	}
	
 class Node{
		
		int data;
		
		Node right;
		Node left;
		
		public Node() {
			right = null;
			left = null;
		}
		
		public Node(int data) {
			this.data = data;
		}
		
	}
	
}
