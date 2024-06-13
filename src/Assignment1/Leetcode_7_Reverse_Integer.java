package Assignment1;
import java.util.*;
public class Leetcode_7_Reverse_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution_Reverse s=new Solution_Reverse();
        System.out.println(s.reverse(n));
    }
}
class Solution_Reverse{
    public int reverse(int x) {
        int num=0;
        while(x!=0){
            if(num>Integer.MAX_VALUE/10 || num<Integer.MIN_VALUE/10){
                return 0;
            }
            num=num*10+x%10;
            x=x/10;
        }
        return num;
    }
}
