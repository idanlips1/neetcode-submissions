class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l < r){
            int m = (l + r) / 2;
            if (nums[m] < nums[r]){
                r = m;
            } else {
                l = m + 1;
            }
        }
        int pivot = l;
        int result = binarySearch(nums,0, pivot - 1, target);
        if (result != -1) {
            return result;
        }
        return binarySearch(nums,pivot, nums.length - 1, target);
    }

    private int binarySearch(int[] nums, int left, int right, int target){
        while (left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] < target){
                left = mid + 1;
            } else if (nums[mid] > target){
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
