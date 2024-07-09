package Assignment3;
import java.util.*;
public class LeetCode_77_Combinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Solution_Combinations scom = new Solution_Combinations();
        List<List<Integer>> combinations = scom.combine(n, k);
        for(List<Integer> ans : combinations){
            System.out.print(ans + " ");
        }
    }
}
class Solution_Combinations {
    List<List<Integer>> ans;
    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        findCombinations(n, 0, k, new ArrayList<>(), 1);
        return ans;
    }
    public void findCombinations(int n,int len, int k, List<Integer> ls, int i){
        if(k == len){
            ans.add(new ArrayList<>(ls));
            return;
        }
        for(; i <= n; i++){
            ls.add(i);
            findCombinations(n, len + 1, k, ls, i + 1);
            ls.remove(ls.size() - 1);
        }
    }
}