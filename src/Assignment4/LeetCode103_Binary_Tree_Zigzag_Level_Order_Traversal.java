package Assignment4;
import java.util.*;
import java.util.Queue;
public class LeetCode103_Binary_Tree_Zigzag_Level_Order_Traversal {
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ls = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)
            return ls;
        int level = 1;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            level++;
            LinkedList<Integer> ll = new LinkedList<>();
            for(int i = 0; i < size; i++){
                TreeNode curr = q.remove();
                ll.add(curr.val);
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null)
                    q.add(curr.right);
            }
            if(level % 2 != 0){
                Collections.reverse(ll);
            }
            ls.add(ll);
        }
        return ls;
    }
}
