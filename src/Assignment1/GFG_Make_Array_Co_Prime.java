package Assignment1;
import java.util.*;

class Solution_CoPrime{
    int gcd(int a,int b){
        if(b == 0)
            return a;
        return gcd(b,a%b);
    }
    int countCoPrime(int []a, int n)
    {
        // Complete the function
        int count=0;
        for(int i=0;i<n-1;i++){
            if(gcd(a[i],a[i+1]) != 1)
                count++;
        }
        return count;
    }
}

public class GFG_Make_Array_Co_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution_CoPrime s = new Solution_CoPrime();
        System.out.println(s.countCoPrime(arr,n));
    }
}
