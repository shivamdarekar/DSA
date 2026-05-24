class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class MaxDepth{

    public static int maxDepth(Node root){
        if(root == null) return 0;

        int left = maxDepth(root.left);

        int right = maxDepth(root.right);

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.left.left = new Node(4);
        root.right = new Node(3);
        root.right.left = new Node(6);

        System.out.print(maxDepth(root));
    }
}