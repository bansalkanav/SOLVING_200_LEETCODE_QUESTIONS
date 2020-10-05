# Given the array queries of positive integers between 1 and m, you have to process all queries[i] (from i=0 to i=queries.length-1) according to the following rules:

#In the beginning, you have the permutation P=[1,2,3,...,m].
#For the current i, find the position of queries[i] in the permutation P (indexing from 0) and 
# then move this at the beginning of the permutation P. Notice that the position of queries[i] in P is the result for queries[i].
#Return an array containing the result for the given queries.

class Solution:
    def processQueries(self, queries: List[int], m: int) -> List[int]:
        l=[]
        for i in range(1,m+1):
            l.append(i) 

        l1=[]
        for i in range(0,len(queries)):
            a=queries[i]
            b=l.index(a)
            l1.append(b)
            f1=l[b]
            l.remove(f1)
            l.insert(0,f1)
            
        return l1
 