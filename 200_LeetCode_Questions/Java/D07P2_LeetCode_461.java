/**
 * leetcode problem link: https://leetcode.com/problems/hamming-distance/
 * Runtime : 0ms faster than 100% submissions
 * Memory : 35.7MB better than 95.68% submissions.
 */

class Solution {
    public int hammingDistance(int x, int y) 
    {
        return getBitCount(x^y);    
    }
    
    public int getBitCount(int num){
        int count=0;
        
        while(num>0)
        {
            num &= num-1;
            count++;
        }
        return count;
    }
}