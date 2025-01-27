package ArrayEasyMediumHard.Medium;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        int[] testArray1 = { 3, 8, 5, 7, 6 };
        int result1 = batterApproch(testArray1);
        System.out.println("Test 1 - Expected: 4, Actual: " + result1);

        int[] testArray2 = { 1, 2, 0, 1 };
        int result2 = batterApproch(testArray2);
        System.out.println("Test 2 - Expected: 3, Actual: " + result2);

        int[] testArray3 = { 100, 4, 200, 1, 3, 2 };
        int result3 = batterApproch(testArray3);
        System.out.println("Test 3 - Expected: 4, Actual: " + result3);
    }

    public static int Sequence(int[] nums) {
        int longest = Integer.MIN_VALUE;
        for (int index = 0; index < nums.length; index++) {
            int n = nums[index];
            int count = 1;

            while (linerStrSearch(nums, n + 1) == true) {
                n = n + 1;
                count++;
            }
            longest = Math.max(count, longest);
        }
        return longest;

    }

    public static boolean linerStrSearch(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static int batterApproch(int[] nums) {

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int lastIndex = Integer.MIN_VALUE, count = 0, longest = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - 1 == lastIndex) {
                count++;
                lastIndex = nums[i];
            } else if (nums[i] != lastIndex) {
                count = 1;
                lastIndex = nums[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

}
