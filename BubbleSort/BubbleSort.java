package BubbleSort;

import java.lang.reflect.Array;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 4, 2 };
        bubbleSort(arr);

        System.out.println("Sorted array in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    public static void bubbleSort(int arr[]) {
        // code here
        boolean swapping;

        for (int i = 0; i < arr.length; i++) {
            swapping = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapping = true;
                    System.out.println(java.util.Arrays.toString(arr));
                }

            }
            if (!swapping)
                break;
        }
    }
}
