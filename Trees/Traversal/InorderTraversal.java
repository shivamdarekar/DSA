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

public  class InorderTraversal{

    public static void inorder(Node root){
        if(root == null) return;

        //left traversal
        inorder(root.left);

        //root
        System.out.print(root.data + " ");

        //right traversal
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        inorder(root);
    }
}