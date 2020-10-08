// Problem : Trapping Rain Water

// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
// Elevation map : https://assets.leetcode.com/uploads/2018/10/22/rainwatertrap.png
// The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
// In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!

// Example:
// Input: [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
    
// Solution :

class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size();
        int total = 0;
        int L=INT_MIN,R=INT_MIN;
        vector<int> left(n,0);
        vector<int> right(n,0);
        for(int i=0;i<n;i++)
        {
            L = max(L,height[i]);
            left[i] = L;
            R = max(R,height[n-i-1]);
            right[n-i-1] = R;
        }
        for(int i=0;i<n;i++){
           total = total + min(left[i],right[i]) - height[i];
        }
        return total;
    }
    Solution(){
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);
        cout.tie(NULL);
    }
};
