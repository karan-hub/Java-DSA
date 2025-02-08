package ArrayEasyMediumHard.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class repeatingMissing {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 2 };
        // System.out.println(Arrays.toString(optimalApproch(nums)));

        System.out.println(findTwoElement(nums));
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

    // TC O(2n) SC O(n)
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

    public static int[] optimalApproch(int[] nums) {
        long n = (long) nums.length;
        // S - Sn ----> X-Y
        long Sn = (n * (n + 1)) / 2;
        // S^2 - Sn^2 ----> X^2 - Y^2
        long S2n = (n * (n + 1) * (2 * n + 1)) / 6;
        long S = 0L;
        long S2 = 0L;
        for (int num : nums) {
            S += num;
            S2 += (num * num);
        }
        // X-Y =-4
        long val1 = S - Sn;
        // X^2 - Y^2
        long val2 = S2 - S2n;
        val2 = val2 / val1;

        int x = (int) (val1 + val2) / 2;
        int y = (int) (x - val1);

        return new int[] { x, y };
    }

    public static ArrayList<Integer> findTwoElement(int[] nums) {
        long n = (long) nums.length;
        // S - Sn ----> X-Y
        long Sn = (n * (n + 1)) / 2;
        // S^2 - Sn^2 ----> X^2 - Y^2
        long S2n = (n * (n + 1) * (2 * n + 1)) / 6;
        long S = 0L;
        long S2 = 0L;
        for (int num : nums) {
            S += num;
            S2 += (num * num);
        }
        // X-Y =-4
        long val1 = S - Sn;
        // X^2 - Y^2
        long val2 = S2 - S2n;
        val2 = val2 / val1;

        int x = (int) (val1 + val2) / 2;
        int y = (int) (x - val1);

        return new ArrayList<>(List.of(x, y));
    }
}
