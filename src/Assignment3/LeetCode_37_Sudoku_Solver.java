package Assignment3;
import java.util.*;
public class LeetCode_37_Sudoku_Solver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char [][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            board[i] = sc.next().toCharArray();
        }
        Solution_Sudoku ss = new Solution_Sudoku();
        ss.solveSudoku(board);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println(board[i][j] + "|");
            }
            System.out.println();
        }
    }
}
class Solution_Sudoku {
    public void solveSudoku(char[][] board) {
        solve(board,0,0);
    }
    private boolean check(char n,char [][]sudoku,int row,int col)
    {
        int r=row-row%3;
        int c=col-col%3;

        for (char[] chars : sudoku)
            if (chars[col] == n)
                return false;

        for(int i=0;i<sudoku.length;i++)
            if(sudoku[row][i]==n)
                return false;

        for(int i=r;i<r+3;i++)
            for(int j=c;j<c+3;j++)
                if(sudoku[i][j]==n)
                    return false;

        return true;
    }
    private boolean solve(char [][]board,int row,int col)
    {
        if(col==9)
        {
            row+=1;
            col=0;
        }
        if(row>=9)
        {
            return true;
        }
        if(board[row][col]!='.')
            return solve(board,row,col+1);
        for(char i='1';i<='9';i++)
        {
            if(check(i,board,row,col))
            {
                board[row][col]=i;
                if(solve(board,row,col+1))
                    return true;
                board[row][col]='.';
            }
        }
        return false;
    }
}
