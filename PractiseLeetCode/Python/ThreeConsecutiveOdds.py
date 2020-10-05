# Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.

class Solution:
    def threeConsecutiveOdds(self, arr: List[int]) -> bool:
        d=0
        for i in range(0,len(arr)-2):
            a=arr[i]
            b=arr[i+1]
            c=arr[i+2]
            if(a%2==1 and b%2==1 and c%2==1):
                d=d+1
                


        if(d>0):
            return(True)
        else:
            return(False)
        