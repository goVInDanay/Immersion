package Assignment3;
import java.util.*;
public class LeetCode_08_String_to_Integer_atoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution_String_to_Integer si = new Solution_String_to_Integer();
        System.out.println(si.myAtoi(s));
    }
}
class Solution_String_to_Integer {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.isEmpty())
            return 0;
        int i = 0;
        int f = 1;
        if(s.charAt(i) == '-'){
            i += 1;
            f = -1;
        }
        else if(s.charAt(i) == '+'){
            i += 1;
        }
        int n = 0;
        for(; i < s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                break;
            }
            int digit = s.charAt(i) - '0';
            if(n > (Integer.MAX_VALUE - digit)/10){
                return f == -1 ? Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            n = n*10 + digit;
        }
        n = n*f;
        return n;
    }
}