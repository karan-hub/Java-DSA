package BinarySearchQuestion;

public class SearchIn2dType2 {
    public static void main(String[] args) {
        int [][] matrix = { {1,4,7,11,15},
                            {2,5,8,12,19},
                            {3,6,9,16,22},
                            {10,13,14,17,24},
                            {18,21,23,26,30}
                        };
        int target = 50 ;
        System.out.println(searchMatrix(matrix,target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int startRow= 0 , endCol=matrix[0].length-1;
        while (startRow <= matrix.length-1 && endCol >=0){
            int number = matrix[startRow][endCol];
            if (number==target)return true;
            else if (number>target) endCol--;
            else startRow++;
        }
        return  false;
    }
}
