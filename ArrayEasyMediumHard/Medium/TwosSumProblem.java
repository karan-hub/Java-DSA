package ArrayEasyMediumHard.Medium;

import java.util.Arrays;

public class TwosSumProblem {

    public static void main(String[] args) {
        int[] nums = { 3, 3, 12, 2 };
        int targetSum = 6;

        saveIndex(nums);

        int[] result2 = usingTwoPointers(nums, targetSum);
        System.out.println("Indices from usingTwoPointers: " + result2[0] + ", " + result2[1]);

    }

    public static int[] towSum1(int[] nums, int targetSum) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                // System.out.println(nums[i] + " + " + nums[j] + " = " + test);

                if (nums[i] + nums[j] == targetSum) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { -1, -1 };

    }

    public static int[] usingTwoPointers(int[] nums, int targetSum) {

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int Start = 0;
        int end = nums.length - 1;

        while (Start < end) {
            int sum = nums[Start] + nums[end];

            if (sum == targetSum) {
                return new int[] { Start, end };
            } else if (sum > targetSum) {
                end--;
            } else {
                Start++;
            }
        }
        return new int[] { -1, -1 };

    }

    public static void saveIndex(int[] nums) {
        int len = nums.length;
        int[][] saveIndexandValue = new int[len][2];

         for (int i = 0; i < nums.length; i++) {
            saveIndexandValue[i][0]=nums[i];
            saveIndexandValue[i][1]=i;
         }
         Arrays.sort(saveIndexandValue, (a, b) -> Integer.compare(a[1], b[1]));
         System.out.println(Arrays.deepToString(saveIndexandValue) +" jvgv ");


    }

}
