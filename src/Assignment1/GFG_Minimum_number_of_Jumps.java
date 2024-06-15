package Assignment1;
import java.util.*;
class Solution_Jumps {
    static int minJumps(int[] arr, int n) {
        if(n<=1)
            return 0;
        if(arr[0]==0)
            return -1;
        // your code here
        // {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
        int jumps=1;
        int steps=arr[0];
        int reach=arr[0];
        for(int i=1;i<n;i++){
            if(i==n-1)
                return jumps;
            reach=Math.max(reach,arr[i]+i);
            steps--;
            if(steps==0){
                jumps++;
                if(i>=reach)
                    return -1;
                steps=reach-i;
            }
        }
        return -1;
    }
}
public class GFG_Minimum_number_of_Jumps {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int []arr=new int[n];
           for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
           }
           System.out.println(Solution_Jumps.minJumps(arr,n));
    }
}
