package Assignment4;
import java.util.*;
public class GFG_Print_all_Nodes_that_do_not_have_Siblings {
    class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
    class Tree
    {
        ArrayList<Integer> noSibling(Node node)
        {
            // code here
            ArrayList<Integer> ans = new ArrayList<>();
            sibling(node, ans);
            Collections.sort(ans);
            if(ans.isEmpty()){
                ans.add(-1);
            }
            return ans;
        }
        void sibling(Node node, ArrayList<Integer> ans){
            if(node == null || (node.left == null && node.right == null)){
                return;
            }
            if(node.left == null){
                ans.add(node.right.data);
            }
            if(node.right == null){
                ans.add(node.left.data);
            }
            sibling(node.left, ans);
            sibling(node.right, ans);
        }
    }
}
