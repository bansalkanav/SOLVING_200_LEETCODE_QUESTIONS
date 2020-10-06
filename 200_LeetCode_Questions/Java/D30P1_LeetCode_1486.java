//leetcode link : https://leetcode.com/problems/xor-operation-in-an-array/
// Runtime: 0ms faster than 100% submissions
// Memory: 35.9 MB better than 86.73% submissions

class Solution {
    public int xorOperation(int n, int start) 
    {
        int ans = 0;
        for(int i=0; i<n; i++)
        {
            ans^= start + 2*i;
        }
        return ans;
    }
}