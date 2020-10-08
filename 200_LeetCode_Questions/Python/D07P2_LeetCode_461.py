class Solution:
    def hammingDistance(self, x: int, y: int) -> int:
        a=x^y
        count=0
        while(a>0):
            if a%2!=0:
                count+=1
            a=a>>1
        return count
