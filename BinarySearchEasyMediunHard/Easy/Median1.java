package BinarySearchEasyMediunHard.Easy;

public class Median1 {
    public static void main(String[] args) {

        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3, 4 };
        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("The median is: " + median);
        // Verify the result with the correct answer

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length, length2 = nums2.length;
        int i = 0, j = 0;
        int finalLenght = length1 + length2;
        int firstMid = finalLenght / 2;
        int secondMid = firstMid - 1;
        int currentIndex = 0;
        int element1 = -1, element2 = -1;

        while (i < length1 - 1 && j < length2 - 1) {
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
        while (i < length1) {
            if (firstMid == currentIndex)
                element1 = nums1[i];
            if (secondMid == currentIndex)
                element2 = nums1[i];
            currentIndex++;
            i++;
        }
        while (j < element2) {
            if (firstMid == currentIndex)
                element1 = nums2[j];
            if (secondMid == currentIndex)
                element2 = nums2[j];
            currentIndex++;
            j++;
        }

        if (finalLenght % 2 == 1)
            return element1;

        return (double) (element1 + element2) / 2;

    }
}
