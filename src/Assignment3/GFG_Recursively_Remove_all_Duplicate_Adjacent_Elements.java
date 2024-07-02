package Assignment3;
import java.util.*;
public class GFG_Recursively_Remove_all_Duplicate_Adjacent_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Solution_Remove_Duplicate sr = new Solution_Remove_Duplicate();
        System.out.println(sr.remove(s));
    }
}
class Solution_Remove_Duplicate{
    String remove(String s) {
        // code here
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int i = 0;
        while(i < n){
            char ch = s.charAt(i);
            int freq = 0;
            while(i < n && s.charAt(i) == ch){
                freq++;
                i++;
            }
            if(freq == 1){
                ans.append(ch);
            }
        }
        // System.out.println(ans);
        String res = ans.toString();
        if(s.equals(res))
            return res;
        return remove(res);
    }
}
