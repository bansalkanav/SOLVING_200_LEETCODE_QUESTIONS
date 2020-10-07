class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        l=[]
        for i in nums:
            if nums.count(i)==1:
                l.append(i)
        return l
        
