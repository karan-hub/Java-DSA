package Linear_Search;

public class MinMax {

    public static void main(String[] args) {
        int[] arr = { 12, 2, 45, 67, 798, -2, 34, 76 };
        System.out.printf("Min value in array: %d\n", min(arr));
        System.out.printf("Max value in array: %d\n", max(arr));
    }

    static int min(int[] arr) {
        int minVal = arr[0];
        for (int i : arr) {
            if (i < minVal) {
                minVal = i;
            }
        }
        return minVal;
    }

    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i : arr) {
            if (i > maxVal) {
                maxVal = i;
            }
        }
        return maxVal;
    }
}
