package Assignment3;
import java.util.*;
public class LeetCode_131_Palindrome_Partitioning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Solution_Palindrome_Partition sp = new Solution_Palindrome_Partition();
        List<List<String>> ans = sp.partition(s);
        for(List<String> str : ans){
            System.out.print(str + " ");
        }
    }
}
class Solution_Palindrome_Partition {
    static List<String> str;
    public List<List<String>> partition(String s) {
        str=new ArrayList<>();
        List<List<String>> ls=new ArrayList<>();
        ls=partitions(s,0,ls);
        return ls;
    }
    public static List<List<String>> partitions(String s,int i,List<List<String>> ls)
    {
        if(i>=s.length())
        {
            ls.add(new ArrayList<>(str));
            return ls;
        }
        for(int x=i;x<s.length();x++)
        {
            if(ispalindrome(s,i,x)){
                str.add(s.substring(i,x+1));
                ls=partitions(s,x+1,ls);
                str.remove(str.size()-1);
            }
        }
        return ls;
    }
    public static boolean ispalindrome(String s,int start,int end)
    {
        while(start<end)
            if(s.charAt(start++)!=s.charAt(end--))
                return false;
        return true;
    }
}