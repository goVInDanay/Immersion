package Assignment3;
import java.util.*;
public class LeetCode_342_Power_of_Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Solution_Power_of_Four.isPowerOfFour(n));
    }
}
class Solution_Power_of_Four {
    public static boolean isPowerOfFour(int n) {
        if(n==1)
            return true;
        if(n<=0)
            return false;
        return n%4 == 0 && isPowerOfFour(n/4);
    }
}