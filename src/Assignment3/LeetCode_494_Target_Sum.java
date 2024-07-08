package Assignment3;
import java.util.*;
public class LeetCode_494_Target_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Solution_TargetSum st = new Solution_TargetSum();
        System.out.println(st.findTargetSumWays(nums, target));
    }
}
class Solution_TargetSum {
    public int findTargetSumWays(int []nums, int target) {
        return ways(nums, target, nums.length - 1);
    }
    private int ways(int []nums, int target, int idx){
        if(idx == 0){
            int count = 0;
            if(target - nums[idx] == 0){
                count++;
            }
            if(target + nums[idx] == 0){
                count++;
            }
            return count;
        }
        int add = ways(nums, target + nums[idx], idx - 1);
        int sub = ways(nums, target - nums[idx], idx - 1);
        return add + sub;
    }
}

