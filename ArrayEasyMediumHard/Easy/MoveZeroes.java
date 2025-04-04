package ArrayEasyMediumHard.Easy;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        movetoEnd(arr);
    }

    public static void movetoEnd(int[] arr) {
        int start = 0;
        int end = 1;
        int len =arr.length;

        while (end < len) {
            if (arr[start] != 0) {
                start++;
                end++;
                
            } else if (arr[start] == 0 && arr[end] !=0)  {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }else{
                end++;
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
