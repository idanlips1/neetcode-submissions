class Solution {
    public int[] productExceptSelf(int[] nums) {
        int preFix = 1;
        int [] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            res[i] = preFix;
            preFix *= nums[i];
        }
        int postFix = 1;
        for (int i = nums.length - 1; i >= 0; i--){
            res[i] *= postFix;
            postFix *= nums[i];
        }

        return res;
    }
}