# Python3 code coming soon

class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        a = 0
        b = 1
        while n:
            k = n % 10
            n //= 10
            a += k
            b *= k
        return b - a
