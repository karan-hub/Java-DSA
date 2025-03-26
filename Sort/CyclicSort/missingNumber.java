package Sort.CyclicSort;

public class missingNumber {

    public static void main(String[] args) {
        int[] arr = { 3, 0,0,2, 1 };
        int missing = sort(arr, arr.length);
        System.out.println("The missing number is: " + missing);

    }

    static int sort(int[] arr, int length) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int correctIndex = arr[i];
            if (arr[i] != n && arr[i] != arr[correctIndex])
                swap(arr, i, correctIndex);
            else
                i++;
        }
        for (int j = 0; j < arr.length; j++)
            if (arr[j] != j)
                return j;

        return n;

    }

    private static void swap(int[] arr, int maxIndex, int last) {
        int temp = arr[last];
        arr[last] = arr[maxIndex];
        arr[maxIndex] = temp;

    }

}
