class Solution:
    def sortByBits(self, arr: List[int]) -> List[int]:
        arr.sort()
        l=[]
        for i in arr:
            l.append(bin(i).count('1'))
            m=max(l)
        l=[]
        for i in range(m+1):
            for j in arr:
                if i==(bin(j).count('1')):
                    l.append(j)
                    #arr.remove(j)
        return l
