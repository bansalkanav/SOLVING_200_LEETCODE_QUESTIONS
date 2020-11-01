# Python3 code coming soon
class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        j=len(s)-1
        for i in range(len(s)//2):
            t = s[i]
            s[i],s[j]=s[j],t
            j=j-1
