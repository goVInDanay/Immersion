package Assignment3;
import java.util.*;
public class GFG_Replace_all_Zeroes_with_Fives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution_Replace sr = new Solution_Replace();
        System.out.println(sr.convertfive(n));
    }
}
class Solution_Replace {
    int convertfive(int num) {
        // Your code here
        return convert(num, 0, 0);
    }
    int convert(int num, int n, int pow){
        if(num == 0){
            return n;
        }
        int d = num%10;
        if(d == 0){
            d = 5;
        }
        n = d * (int)Math.pow(10, pow) + n;
        return convert(num/10, n, pow + 1);
    }
}