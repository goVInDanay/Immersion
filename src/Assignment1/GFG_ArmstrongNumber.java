package Assignment1;
import java.util.*;
class Solution_Armstrong{
    static String armstrongNumber(int n){
        // code here
        int pow=(int)Math.log10(n)+1;
        int copy=n;
        int arm=0;
        while(n>0){
            arm=arm+(int)Math.pow(n%10,pow);
            n=n/10;
        }
        return (arm==copy)?"Yes":"No";
    }
}
public class GFG_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Solution_Armstrong.armstrongNumber(n));
    }
}
