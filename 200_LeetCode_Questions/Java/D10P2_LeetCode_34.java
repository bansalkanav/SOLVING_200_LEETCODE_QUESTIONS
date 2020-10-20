import java.util.Scanner;

public class D10P2_LeetCode_34 {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);

        int i,j,target,elements;
        int arrpos [] = new int [2];

        System.out.print("input the number of elements ");
        elements = s.nextInt();

        int grid [] = new int [elements];
        System.out.println("Input elements in array in ascending order");
        for (i=0; i<elements; i++){
            grid[i] = s.nextInt();
        }

        System.out.print("input the target value ");
        target = s.nextInt();

        for (i=0; i<elements; i++){
            if(grid[i] == target){
                arrpos[0] = i;
                break;
            }
            else
             arrpos[0] = -1;
        }

        for (j=i; j<elements; j++){
            if(grid[j] == target){
                arrpos[1] = j;
            }
            else
              arrpos[1] = -1;
        }

        System.out.println("First and last position is ["+arrpos[0]+","+arrpos[1]+"]");

    }

}