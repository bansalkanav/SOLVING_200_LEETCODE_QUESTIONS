// Given a non-negative integer num, return the number of steps to reduce it to zero.
// If the current number is even, you have to divide it by 2,
// otherwise, you have to subtract 1 from it.

// Input: num = 8
// Output: 4
// Explanation: 
// Step 1) 8 is even; divide by 2 and obtain 4. 
// Step 2) 4 is even; divide by 2 and obtain 2. 
// Step 3) 2 is even; divide by 2 and obtain 1. 
// Step 4) 1 is odd; subtract 1 and obtain 0.

//SOLUTION-->
class Solution
{
public:
    int numberOfSteps (int num)
    {
      if(num == 0)
      { return 0;}
      else{
      int p = -1;
        while(num!=0)
        {
            if(num&1==1)
            {
                p++;
            }
            p++;
            num = num>>1;
        }
        return p;  
    }
    }
   Solution(){
       // To Know about the below used code visit : https://www.geeksforgeeks.org/fast-io-for-competitive-programming/
       ios_base::sync_with_stdio(false);
       cin.tie(NULL);
   } 
};
