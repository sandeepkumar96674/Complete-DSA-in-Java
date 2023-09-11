import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {23,1,12},
                {18,9,16,61},
                {78,62,37,43,68},
                {19,21}

        };
        int target=43;
        int[] ans=seacrh(arr,target); //Format of the return value{row,col}
        System.out.println(Arrays.toString (ans));
    }static int[] seacrh(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }

            }

        }
        return new int[]{-1,-1};
    }
}
