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

public class MinDepthBT{

    public static int minDepth(Node root){
        if(root == null) return 0;

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        return (left == 0 || right == 0) ? left+right+1 : Math.min(left,right)+1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.left.left = new Node(4);
        root.right = new Node(3);
        root.right.left = new Node(6);

        System.out.print(minDepth(root));
        
    }
}