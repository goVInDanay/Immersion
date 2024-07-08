package Assignment3;
import java.util.*;
public class LeetCode_90_SubsetsII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        Solution_SubsetsII ss = new Solution_SubsetsII();
        List<List<Integer>> subsets = ss.subsetsWithDup(nums);
        for(List<Integer> subset : subsets){
            System.out.print(subset + " ");
        }
    }
}
class Solution_SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> num=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        Arrays.sort(nums);
        print(nums,0,ls,num);
        return num;
    }
    public static void print(int []arr,int lp,List<Integer> ls,List<List<Integer>> num)
    {
        num.add(new ArrayList<>(ls));
        for(int i=lp;i<arr.length;i++)
        {
            ls.add(arr[i]);
            print(arr,i+1, ls,num);
            while(i<arr.length-1 && arr[i]==arr[i+1])
                i++;
            ls.remove(ls.size()-1);
        }
    }
}

