package ArrayEasyMediumHard.Easy;

public class SumOfSubArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5 };
        int targetSum = 5;
        int result = usingBrutforce2(arr, targetSum);
        System.out.println("Length of subarray with target sum: " + result);
    }
    // using two pointers

    public static int lenghtOfSubarray(int[] arr, int targetSum) {

        int Start = 0;
        int end = 0;
        int currenSum = 0;
        int maxLength = 0;
        while (end < arr.length) {
            currenSum += arr[end];

            while (currenSum > targetSum) {
                currenSum -= arr[Start];
                Start++;
            }

            if (currenSum == targetSum) {
                maxLength = Math.max(maxLength, end - Start + 1);
            }
            end++;
        }
        return maxLength;

    }

    public static int usingBrutforce1(int[] num, int targetSum) {
        int len = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int sum = SumSrartToEnd(num, i, j);
                if (targetSum == sum) {
                    len = Math.max(len, j - i + 1);
                } else if (sum > targetSum) {
                    break;
                }

            }
        }

        return len;
    }

    public static int SumSrartToEnd(int[] num, int startIndex, int endIndex) {

        if (startIndex > num.length && endIndex > num.length) {
            return -1;
        }

        int sum = 0;

        for (int i = startIndex; i <= endIndex; i++) {
            sum = sum + num[i];
        }
        return sum;
    }

    public static int usingBrutforce2(int[] nums, int targetSum) {
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (targetSum == sum) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }
}
