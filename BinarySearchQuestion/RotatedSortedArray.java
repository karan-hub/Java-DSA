package BinarySearchQuestion;

public class RotatedSortedArray {
    public static void main(String[] args) {

        int[] nums = { 3,1 };

        System.out.println(search(nums, 3));

    }

    static int search(int[] nums, int target) {

        int pivote = searchPivot(nums);

        if (pivote == -1) {
            return BinarySearch(nums, target, 0, nums.length - 1);
        }

        if (nums[pivote] == target) {
            return pivote;
        }

        if (target >= nums[0]) {
            return BinarySearch(nums, target, 0, pivote - 1);
        }

        return BinarySearch(nums, target, pivote + 1, nums.length - 1);
    }

    public static int searchPivot(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

            return -1;
        }

    static int BinarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
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
