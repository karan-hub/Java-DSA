
package ArrayEasyMediumHard.Medium;

public class PrintLongestSumSubArray {

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int[] result = SunPrint(nums);
        System.out.println("The start index of the longest subarray is: " + result[0]);
        System.out.println("The end index of the longest subarray is: " + result[1]);

        System.out.print("The longest subarray is: ");
        for (int i = result[0]; i <= result[1]; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static int[] SunPrint(int[] nums) {

        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        int startIndex = -1;
        int endIndex = -1;

        for (int i = 0; i < nums.length; i++) {

            if (sum == 0) {
                startIndex = i;
            }
            sum += nums[i];

            if (sum < 0) {
                sum = 0;
            }

            if (sum > maxi) {
                maxi = sum;
                endIndex = i;

            }
        }
        return new int[] { startIndex, endIndex };

    }
}
