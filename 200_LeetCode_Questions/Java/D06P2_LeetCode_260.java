class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        //xoring all no.s to obtain xor of those two unique
        // numbers, as xor of numbers repeating twice is zero.(a^a=0)
        
        for(int i:nums)
        {
            xor^=i;
        }
        //xor= 1^2^1^3^2^5 = (1^1)^(2^2)^(3^5)= 0^0^(3^5)= 6 
        //xor(in binary)=110
        
        //obtain last set bit, (-xor) will give two's compliment
        // and it's &(and) with xor will give last set bit
        
        int lastBit = xor & (-xor);//lastbit= (110)&(010) = 010(2)
        
        //now as we obtained the last set bit , then we knew
        //a bit is set when there is xor of different bits,
        // using which we can obtain two no.s that appears exactly once  i.e. 1^0=1
        
        int res[]=new int[2];       
        
        for(int i:nums)
        {
            
            if((i&lastBit)==0) // 1(i) & 0(lastbit) = 0 
            {
                //if a number has same bit at the position of last set bit then both
                //occurence of that number will be xored in res[0] , also one of the
                //number(which has set bit at that position) that occurs once will also
                // be xored 
                 
                res[0]^=i;
                
                // 1^1^5 = 5
            }
            else//2 ^ 0 != 0
            {
                //else remaining numbers(occuring twice will be xored in res[1]) along
                // with other number that appers exactly once
                res[1]^=i;
                //2^2^3 = 3
            }
        }
        //hence res[0] and res[1] will contain those two no.s that occur once
        
        return res;
    }
}