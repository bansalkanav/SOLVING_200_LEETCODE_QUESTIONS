# Given two arrays, write a function to compute their intersection.
class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        l=[]
        for i in range(0,len(nums1)):
            a=nums1[i]
            if a in nums2 and a not in l:
                l.append(a)


        return(l)
        