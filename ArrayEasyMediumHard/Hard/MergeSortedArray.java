package ArrayEasyMediumHard.Hard;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

        int[] arr1 = { 1, 4, 8, 10 };
        int[] arr2 = { 2, 3, 9 };
        int n = 4, m = 3;
        optimalOne(arr1, m, arr2, n);

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

}
