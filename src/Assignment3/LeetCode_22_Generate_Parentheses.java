package Assignment3;
import java.util.*;
public class LeetCode_22_Generate_Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Solution_Parentheses.generateParenthesis(n));
    }
}
class Solution_Parentheses {
    public static List<String> possible(int n,String s,int left,int right,List<String> ls)
    {
        if(s.length()==2*n)
        {
            ls.add(s);
            return ls;
        }
        if(left<n)
            possible(n,s.concat("("),left+1,right,ls);
        if(right<left)
            possible(n,s.concat(")"),left,right+1,ls);
        return ls;
    }
    public static List<String> generateParenthesis(int n) {
        ArrayList<String> ls=new ArrayList<>();
        return possible(n,"",0,0,ls);
    }
}
