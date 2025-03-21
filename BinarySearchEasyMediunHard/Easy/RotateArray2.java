package BinarySearchEasyMediunHard.Easy;

public class RotateArray2 {
    static int Search(int arr[], int target, int length) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[start] == arr[mid] && arr[end] == arr[end]) {
                start = start + 1;
                end = end - 1;
                continue;
            }
            // left
            if (arr[start] <= arr[mid]) {
                if (arr[start] <= target && target <= arr[mid]) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            } else {
                // right
                if (arr[mid] <= target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 3, 1, 3, 3, 3, 3 };
        int target = 1;
        System.out.println(Search(arr, target, arr.length));

    }
}
