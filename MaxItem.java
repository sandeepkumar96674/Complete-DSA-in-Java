public class MaxItem {
    public static void main(String[] args) {
        int[] arr={1,32,34,345,453,343,433};
        System.out.println (max(arr));
    }
    //Assume that arr is not empty
    static int max(int[] arr){
        int maxVal=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
