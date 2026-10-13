class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r){
            while (l < r && nums[l] % 2 == 0){
                l++;
            }
            while (l < r && nums[r] % 2 == 1){
                r--;
            }
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            r--;
            l++;
        }
        return nums;
    }
}