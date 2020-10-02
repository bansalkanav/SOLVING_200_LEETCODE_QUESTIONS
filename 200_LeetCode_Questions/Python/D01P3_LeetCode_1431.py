class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        m=max(candies)
        l=[]
        for i in candies:
            d=i+extraCandies
            l.append(not(d<m))
        return l
