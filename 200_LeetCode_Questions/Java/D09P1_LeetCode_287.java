class Main { 
    public static int findDuplicate(int[] inputs) {
        if (inputs == null || inputs.length < 2) {
            return 0;
        }
        int scope_start = 1;
        int scope_end = inputs.length - 1;
        while (scope_start < scope_end) {
            int mid = (scope_start + scope_end) / 2, count = 0;
            for (int num : inputs) {
                if (num <= mid) {
                    count++;
                }
            }
            if (count <= mid) {
                scope_start = mid + 1;
            } else{
                scope_end = mid;
            }
        }
        return scope_start;
    }


    public static void main(String[] args){
      int[] inputs = {1,3,4,2,1,8,6,7,9,5};
      System.out.println("The Duplicate number is : "+findDuplicate(inputs));
    }
}