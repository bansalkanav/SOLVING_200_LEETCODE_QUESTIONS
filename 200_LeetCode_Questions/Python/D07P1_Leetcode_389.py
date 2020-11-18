class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        x=0
        y=0
        for i in s:
            x=x+ord(i)
        for i in t:
            y=y+ord(i)
        return chr(y-x)