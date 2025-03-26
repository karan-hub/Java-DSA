package Sort.SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 6, 2 };
        bubbleSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    public static void bubbleSort(int arr[]) {
        // code here

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    private static void swap(int[] arr, int maxIndex, int last) {
        int temp = arr[last];
        arr[last] = arr[maxIndex];
        arr[maxIndex] = temp;

    }

    static int getMaxIndex(int[] arr, int i, int last) {
        int maxIndex = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[maxIndex] > arr[j])
                maxIndex = j;
        }
        return maxIndex;

    }

}
