package ArrayEasyMediumHard.Medium;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        int[] testArray1 = { 3, 8, 5, 7, 6 };
        int result1 = Sequence(testArray1);
        System.out.println("Test 1 - Expected: 4, Actual: " + result1);

        int[] testArray2 = { 1, 2, 0, 1 };
        int result2 = Sequence(testArray2);
        System.out.println("Test 2 - Expected: 3, Actual: " + result2);

        int[] testArray3 = { 100, 4, 200, 1, 3, 2 };
        int result3 = Sequence(testArray3);
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
}
