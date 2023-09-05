import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,234,45,230,455,35,324,650);
    }

    static void fun(int ...v) {
        System.out.println (Arrays.toString (v));
    }
}
