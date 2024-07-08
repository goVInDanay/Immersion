package Assignment3;
import java.util.*;
public class GFG_All_Mappings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        Solution_Mapped sm = new Solution_Mapped();
        sm.print_mapped(num, "");
    }
}
class Solution_Mapped{
    char []characters = {' ','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    void print_mapped(String n, String ans){
        if(n.isEmpty()){
            System.out.println(ans);
            return;
        }
        int idx = n.charAt(0) - '0';
        if(idx != 0) {
            print_mapped(n.substring(1), ans + characters[idx]);
        }
        if(n.length() > 1){
            int sdx = n.charAt(1) - '0';
            int i = idx*10 + sdx;
            if(i >= 10 && i <= 26){
                print_mapped(n.substring(2), ans + characters[i]);
            }
        }
    }
}
