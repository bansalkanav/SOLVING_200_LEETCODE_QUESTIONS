# C++ code coming soon
class Solution {
public:
    int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        while(n>0){
            int temp=n%10;
            n/=10;
            product*=temp;
            sum+=temp;
        }
        return product-sum;
    }
};
