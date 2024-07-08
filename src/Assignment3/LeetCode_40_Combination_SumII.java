package Assignment3;
import java.util.*;
public class LeetCode_40_Combination_SumII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []candidates = new int[n];
        for(int i = 0; i < n; i++){
            candidates[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Solution_Combination_SumII scs = new Solution_Combination_SumII();
        List<List<Integer>> ans = scs.combinationSum2(candidates, target);
        for(List<Integer> ls : ans){
            System.out.print(ls + " ");
        }
    }
}
class Solution_Combination_SumII {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        sum_target(candidates,target,0,new ArrayList<>());
        return res;
    }
    public void sum_target(int []nums,int target,int idx,List<Integer> ls){
        if(target==0){
            res.add(new ArrayList<>(ls));
            return;
        }
        if(idx==nums.length || target<nums[idx])
            return;
        int val=nums[idx];
        ls.add(nums[idx]);
        sum_target(nums,target-val,idx+1,ls);
        ls.remove(ls.size()-1);
        int i=1;
        while(idx+i<nums.length && nums[idx+i]==val)
            i++;
        sum_target(nums,target,idx+i,ls);
    }
}
