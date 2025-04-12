package RecursionBasic;

import java.util.Arrays;

public class ReverceArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse_this(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        // print reversed array

    }
     static void reverse_this(int[] arr, int form, int to){
        if (form >= to) return;
        int temp = arr[form];
        arr[form] = arr[to];
        arr[to]=temp;

        reverse_this(arr , form +1,  to -1);
     }
}
