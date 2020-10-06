class Solution {
public:
vector smallerNumbersThanCurrent(vector& nums)
{
vector nums1{nums};
int count = 0;
for( int i = 0; i < nums.size();i++)
{
for ( int j = 0; j < nums.size(); j ++)
{
if((nums[i]>nums[j]) && j != i )
{
count++;
}
}
nums1[i] = count;
count=0;
}

    return nums1;
}
};
