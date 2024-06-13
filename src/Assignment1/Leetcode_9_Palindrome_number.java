package Assignment1;
import java.util.*;
public class Leetcode_9_Palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution_Palindrome s=new Solution_Palindrome();
        System.out.println(s.isPalindrome(n));
    }
}
class Solution_Palindrome{
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int num=0;
        int copy=x;
        while(x>0){
            num=num*10+x%10;
            x=x/10;
        }
        return num==copy;
    }
}
