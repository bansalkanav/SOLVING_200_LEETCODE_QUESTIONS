# Given an array of integers A sorted in non-decreasing order, 
# return an array of the squares of each number, also in sorted non-decreasing order.

class Solution:
    def sortedSquares(self, A: List[int]) -> List[int]:
        l1=[(i**2) for i in A]
        return(sorted(l1))