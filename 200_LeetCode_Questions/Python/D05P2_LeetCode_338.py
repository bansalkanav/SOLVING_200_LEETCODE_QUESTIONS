class Solution:
    def countBits(self, num: int) -> List[int]:
        l=[]
        for i in range(num+1):
            x=bin(i)
            l.append(x.count('1'))
        return l
