package Assignment4;
import java.util.*;
public class GFG_Reverse_Level_Order_Traversal {
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
        public ArrayList<Integer> reverseLevelOrder(Node node)
        {
            // code here
            Queue<Node> q = new LinkedList<>();
            ArrayList<Integer> ans = new ArrayList<>();
            q.add(node);
            while(!q.isEmpty()){
                Node curr = q.remove();
                ans.add(0, curr.data);
                if(curr.right != null){
                    q.add(curr.right);
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
            }
            return ans;
        }
    }
}
