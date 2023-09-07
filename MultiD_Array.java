import java.util.Arrays;
import java.util.Scanner;

public class MultiD_Array {
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
    /*
        1 2 3
        4 5 6
        7 8 9
     */
       int[][] arr=new int[3][2];
       //Input
        for (int row = 0; row <arr.length ; row++) {
            //for each column in every row
            for (int col = 0; col <arr[row].length ; col++) {
                arr[row][col]=in.nextInt();

            }

        }
        //Output First method
//        for (int row = 0; row <arr.length ; row++) {
//            //for each column in every row
//            for (int col = 0; col <arr[row].length ; col++) {
//                System.out.print (arr[row][col]+ " ");
//
//            }
//            System.out.println ();
//
//        }
        // Second method to print
//        for (int row = 0; row <arr.length ; row++) {
//            System.out.println (Arrays.toString (arr[row]));
//        }
        //Third Method
        for (int[] a:arr){
            System.out.println (Arrays.toString (a));
        }
    }
}
