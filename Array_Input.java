import java.util.Scanner;

public class Array_Input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        arr[0]=23;
        arr[1]=25;
        arr[2]=32;
        arr[3]=82;
        arr[4]=42;
        /*
        Internally its stores values as [23,25,32,82,42]
         */
        System.out.println (arr[3]);

        //input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println (arr[i]+" ");

        }

        for (int j : arr) { //for every element in the array, print the array
            System.out.println (j + " "); //here num represent element of the array

        }
//        System.out.println (arr[5]); //index out of bound error

    }
}
