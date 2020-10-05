// Problem : Relative Sort Array

// Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
// Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2,
// Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order.

// Example 1:
// Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
// Output: [2,2,2,1,4,3,3,9,6,7,19]

// Solution :

class Solution {
public:
    vector<int> relativeSortArray(vector<int>& arr1, vector<int>& arr2) {
        vector<int> arr;
        map<int,int> mp;
        for(auto i:arr1)
        {
            if(mp.find(i)==mp.end())
            mp[i] = 1;
            else
            mp[i] += 1;
        }
        for(auto i:arr2)
        {
            auto it=mp.find(i);
            while(it->second>0)
            {   arr.push_back(i);
                it->second--;
            }
            mp.erase(it);
        }
        for(auto it=mp.begin();it != mp.end();it++)
        {
            while(it->second>0)
            {   arr.push_back(it->first);
                it->second--;
            }
        }
        return arr;
    }
};
