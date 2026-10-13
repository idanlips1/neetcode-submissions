class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;

        int left = 2, right = x / 2;
        while (left <= right){
            int m = left + (right - left) / 2;
            if ((long) m * m > x){
                right = m - 1;
            } else if ((long) m * m < x) {
                left = m + 1;
            } else {
                return m;
            }
        }
        return right;
    }
}