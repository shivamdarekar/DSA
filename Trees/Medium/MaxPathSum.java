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

public class MaxPathSum{

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(Node root){
        dfs(root);
        return maxSum;
    }

    public int dfs(Node root){
        if(root == null) return 0;

        int leftSum = dfs(root.left);
        int rightSum = dfs(root.right);

        maxSum = Math.max(maxSum, root.data + (rightSum+leftSum));

        return root.data + Math.max(leftSum,rightSum);
    }//TC = O(n)

    public static void main(String[] args) {
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        MaxPathSum ans = new MaxPathSum();
        System.out.print(ans.maxPathSum(root));
    }
}