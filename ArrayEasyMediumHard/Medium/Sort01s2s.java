package ArrayEasyMediumHard.Medium;

public class Sort01s2s {
    public static void main(String[] args) {
        int[] nums = {2, 0, 1, 2, 0, 1, 2, 0, 1};
        int[] sortedNums = BatterApproch(nums);
        for (int num : sortedNums) {
            System.out.print(num + " ");
        }
    }

    public static int[] swapThreeNumbers(int a, int b, int c) {

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        return new int[] { a, b, c };
    }

    public static int[] BatterApproch(int[] nums) {

        int i = 0;
        int zero = 0;
        int one = 0;
        int two = 0;
        while (i < nums.length) {
            if (nums[i] == 0) {
                zero++;
            }
            if (nums[i] == 1) {
                one++;
            }
            if (nums[i] == 2) {
                two++;
            }
            i++;
        }

        for (int j = 0; j < zero; j++) {
            nums[j]=0;

        }
        for (int j = zero; j < zero + one; j++) {
            nums[j]=1;

        }
        for (int j = zero + one; j < nums.length; j++) {
            nums[j]=2;

        }

        return nums;

    }
}
