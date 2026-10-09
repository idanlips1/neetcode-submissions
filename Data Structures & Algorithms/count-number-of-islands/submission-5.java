class Solution {
    public int numIslands(char[][] grid) {
        int ROWS = grid.length, COLS = grid[0].length;
        int islands = 0;
        for (int row = 0; row < ROWS; row++){
            for (int col = 0; col < COLS; col++){
                if (grid[row][col] == '1'){
                    dfs(grid,row,col);
                    islands += 1;
                }
            }
        }
        return islands;
    }

    private void dfs(char[][] grid, int r, int c){
        if (Math.min(r,c) < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0'){
            return;
        }

        grid[r][c] = '0';
        dfs(grid,r + 1, c);
        dfs(grid,r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);
    }
}
