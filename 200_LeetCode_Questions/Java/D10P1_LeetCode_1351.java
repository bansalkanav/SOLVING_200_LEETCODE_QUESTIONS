import java.util.Scanner;

public class D10P1_LeetCode_1351 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int i,j,flag=0,row,col;
          
        System.out.print("input row ");
        row = s.nextInt();
        System.out.print("input column");
        col = s.nextInt();

        int grid [][] = new int [row][col];
        System.out.println("Input elements in array in descending order");
        for (i=0; i<row; i++){
            for (j=0; j<col; j++){
                grid [i][j] = s.nextInt();
            }
        }
       
        for (i=0; i<row; i++){
            for (j=0; j<col; j++){
                 if(grid[i][j]<0){
                     flag++;
                 }
            }
        }

        System.out.println("Negative Numbers in given sorted array are "+flag);
    }
}