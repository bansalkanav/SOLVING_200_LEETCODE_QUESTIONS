// Problem : Subtract the Product and Sum of Digits of an Integer

// Given an integer number n, return the difference between the product of its digits and the sum of its digits.

// Example 1:
// Input: n = 234
// Output: 15 
// Explanation: 
// Product of digits = 2 * 3 * 4 = 24 
// Sum of digits = 2 + 3 + 4 = 9 
// Result = 24 - 9 = 15
  
// Solution : 

class Solution
{
public:
    int subtractProductAndSum(int n)
    {
        int pod =1;
        int sod =0;
        while(n!=0)
        {
            pod *= n%10;
            sod += n%10;
            n /=10;
        }
        return pod-sod;
    }
};
