package Assignment4;

public class LeetCode129_Sum_Root_to_Leaf {
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
        public int sumNumbers(TreeNode root) {
            return sum_of_Path(root,0);
        }
        public int sum_of_Path(TreeNode root,int sum){
            if(root==null)
                return 0;
            sum=sum*10+root.val;
            if(root.left==null && root.right==null)
                return sum;
            return sum_of_Path(root.left,sum)+sum_of_Path(root.right,sum);
        }
    }
}
