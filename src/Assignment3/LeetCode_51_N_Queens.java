package Assignment3;
import java.util.*;
public class LeetCode_51_N_Queens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution_N_Queens sn = new Solution_N_Queens();
        List<List<String>> ans = sn.solveNQueens(n);
        for(List<String> board : ans){
            for(String s : board){
                System.out.println(s);
            }
            System.out.println();
        }
    }
}
class Solution_N_Queens {
    public List<List<String>> solveNQueens(int n) {
        String [][]board=new String[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]=".";
            }
        }
        List<List<String>> ls=new ArrayList<>();
        print(board,0,n,ls);
        return ls;
    }
    public static void print(String [][]board,int row,int queen,List<List<String>> ls)
    {
        if(queen==0)
        {
            List<String> brd=new ArrayList<>();
            for (String[] strings : board) {
                StringBuilder str = new StringBuilder();
                for (int j = 0; j < board[0].length; j++) {
                    str.append(strings[j]);
                }
                brd.add(str.toString());
            }
            ls.add(new ArrayList<>(brd));
            return;
        }
        if(row==board.length)
            return;
        for(int i=0;i<board[0].length;i++)
        {
            if(check(board, row, i))
            {
                board[row][i]="Q";
                print(board, row+1, queen-1,ls);
                board[row][i]=".";
            }
        }
    }
    public static boolean check(String [][]board,int row,int col)
    {
        for (String[] strings : board) {
            if (strings[col].equals("Q"))
                return false;
        }
        int left=Math.min(row,col);
        for(int i=1;i<=left;i++)
        {
            if(board[row - i][col - i].equals("Q"))
                return false;
        }
        int right=Math.min(row,board[0].length-col-1);
        for(int i=1;i<=right;i++)
        {
            if(board[row - i][col + i].equals("Q"))
                return false;
        }
        return true;
    }
}
