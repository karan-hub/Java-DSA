package BinarySearchQuestion;

public class Mountain {
    public static void main(String[] args) {
        int[] mountainArray = { 1, 3, 5, 7, 6, 4, 2 };
        int peakIndex = peakIndexInMountainArray(mountainArray);
        System.out.println("Peak index in mountain array: " + peakIndex);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else { 
                start = mid + 1;
            }
        }

        return arr[start];

    }
}
