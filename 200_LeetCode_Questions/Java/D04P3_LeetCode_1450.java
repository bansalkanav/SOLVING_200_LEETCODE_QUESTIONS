// Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Students Doing Homework at a Given Time.
// Memory Usage: 37.9 MB, less than 42.26% of Java online submissions for Number of Students Doing Homework at a Given Time.

class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int students = 0;
        for(int i = 0; i < startTime.length; i++){
            if(startTime[i] <= queryTime && endTime[i] >= queryTime){
                students++;
            }
        }
        return students;
    }
}
