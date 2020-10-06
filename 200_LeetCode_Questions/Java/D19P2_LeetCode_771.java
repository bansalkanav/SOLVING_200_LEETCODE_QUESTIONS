class Solution {
    public int numJewelsInStones(String J, String S) {
        
        int lowCase[]=new int[26];
        int upCase[]=new int[26];
        int ascii;
        for(int i=0;i<S.length();i++)
        {
            ascii=(int)S.charAt(i);
            if(S.charAt(i)<='Z' && S.charAt(i)>='A')
            {
                upCase[ascii-65]++;
            }
            else
            {
                lowCase[ascii-97]++;
            }
        }
        int cnt=0;
        for(int i=0;i<J.length();i++)
        {
            ascii=(int)J.charAt(i);
            if(J.charAt(i)<='Z' && J.charAt(i)>='A')
            {
                cnt+=upCase[ascii-65];          
            }
            else{
                cnt+=lowCase[ascii-97];
            }
        }
        
        return cnt;
    }
}