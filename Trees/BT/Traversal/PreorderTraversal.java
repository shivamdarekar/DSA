import java.util.*;

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

public class PreorderTraversal{

    public static void preorder(Node root, List<Integer>lt){
        if(root == null) return;

        lt.add(root.data);

        //left traversal
        preorder(root.left, lt);

        //right traversal
        preorder(root.right, lt);
    }

    public static List<Integer> preorderTraversal(Node root){
        List<Integer>lt = new ArrayList<>();
        preorder(root, lt);
        return lt;
    }
    //Tc = O(n) | SC = O(n)

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer>ans = preorderTraversal(root);
        System.out.println(ans);
    }
}


/*
                      1
              2              3
          4      5        6      7
*/