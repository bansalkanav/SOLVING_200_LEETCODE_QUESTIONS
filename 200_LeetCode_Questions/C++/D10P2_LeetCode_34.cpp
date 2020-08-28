// The code modies the working of binary search by not stopping at where the element is found rather it pushes to left or right depending upon the result
class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int l,r,m,s,e;
        l=0;
        r=nums.size();
        if(r<=l)
            return vector<int>{-1,-1};
        r=r-1;
        s=-1;
        while(l<=r){
            m=(l+r)/2;
        if(nums[m]>target){
                r=m-1;
            }else if(nums[m]<target){
                l=m+1;
            }else{
                r=m-1;
                s=m;
            }
         }
        l=0;
        e=-1;
         r=nums.size()-1;
         while(l<=r){
            m=(l+r)/2;
            if(nums[m]>target){
                r=m-1;
            }else if(nums[m]<target){
                l=m+1;
            }else{
                l=m+1;
                e=m;
            }
        }
        return vector<int>{s,e};
    }
};

//Time Complexity = O(log(n)+log(n))= O(log(n))
