// Problem : Subsets

// Given a set of distinct integers, nums, return all possible subsets (the power set).

// Note: The solution set must not contain duplicate subsets.

// Example:

// Input: nums = [1,2,3]
// Output:
// [
//   [3],
//   [1],
//   [2],
//   [1,2,3],
//   [1,3],
//   [2,3],
//   [1,2],
//   []
// ]

// Solution : 

class Solution
{
public:
    vector<vector<int>> subsets(vector<int>& nums)
    {
        vector<vector<int>> res;
        sort(nums.begin(), nums.end());
        int set_size=nums.size();
        int n=pow(2,set_size);
        for(int i=0;i<n;i++)
        {
            vector<int> t;
            for(int j=0;j<=set_size;j++)
            {
                if((1<<j)&(i))
                t.push_back(nums[j]);
            }
            res.push_back(t);
        }
        return res;  
    }
};
