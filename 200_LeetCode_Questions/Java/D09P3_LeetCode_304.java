class Main {

  public static int[][] matrix = { 
      { 3, 0, 1, 4, 2 }, 
      { 5, 6, 3, 2, 1 }, 
      { 1, 2, 0, 1, 5 }, 
      { 4, 1, 0, 1, 7 },
      { 1, 0, 3, 0, 5 } 
  };

  public static void main(String args[]) {
    System.out.println(sumRegion(2, 1, 3, 4));
  }

  public static int sumRegion(int row1, int col1, int row2, int col2) {
    if (row2 < row1 || col2 < col1) {
      throw new ArithmeticException("Input row or col Err"); 
    }
    int sum = 0;
    for (int i = col1; i <= col2; i++) {
      for (int j = row1; j <= row2; j++) {
        sum += matrix[j][i];
      }
    }
    return sum;
  }
}