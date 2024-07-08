package Assignment3;
import java.util.*;
public class LeetCode_39_Combination_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Solution_Combination_Sum scs = new Solution_Combination_Sum();
        List<List<Integer>> ans = scs.combinationSum(nums, target);
        for(List<Integer> sum : ans){
            System.out.println(sum + " ");
        }
    }
}
class Solution_Combination_Sum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> num=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        boolean []flag=new boolean[candidates.length];
        print(candidates,target,ls,num,flag,0);
        return num;
    }
    private static void print(int [] arr,int target,List<Integer> ls,List<List<Integer>> num,boolean[] flag,int i)
    {
        if(target==0)
        {
            ArrayList<Integer> ll=new ArrayList<>(ls);
            num.add(ll);
            return;
        }
        for(;i<arr.length;i++)
        {
            if(arr[i]<=target){
                if(!flag[i])
                {
                    ls.add(arr[i]);
                    print(arr, target-arr[i], ls,num,flag,i);
                    flag[i]=true;
                    ls.remove(ls.size()-1);
                }
            }
            flag[i]=false;
        }
    }
}