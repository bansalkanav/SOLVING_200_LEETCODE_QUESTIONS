class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        l=[]
        for i in t:
            l.append(i)
        for i in s:
            l.remove(i)
        return l[0]
