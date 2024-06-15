package Assignment1;
import java.util.*;
public class Codeforces_1899A_Game_With_Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(n%3 == 0){
                System.out.println("Second");
            }
            else if((n-1)%3 == 0 || (n+1)%3 == 0){
                System.out.println("First");
            }
            else if((n-2)%3 == 0 || (n+2)%3 == 0){
                System.out.println("Second");
            }
        }
        sc.close();
    }
}
