# C++ code coming soon
class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        vector<int> result(nums.size());
        
        for( int i = 0; i < nums.size();i++)
        {   
            int count = 0;
            for ( int j = 0; j < nums.size(); j ++)
            {
            if((nums[i]>nums[j]) && j != i )
                {
                count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
};
