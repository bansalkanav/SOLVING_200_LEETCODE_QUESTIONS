import java.util.Scanner;
public class D10P3_LeetCode_69{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Input a non-negative number : ");
        int num = s.nextInt();

        int squrt = (int) Math.sqrt(num);

        System.out.println("The square root of "+num+" = "+squrt);
    }
}