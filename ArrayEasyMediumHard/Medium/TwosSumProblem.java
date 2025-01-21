package ArrayEasyMediumHard.Medium;

public class TwosSumProblem {

    public static void main(String[] args) {
        int[] nums = { 21, 7, 12, 2 };
        int targetSum = 9;
        int[] result = towSum(nums, targetSum);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

    public static int[] towSum(int[] nums, int targetSum) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j < nums.length; j++) {
                int test = nums[i] + nums[j];
                // System.out.println(nums[i] + " + " + nums[j] + " = " + test);

               
                if (test == targetSum) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { -1, -1 };

    }

    

}
