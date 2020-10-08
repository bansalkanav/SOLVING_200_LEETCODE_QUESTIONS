#Given an array nums containing n distinct numbers in the range [0, n], 
#return the only number in the range that is missing from the array.

class Solution:
  def missingNumber(self, nums: List[int]) -> int:
      real_sum = 0
      missing_sum = 0
      
      for i, num in enumerate(nums): 
          real_sum += i + 1
          missing_sum += num
      
      return real_sum - missing_sum