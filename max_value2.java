import java.util.Scanner;

import java.util.*;
public class max_value2 {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        int a =in.nextInt ();
        int b =in.nextInt ();
        int c =in.nextInt ();

        /*
        find the largest number of the 3 numbers
         */
        int max=a;
        if (b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println ("maximum number is " +max);
    }
}
