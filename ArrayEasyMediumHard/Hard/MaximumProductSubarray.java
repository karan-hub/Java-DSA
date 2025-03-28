package ArrayEasyMediumHard.Hard;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, -3, 0, -4, 0, -5 };
        int answer = brutForce(arr);
        System.out.println("The maximum product subarray is: " + answer);

    }

    public static int maxProductSubArray(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        int prefixSum = 1;
        int sufixSum = 1;
        for (int i = 0; i < nums.length; i++) {
            if (prefixSum == 0) {
                prefixSum = 1;
            }
            if (sufixSum == 0) {
                sufixSum = 1;
            }
            prefixSum = prefixSum * nums[i];
            sufixSum = sufixSum * nums[n - i - 1];
            maxi = Math.max(maxi, Math.max(prefixSum, sufixSum));
        }

        return maxi;
    }

    public static int brutForce(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = i; j < nums.length; j++) {
                product = product * nums[j];

                maxi = Math.max(maxi, product);
            }
        }

        return maxi;

    }

}
