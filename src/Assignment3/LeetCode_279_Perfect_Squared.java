package Assignment3;
import java.util.*;
public class LeetCode_279_Perfect_Squared {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution_Squared ss = new Solution_Squared();
        System.out.println(ss.numSquares(n));
    }
}
class Solution_Squared {
    public int numSquares(int n) {
        int []dp = new int[n + 1];
        for(int i = 0; i <= n; i++){
            dp[i] = -1;
        }
        return squared(n, dp);
    }
    private int squared(int n, int []dp){
        if(n <= 0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int min = n;
        for(int i = 1; i * i <= n; i++){
            min = Math.min(min, 1 + squared(n - i*i, dp));
        }
        dp[n] = min;
        return dp[n];
    }
}