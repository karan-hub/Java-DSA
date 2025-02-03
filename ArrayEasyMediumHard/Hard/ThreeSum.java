package ArrayEasyMediumHard.Hard;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {

        int[] arr = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> set = optimalApproach(arr);
        for (List<Integer> list : set) {
            System.out.println(Arrays.toString(list.toArray()));
        }
         
    }

    // O(n)^3
    public static Set<List<Integer>> brutForce(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    List<Integer> list = new ArrayList<>();
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        if (!set.contains(list)) {
                            set.add(list);
                        }

                    }
                }
            }
        }
        return set;
    }

    // O(n)^2

    public static List<List<Integer>> findTriplets(int[] nums) {
        // Set to store unique triplets (avoiding duplicates)
        Set<List<Integer>> uniqueTriplets = new HashSet<>();

        // Outer loop to pick one number at a time
        for (int i = 0; i < nums.length; i++) {
            // HashSet to store numbers we have seen in this iteration
            Set<Integer> seenNumbers = new HashSet<>();
            // Target sum for the remaining two numbers
            int targetSum = -nums[i];

            // Inner loop to find two numbers that sum up to targetSum
            for (int j = i + 1; j < nums.length; j++) {
                int thirdNumber = targetSum - nums[j]; // The number needed to complete the triplet

                // If thirdNumber is already in seenNumbers, we have found a valid triplet
                if (!seenNumbers.contains(thirdNumber)) {
                    // Create a triplet
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], thirdNumber);
                    triplet.sort(null); // Sort to maintain order and avoid duplicate variations
                    uniqueTriplets.add(triplet); // Add to the set
                }

                // Add the current number to seenNumbers for future checks
                seenNumbers.add(nums[j]);
            }
        }

        // Convert the set to a list and return the result
        return new ArrayList<>(uniqueTriplets);
    }

    // TC => O(NlogN)+O(N^2) = O(N^2)
    // SC => O(N) (for storing output triplets)
    public static List<List<Integer>> optimalApproach(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums); // Sorting to use the two-pointer technique

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue; // Skip duplicate `i` values

            int j = i + 1, k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                    // Skip duplicate values for `j`
                    while (j < k && nums[j] == nums[j - 1])
                        j++;

                    // Skip duplicate values for `k`
                    while (j < k && nums[k] == nums[k + 1])
                        k--;
                }
            }
        }
        return list;
    }
}
