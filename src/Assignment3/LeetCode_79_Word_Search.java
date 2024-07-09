package Assignment3;
import java.util.*;
public class LeetCode_79_Word_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char [][]board = new char[n][m];
        for(int i = 0; i < n; i++){
            board[i] = sc.next().toCharArray();
        }
        String word = sc.next();
        Solution_WordSearch sw = new Solution_WordSearch();
        System.out.println(sw.exist(board, word));
    }
}
class Solution_WordSearch {
    public boolean exist(char[][] board, String word) {
        boolean f;
        boolean[][] chk=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                char ch=word.charAt(0);
                if(board[i][j]==ch)
                {
                    f=solve(board,i,j,word,0,chk);
                    if(f)
                        return true;
                }
            }
        }
        return false;
    }
    public static boolean solve(char [][] board,int row,int col,String word,int idx,boolean [][]chk)
    {
        int r;
        int c;
        boolean flag;
        if(idx==word.length())
        {
            return true;
        }
        if(row<0 || row>=board.length || col<0 || col>=board[0].length || board[row][col]!=word.charAt(idx) ||(board[row][col]==word.charAt(idx) && chk[row][col]))
            return false;
        int []moveRow={1,0,-1,0};
        int []moveCol={0,1,0,-1};
        chk[row][col]=true;
        for(int i=0;i<4;i++)
        {
            r=moveRow[i];
            c=moveCol[i];
            flag=solve(board,row+r,col+c,word,idx+1,chk);
            if(flag)
                return flag;
        }
        chk[row][col]=false;
        return false;
    }
}
