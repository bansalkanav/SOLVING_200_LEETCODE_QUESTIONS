class alpha { 
      
   
    static int xorOfArray(int arr[], int n) 
    { 
        int xor_arr = 0; 
      
     for (int i = 0; i < n; i++) { 
      
          
            xor_arr = xor_arr ^ arr[i]; 
        }
        return xor_arr; 
    } 
      
   
    public static void main (String[] args) 
    { 
      
        int arr[] = { 3, 9, 12, 13, 15 }; 
        int n = arr.length; 
      
        // Function call 
        System.out.println(xorOfArray(arr, n)); 
  
    } 
} 
