class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()

        for index, number in enumerate(nums):
            if number > 0:
                break
            if index > 0 and number == nums[index - 1]:
                continue
            
            l, r = index + 1, len(nums) - 1
            while l < r:
                threeSum = number + nums[l] + nums[r]

                if threeSum < 0:
                    l += 1
                elif threeSum > 0:
                    r -= 1
                else:
                    res.append([number,nums[l], nums[r]])
                    l += 1
                    r -= 1
                    while nums[l] == nums[l-1] and l < r:
                        l += 1
        return res