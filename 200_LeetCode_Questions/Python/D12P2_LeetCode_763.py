# Python3 code coming soon
class Solution:
    def partitionLabels(self, S: str) -> List[int]:
        # store the indexes of each letter dictionary 
        my_dict = defaultdict(list)# to avoid key errors in dictionary
        for i, letter in enumerate(S):
            my_dict[letter].append(i)
        res = []
        i = 0
        # find maximum index for each letter until current partition is done
        max_ind = max(my_dict[S[0]])
        while i < len(S):
            max_ind = max(max_ind, max(my_dict[S[i]]))
            if i == max_ind:
                res.append(i+1 - sum(res))
            i+=1
        return res
