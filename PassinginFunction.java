import java.util.Arrays;

public class PassinginFunction {
    public static void main(String[] args) {
        int[] nums={3,6,4,2,7};
        System.out.println (Arrays.toString (nums));
        change (nums);
        System.out.println (Arrays.toString (nums));
    }
    static void change(int[] arr){
       arr[0]=45;//modifying the element in the array
    }
}
