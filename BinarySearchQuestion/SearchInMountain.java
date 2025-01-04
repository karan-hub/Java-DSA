package BinarySearchQuestion;

public class SearchInMountain {
    public static void main(String[] args) {

        int[] mountainArr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int result = findInMountainArray(mountainArr, target);
        System.out.println("Target found at minimum index: " + result);

    }

    static int findInMountainArray(int[] arr, int target) {


        int peakIndex = peakIndexInMountainArray(arr);
        int fristcheck = OrderEgnosticSearch(arr, target , 0 , peakIndex);
        if (fristcheck != -1) {
            return fristcheck; 
        }
        return OrderEgnosticSearch(arr, target  , peakIndex +1 , arr.length-1);
    }

    static int Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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

    static int OrderEgnosticSearch(int[] arr, int target  , int start , int end) {
        

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1; // Not found
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

        return start;

    }
}
