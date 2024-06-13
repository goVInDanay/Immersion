package Assignment1;
import java.util.*;
class SolutionLCMGCD {
    static Long[] lcmAndGcd(Long A, Long B) {
        // code here
        Long[] ans = new Long[2];
        long min, max;
        min = Math.min(A, B);
        max = Math.max(A, B);
        ans[1] = gcd(max, min);
        ans[0] = (A * B) / ans[1];
        return ans;
    }

    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
public class GFG_LCM_GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        long b=sc.nextInt();
        Long []ans= SolutionLCMGCD.lcmAndGcd(a,b);
        System.out.println("LCM: "+ans[0]+"  "+"GCD: "+ans[1]);
    }
}
