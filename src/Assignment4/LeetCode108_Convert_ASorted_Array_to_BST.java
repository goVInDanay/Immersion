package Assignment4;

public class LeetCode108_Convert_ASorted_Array_to_BST {
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
        public TreeNode sortedArrayToBST(int[] nums) {
            if(nums.length == 0){
                return null;
            }
            return createBST(nums, 0, nums.length - 1);
        }
        private TreeNode createBST(int nums[], int left, int right){
            if(left > right){
                return null;
            }
            int mid = (right + left)/2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = createBST(nums, left, mid - 1);
            root.right = createBST(nums, mid + 1, right);
            return root;
        }
    }
}
