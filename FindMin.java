public class FindMin {
    public static void main(String[] args) {
        int[] arr={3,34,54,43,-12,19,16};
        System.out.println (min(arr));
    }
    static int min(int[] arr){
        //assume that the length !=0
        int ans=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<ans){
                ans=arr[i];
            }

        }return ans;
    }
}
