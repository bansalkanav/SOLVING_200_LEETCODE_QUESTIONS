// Problem : Sort Integers by The Number of 1 Bits

// Given an integer array arr. You have to sort the integers in the array in ascending order by the number of 1's in their binary representation 
// and in case of two or more integers have the same number of 1's you have to sort them in ascending order.
// Return the sorted array.

// Example 1:
// Input: arr = [0,1,2,3,4,5,6,7,8]
// Output: [0,1,2,4,8,3,5,6,7]
// Explantion: [0] is the only integer with 0 bits.
// [1,2,4,8] all have 1 bit.
// [3,5,6] have 2 bits.
// [7] has 3 bits.
// The sorted array by bits is [0,1,2,4,8,3,5,6,7]

// Solution :

class Solution {
public:
    int count(int num){
        if(num==0){
            return 0;
        }
            return (num&1) + count(num>>1);
        }
    vector<int> sortByBits(vector<int>& arr) {
       map<int,priority_queue<int,vector<int>,greater<int>>> mp;
       for(auto i:arr){
          int j = count(i);
          if(mp.find(j)==mp.end()){
             priority_queue<int,vector<int>,greater<int>> pq;
             pq.push(i);
             mp.insert(pair<int,priority_queue<int,vector<int>,greater<int>>>(j,pq));
          }
           else{
               auto p = mp.find(j);
               p->second.push(i);
           }   
       }
        vector<int> res;
        for(auto itr=mp.begin();itr!=mp.end();++itr)
        {
            while(itr->second.empty()==false)
            {
                res.push_back(itr->second.top());
                itr->second.pop();
            }
        }
        
        return res;
        
    }
    Solution(){
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);
    }
};
