package Assignment3;
import java.util.*;
public class GFG_N_digit_number_with_digit_in_increasing_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Solution_digits.increasingNumbers(n));
    }
}
class Solution_digits {
    static ArrayList<Integer> ls;
    public static ArrayList<Integer> increasingNumbers(int n) {
        // code here
        ls = new ArrayList<>();
        int i = 1;
        if(n == 1){
            i = 0;
        }
        for(; i < 10; i++){
            combinations(n - 1, i);
        }
        return ls;
    }
    public static void combinations(int n, int num){
        if(n == 0){
            ls.add(num);
            return;
        }
        int d = num;
        if(num > 10){
            d = num%10;
        }
        for(int i = d + 1; i < 10; i++){
            combinations(n - 1, num*10 + i);
        }
    }
}
