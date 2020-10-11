import java.util.*;
class Main {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        ArrayList<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(arr);
        int min = arr[1] - arr[0];
        for(int i = 2; i < arr.length; i++){
          min = (arr[i] - arr[i-1] < min) ? arr[i] - arr[i-1] : min;
        }
        for(int i = 1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==min){
                ArrayList<Integer> _tmp = new ArrayList<>();
                _tmp.add(arr[i-1]);
                _tmp.add(arr[i]);
                resultList.add(_tmp);
            }
        }
        return resultList;
    }

    public static void main(String args[]){
      int[] arr = {-40,-38,-42,-25,-157,-17,-21,-19, -2 , 0 , 5};
      List<List<Integer>> list = minimumAbsDifference(arr);
      System.out.println(list);
    }
}