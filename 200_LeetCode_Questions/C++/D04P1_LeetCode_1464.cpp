//Maximum Product of Two Elements in an Array

//Question: Given the array of integers nums, you will choose two different indices i and j of that array. 
// Return the maximum value of (nums[i]-1)*(nums[j]-1)

//size of the given array will be >=2

//Solution: helper function
class Solution 
{
public:
	
    int maxProduct(vector<int>& nums) 
	{
	        
		int max1 = INT_MIN, max2 = INT_MIN;
		for(int i=0;i<nums.size();i++)
		{
			if(max1<nums[i])
			{
				max2 = max1;
				max1 = nums[i];
			}
			else if(max2<nums[i])
				max2 = nums[i];
		}
		return (max1-1)*(max2-1);
	}
};
