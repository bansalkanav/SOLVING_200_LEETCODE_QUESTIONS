/*Leetcode 137.Single number 2

  Question: Given a non-empty array of integers, every element appears three times except for one, 
  which appears exactly once. Find that single one.
  
  Follow up: Algorithm should have a linear runtime complexity. 
  Implement it without using extra memory */

//Solution class containing helper function to achieve the task  
class Solution
{
	public:
		int singleNumber(vector<int> &a)
		{
			int i,j,bit;
        		int cnt,ans=0;
        		for(i=0;i<32;i++)//since "int" datatype can be maximum 32 bits long
        		{
	            		int cnt=0;
	            		for(j=0;j<a.size();j++)//iterate through all numbers and find if ith bit is set or not
	            		{
	                		bit=(a[j]&(1<<i));
	                		if(bit)cnt++;
	            		}
	            		if(cnt%3)  //if the number which has repeated only once has ith bit set
	            		{          //then cnt%3=1,(since all other numbers appear thrice) so we add that bit value to answer
	                		ans+=(1<<i);
	            		}	
        		}
        		return ans;
		}
};

