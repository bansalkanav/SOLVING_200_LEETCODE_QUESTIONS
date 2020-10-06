class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        a=n
        mul=1
        su=0
        while(a>0):
            rem=a%10
            mul*=rem
            su+=rem
            a=a//10
        return mul-su
        
