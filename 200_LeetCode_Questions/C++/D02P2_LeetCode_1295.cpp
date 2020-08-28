class Solution {
public:
    int findNumbers(vector<int> &nums) {
        int counter=0;
        for (int val: nums){
          if (int(log10(val)+1) %2==0) {
                counter ++;
          }
        }
        return counter;
    }
};