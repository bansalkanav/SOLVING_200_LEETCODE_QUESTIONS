class Solution:
    def hammingDistance(self, x: int, y: int) -> int:
        c=0
        for i in range(0,32):
            if (x & 1<<i)^(y & 1<<i):
                c=c+1 
        return c
            
        