/**
 * leetcode problem link: https://leetcode.com/problems/hamming-distance/
 * Runtime : 0ms faster than 100% submissions
 * Memory : 37.2MB better than 86.28% submissions.
 */


class Solution {
    public char findTheDifference(String s, String t) {
        
        // constant space to store the occurence of chars in both the strings
        int[] store = new int[26];        
        char ans = ' ';
        
        for(char c: s.toCharArray())
        {
            store[c-'a']++; // increasing the count of char at it's normalized index (i.e char -'a')             
        }
        
        for(char c: t.toCharArray())
        {
            if(store[c-'a']==0)
            {
                ans = c;
                break;
            }
            store[c-'a']--; // decrement the count of char from the store
        }
        return ans;
    }
}