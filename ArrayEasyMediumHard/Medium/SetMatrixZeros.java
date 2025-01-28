package ArrayEasyMediumHard.Medium;

public class SetMatrixZeros {

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 0, 6 },
                { 7, 8, 9 }
        };

        int[][] result = brutfoceApproch(matrix);

        for (int i = 0; i < result.length; i++) {
           
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();
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
            // System.out.println(" ");

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

}