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

class Pair{
    Node node;
    int hd;

    Pair(Node node, int hd){
        this.node = node;
        this.hd = hd;
    }
}

public class TopViewOfBT{
    public static List<Integer> topView(Node root){
        List<Integer>ans = new ArrayList<>();
        if (root == null) return ans;

        Map<Integer,Integer>mpp = new TreeMap<>();
        Queue<Pair>q = new LinkedList<>();
        //Queue<Object[]> q = new LinkedList<>();
        // Example of enqueue: q.add(new Object[]{root, 0});

        q.add(new Pair(root, 0));
        while(!q.isEmpty()){
            Pair curr = q.poll();
            Node node = curr.node;
            int hd = curr.hd;

            if(!mpp.containsKey(hd)){
                mpp.put(hd, node.data);
            }

            if(node.left != null) q.add(new Pair(node.left, hd-1));
            if(node.right != null) q.add(new Pair(node.right, hd+1));
        }

        for(int val:mpp.values()){
            ans.add(val);
        }
        //Treemap internally sort the keys so we get left to right ans

        return ans;
    }
    //TC = O(nlogn) | SC = O(n);

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

        System.out.print(topView(root));
    }
}