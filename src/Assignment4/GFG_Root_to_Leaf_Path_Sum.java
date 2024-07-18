package Assignment4;

public class GFG_Root_to_Leaf_Path_Sum {
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
    class Solution {
        boolean hasPathSum(Node root, int target) {
            // Your code here
            if(root == null){
                return false;
            }
            if(root.left == null && root.right == null && root.data == target){
                return true;
            }
            return hasPathSum(root.left, target - root.data) || hasPathSum(root.right, target - root.data);
        }
    }
}
