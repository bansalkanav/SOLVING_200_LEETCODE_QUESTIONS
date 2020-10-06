class Solution {
public:
    int findNumbers(vector<int>& num) {
        int t;
        int count = 0;
        int count1 =0;
        for ( int i = 0; i < num.size(); i++)
        {
            while(num[i])
            {
                t = num[i] %10;
                count++;
                num[i]/=10;
            }
            if ( count % 2 == 0)
            {
                count1 +=1;
            }
            
            count = 0;
        }
        return count1;
        
    }
};