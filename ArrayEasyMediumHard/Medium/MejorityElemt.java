package ArrayEasyMediumHard.Medium;

import java.util.Arrays;

public class MejorityElemt {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 1, 1 };
        int result = BrutForce(nums);
        System.out.println("The majority element is: " + result);

    }

    public static int Mejority(int[] nums) {

        int frequency = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

            if (frequency == 0) {
                ans = nums[i];
            }
            if (ans == nums[i]) {
                frequency++;

            } else {
                frequency--;
            }
        }
        return ans;

    }

    public static int BatterApproch(int[] nums) {

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int ans = nums[0];
        int frequency = 0;
        for (int i : nums) {
            if (i == ans) {
                frequency++;
            } else {
                ans = i;
            }

            if (frequency == Math.floorDiv(nums.length, 2)) {
                return ans;
            }
        }

        return -1;

    }

    public static int BrutForce(int[] nums) {
        int frequency = 0;
        int asn = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
                if (count > frequency) {
                    asn = nums[i];
                }
            }
            count = 0;
        }
        return asn;
    }
}