package ArrayEasyMediumHard.Medium;

public class RotateImage {
    public static void main(String[] args) {
        

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
