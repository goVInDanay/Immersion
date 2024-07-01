package Assignment3;
import java.util.*;
public class LeetCode_231_Power_of_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isTrue = Solution_isTwo.isPowerOfTwo(n);
        System.out.println(isTrue);
    }
}
class Solution_isTwo {
    public static boolean isPowerOfTwo(int n) {
        return n>0 && (n&(n-1))==0;
    }
}
