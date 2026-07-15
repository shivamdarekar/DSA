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

public class InsertNodeAtLeaf{

    public static Node insert(Node root, int val){
        if(root == null) return new Node(val);
        Node curr = root;

        while(true){
            if(val > curr.data){
                if(curr.right != null) curr = curr.right;
                else{
                    curr.right = new Node(val);
                    break;
                }
            }
            else{
                if(curr.left != null) curr = curr.left;
                else {
                    curr.left = new Node(val);
                    break;
                }
            }
        }
        return root;
    }
    //TC = O(h) | SC = O(1)


    public Node insertIntoBST(Node root, int val) {
        if(root == null) {
            return new Node(val);
        }
        else if(val > root.data) {
            root.right = insertIntoBST(root.right, val);
        }
        else if(val < root.data) {
            root.left = insertIntoBST(root.left, val);
        }
        return root;
    }
    //TC = O(h) | SC = O(n)

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
    }
}