# Java code coming soon
class Solution {
    public int search(int[] nums, int target) {
         //If array is empty, return -1
        if(nums.length == 0) {
           return -1;
        }
        //Traverse an array
        for(int i = 0; i < nums.length; i++) {
 
            //If element is found, then return it's index
            if(nums[i] == target) {
                 return i;
            }
         }
         return -1;
    }
}
