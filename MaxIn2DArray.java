public class MaxIn2DArray {
    public static void main(String[] args) {
        int arr[][]={
                {12,34,17},
                {39,45,16,23,42},
                {24,63,13,36,6}
        };
        System.out.println (max (arr));
    }
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int col = 0; col < ints.length; col++) {
                if (ints[col] > max) {
                    max = ints[col];
                }


            }

        }
        return max;
    }
}
