# Python3 code coming soon


class Solution:
    def xorOperation(self, n: int, start: int) -> int:
        ans = temp = start
        for i in range(1, n):
            temp += 2  
            ans = ans ^ temp
        return ans
