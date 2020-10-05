class Solution {
public:
   vector<int> shuffle(vector<int>& nums, int n) {
       for (int i = 2*n-1; i > 0; i--) {
           int j = i;
           do {
               if (j % 2 == 1)
                   j = j/2 + n;
               else
                   j = j/2;
           } while (j > i);
           swap(nums[i], nums[j]);
       }
       return nums;
   }
};