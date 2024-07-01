package Assignment3;
import java.util.*;
public class GFG_is_Array_Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Solution_isSorted.arraySortedOrNot(arr, n));
    }
}
class Solution_isSorted {
    static boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        return isSorted(arr, n - 2, arr[n - 1]);
    }
    static boolean isSorted(int arr[], int i, int val){
        if(i == -1){
            return true;
        }
        if(val < arr[i]){
            return false;
        }
        return isSorted(arr, i - 1, arr[i]);
    }
}
