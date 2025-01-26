package ArrayEasyMediumHard.Medium;

 

public class NextPermutation {

    public static void main(String[] args) {
        int[] nums = { 1, 3, 2 };
        int[] result = nextPermutationArray(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] nextPermutationArray(int[] nums) {
        int pivotElement = -1;
        // find Pivot
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivotElement = i;
            }

        }

        if (pivotElement == -1) {
            reverse(nums, 0, nums.length - 1);
            return nums;
        }

        // Step 2: Find the smallest element on the right of the pivot that is larger

        for (int i = nums.length - 1; i > pivotElement; i--) {
            if (nums[i] > nums[pivotElement]) {
                swap(nums, i, pivotElement);
                break;
            }
        }

        // 3rd reverce
        reverse(nums, pivotElement + 1, nums.length - 1);
//  System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

}
