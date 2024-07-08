package Assignment3;
import java.util.*;
public class GFG_Convert_String_to_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Solution_Convert_String_to_Integer scs = new Solution_Convert_String_to_Integer();
        System.out.println(scs.convert(s, 0));
    }
}
class Solution_Convert_String_to_Integer{
    int convert(String s, int num) {
        if (s.isEmpty()) {
            return num;
        }
        int d = s.charAt(0) - '0';
        return convert(s.substring(1), num*10 + d);
    }
}
