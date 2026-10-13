class Solution {
    public int mySqrt(int x) {
        int l = 0, r = x;
        int res = 0;
        while (l <= r){
            int m = (l + r) / 2;
            if ((long) m * m < x){
                l = m + 1;
                res = m;
            } else if ((long) m * m > x){
                r = m - 1;
            } else {
                return m;
            }
        }
        return res;
    }
}