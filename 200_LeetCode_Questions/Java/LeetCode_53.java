class LeetCode_53 {
    public int maxSubArray(int[] arr) {
        int maxSoFar = arr[0];
        int maxEndHere = arr[0];

        for(int i=1;i<arr.length;i++){
            maxEndHere = Math.max(maxEndHere + arr[i], arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndHere);
        }

        return maxSoFar;
    }
}