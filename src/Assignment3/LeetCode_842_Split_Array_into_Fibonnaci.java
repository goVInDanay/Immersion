package Assignment3;
import java.util.*;
public class LeetCode_842_Split_Array_into_Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        Solution_Split ss = new Solution_Split();
        List<Integer> fib = ss.splitIntoFibonacci(num);
        for(int nums : fib) {
            System.out.print(nums + " ");
        }
    }
}
class Solution_Split {
    public List<Integer> splitIntoFibonacci(String num) {
        List<Integer> ans = new ArrayList<>();
        split(num.toCharArray(), ans, 0);
        return ans;
    }
    public boolean split(char [] digit, List<Integer> ans, int idx){
        if(idx == digit.length && ans.size() > 2){
            return true;
        }
        for(int i = idx; i < digit.length; i++){
            if(digit[idx] == '0' && i > idx){
                break;
            }
            long n = convert(digit, idx, i + 1);
            if(n > Integer.MAX_VALUE){
                break;
            }
            if(ans.size() >= 2 && n > ans.get(ans.size() - 1) + ans.get(ans.size() - 2)){
                break;
            }
            if(ans.size() <= 1 || n == ans.get(ans.size() - 1) + ans.get(ans.size() - 2)){
                ans.add((int)n);
                if(split(digit, ans, i + 1)){
                    return true;
                }
                ans.remove(ans.size() - 1);
            }
        }
        return false;
    }
    private long convert(char[] digit, int start, int end){
        long ans = 0;
        for(int i = start; i < end; i++){
            ans = ans * 10 + digit[i] - '0';
        }
        return ans;
    }
}