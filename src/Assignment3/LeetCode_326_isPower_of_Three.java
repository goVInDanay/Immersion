package Assignment3;
import java.util.*;
public class LeetCode_326_isPower_of_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Solution_isThree.isPowerOfThree(n));
    }
}
class Solution_isThree {
    public static boolean isPowerOfThree(int n) {
        if(n == 0){
            return false;
        }
        else if(n == 1){
            return true;
        }
        return n % 3 == 0 && isPowerOfThree(n/3);
    }
}