# Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        arr=nums
        maj=len(arr)//2
        l=[]
        for i in arr:
            if i not in l:
                l.append(i)


        for i in range(0,len(l)):
            a=l[i]
            count=0
            for j in range(0,len(arr)):
                if(a==arr[j]):
                    count=count+1
            if(count>maj):
                return(a)
                break
        