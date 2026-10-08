class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxp = 0;
        for (int p : piles){
            maxp = Math.max(p, maxp);
        }
        int l = 1, r = maxp;
        int res = r;
        while (l <= r){
            int k = (l + r) / 2;
            long hours = 0;
            for (int p : piles) {
                hours += Math.ceil((double) p / k);
            }
            if (hours <= h){
                res = Math.min(res,k);
                r = k - 1;
            } else {
                l = k + 1;
            }
        }
        return res;
    }
}
