class Solution:
    def numTeams(self, rating: List[int]) -> int:
        count=0
        for  i in range (len(rating)):
            for j in range(i+1,len(rating)):
                for k in range(j+1,len(rating)):
                    if (rating[i] < rating[j] < rating[k]) or (rating[i] > rating[j] > rating[k]):
                        count+=1
        return count
                    
                    
