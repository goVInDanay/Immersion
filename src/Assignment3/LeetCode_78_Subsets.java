package Assignment3;
import java.util.*;
public class LeetCode_78_Subsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        Solution_Subsets ss = new Solution_Subsets();
        List<List<Integer>> subsets = ss.subsets(nums);
        for (List<Integer> subset : subsets) {
            System.out.print(subset + " ");
        }
    }
}
class Solution_Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> num=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        print(nums,0,ls,num,nums.length);
        return num;
    }
    public static void print(int []arr,int i,List<Integer> ls,List<List<Integer>> num,int n)
    {
        if(i==n)
        {
            num.add(new ArrayList<>(ls));
            return;
        }
        ls.add(arr[i]);
        print(arr,i+1, ls,num,n);
        ls.remove(ls.size()-1);
        print(arr,i+1,ls,num,n);
    }
}
