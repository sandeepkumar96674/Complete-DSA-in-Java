public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-13,-5,0,1,2,3,4,14,15,171};
        int target=0;
        int ans=binarySearch (arr,target);
        System.out.println (ans);
    }
    //return the index
    //return -1 if the target element not found
    static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
    // For ascending order array
        while(start<=end){
            //find the middle element
//            int mid=(start+end)/2; // might be exceed the int range in java
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else{
                //answer found
                System.out.print("The target element is in the index :");
                return mid;
            }
        }
        System.out.print ("Element doesn't exist : ");
        return -1;
    }
}
