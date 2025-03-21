package BinarySearchEasyMediunHard.Easy;

public class RotatedArray1 {
    public static void main(String[] args) {
        int[] arr = new int[] { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(Search(target, arr, arr.length));

    }

    static int Search(int target, int[] arr, int length) {
        int start = 0;
        int end = arr.length - 1;
 
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;

            // check sorted Half
            // left
            if (arr[start] <= arr[mid]) {
                if (arr[start] <= target && target <= arr[mid]) {
                    // new start
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] <= target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return -1;

    }

}
