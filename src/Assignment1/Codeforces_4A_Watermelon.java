package Assignment1;
import java.util.*;
public class Codeforces_4A_Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0 || n == 2 || n % 2 != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
