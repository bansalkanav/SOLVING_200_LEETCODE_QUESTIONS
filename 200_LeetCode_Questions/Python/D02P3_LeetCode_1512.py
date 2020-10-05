# Python3 , By:- Harsh Udai
# Que. Number of Good Pairs

class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        count=0
        for i in range(0,len(nums)):
            for j in range(i+1,len(nums)):
                if(i<j and nums[i]==nums[j]):
                    count+=1
                    
                    
        return count
        