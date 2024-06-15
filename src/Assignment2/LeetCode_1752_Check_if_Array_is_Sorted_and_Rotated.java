package Assignment2;
import java.util.*;
class Solution_isSorted {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        if(nums[0] <  nums[n-1])
            count++;
        for(int i = 0; i < n-1; i++){
            if(nums[i] > nums[i+1]){
                count++;
            }
        }
        return count <= 1;
    }
}
public class LeetCode_1752_Check_if_Array_is_Sorted_and_Rotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Solution_isSorted s = new Solution_isSorted();
        System.out.println(s.check(arr));
    }
}
