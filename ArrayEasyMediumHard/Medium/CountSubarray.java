
package ArrayEasyMediumHard.Medium;

public class CountSubarray {

    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 4 };
        int k = 6;

        System.out.println(batterSolutation(nums, k));

    }

    public static int brutForce(int[] nums, int n) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + nums[k];
                }

                if (sum == n) {
                    count++;
                }
            }
        }

        return count;

    }

    public static int batterSolutation(int[] nums, int n) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == n) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}