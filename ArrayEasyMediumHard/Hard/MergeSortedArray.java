package ArrayEasyMediumHard.Hard;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

        int[] arr1 = { 1, 4, 8, 10 };
        int[] arr2 = { 2, 3, 9 };
        int n = 4, m = 3;
        brutForce(arr1, m, arr2, n);

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
                nums2[i-n] = ans[i];
            }
        }

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }

    public static void optimalOne(int[] nums1, int m, int[] nums2, int n){
        
    }
}
