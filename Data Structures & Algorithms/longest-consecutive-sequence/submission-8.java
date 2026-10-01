class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums){
            seen.add(num);
        }
        int longest = 0;
        int count = 0;
        for (int num : nums){
            if (!seen.contains(num - 1)){
                count = 1;
                while (seen.contains(num + count)){
                    count++;
                }
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
}
