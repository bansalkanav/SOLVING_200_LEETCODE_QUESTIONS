// Problem : Single Number III

// Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice,
// Find the two elements that appear only once. You can return the answer in any order.
// Follow up: Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?

// Example 1:
// Input: nums = [1,2,1,3,2,5]
// Output: [3,5]
// Explanation:  [5, 3] is also a valid answer.
  
// Solution : 

class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        int a = 0;
        int diff_bit;
        vector<int> arr(2,0);
        for(auto i:nums)
            a = a ^ i;
        diff_bit = a & ~(a-1);
        for(auto i:nums){
            if(i & diff_bit)
            {arr[0] ^= i;}
            else
            {arr[1] ^= i;}
        }
            
        return arr;
    }
    Solution(){
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);
    }
};
