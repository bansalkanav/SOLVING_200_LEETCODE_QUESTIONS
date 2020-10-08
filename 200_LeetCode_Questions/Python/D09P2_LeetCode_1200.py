class Solution:
    def minimumAbsDifference(self, arr: List[int]) -> List[List[int]]:
        l=[]
        arr.sort()
        for i in arr:
            for j in arr:
                if i-j>0:
                    l.append(i-j)
        m=min(l)
        l=[]
        for i in arr:
            for j in arr:
                if i-j==m:
                    l.append([j,i])
        return l


        
