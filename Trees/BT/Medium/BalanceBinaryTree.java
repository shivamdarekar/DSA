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

public class BalanceBinaryTree{

    public static boolean isBalance(Node root){
        if(root == null) return false;
        int ans = check(root);

        if(ans == -1) return false;
        return true;
    }

    public static int check(Node root){
        if(root == null) return 0;
        
        int leftHeight = check(root.left);
        if(leftHeight == -1) return -1;

        int rightHeight = check(root.right);
        if(rightHeight == -1) return -1;

        if(Math.abs(leftHeight - rightHeight) > 1) return -1;
        return 1 + Math.max(leftHeight, rightHeight);
    }//TC = O(n)

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);

        System.out.print(isBalance(root));
    }
}