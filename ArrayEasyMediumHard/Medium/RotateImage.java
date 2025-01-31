package ArrayEasyMediumHard.Medium;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] rotatedMatrix = optimalApproch(matrix);

        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = 0; j < rotatedMatrix[i].length; j++) {
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
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

    public static int[][] optimalApproch(int[][] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }

        return nums;
    }

    

}
