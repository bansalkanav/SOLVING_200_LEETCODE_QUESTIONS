class Solution:
    def findMin(self, nums: List[int]) -> int:
        left = 0
        right = len(nums) - 1

        while (left < right):
            midpoint = int(left + (right - left)/2)
            if(nums[midpoint] < nums[midpoint -1]):
                return nums[midpoint]
            elif (nums[midpoint] >= nums[left] and nums[midpoint] > nums[right]):
                left = midpoint+1
            else:
                right = midpoint - 1

        return nums[left]
