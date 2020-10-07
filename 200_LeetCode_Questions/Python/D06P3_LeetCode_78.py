class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        l=[]
        for i in range(len(nums)+1):
            comb = combinations(nums, i)
            for j in comb:
                l.append(j)
        return l
            
