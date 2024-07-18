package Assignment4;

public class LeetCode988_Smallest_String_Starting_from_Left {
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
        String smallest=null;
        public String smallestFromLeaf(TreeNode root) {
            findSmallest(root,new StringBuilder());
            return smallest;
        }
        public void findSmallest(TreeNode root,StringBuilder curr){
            if(root==null)
                return;
            curr.insert(0,(char)('a'+root.val));
            if(root.left==null && root.right==null){
                String current=curr.toString();
                if(smallest==null || current.compareTo(smallest)<0)
                    smallest=current;
            }
            else{
                findSmallest(root.left,curr);
                findSmallest(root.right,curr);
            }
            curr.deleteCharAt(0);
        }
    }
}
