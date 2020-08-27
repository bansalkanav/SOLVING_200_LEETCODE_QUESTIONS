//Runtime: 0 ms, faster than 100.00% of Java online submissions for Kids With the Greatest Number of Candies.
//Memory Usage: 39.3 MB, less than 91.09% of Java online submissions for Kids With the Greatest Number of Candies.

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> output = new ArrayList<>();
        int max = 0;
        for(int candy : candies){
            max = Math.max(candy, max);
        }
        for(int candy : candies){
            if(candy + extraCandies >= max){
                output.add(true);
            }else{
                output.add(false);
            }
        }
        return output;
    }
}
