package Assignment3;
import java.util.*;
public class GFG_Generate_Binary_Strings_without_Consecutive_Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution_Generate sg = new Solution_Generate();
        int n = sc.nextInt();
        ArrayList<String> ans = sg.validStrings(n);
        for (String s : ans) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
class Solution_Generate {
    ArrayList<String> ls = new ArrayList<>();
    public ArrayList<String> validStrings(int n) {
        generate(n, new StringBuilder());
        return ls;
    }
    public void generate(int n, StringBuilder ans){
        if(n == 0){
            ls.add(ans.toString());
            return;
        }
        if(ans.isEmpty() || ans.charAt(ans.length() - 1) != '1'){
            ans.append('1');
            generate(n - 1, ans);
            ans.deleteCharAt(ans.length() - 1);
        }
        ans.append('0');
        generate(n - 1, ans);
        ans.deleteCharAt(ans.length() - 1);

    }
}