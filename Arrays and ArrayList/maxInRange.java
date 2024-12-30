public class maxInRange {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println(maxIn(arr, 1, 3));

    }

    static int maxIn(int[] arr, int startIndex, int EndIndex) {
        int max = arr[startIndex];
        for (int k = startIndex; k <= EndIndex; k++) {
            if (arr[k] > max) {
                max = arr[k];
            }

        }

        return max;

    }
}