package Assignment3;
import java.util.*;
public class LeetCode_47_PermutationsII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        Solution_Perms sp = new Solution_Perms();
        List<List<Integer>> perms = sp.permuteUnique(nums);
        for(List<Integer> permutation : perms){
            System.out.print(permutation + " ");
        }
    }
}
class Solution_Perms {
    List<List<Integer>> ans;
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean []flag = new boolean[nums.length];
        List<Integer> ls = new ArrayList<>();
        ans = new ArrayList<>();
        Arrays.sort(nums);
        unique(nums, flag, ls);
        return ans;
    }
    private void unique(int []nums, boolean[] flag, List<Integer> ls){
        if(ls.size() == nums.length){
            ans.add(new ArrayList<>(ls));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(flag[i]){
                continue;
            }
            if(i > 0 && nums[i - 1] == nums[i] && !flag[i - 1]){
                continue;
            }
            flag[i] = true;
            ls.add(nums[i]);
            unique(nums, flag, ls);
            ls.remove(ls.size() - 1);
            flag[i] = false;
        }
    }
}