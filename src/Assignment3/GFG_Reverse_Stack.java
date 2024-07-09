package Assignment3;
import java.util.*;
public class GFG_Reverse_Stack {
    static Stack<Integer> st = new Stack<>();
    public static void main(String[] args) {
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        reverse();
        System.out.println(st);
    }
    private static void reverse() {
        if(!st.isEmpty()){
            int x = st.pop();
            reverse();
            insert_At_Bottom(x);
        }
    }
    private static void insert_At_Bottom(int x){
        if(st.isEmpty()){
            st.push(x);
        }
        else{
            int n = st.pop();
            insert_At_Bottom(x);
            st.push(n);
        }
    }
}