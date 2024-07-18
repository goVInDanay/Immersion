package Assignment4;

public class GFG_Insert_Node_in_BST {
    class Node {
        int data;
        Node left, right;

        public Node(int d) {
            data = d;
            left = right = null;
        }
    }
    class Solution {
        // Function to insert a node in a BST.
        Node insert(Node root, int Key) {
            // your code here
            if(root == null){
                root = new Node(Key);
            }
            if(root.data > Key){
                root.left = insert(root.left, Key);
            }
            if(root.data < Key){
                root.right = insert(root.right, Key);
            }
            return root;
        }
    }
}
