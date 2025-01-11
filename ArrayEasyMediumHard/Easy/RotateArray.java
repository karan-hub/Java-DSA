package ArrayEasyMediumHard.Easy;

 
import java.util.Arrays;

 
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        Optimal(nums, k);

    }

    public static int[] BruteForce(int[] nums, int k) {
        int[] temp = new int[nums.length];
        int j = 0;

        for (int i = k; i < temp.length; i++) {
            temp[j] = nums[i];
            j++;
        }

        for (int i = 0; i < k; i++) {

            temp[j] = nums[i];
            j++;
        }
        System.out.println(Arrays.toString(temp));

        return temp;

    }

    public static int[] BruteForce2(int[] nums, int k) {

        while (k > 0) {

            int start = nums[nums.length - 1];

            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = start;
            k--;
            System.out.println(Arrays.toString(nums));

        }
        return nums;

    }

    public static void Optimal(int arr[], int k) {
        int len = arr.length;
        k %= len;

        reverce(arr, 0, len - 1);
        reverce(arr, 0, k - 1);
        reverce(arr, k, len - 1);
        System.out.println(Arrays.toString(arr));


    }

    public static void reverce(int arr[], int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];

            arr[end] = temp;
            start++;
            end--;

        }
    }
}
