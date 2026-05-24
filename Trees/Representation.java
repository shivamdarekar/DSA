class Node{
    int data;
    Node left;
    Node right;

    //constructor to initialize node with given key
    Node(int key){
        data = key;
        left = null;
        right = null;
    }
}

public class Representation{
    public static void main(String[] args) {
        //creating a binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

    }
}