package ArrayEasyMediumHard.Medium;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int result = subArray(arr);
        System.out.println("The sum of the longest subarray is: " + result);

    }

    public static int subArray(int[] arr) {
        int sum = 0;
        for (int start = 0; start < arr.length; start++) {
            for (int end = 0; end < arr.length; end++) {
                int curretnSum = 0;
                for (int i = start; i <=end; i++) {
                    curretnSum += arr[i];
                }
                if (sum < curretnSum) {
                    sum = curretnSum;
                }

            }
        }
        return sum;

    }
}
