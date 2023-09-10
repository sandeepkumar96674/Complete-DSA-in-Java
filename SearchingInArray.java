public class SearchingInArray {
    public static void main(String[] args) {
     int[] nums={11,34,32,45,12,-43,19,18,15,35};
     int target=18;
     boolean answer=linearsearch(nums,target); //the index value will be return from the function and it will be store in answer variable
        System.out.println (answer);
    }
    /*
    //Search in the array: return the index if item dound
    //otherwise if the item not found return -1
     */
    static boolean linearsearch(int[] arr,int target){
        if(arr.length==0){
            return false;
        }
        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check for the element index if it is=target
            int element=arr[index];
            if(element==target){
                return true;//It will return the index of the target element, you can return the target element also by return the element.
            }

        }
        //this line will execute if none of the return statement above have executed
        //hence the target not found
        return false;
    }
}
