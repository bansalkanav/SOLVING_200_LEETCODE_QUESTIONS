class Solution 
{
public:
    int mySqrt(int x) 
    {
        long mid,r;
        int start = 1;
        int end = x/2+1; //Searching upto Half # sqrt(n) <= n/2 #
        // if the number is 0 or 1 it's sqrt will be the number itself.
        if (x == 0 || x == 1)
        {   return x;}
        else{
            // applying binary search
            while(start<=end){
                mid = (start+end)/2;
                if(mid*mid == x )
                {
                    return mid;
                }
                else{
                    if(mid*mid<x)
                    {
                        start = mid+1;
                        r = mid;
                    }
                    else
                    {
                        end = mid-1;
                    }
                    }
              }
          }
        return r;
    }
};
//Time Complexity : O(log(n))
