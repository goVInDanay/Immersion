package Assignment4;
import java.util.*;
public class LeetCode993_Cousins_in_a_Binary_Tree {
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
        public boolean isCousins(TreeNode root, int x, int y) {
            Queue<TreeNode> q  = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                int size = q.size();
                boolean isX = false;
                boolean isY = false;
                for(int i = 0; i < size; i++){
                    TreeNode curr = q.remove();
                    if(curr.val == x){
                        isX = true;
                    }
                    if(curr.val == y){
                        isY = true;
                    }
                    if(curr.left != null && curr.right != null){
                        if(curr.left.val == x && curr.right.val == y){
                            return false;
                        }
                        if(curr.left.val == y && curr.right.val == x){
                            return false;
                        }
                    }
                    if(curr.left != null){
                        q.add(curr.left);
                    }
                    if(curr.right != null){
                        q.add(curr.right);
                    }
                }
                if(isX && isY){
                    return true;
                }
            }
            return false;
        }
    }
}
