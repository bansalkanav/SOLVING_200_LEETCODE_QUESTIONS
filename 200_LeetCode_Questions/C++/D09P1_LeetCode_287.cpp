//Simple Map solution

class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        map<int,int> check;
        for(int i=0;i<nums.size();i++)
        {
            check[nums[i]]++;
            if(check[nums[i]]==2)
            {
                return nums[i];
            }
        }
        return 0;
    }
};
