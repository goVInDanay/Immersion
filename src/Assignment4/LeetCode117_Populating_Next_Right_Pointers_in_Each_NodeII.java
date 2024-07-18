package Assignment4;
import java.util.*;
public class LeetCode117_Populating_Next_Right_Pointers_in_Each_NodeII {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    class Solution {
        public Node connect(Node root) {
            if(root == null){
                return root;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                int size = q.size();
                List<Node> ls = new ArrayList<>();
                for(int i = 0; i < size; i++){
                    Node curr = q.remove();
                    ls.add(curr);
                    if(curr.left != null){
                        q.add(curr.left);
                    }
                    if(curr.right != null){
                        q.add(curr.right);
                    }
                }
                for(int i = 0; i < ls.size() - 1; i++){
                    Node newNode = ls.get(i);
                    newNode.next = ls.get(i + 1);
                }
            }
            return root;
        }
    }
}
