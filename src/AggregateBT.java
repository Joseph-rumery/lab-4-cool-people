public class AggregateBT extends BinaryTree {

    public AggregateBT() {
        super();
    }

    public int sumLessThan(int item) {
        return sumLessThan(root, item);
    }

    private int sumLessThan(Node node, int item) {
        if (node == null) {
            return 0;
        }

        int sum = 0;
        if (node.data < item) {
            sum += node.data;
        }

        sum += sumLessThan(node.left, item);
        sum += sumLessThan(node.right, item);

        return sum;
    }

    public int findMax() {
        return findMax(root);
    }

    private int findMax(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int leftMax = findMax(node.left);
        int rightMax = findMax(node.right);

        return Math.max(node.data, Math.max(leftMax, rightMax));
    }

    // Testing method to create a sample tree and demonstrate the methods
    public static void main(String[] args) {
        AggregateBT tree = new AggregateBT();

        // Sample tree construction
        tree.root = tree.new Node();
        tree.root.data = 50;

        tree.root.left = tree.new Node();
        tree.root.left.data = 30;

        tree.root.right = tree.new Node();
        tree.root.right.data = 70;

        tree.root.left.left = tree.new Node();
        tree.root.left.left.data = 20;

        tree.root.left.right = tree.new Node();
        tree.root.left.right.data = 40;

        tree.root.right.left = tree.new Node();
        tree.root.right.left.data = 60;

        tree.root.right.right = tree.new Node();
        tree.root.right.right.data = 80;

        int item = 55;
        int sumLessThanResult = tree.sumLessThan(item);
        int findMaxResult = tree.findMax();

        System.out.println("Sum of values less than " + item + ": " + sumLessThanResult);
        System.out.println("Maximum number in the tree: " + findMaxResult);
    }
}
