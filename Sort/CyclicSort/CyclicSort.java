package Sort.CyclicSort;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 9, 10,  7, 3, 8, 4, 2, 1, 5, 6 };

        sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            // if (correctIndex <= 0) correctIndex =0;
            if (arr[i] != arr[correctIndex])
                swap(arr, i, correctIndex);
            else
                i++;
        }
    }

    private static void swap(int[] arr, int maxIndex, int last) {
        int temp = arr[last];
        arr[last] = arr[maxIndex];
        arr[maxIndex] = temp;

    }
}
