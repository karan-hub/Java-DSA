package ArrayEasyMediumHard.Hard;

import java.util.Arrays;

public class repeatingMissing {
    public static void main(String[] args) {
        int[] nums = new int[] { 3, 1, 2, 5, 3 };
        System.out.println(Arrays.toString(brutforce(nums)));
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
}
