package ArrayEasyMediumHard.Medium;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        for (int[] is : matrix) {
            System.out.println(Arrays.toString(is));
        }
        System.out.println("\n\n");

        int[][] rotatedMatrix = optimalApproach(matrix);

        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = 0; j < rotatedMatrix[i].length; j++) {
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n\n");
        int[][] rotatedMatrix2 = rotate(matrix);
        for (int[] is : rotatedMatrix2) {
            System.out.println(Arrays.toString(is));
        }

    }

    public static int[][] rotate(int[][] nums) {

        int n = nums.length;
        int[][] result = new int[n][n];

        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                int newRow = col;
                int newCol = n - row - 1;
                result[newRow][newCol] = nums[row][col];

            }
        }
        return result;

    }

    public static int[][] optimalApproach(int[][] nums) {
        // Step 1: Transpose the matrix
        for (int i = 0; i < nums.length; i++) { // Fix: Include all rows
            for (int j = i + 1; j < nums.length; j++) {
                swap(nums, i, j);
            }
        }

        // Step 2: Reverse each row
        reverse(nums);
        return nums;
    }

    public static void swap(int[][] nums, int i, int j) {
        int temp = nums[i][j];
        nums[i][j] = nums[j][i];
        nums[j][i] = temp;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[][] nums) {
        for (int row = 0; row < nums.length; row++) {
            int i = 0, j = nums[row].length - 1;
            while (i < j) { // Fix: Prevents unnecessary swaps
                swap(nums[row], i, j);
                i++;
                j--;
            }
        }
    }

}
