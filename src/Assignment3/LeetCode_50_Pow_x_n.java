package Assignment3;
import java.util.*;
public class LeetCode_50_Pow_x_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        Solution_Pow sp = new Solution_Pow();
        System.out.println(sp.myPow(x,n));
    }
}
class Solution_Pow {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        double val = myPow(x, Math.abs(n/2));
        val = val*val;
        if(n >0){
            if(n%2 == 0){
                return val;
            }
            else{
                return val*x;
            }
        }
        else{
            if(n%2 == 0){
                return 1/val;
            }
            else{
                return 1/(val*x);
            }
        }
    }
}
