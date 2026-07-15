
class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class SearchInBST {

    public static Node search(Node root, int val) {
        while (root != null && root.data != val) {
            if (val < root.data) {
                root = root.left; 
            }else {
                root = root.right;
            }
        }

        return root;
    }
    //TC = O(logn)

    public static boolean searchNode(Node root, int target) {
        if (root == null) {
            return false;
        }

        if (root.data == target) {
            return true;
        }

        if (target < root.data) {
            return searchNode(root.left, target);
        }
        return searchNode(root.right, target);
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        Node ans = search(root, 7);
        System.out.print(ans.data);
    }
}
