package Assignment3;
import java.util.*;
public class LeetCode_784_Letter_Case_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Solution_Letter sl = new Solution_Letter();
        List<String> ans = sl.letterCasePermutation(s);
        for(String str : ans){
            System.out.print(str + " ");
        }
    }
}
class Solution_Letter {
    List<String> ans;
    public List<String> letterCasePermutation(String s) {
        ans = new ArrayList<>();
        permutations(s, "");
        return ans;
    }
    private void permutations(String s, String str){
        if(s.isEmpty()){
            ans.add(str);
            return;
        }
        char ch = s.charAt(0);
        permutations(s.substring(1), str + ch);
        if(!Character.isDigit(ch)){
            if(ch < 91){
                ch = (char)(ch + 32);
            }
            else{
                ch = (char)(ch - 32);
            }
            permutations(s.substring(1), str + ch);
        }
    }
}
