class LeetCode_42 {
    public int trap(int[] heights) {
        int water = 0;
        int startMax = 0, endMax = 0;
        int start = 0, end = heights.length - 1;

        while(start < end){
            if(heights[start] < heights[end]){
                if(heights[start] > startMax)
                    startMax = heights[start];
                else{
                    water += startMax - heights[start];
                    start++;
                }
            }
            else{
                if(heights[end] > endMax)
                    endMax = heights[end];
                else{
                    water += endMax - heights[end];
                    end--;
                }
            }
        }

        return water;
    }
}