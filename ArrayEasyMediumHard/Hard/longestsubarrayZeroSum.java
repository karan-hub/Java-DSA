package ArrayEasyMediumHard.Hard;

import java.util.HashMap;

public class longestsubarrayZeroSum {
    public static void main(String[] args) {
        int a[] = { 9, -3, 3, -1, 6, -5 };
        System.out.println(optimalApproach(a));

    }

    public static int optimalApproach(int[] nums) {
        // HashMap to store the prefix sum and its first occurrence index
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0; // Variable to store the cumulative sum
        int maxLength = 0; // Variable to track the maximum subarray length

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; // Add the current element to the sum

            // If sum becomes 0, update maxLength (subarray from start to i)
            if (sum == 0) {
                maxLength = i + 1;
            }

            // If the sum was seen before, it means the subarray between
            // the previous index and current index has sum = 0
            if (map.get(sum) != null) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                // Store the sum with its first occurrence index
                map.put(sum, i);
            }
        }

        return maxLength;
    }


    
}
