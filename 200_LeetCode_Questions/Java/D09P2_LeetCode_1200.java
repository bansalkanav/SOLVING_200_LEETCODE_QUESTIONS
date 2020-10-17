// Runtime: 14 ms, faster than 99.15% of Java online submissions for Minimum Absolute Difference.
// Memory Usage: 50.1 MB, less than 10.70% of Java online submissions for Minimum Absolute Difference.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        int min = arr[1]- arr[0];
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        add(res, arr[0], arr[1]);
        for (int i= 2; i < arr.length; i++){
            int diff = arr[i]- arr[i-1];
            if (diff <  min){
                min = diff;
                res = new ArrayList<List<Integer>>();
                add(res, arr[i-1], arr[i]);
            } else if (diff == min){
                add(res, arr[i-1], arr[i]);
            }
            //System.out.println("list= " + list);
        }
        return res;
    }
    private void add(List<List<Integer>> res, int e1, int e2){
        List<Integer> list = new ArrayList<Integer>();
        list.add(e1);
        list.add(e2);
        res.add(list);
    }
}