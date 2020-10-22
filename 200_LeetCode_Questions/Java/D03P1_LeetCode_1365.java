// Runtime: 11 ms, faster than 53.48% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
// Memory Usage: 39.4 MB, less than 13.35% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int n = nums.length;
        int temp[] = new int[n];
        
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(nums[j]<nums[i])
                    count++;
            }
            temp[i]=count;
        }
        
        return temp;
        
    }
    
    
}
