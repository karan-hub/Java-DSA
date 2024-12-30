import java.util.*;

public class MultiDaimentionArray {
    /*
     * 1 2 3
     * 4 5 6
     * 7 8 9
     */

    // int [][] multi = {

    // {1,2,3},
    // {4,5,6},
    // {7,8,9},
    // };

    public static void main(String[] args) {
        // int length =0;
        int[][] arr = new int[3][3];
        // System.out.println(Arrays.toString(arr));
        // System.out.println(arr.length);
        try (Scanner input = new Scanner(System.in)) {

            for (int row = 0; row < arr.length; row++) {
                System.out.printf("row [%d] \n", row);
                // System.out.printf("give lenght for roe [%d] \n", row);

                for (int col = 0; col < arr[row].length; col++) {
                    arr[row][col] = input.nextInt();
                    // System.out.println(Arrays.toString(arr[row]));
                }
                System.out.println(Arrays.toString(arr[row]));

            } 
        }
        System.out.println(" Input Array is ");
        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));

        }
    }

}
