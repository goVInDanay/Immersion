package Assignment4;
import java.util.*;
public class LeetCode102_Level_Order_Traversal {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>> level=new ArrayList<>();
        if(root==null)
            return level;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levels=q.size();
            List<Integer> k_level=new ArrayList<>();
            for(int i=0;i<levels;i++){
                if(q.peek().left!=null)
                    q.add(q.peek().left);
                if(q.peek().right!=null)
                    q.add(q.peek().right);
                k_level.add(q.remove().val);
            }
            level.add(k_level);
        }
        return level;
    }
}
