package Assignment3;
import java.util.*;
public class LeetCode_401_Binary_Watch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int turnedOn = sc.nextInt();
        Solution_Binary_Watch sb = new Solution_Binary_Watch();
        List<String> time = sb.readBinaryWatch(turnedOn);
        for(String ans : time){
            System.out.print(ans + " ");
        }
    }
}
class Solution_Binary_Watch{
    int []hours = {1, 2, 4, 8};
    int []mins = {1, 2, 4, 8, 16, 32};
    List<String> ls;
    public List<String> readBinaryWatch(int turnedOn) {
        ls = new ArrayList<>();
        findTime(turnedOn, 0, 0, 0, 0);
        return ls;
    }
    public void findTime(int on, int h, int m, int i, int j){
        if(on == 0){
            if(h <= 11 && m <= 59){
                String minute = "" + m ;
                if(m < 10){
                    minute = "0" + minute;
                }
                String ans = h + ":" + minute;
                ls.add(ans);
            }
            return;
        }
        for(; i < mins.length; i++){
            findTime(on - 1, h, m + mins[i], i +1, j);
        }
        for(; j < hours.length; j++){
            findTime(on - 1, h + hours[j], m, i, j + 1);
        }
    }
}