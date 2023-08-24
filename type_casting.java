import java.util.*;
public class type_casting {
    public static void main(String[] args) {
        Scanner input =  new Scanner (System.in);

        //Type casting [Narrowing]
        int num = (int)(65.56f);
        System.out.println (num);

        // Automatic type promotion in expression
        int a =257;
        byte b = (byte)(a);

        System.out.println (b); //257 % 256 = 1

        byte h = 40;
        byte v= 50;
        byte c =100;
        int d = ( h *b)/c;
        System.out.println (d);


    }
}
