# C++ code coming soon
class Solution {
public:
    int xorOperation(int n, int start) {
        int x=0;
        while(n--){
            x^=start;
            start+=2;
        }
        return x;
    }
};
