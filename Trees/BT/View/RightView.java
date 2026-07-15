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

public class RightView{

    public static List<Integer> rightView(Node root){
        List<Integer>ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<Node>q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0;i<size;i++){
                Node curr = q.poll();
                if(i == size - 1) ans.add(curr.data);

                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(10);
        root.right.left = new Node(9);

        System.out.print(rightView(root));
    }
}