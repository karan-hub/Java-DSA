package BinarySearchQuestion;

public class FindElementINInfiniteArray {

    public static void main(String[] args) {

        int[] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int k = 10;
        int result = InfiniteElement(arr, k);
        System.out.println("Element found at index: " + result);

    }

    static int InfiniteElement(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            end = start +( end *2);
            start = newStart;
            // return Search(arr, target, start, end);
        }

        // Search(arr, target, start, end);

        return Search(arr, target, start, end);

    }

    static int Search(int[] arr, int target, int start, int end) {

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;

    }
}