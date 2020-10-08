class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        for i in nums:
            if(nums.count(i)==1):
                return i
      
