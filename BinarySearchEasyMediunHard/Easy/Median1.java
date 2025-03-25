package BinarySearchEasyMediunHard.Easy;

public class Median1 {
    public static void main(String[] args) {

        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("The median is: " + median);
        // Verify the result with the correct answer
        if (median == 2.0) {
            System.out.println("The answer is correct.");
        } else {
            System.out.println("The answer is incorrect.");
        }
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length, length2 = nums2.length;
        int i = 0, j = 0;
        int finalLenght = length1 + length2;
        int firstMid = finalLenght / 2;
        int secondMid = firstMid - 1;
        int currentIndex = 0;
        int element1 = -1, element2 = -1;

        while (i < length1 && j < length2) {
            if (nums1[i] < nums2[j]) {

                if (firstMid == currentIndex)
                    element1 = nums1[i];
                if (secondMid == currentIndex)
                    element2 = nums1[i];
                currentIndex++;
                i++;

            } else {
                if (firstMid == currentIndex)
                    element1 = nums2[j];
                if (secondMid == currentIndex)
                    element2 = nums2[j];
                currentIndex++;
                j++;

            }

        }
        if (element1 != -1 && element2 != -1) {
            if (finalLenght % 2 == 1)
                return element1;
            else
                return (double) (element1 + element2) / 2;
        }

        return 0;

    }
}
