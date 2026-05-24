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

public class DiameterOfBT{

    int diameter = 0;

    public int calDiameter(Node root){
        height(root);
        return diameter;
    }

    public int height(Node root){
        if(root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        diameter = Math.max(diameter, leftHeight+rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }
    //TC = O(n) | Sc = O(h);

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);

        //Diameter of a Binary Tree is the longest distance between any two nodes of that tree. 
        //This path may or may not pass through the root.

        DiameterOfBT tree = new DiameterOfBT();

        System.out.print(tree.calDiameter(root));
    }
}