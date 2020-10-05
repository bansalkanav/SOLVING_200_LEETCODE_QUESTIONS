# Python3 ,By:- Harsh Udai
# Que. Find Numbers with Even Number of Digits

class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        count=0
        for i in range(0,len(nums)):
            val=len(str(nums[i]))
            if(val%2==0):
                count+=1
                
        return count
            
            
        