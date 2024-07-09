package Assignment3;
import java.util.*;
public class LeetCode_306_Additive_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        Solution_Additive sa = new Solution_Additive();
        System.out.println(sa.isAdditiveNumber(num));
    }
}
class Solution_Additive {
    public boolean isAdditiveNumber(String num) {
        if(num.length() <= 2){
            return false;
        }
        long n1 = 0;
        for(int i = 0; i < num.length() - 2; i++){
            n1 = n1 * 10 + num.charAt(i) - '0';
            long n2 = 0;
            for(int j = i + 1; j < num.length() - 1; j++){
                String s1 = num.substring(0, i+1);
                String s2 = num.substring(i+1, j+1);
                n2 = n2 * 10 + num.charAt(j) - '0';
                if((s1.charAt(0) == '0' && n1 != 0) || (s2.charAt(0) == '0' && n2 != 0))
                    continue;
                if(isPossible(num, n1, n2, j+1))
                    return true;
            }
        }
        return false;
    }
    public boolean isPossible(String num, long a, long b, int idx){
        if(idx == num.length()){
            return true;
        }
        if(idx > num.length()){
            return false;
        }
        long sum = a + b;
        long n = 0;
        StringBuilder s = new StringBuilder();
        for(int i = idx; i < num.length(); i++){
            s.append(num.charAt(i));
            n = n * 10 + (num.charAt(i) - '0');
            if(s.charAt(0) == '0' && n != 0)
                continue;
            if(n == sum)
            {
                if(isPossible(num, b, sum, i+1))
                    return true;
            }
        }
        return false;
    }
}