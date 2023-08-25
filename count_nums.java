public class count_nums {
    public static void main(String[] args) {
        int n =154684434;
        int count=0;
        while(n>0){
            int rem=n%10;
            if (rem==3){ //try to find out the occurance of 3s.
                count++;
            }
            n=n/10;
        }
        System.out.println (count);
    }
}
