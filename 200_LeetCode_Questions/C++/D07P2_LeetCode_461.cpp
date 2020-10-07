/*Leetcode 461. Hamming Distance

 The Hamming distance between two integers is the number of positions at which the 
 corresponding bits are different.

 Question: Given two integers x and y, calculate the Hamming distance.

 the two integers will be in range ( 0<= x,y < 2^31 ) */

//Solution class containing helper function to achieve the task  
class Solution
{
public:
    int hammingDistance(int x, int y)
    {
      	int ans = 0; 
        while (x || y) //while either of x or y are greater than zero
	{ 
            if (x%2 != y%2) ans++; //if their corresponding least significant bit is not same,increase count
            x /= 2; //same as left shift operation
            y /= 2;
        } 
        return ans;
    }
};


