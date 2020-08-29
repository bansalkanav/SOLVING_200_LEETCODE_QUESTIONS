// Runtime: 0 ms, faster than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
// Memory Usage: 36.6 MB, less than 43.70% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.

class Solution {
    public int subtractProductAndSum(int n) {
        if(n == 0){
            return 0;
        }
        int prod = 1, sum = 0;
        while(n > 0){
            prod *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return prod - sum;
    }
}
