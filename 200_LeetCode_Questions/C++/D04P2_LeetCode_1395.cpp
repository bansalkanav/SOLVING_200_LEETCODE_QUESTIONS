//---Count Number of Teams---

//Question: There are n soldiers standing in a line. Each soldier is assigned a unique rating value.
//You have to form a team of 3 soldiers amongst them under the following rules:
//Choose 3 soldiers with index (i, j, k) with rating (rating[i], rating[j], rating[k]).
//A team is valid if:  (rating[i] < rating[j] < rating[k]) or (rating[i] > rating[j] > rating[k]) where (0 <= i < j < k < n).
//Return the number of teams you can form given the conditions. (soldiers can be part of multiple teams).

//Solution:helper function

class Solution 
{
	public:
	    int numTeams(vector<int>& rating) 
		{
			int n = rating.size();
	        if(!n)return 0; //answer is zero for empty array
	        int i,j;
	        vector <int> right_max(n,0),right_min(n,0);
	        int result=0;
	        for (i = n-2; i >= 0; i--) 
			{
	            for (j = i+1; j<n; j++) 
				{
	                if (rating[i] < rating[j]) 
					{
	                    result += right_max[j];
	                    ++right_max[i];
	                } 
					else if (rating[i] > rating[j])
					{
	                    result += right_min[j];
	                    ++right_min[i];
	                }
	            }
	        }
	        return result;
	    }
};
