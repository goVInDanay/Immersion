package Assignment3;
import java.util.*;
public class LeetCode_386_Lexicographical_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution_LexNums sl = new Solution_LexNums();
        List<Integer> ans = sl.lexicalOrder(n);
        for(int nums : ans){
            System.out.print(nums + " ");
        }
    }
}
class Solution_LexNums {
    public static void lexical(int n,int num,List<Integer> nums)
    {
        if(num>n)
            return;
        int i=0;
        if(num!=0)
            nums.add(num);
        if(num==0)
            i=1;
        for(;i<10;i++)
        {
            if(num*10+i>n)
                return;
            lexical(n,num*10+i,nums);
        }
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> nums=new ArrayList<>();
        lexical(n,0,nums);
        return nums;
    }

}