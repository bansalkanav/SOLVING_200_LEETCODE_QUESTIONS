// The below code find square root of an number using binary search by slightly modifying it, watch out for interger overflow
class Solution {
public:
    int mySqrt(int x) {
    if (x == 0 || x == 1)
    return x;
    int l,r,ans;
    l=1;
    r=(x/2)+1;  // just searching upto half the numbers is enough
    long long m;
    while (l<=r) {
        m = (l+r)/2;
        if ((m*m) == x)
            return m;
        if ((m*m) < x){
            l = m + 1;
            ans = m;
        }
        else
            r = m-1;
        }
    return ans;
  }
};
//Time Complexity : O(log(n))
