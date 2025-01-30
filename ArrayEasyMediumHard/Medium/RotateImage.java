package ArrayEasyMediumHard.Medium;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        rotate(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void rotate(int[][] nums) {

        int[][] result = new int[nums.length][];

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result.length; col++) {

                result[col][(nums[row].length - row) - 1] = nums[row][col];

            }
        }

    }
}
