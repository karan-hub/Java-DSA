package ArrayEasyMediumHard.Medium;

import java.util.ArrayList;
 
import java.util.List;

public class SpiralTraversal {
    public static void main(String[] args) {

        int[][] nums = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        List<Integer> result = Spiral(nums);
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }

    public static List<Integer> Spiral(int[][] nums) {
        int n = nums[0].length, m = nums.length;
        int startRow = 0, startCol = 0;
        int endRow = m - 1, endCol = n - 1;

        List<Integer> list = new ArrayList<>();

        while (startCol <= endCol && startRow <= endRow) {
            // TOP
            for (int top = startCol; top <= endCol; top++) {
                list.add(nums[startRow][top]);
                // [ 1, 2, 3, 4 ]
            }

            // for (Integer integer : list) {
            // System.out.print(integer + " ");
            // }

            // Right
            for (int right = startRow + 1; right <= endRow; right++) {
                list.add(nums[right][endCol]);
                /*
                 * [.....4], // checked
                 * [.....8], startRow +1
                 * [....12], |
                 * [....16] endRow
                 */
            }
            // System.out.println(" ");
            // for (Integer integer : list) {
            // System.out.print(integer + " ");
            // }

            // Bottom
            for (int bottom = endCol - 1; bottom >= startCol; bottom--) {
                if (startRow == endRow) {
                    break;
                }
                list.add(nums[startRow][bottom]);
                /*
                 * [ 13, 14, 15, 16 ]
                 * | | |
                 * endRow bottom checked
                 */
            }

            // System.out.println(" ");

            // for (Integer integer : list) {
            // System.out.print(integer + " ");
            // }

            // Left

            for (int left = endRow - 1; left >= startRow + 1; left--) {
                if (startCol == endCol) {
                    break;
                }
                list.add(nums[left][startCol]);
                /*
                 * [1......], --> checked
                 * [5......], startRow +1
                 * [9......], endRow -1
                 * [13......] --> checked
                 */

            }

            // System.out.println(" ");

            // for (Integer integer : list) {
            // System.out.print(integer + " ");
            // }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
            /*
             * [
             * [ - , - , - , - ]
             * [ | , 6 , 7 , | ]
             * [ | , 10, 11, | ]
             * [ - , - , - , - ]
             * ]
             */
            // System.out.println(" ");

            // System.out.println("pass 2");

        }

        return list;
    }

}
