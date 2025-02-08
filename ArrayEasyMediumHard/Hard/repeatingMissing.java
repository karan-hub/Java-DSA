package ArrayEasyMediumHard.Hard;

import java.util.Arrays;

public class repeatingMissing {
    public static void main(String[] args) {
        int[] nums = new int[] { 3, 1, 2, 5, 3 };
        System.out.println(Arrays.toString(batterApproch(nums)));
    }

    public static int[] brutforce(int[] nums) {

        int missing = -1;
        int repiting = -1;
        // integer value is between ‘1’ and ‘N’.
        for (int i = 1; i <= nums.length; i++) {
            int count = 0;
            for (int num : nums) {
                if (num == i) {
                    count++;
                }
            }
            if (count == 2) {
                repiting = i;
            } else if (count == 0) {
                missing = i;
            }

            if (missing != -1 && repiting != -1) {
                return new int[] { missing, repiting };
            }

        }

        return new int[] { missing, repiting };
    }

    public static int[] batterApproch(int[] nums) {
        int[] hashArray = new int[nums.length + 1];
        for (int num : nums) {
            hashArray[num]++;
        }
        System.out.println(Arrays.toString(hashArray));

        int missing = -1, repiting = -1;

        for (int i = 1; i < hashArray.length; i++) {
            if (hashArray[i] == 0) {
                missing = i;
            } else if (hashArray[i] == 2) {
                repiting = i;
            }

        }

        return new int[] { missing, repiting };
    }
}
