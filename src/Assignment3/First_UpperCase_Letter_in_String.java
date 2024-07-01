package Assignment3;
import java.util.*;
public class First_UpperCase_Letter_in_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int idx = Solution_First_Uppercase.first_UpperCase(str, 0);
        if(idx == -1){
            System.out.println("-1");
        }
        else{
            System.out.println(str.charAt(idx));
        }
    }
}
class Solution_First_Uppercase{
    public static int first_UpperCase(String str, int idx){
        if(idx == str.length()) {
            return -1;
        }
        if(str.charAt(idx) > 64 && str.charAt(idx) < 92){
            return idx;
        }
        return first_UpperCase(str, idx + 1);
    }
}