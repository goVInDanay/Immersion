package Assignment4;
import java.util.*;
public class LeetCode$37_Path_SumIII {
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
        int count = 0;
        Map<Long,Integer> map = new HashMap<>();
        public int pathSum(TreeNode root, int targetSum) {
            if(root == null)
                return 0;
            map.put(0L,1);
            search(root, targetSum, 0);
            return count;
        }
        public void search(TreeNode root,long target, long sum){
            if(root == null){
                return;
            }
            sum += root.val;
            if(map.containsKey(sum - target)){
                count += map.get(sum - target);
            }
            map.put(sum,map.getOrDefault(sum, 0) + 1);
            search(root.left,target, sum);
            search(root.right,target, sum);
            map.put(sum,map.get(sum) - 1);
        }
    }
}
