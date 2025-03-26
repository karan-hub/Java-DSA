package Sort.InsertionSort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2, 7};
        System.out.println("Before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        insertionSort(arr);

        System.out.println("After sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    public static void insertionSort(int arr[]) {
        // code here
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1])
                    swap(arr, j, j - 1);
                else
                    break;

            }

        }
    }

    private static void swap(int[] arr, int maxIndex, int last) {
        int temp = arr[last];
        arr[last] = arr[maxIndex];
        arr[maxIndex] = temp;

    }
}
