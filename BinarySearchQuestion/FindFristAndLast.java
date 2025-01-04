package BinarySearchQuestion;

public class FindFristAndLast {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println("First and Last positions: " + result[0] + ", " + result[1]);
    }

    static int[] searchRange(int[] arr, int target) {
        int[] ans = { -1, -1 };

        int start = Search(arr, target, true);
        int end = Search(arr, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;

    }

    static int Search(int[] arr, int target, boolean findStartIndex) {

        int ans = -1;

        int Start = 0;
        int end = arr.length - 1;

        while (Start <= end) {
            int mid = Start + (end - Start) / 2;

            if (target > arr[mid]) {
                Start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;

            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    Start = mid + 1;
                }

            }

        }

        return ans;

    }
}
