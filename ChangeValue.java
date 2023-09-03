import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr={1,2,43,45,234};
        change(arr);
        System.out.println (Arrays.toString (arr));
    }

    static void change(int[] nums) {
        nums[0]=99; //if you make change to the object via ref variable, same object will be change
    }
}
