public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr={-13,-5,0,1,2,3,4,14,15,171}; //Ascending Order Array
        int[] arr={90,76,34,32,28,24,14,12,10,5,3,1}; // Descending Order Array
        int target=24;
        int ans=OrderAgnosticBS (arr,target);
        System.out.println (ans);
    }
    static int OrderAgnosticBS(int[] arr,int target){
        int s=0;
        int end= arr.length-1;

        //find whether the arrar is sorted in ascending or descending
        boolean isAsc;
        isAsc= arr[s] < arr[end];


        while(s<=end){
            //find the middle element
//            int mid=(start+end)/2; // might be exceed the int range in java
            int mid=s+(end-s)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                } else {
                    s=mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end=mid-1;
                } else{
                    s=mid+1;
                }
            }

        }
        System.out.print ("Element doesn't exist : ");
        return -1;
    }
}
