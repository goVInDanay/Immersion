package Assignment3;
import java.util.*;
public class GFG_Geekonacci_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(Solution_find_Nth.find_Nth(a, b, c, n));
        }
    }
}
class Solution_find_Nth{
    public static int find_Nth(int a, int b, int c, int n){
        if(n == 3){
            return c;
        }
        return find_Nth(b, c, a + b + c, n - 1);
    }
}
