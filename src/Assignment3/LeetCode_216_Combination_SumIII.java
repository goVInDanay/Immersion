package Assignment3;
import java.util.*;
public class LeetCode_216_Combination_SumIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        Solution_Combination_SumIII scs = new Solution_Combination_SumIII();
        List<List<Integer>> ans = scs.combinationSum3(k, n);
        for(List<Integer> ls : ans){
            System.out.print(ls + " ");
        }
    }
}
class Solution_Combination_SumIII {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum3(int k, int n) {
        ans = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        combinations(ans, ls, n, k, 1);
        return ans;
    }
    private void combinations(List<List<Integer>> ans, List<Integer> ls, int n, int k, int idx){
        if(k == 0 && n == 0){
            ans.add(new ArrayList<>(ls));
            return;
        }
        for(int i = idx; i < 10; i++){
            if(n == 0){
                break;
            }
            ls.add(i);
            combinations(ans, ls, n - i, k - 1, i + 1);
            ls.remove(ls.size() - 1);
        }
    }
}
