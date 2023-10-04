
public class BTPrinting extends BinaryTree {
	
	public void preOrder(Node<Integer> node) {
		if (node==null)
			return;
		System.out.println(node.data);
		preOrderPrint(node.left);
		preOrderPrint(node.right);
	}
	
	private void preOrderPrint() {
		preOrderPrint(root);
	}
	
	public void printLeft() {
		if (node==null)
			return;
		System.out.println(node.data);
		leftNodePrint(node.left);
	}
	
	private void leftNodePrint(Node<Integer> node) {
		printLeft(node);
	}
}
