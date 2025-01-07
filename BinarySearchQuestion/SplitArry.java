package BinarySearchQuestion;

public class SplitArry {
    public static void main(String[] args) {
        int[] nums = { 7, 2, 5, 10, 8 };
        int k = 2;
        int result = splitArray(nums, k);
        System.out.println("The result is: " + result);

    }

    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i : nums) {
            start = Math.max(start, i);
            end += i;
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pices = 1;

            for (int i : nums) {
                if (sum + i > mid) {
                    sum = i;
                    pices ++;

                }else{
                    sum +=i;
                }

            }
            if (pices > k ) {
                start = mid + 1;
            }else{
                end = mid;
            }

        }

        return end;

    }

}
