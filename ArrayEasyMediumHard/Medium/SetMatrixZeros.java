package ArrayEasyMediumHard.Medium;

import java.util.Arrays;

public class SetMatrixZeros {

    public static void main(String[] args) {
        int[][] matrix = {
                { 0, 1, 2, 0 },
                { 3, 4, 5, 2 },
                { 1, 3, 1, 5 }
        };

        int[][] betterResult = batterApproch(matrix);
        for (int[] is : betterResult) {
            System.out.println(Arrays.toString(is));
        }

    }

    public static int[][] brutfoceApproch(int[][] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == 0) {
                    markCol(nums, j);
                    markRow(nums, i);
                }

            }

        }

        setZero(nums);
        return nums;

    }

    public static void markCol(int[][] nums, int j) {
        for (int index = 0; index < nums.length; index++) {
            if (nums[index][j] != 0) {
                nums[index][j] = -1;
            }

        }
    }

    public static void markRow(int[][] nums, int i) {
        for (int index = 0; index < nums[i].length; index++) {
            if (nums[i][index] != 0) {
                nums[i][index] = -1;
            }
        }
    }

    public static void setZero(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == -1) {
                    nums[i][j] = 0;
                }
            }
        }
    }

    // O(n^2)
    public static int[][] batterApproch(int[][] nums) {
        int[] row = new int[nums.length];
        int[] col = new int[nums[1].length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {

                if (nums[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }

        }
        System.out.println("row" + Arrays.toString(row));
        System.err.println("col" + Arrays.toString(col));
        System.out.print("[");
        for (int r = 0; r < row.length; r++) {
            for (int c = 0; c < col.length; c++) {
                if (row[r] == 1 || col[c] == 1) {
                    nums[r][c] = 0;
                }
            }
            System.out.print(Arrays.toString(nums[r]));
        }

        System.out.println("]");
        return nums;
    }

}