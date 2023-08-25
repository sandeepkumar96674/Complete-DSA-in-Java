import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //Loop: for repetative task we use loops
        /* 1. For loop:
         Syntax: for(initialization,condition,increment/decrement){
            //body
         }
         */

        for (int num = 1; num <= 5; num += 1) {
            System.out.println (num
            );

            // print number
            Scanner in = new Scanner (System.in);
            int n = in.nextInt ();
            for (int number=1; number <= n; number++) {
                System.out.println (number + " ");
                System.out.println ("Hello World");
            }
        }
    }
}

