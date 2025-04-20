package Problem_Of_The_Day.src;


import java.util.Arrays;

//https://leetcode.com/problems/count-the-number-of-fair-pairs/description/?envType=daily-question&envId=2025-04-19
public class FairPairs {
    public static void main(String[] args) {
      int []  nums = new int[] {0,1,7,4,4,5} ;
      int lower = 3, upper = 6 ;
        System.out.println(countFairPairs(nums , lower ,upper) );
//        int[] nums =  {1, 3, 3, 5, 7, 8, 9};
//        int lb = lowerBound(nums, 0, nums.length - 1, 5);  // returns 3
//        int ub = upperBound(nums, 0, nums.length - 1, 5);  // returns 4

    }

    public static long countFairPairsBrut(int[] nums, int lower, int upper) {
        long fairPairCount = 0;
        int n = nums.length;
        for (int first = 0; first < n; first++) {
            for (int second = first + 1; second < n; second++) {
                int pairSum = nums[first] + nums[second];
                if (pairSum >= lower && pairSum <= upper) {
                    fairPairCount++;
                }
            }
        }
        return fairPairCount;
    }



    public static long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count = 0;

        for (int i = 0; i < nums.length; i++) {
            int minTarget = lower - nums[i];
            int maxTarget = upper - nums[i];

            int start = lowerBound(nums, i + 1, nums.length - 1, minTarget);
            int end = upperBound(nums, i + 1, nums.length - 1, maxTarget);

            count += (end - start);
        }

        return count;
    }

    // Finds first index where nums[index] >= target
    public static int lowerBound(int[] nums, int start, int end, int target) {
        int low = start, high = end;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }


    // Finds first index where nums[index] > target
    public static int upperBound(int[] nums, int start, int end, int target) {
        int low = start, high = end;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }


}
