import java.util.Scanner;

import java.util.*;
public class char_case {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        char ch = in.next ().trim ().charAt (0); //trim for remove the whitespace from the input.
        if (ch >= 'a' && ch <= 'z') {
            System.out.println ("The case of charcater is lower");
        } else {
            System.out.println ("The case of charcater is upper");
        }

    }
}
