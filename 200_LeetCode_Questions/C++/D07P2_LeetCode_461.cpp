//The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
// Input: x = 1, y = 4
// Output: 2
// Explanation:
// 1   (0 0 0 1)
// 4   (0 1 0 0)
//        ↑   ↑
//SOLUTION-->
class Solution
{
public:
    // function to count number of set bits in the number.
    int count(int n)
    {
        if(n==0)
        {    return 0;}
        return (n&1) + count(n>>1);
    }
    int hammingDistance(int x, int y) {
    
        int x_or = x ^ y;
        return count(x_or);
      
    }
    Solution(){
        // To Know about the Below code Visit : https://www.geeksforgeeks.org/fast-io-for-competitive-programming/
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);
    }
};
