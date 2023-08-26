import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int num = in.nextInt ();
        int ans=0;
        while  (num>0){
            int res=num%10;
            num/=10;
            ans=ans*10+res;

        }
        System.out.println (ans);
    }
}
