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

public class RootToLeaf{

    public static boolean getPath(Node root, List<Integer>ans, int x){
        if(root == null) return false;

        ans.add(root.data);
        if(root.data == x) return true;

        if(getPath(root.left, ans, x) || getPath(root.right, ans, x)){
            return true;
        }

        ans.remove(ans.size()-1);

        return false;
    }

    public static List<Integer> solve(Node root, int x){
        List<Integer>ans = new ArrayList<>();

        if(root == null) return ans;
        getPath(root,ans,x);
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);

        System.out.print(solve(root, 7));
    }
}