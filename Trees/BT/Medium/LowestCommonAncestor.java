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

//Lowest Common Ancestor of two nodes is the deepest node that has both nodes in its subtree.

public class LowestCommonAncestor{

    public static Node lca(Node root, Node p, Node q){
        if(root == null || root == p || root == q){
            return root;
        }

        Node left = lca(root.left, p, q);
        Node right = lca(root.right, p, q);

        if(left == null) return right;
        else if(right == null) return left;
        else return root; //l and r not null means we found lca
    }
    //TC = O(n) | SC = O(n)

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);

        Node p = root.left.left;
        Node q = root.left.right;
        Node ancestor = lca(root, p, q);
        System.out.print(ancestor.data);
    }
}