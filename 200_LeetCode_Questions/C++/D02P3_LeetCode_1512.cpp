// Problem : Number of Good Pairs

// Given an array of integers nums.
// A pair (i,j) is called good if nums[i] == nums[j] and i < j.
// Return the number of good pairs.
  
// Example 1:
// Input: nums = [1,2,3,1,1,3]
// Output: 4
// Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

// Solution :

class Solution {
public:
    int numIdenticalPairs(vector<int>& nums)
    {   ios_base::sync_with_stdio(false); 
        cin.tie(0);
        cout.tie(0);
        int count_pair=0;
        int p = nums.size();
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<p;j++)
            {
                if(i!=j && nums[i]==nums[j] && i<j)
                    count_pair++;
            }
        }
        return count_pair; 
    }
};
