package BinarySearchEasyMediunHard.Easy;

public class minRotatedArray {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2};
        int result = findMin(nums);
        System.out.println("The minimum element is: " + result);

    }

    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int ans = Integer.MAX_VALUE;

        while (start <= end) {
            int mid = (start + end) / 2;
            if(nums[start] <= nums[mid] && nums[mid] <= nums[end] && nums[start] <= nums[end]){
            return min(ans, nums[start]);
            }
            // check sorted half
            if (nums[start] <= nums[mid]) {
                ans = min(ans, nums[start]);
                start = mid + 1;
            } else {
                ans = min(ans, nums[mid]);
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int min(int a, int b) {
        if (a < b)
            return a;
        return b;
    }
}
