package Assignment3;
import java.util.*;
public class GFG_Rat_in_a_Maze {
    static String direction = "DLRU";
    static int[] dr = {0, -1, 0, 1};
    static int[] dc = {-1, 0, 1, 0};
    private static boolean isValid(int row, int col, int n, int [][]maze){
        return row >= 0 && col >= 0 && row < n && col < n && maze[row][col] == 1;
    }
    static void findPath(int row, int col, int[][] maze, int n, ArrayList<String> ans, StringBuilder currentPath){
        if (row == n - 1 && col == n - 1) {
            ans.add(currentPath.toString());
            return;
        }
        maze[row][col] = 0;

        for (int i = 0; i < 4; i++) {
            int nextrow = row + dr[i];
            int nextcol = col + dc[i];
            if (isValid(nextrow, nextcol, n, maze)) {
                currentPath.append(direction.charAt(i));
                findPath(nextrow, nextcol, maze, n, ans,
                        currentPath);
                currentPath.deleteCharAt(
                        currentPath.length() - 1);
            }
        }
        maze[row][col] = 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]maze = new int[n][n];
        ArrayList<String> result = new ArrayList<>();
        StringBuilder currentPath = new StringBuilder();
        if (maze[0][0] != 0 && maze[n - 1][n - 1] != 0) {
            findPath(0, 0, maze, n, result, currentPath);
        }
        if (result.isEmpty()) {
            System.out.println(-1);
        }
        else {
            for (String path : result) {
                System.out.print(path + " ");
            }
        }
        System.out.println();
    }
}
