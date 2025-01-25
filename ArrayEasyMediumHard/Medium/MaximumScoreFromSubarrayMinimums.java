package ArrayEasyMediumHard.Medium;
 

public class MaximumScoreFromSubarrayMinimums {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 1, 5, 6 };
        int x = minimumSubArray(nums);
        System.out.println(x);

    }

    public static int[] smallandsecsmall(int nums[], int Start, int End) {
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        for (int i = Start; i <= End; i++) {
            int current = nums[i];
            if (current < small) {
                secondSmall = small; // big , 4 , 3
                small = current; // 4 , 3 , 1
            }
            if (current > small && current < secondSmall) {
                secondSmall = current;
            }

        }
        return new int[] { small, secondSmall };
    }

    public static int minimumSubArray(int[] nums) {

        int currentMax = 0;

        for (int start = 0; start < nums.length; start++) {
            int small = Integer.MAX_VALUE;
            int secondSmall = Integer.MAX_VALUE;

            for (int end = start; end < nums.length; end++) {
                int current = nums[end];

                if (current < small) {
                    secondSmall = small; // big , 4 , 3
                    small = current; // 4 , 3 , 1
                }
                if (current > small && current < secondSmall) {
                    secondSmall = current;
                }

                // int result[] = smallandsecsmall(nums, start, end);
                // int max = result[0] + result[1];
                int max = small + secondSmall;
                if (currentMax < max) {
                    currentMax = max;
                }
            }
        }
        return currentMax;
    }

}
