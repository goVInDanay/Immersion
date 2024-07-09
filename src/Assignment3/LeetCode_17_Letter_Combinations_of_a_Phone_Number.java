package Assignment3;
import java.util.*;
public class LeetCode_17_Letter_Combinations_of_a_Phone_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String digit = sc.next();
        Solution_Number sn = new Solution_Number();
        List<String> letters = sn.letterCombinations(digit);
        for(String ans : letters){
            System.out.print(ans + " ");
        }
    }
}

class Solution_Number {
    static String[] arr={"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty())
            return new ArrayList<>();
        List<String> list=new ArrayList<>();
        print(digits,list,"");
        return list;
    }
    public static void print(String digits,List<String> list,String ans)
    {
        if(digits.isEmpty())
        {
            list.add(ans);
            return;
        }
        char ch=digits.charAt(0);
        String ques=arr[ch-'0'-1];
        for(int i=0;i<ques.length();i++)
            print(digits.substring(1),list,ans+ques.charAt(i));
    }
}