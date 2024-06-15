package Assignment2;
import java.util.*;
class Solution_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int l = 0;
        int n = nums.length;
        for(int r = 0; r < n; r++){
            if(nums[r] != 0){
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                l++;
            }
        }
    }
}
public class LeetCode_283_Move_Zeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Solution_MoveZeroes s=new Solution_MoveZeroes();
        s.moveZeroes(arr);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
