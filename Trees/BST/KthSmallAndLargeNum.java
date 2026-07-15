///find kth smallest and largest number in BST

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

public class KthSmallAndLargeNum{

    public static void Brut(Node root, int k){
        List<Integer>lt = new ArrayList<>();

        dfs(root,lt);

        Collections.sort(lt);

        System.out.println("Smallest: " + lt.get(k-1));
        System.out.println("Largest: " + lt.get(lt.size()-k));
    }

    public static void dfs(Node root, List<Integer>lt){
        if(root == null) return;
        lt.add(root.data);
        dfs(root.left, lt);
        dfs(root.right, lt);
    }//TC = O(n + nlogn) | SC = O(n)


    public static void Better(Node root, int k){
        List<Integer>lt = new ArrayList<>();

        inorder(root, lt);
        System.out.println("Smallest: " + lt.get(k-1));
        System.out.println("Largest: " + lt.get(lt.size()-k));
    }

    public static void inorder(Node root, List<Integer>lt){
        if(root == null) return;
        inorder(root.left,lt);
        lt.add(root.data);
        inorder(root.right, lt);
    }//TC = O(n) | SC = O(n)


    static int cnt = 0;
    static int ans = -1;
    public static int Optimal(Node root, int k){
        inorder(root, k);
        return ans;
    }

    public static void inorder(Node root, int k){
        if(root == null) return;
        inorder(root.left, k);
        cnt++;

        if(cnt == k){
            ans = root.data;
            return;
        }
        inorder(root.left,k);
    }//TC = O(n) | Sc = O(1)

    //for kth largest just reverse the inorder right -> root -> left

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(13);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.left = new Node(11);
        root.right.right = new Node(14);

        //Brut(root, 3);
        Better(root,3);
    }
}