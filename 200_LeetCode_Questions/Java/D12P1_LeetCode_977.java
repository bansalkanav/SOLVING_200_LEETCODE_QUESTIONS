/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Squares of a Sorted Array.
Memory Usage: 40.8 MB, less than 83.69% of Java online submissions for Squares of a Sorted Array.
*/

class Solution {
    public int[] sortedSquares(int[] A) {
        int[] returnedArray = new int[A.length];
        int right = A.length-1;
        int left = 0;
        for(int i=0 ; i < A.length ; i++){
            if(Math.abs(A[left])<Math.abs(A[right])){
                returnedArray[A.length-i-1] = A[right]*A[right];
                right--;
            }else{
                returnedArray[A.length-i-1] = A[left]*A[left];
                left++;
            }
        }
        return returnedArray;
    }
}