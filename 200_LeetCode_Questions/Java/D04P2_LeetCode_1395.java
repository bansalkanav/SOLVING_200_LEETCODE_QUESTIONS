// Runtime: 3 ms, faster than 75.45% of Java online submissions for Count Number of Teams.
// Memory Usage: 37.1 MB, less than 67.41% of Java online submissions for Count Number of Teams.

class Solution {
    public int numTeams(int[] rating) {
        int teams = 0;
        int[] low;
        int[] high;
        for (int i = 1; i < rating.length - 1; ++i) {
            low = new int[2];
            high = new int[2];
            for (int j = 0; j < rating.length; ++j) {
                if (rating[i] < rating[j]){
                    ++low[j > i ? 1 : 0];
                }
                if (rating[i] > rating[j]){
                    ++high[j > i ? 1 : 0];
                }
            }
            teams += low[0] * high[1] + high[0] * low[1];
        }
        return teams;
    }
}
