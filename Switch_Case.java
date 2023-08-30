import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String fruit=in.next();
        switch (fruit) {
            case "Mango" -> System.out.println ("King of Fruits");
            case "Apple" -> System.out.println ("A red sweet Fruit");
            case "Orange" -> System.out.println ("Round Fruit");
            case "Grapes" -> System.out.println ("Small Fruit");
            default -> System.out.println ("Please enter a valid fruit");
        }

    }
}

