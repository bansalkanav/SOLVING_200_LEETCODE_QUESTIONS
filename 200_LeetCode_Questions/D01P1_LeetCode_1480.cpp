# C++ code coming soon

class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        for(int i = 1; i < size(nums); i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
};
