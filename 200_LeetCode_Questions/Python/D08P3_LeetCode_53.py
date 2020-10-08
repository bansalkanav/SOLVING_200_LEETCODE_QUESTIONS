#Given an integer array nums, find the contiguous subarray (containing at least one number) 
#which has the largest sum and return its sum

class Solution:
  #Kadane's Algorithm
  def maxSubArray(self, nums: List[int]) -> int:
      max_sum = nums[0]
      cur_sum = max_sum
      
      for i in range(1, len(nums)):
          cur_sum = max(nums[i] + cur_sum, nums[i])
          max_sum = max(cur_sum, max_sum)
      
      return max_sum