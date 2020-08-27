//Runtime: 1 ms, faster than 97.15% of Java online submissions for Find Numbers with Even Number of Digits.
//Memory Usage: 39.1 MB, less than 74.25% of Java online submissions for Find Numbers with Even Number of Digits.

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(Integer.toString(num).length() % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
