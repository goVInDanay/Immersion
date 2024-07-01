package Assignment3;
import java.util.*;
public class Sum_of_N_Natural_numbers_using_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = Solution_Sum.sum_of_Numbers(n);
        System.out.println(sum);
    }
}
class Solution_Sum{
    public static int sum_of_Numbers(int n){
        if(n == 0){
            return 0;
        }
        return n + sum_of_Numbers(n - 1);
    }
}
