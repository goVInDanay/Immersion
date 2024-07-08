package Assignment3;
import java.util.*;
public class GFG_Print_Odd_and_Even_in_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        Solution_Print_Odd_Even sp = new Solution_Print_Odd_Even();
        sp.print_Even(l, r);
        System.out.println();
        sp.print_Odd(l, r);
    }
}
class Solution_Print_Odd_Even{
    void print_Even(int l, int r){
        if(l > r){
            return;
        }
        if(l%2 == 0) {
            System.out.print(l + " ");
            print_Even(l + 2, r);
        }
        else{
            print_Even(l + 1, r);
        }
    }
    void print_Odd(int l, int r){
        if(l > r){
            return;
        }
        if(l%2 != 0){
            System.out.print(l + " ");
            print_Odd(l + 2, r);
        }
        else{
            print_Odd(l + 1, r);
        }

    }
}
