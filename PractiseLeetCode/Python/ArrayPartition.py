# Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        a=sorted(nums)
        val=0
        for i in range(0,len(a)-1,2):
            val=val+(min(a[i],a[i+1]))
            
        return val
