package Assignment4;
import java.util.*;
public class LeetCode1161_Maximum_Level_Sum_of_a_Binray_Tree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    class Solution {
        public int maxLevelSum(TreeNode root) {
            if(root == null){
                return 0;
            }
            Queue<TreeNode> q = new LinkedList<>();
            int  level = 0;
            q.add(root);
            int max = Integer.MIN_VALUE;
            int pos = 1;
            while(!q.isEmpty()){
                int size = q.size();
                int sum = 0;
                for(int i = 0; i < size; i++){
                    TreeNode curr = q.remove();
                    sum += curr.val;
                    if(curr.left != null){
                        q.add(curr.left);
                    }
                    if(curr.right != null){
                        q.add(curr.right);
                    }
                }
                level++;
                if(max < sum){
                    max = sum;
                    pos = level;
                }
            }
            return pos;
        }
    }
}
