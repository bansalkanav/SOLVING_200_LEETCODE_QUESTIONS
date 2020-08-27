class Solution {
public:
    int maxCoins(vector<int>& piles) {
        sort(piles.begin(),piles.end());
        int i=0,ans=0;
        int h= piles.size()-2;
        while(i<=h){
            ans+=piles[h];
            h=h-2;
            i++;
        }
        return ans;
        
    }
};
