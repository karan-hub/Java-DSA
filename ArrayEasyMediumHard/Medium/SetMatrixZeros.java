package ArrayEasyMediumHard.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeros {

    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
//        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
//        matrix.add(new ArrayList<>(Arrays.asList(4, 0, 6)));
//        matrix.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        int[][] arr= new int [][] {{1,1,1},{1,0,1},{1,1,1}};

        int [][] result = batterApproch(arr);

//        for (ArrayList<Integer> row : result) {
//            System.out.println(row);
//        }

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

    public static int[][] optimalApproch(int[][] nums) {
        int col0 = 1;

        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {

                if (nums[row][col] == 0) {
                    // make row and col zero
                    nums[row][0] = 0;
                    if (col != 0) {
                        nums[row][col] = 0;
                    } else {
                        col0 = 0;
                    }

                    // for (int[] is : nums) {
                    // System.out.println(Arrays.toString(is));
                    // }
                    // System.out.println();

                }

            }
        }

        for (int row = 1; row < nums.length; row++) {
            for (int col = 1; col < nums[row].length; col++) {
                // check col and row
                if (nums[0][col] == 0 || nums[row][0] == 0) {
                    nums[row][col] = 0;
                }
            }
        }

        if (nums[0][0] == 0) {
            for (int col = 0; col < nums.length; col++) {

                nums[0][col] = 0;
            }
        }

        if (col0 == 0) {
            for (int row = 0; row < nums.length; row++) {

                nums[row][0] = 0;
            }
        }

        return nums;

    }

    public static ArrayList<ArrayList<Integer>> optimalApproach(ArrayList<ArrayList<Integer>> nums) {
        int col0 = 1;
        int rows = nums.size();
        int cols = nums.get(0).size();

        // Mark rows and columns that need to be zeroed
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (nums.get(row).get(col) == 0) {
                    nums.get(row).set(0, 0);
                    if (col != 0) {
                        nums.get(0).set(col, 0);
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        // Set elements to zero based on markers
        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                if (nums.get(row).get(0) == 0 || nums.get(0).get(col) == 0) {
                    nums.get(row).set(col, 0);
                }
            }
        }

        // Handle first row
        if (nums.get(0).get(0) == 0) {
            for (int col = 0; col < cols; col++) {
                nums.get(0).set(col, 0);
            }
        }

        // Handle first column
        if (col0 == 0) {
            for (int row = 0; row < rows; row++) {
                nums.get(row).set(0, 0);
            }
        }

        return nums;
    }
}