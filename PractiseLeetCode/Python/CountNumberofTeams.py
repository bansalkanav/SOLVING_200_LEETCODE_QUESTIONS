# There are n soldiers standing in a line. Each soldier is assigned a unique rating value.
#You have to form a team of 3 soldiers amongst them under the following rules:
#Choose 3 soldiers with index (i, j, k) with rating (rating[i], rating[j], rating[k]).
#A team is valid if:  (rating[i] < rating[j] < rating[k]) or (rating[i] > rating[j] > rating[k]) where (0 <= i < j < k < n).
#Return the number of teams you can form given the conditions. (soldiers can be part of multiple teams).

class Solution:
    def numTeams(self, rating: List[int]) -> int:
        count=0
        for i in range(0,len(rating)):
            for j in range(i,len(rating)):
                for k in range(j,len(rating)):
                    if(rating[i]<rating[j]<rating[k] or rating[i]>rating[j]>rating[k]):
                        count=count+1
        
        return count