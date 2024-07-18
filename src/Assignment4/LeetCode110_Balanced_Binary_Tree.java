package Assignment4;
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
public class LeetCode110_Balanced_Binary_Tree {
    class Solution {
        public boolean isBalanced(TreeNode root) {
            if(root == null){
                return true;
            }
            if(findHeight(root) == -1){
                return false;
            }
            return true;
        }
        private int findHeight(TreeNode root){
            if(root == null){
                return 0;
            }
            int left = findHeight(root.left);
            int right = findHeight(root.right);
            if(left == -1 || right == -1){
                return -1;
            }
            if(Math.abs(left - right) > 1){
                return -1;
            }
            return Math.max(left, right) + 1;
        }
    }
}
