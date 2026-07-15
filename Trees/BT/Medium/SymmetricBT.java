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

public class SymmetricBT{

    public static boolean isSymmetric(Node root){
        if(root == null) return true;
        return isMirror(root.left, root.right);
    }

    public static boolean isMirror(Node left, Node right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;

        if(left.data != right.data) return false;

        return isMirror(left.left, right.right) &&
               isMirror(left.right, right.left);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.right.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);

        System.out.print(isSymmetric(root));
    }
}