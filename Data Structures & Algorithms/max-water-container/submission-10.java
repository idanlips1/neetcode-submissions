class Solution {
    public int maxArea(int[] heights) {
        int maxA = 0;
        int l = 0, r = heights.length - 1;
        while (l < r){
            int area = (r - l) * Math.min(heights[l], heights[r]);
            maxA = Math.max(maxA, area);
            if (heights[l] < heights[r]){
                l++;
            } else {
                r--;
            }
        }
        return maxA;
    }
}
