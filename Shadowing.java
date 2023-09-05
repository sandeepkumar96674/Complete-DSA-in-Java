public class Shadowing {
    static int x=50; //This will be shadowed at the line 6
    public static void main(String[] args) {
        System.out.println (x); //50
        int x=10; // Scope will begin, when the value is initialised.
        //Lower level variable shadowed the higher level variable.
        System.out.println (x);//10
    }
}
