class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        int ROWS = grid.length, COLS = grid[0].length;

        for (int row = 0; row < ROWS; row++){
            for (int col = 0; col < COLS; col++){
                if (grid[row][col] == 1){
                    area = Math.max(area, dfs(grid,row,col));
                }
            }
        }
        return area;
    }

    private int dfs(int[][] grid, int r, int c){
        if (Math.min(r,c) < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0){
            return 0;
        }

        grid[r][c] = 0;
        int res = 1;
        res += dfs(grid, r + 1, c);
        res += dfs(grid, r - 1, c);
        res += dfs(grid, r, c - 1);
        res += dfs(grid, r, c + 1);
        return res;
    }
}
