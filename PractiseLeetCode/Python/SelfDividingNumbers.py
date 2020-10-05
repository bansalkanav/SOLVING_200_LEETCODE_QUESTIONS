# A self-dividing number is a number that is divisible by every digit it contains.

# For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

# Also, a self-dividing number is not allowed to contain the digit zero.

# Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        l=[ i for i in range(left,right+1)]
        l1=[]
        for x in range(0,len(l)):
            a=l[x]
            b=str(a)
            count=0
            for j in range(0,len(b)):
                if(b[j]!='0'):
                    if((a%int(b[j]))==0):
                        count=count+1
            if(count==len(b)):
                l1.append(a)
                
        return l1