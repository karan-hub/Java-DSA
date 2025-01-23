package ArrayEasyMediumHard.Medium;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int result = BatterApproch(arr);
        System.out.println("The sum of the longest subarray is: " + result);
        // // int y = usingwhileloop(arr);
        // System.out.println(y);

    }

    public static int subArray(int[] arr) {
        int sum = 0;
        for (int start = 0; start < arr.length; start++) {
            for (int end = 0; end < arr.length; end++) {
                int curretnSum = 0;
                for (int i = start; i <= end; i++) {
                    curretnSum += arr[i];
                }
                if (sum < curretnSum) {
                    sum = curretnSum;
                }

            }
        }
        return sum;

    }

    public static int OptimalApproch(int array[]) {

        int sum = 0;
        int curretnSum = Integer.MIN_VALUE;

        for (int num : array) {

            sum += num;
            if (sum > curretnSum) {
                curretnSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return curretnSum;
    }

    public static int BatterApproch(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            // curretnSum += arr[start];
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];

                max = Math.max(max, sum);
            }

        }
        return max;

    }

}
