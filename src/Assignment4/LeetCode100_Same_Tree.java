package Assignment4;
import java.util.*;
public class LeetCode100_Same_Tree {
    class TreeNode{
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if((p == null && q != null) || (p != null && q == null)){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        boolean flag1 = isSameTree(p.left, q.left);
        boolean flag2 = isSameTree(p.right, q.right);
        return flag1 && flag2;
    }
}

