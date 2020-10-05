# You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  
# Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

#The letters in J are guaranteed distinct, and all characters in J and S are letters. 
# Letters are case sensitive, so "a" is considered a different type of stone from "A".

class Solution {
    public int numJewelsInStones(String J, String S) {
        int count=0;
        
        char []j1=J.toCharArray();
        char []s=S.toCharArray();
        
        for(int i=0;i<J.length();i++){
            for(int j=0;j<S.length();j++){
                if(j1[i]==s[j]){
                    count=count+1;
                }
            }
        }
        return count;
    }
}