package Assignment4;
import java.util.*;
public class LeetCode113_Path_SumII {
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
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<Integer> ls = new ArrayList<>();
            search(root, ls, targetSum);
            return ans;
        }
        public void search(TreeNode root, List<Integer> ls, int sum){
            if(root == null)
                return;
            ls.add(root.val);
            if(root.left == null && root.right == null){
                if(sum == root.val){
                    ans.add(new ArrayList<>(ls));
                }
            }
            search(root.left, ls, sum - root.val);
            search(root.right, ls, sum - root.val);
            ls.remove(ls.size() - 1);
        }
    }
}
