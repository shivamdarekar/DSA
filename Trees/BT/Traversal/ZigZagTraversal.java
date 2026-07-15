import java.util.*;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class ZigZagTraversal{

    public static List<List<Integer>> traversal(TreeNode root){
        Queue<TreeNode>q = new LinkedList<>();
        List<List<Integer>>ans = new ArrayList<>();
        boolean leftToRight = true;

        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                if(leftToRight) level.add(node.data);
                else level.add(0, node.data);

                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            ans.add(level);
            leftToRight = !leftToRight;
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.print(traversal(root));
    }
}