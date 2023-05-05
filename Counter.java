class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public Node root;
}

public class counter {
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(7);
        root.left.left = new Node(5);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right = new Node(2);
        root.right = new Node(1);
        root.right.right = new Node(3);
        root.right.left = new Node(6);


        System.out.println("The total number of items in this binary tree is: " + count(root));
    }

    public static int count(Node root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + count(root.left) + count(root.right);
        }
    }
}
