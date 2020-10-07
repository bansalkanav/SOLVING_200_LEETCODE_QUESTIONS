class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        //total no. of subsets = pow(2,N) = 1<<N where N is no. of elements in the set
        //i.e. for [1,2,3] , total no. of subsets = 1<<3 = 8 ( 1<<1 =2 ; 1<<2 =4 ; 1<< 3 = 8)

        List<List<Integer>> lst=new ArrayList<>();
        
        //traversing loop to obtain all subsets 

        for(int i=0;i<(1<<nums.length);i++)
        {
            List<Integer> sub=new ArrayList<>();
            //we have to make choice among given elements to make subsets
            //we can map elements as per the different binary representation till total no. of subsets 
            // i.e. for total no. of subsets=8 and given set is [1,2,3]
            // binary representation     -- > subset
            //   0.     0 0 0 --> []  not selecting any element 
            //   1.     0 0 1 --> [1] selecting 1st element   
            //   2.     0 1 0 --> [2] selecting 2nd element
            //   3.     0 1 1 --> [1,2] selecting 1st and 2nd element
            //   4.     1 0 0 --> [3] selecting 3rd element
            //   5.     1 0 1 --> [1,3] selecting 1st and 3rd element
            //   6.     1 1 0 --> [2,3] selecting 2nd and 3rd element
            //   7.     1 1 1 -->[1,2,3] selecting all elements 

            for(int j=0;j<nums.length;j++)
            {
                //subset will contain same number of elements as there are 1's in binary representation of 'i' (from 0 to less than total number of subsetes)
                if(((i>>j)&1)==1)
                {
                    //for i=7 and j=0
                    //   (111>>0)&1 = (111)&1 =1  -> [1]  ;
                    //   (111>>1)&1 =(011)&1 =1 --> [1,2] ;
                    //   (111>>2)&1 =(001)&1=1 -->[1,2,3] ;
                    sub.add(nums[j]);//adding elements to sublist
                }
            }
            lst.add(sub);//adding sublist to main list
        }
        return lst;
    }
}