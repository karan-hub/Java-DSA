package ArrayEasyMediumHard.Hard;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 0, 0, 0 };
        int[] arr2 = { 2, 5, 6 };
        int n = 3, m = 3;
        optimalTwo(arr1, m, arr2, n);

    }

    public static void brutForce(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[nums1.length + nums2.length];
        int index = 0;
        int right = 0;
        int left = 0;

        while (right < m && left < n) {

            if (nums1[left] <= nums2[right]) {
                ans[index] = nums1[left];
                index++;
                left++;
            } else {
                ans[index] = nums2[right];
                right++;
                index++;
            }

        }

        while (left < n) {
            ans[index++] = nums1[left++];
        }
        while (right < m) {
            ans[index++] = nums1[right++];
        }

        System.out.println(Arrays.toString(ans));

        for (int i = 0; i < ans.length; i++) {
            if (i < n) {
                nums1[i] = ans[i];
            } else {
                nums2[i - n] = ans[i];
            }
        }

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }

    public static void optimalOne(int[] nums1, int m, int[] nums2, int n) {
        int left = n - 1;
        int right = 0;

        while (left >= 0 && right < m) {
            if (nums1[left] > nums2[right]) {
                swap(nums1, left, nums2, right);
                left--;
                right++;
            } else {
                break;
            }
        }

        Sort(nums1);
        Sort(nums2);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

    }

    private static void swap(int[] nums1, int left, int[] nums2, int right) {
        int temp = nums1[left];
        nums1[left] = nums2[right];
        nums2[right] = temp;
    }

    private static void Sort(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] > nums[j]) {
                swap(i, nums, j);
            }
            i++;
            j--;
        }

    }

    private static void swap(int i, int[] nums, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void optimalTwo(int[] nums1, int m, int[] nums2, int n) {
        int len = m + n;
        int gap = (len / 2) + (len % 2); // Ceiling of len/2

        while (gap > 0) {
            int left = 0;
            int right = left + gap;

            while (right < len) {
                if (left < m && right < m) {
                    // Swap within nums1
                    swapIf(nums1, left, nums1, right);
                } else if (left < m && right >= m) {
                    // Swap between nums1 and nums2
                    swapIf(nums1, left, nums2, right - m);
                } else {
                    // Swap within nums2
                    swapIf(nums2, left - m, nums2, right - m);
                }
                left++;
                right++;
            }

            if (gap == 1) {
                break;
            }
            gap = (gap / 2) + (gap % 2); // Reduce gap
        }

        // Copy sorted nums2 into nums1
        System.arraycopy(nums2, 0, nums1, m, n);
        System.out.println(Arrays.toString(nums1));
    }

    private static void swapIf(int[] nums1, int i, int[] nums2, int j) {
        if (nums1[i] > nums2[j]) {
            int temp = nums1[i];
            nums1[i] = nums2[j];
            nums2[j] = temp;
        }
    }

}
