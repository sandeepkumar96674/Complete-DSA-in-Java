public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        {
            a=30; // we can modify the value of the reference variable but not initialize again.
            System.out.println (a);

        }
        System.out.println (a);
    }
}
