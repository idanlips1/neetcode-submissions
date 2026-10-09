class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ROWS = grid.length, COLS = grid[0].length;
        int area = 0;

        for (int r = 0; r < ROWS; r++){
            for (int c = 0; c < COLS; c++){
                if (grid[r][c] == 1){
                    area = Math.max(area, dfs(grid,r,c));
                }
            }
        }
        return area;
    }

    private int dfs(int[][]grid, int row, int col){
        if (Math.min(row,col) < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0){
            return 0;
        }

        grid[row][col] = 0;
        int res = 1;
        res += dfs(grid,row + 1, col);
        res += dfs(grid,row - 1, col);
        res += dfs(grid,row, col + 1);
        res += dfs(grid,row, col  - 1);
        return res;
    }
}
