# Python3 code coming soon


class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        
        l = [0]*len(nums)
        
        for i in range(len(nums)):
            count=0
            for j in range(len(nums)):
                if nums[i]>nums[j]:
                    count+=1
                    
            l[i] = count
            
            
        return l
