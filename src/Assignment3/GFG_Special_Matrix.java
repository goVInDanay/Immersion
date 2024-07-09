package Assignment3;
import java.util.*;
public class GFG_Special_Matrix
{
    static int R = 4;
    static int C = 4;
    static int countPaths(int [][]maze)
    {
        if (maze[0][0] == -1)
            return 0;
        for (int i = 0; i < R; i++)
        {
            if (maze[i][0] == 0)
                maze[i][0] = 1;
            else
                break;
        }

        for (int i = 1; i < C; i++)
        {
            if (maze[0][i] == 0)
                maze[0][i] = 1;
            else
                break;
        }

        for (int i = 1; i < R; i++)
        {
            for (int j = 1; j < C; j++)
            {
                if (maze[i][j] == -1)
                    continue;
                if (maze[i - 1][j] > 0)
                    maze[i][j] = (maze[i][j] +
                            maze[i - 1][j]);

                if (maze[i][j - 1] > 0)
                    maze[i][j] = (maze[i][j] +
                            maze[i][j - 1]);
            }
        }
        return Math.max(maze[R - 1][C - 1], 0);
    }
    static int numberOfPaths(int m, int n)
    {
        int path = 1;
        for (int i = n; i < (m + n - 1); i++)
        {
            path *= i;
            path /= (i - n + 1);
        }
        return path;
    }
    static int solve(int [][]maze)
    {
        return numberOfPaths(R, C) - countPaths(maze);
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int [][]blocked = new int[k][2];
        for(int i = 0; i < k; i++){
            blocked[i][0] = sc.nextInt();
            blocked[i][1] = sc.nextInt();
        }
        System.out.println(create(n, m, blocked));
    }
    public static int create(int n, int m, int [][]blocked){
        int [][]maze = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++) {
                maze[i][j] = 0;
            }
        }
        for (int[] ints : blocked) {
            maze[ints[0] - 1][ints[1] - 1] = -1;
        }
        return solve(maze);
    }
}
