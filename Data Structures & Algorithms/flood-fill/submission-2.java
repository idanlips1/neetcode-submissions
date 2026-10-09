class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];
        if (original == color){
            return image;
        }
        int m = image.length, n = image[0].length;
        dfs(image,sr,sc,original,color,m,n);
        return image;
    }

    private void dfs(int[][] image, int r, int c, int original, int color, int row, int col){
        if (Math.min(r,c) < 0 || r >= row || c >= col || image[r][c] != original){
            return;
        }

        image[r][c] = color;
        dfs(image,r - 1, c, original, color, row, col);
        dfs(image,r + 1, c, original, color, row, col);
        dfs(image,r, c - 1, original, color, row, col);
        dfs(image,r , c + 1, original, color, row, col);
    }

    
}