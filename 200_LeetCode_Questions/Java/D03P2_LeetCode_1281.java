class Solution {
    public int subtractProductAndSum(int n) {
        int ans, prod=1, sum=0;


        while(n>0){

            prod *= n%10;
            sum += n%10;
            n /=10;
        }	        }
        	
        ans = prod - sum;
        return ans;
            	
    }
}	
