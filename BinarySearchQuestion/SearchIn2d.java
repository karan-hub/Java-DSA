package BinarySearchQuestion;

public class SearchIn2d {
    public static void main(String[] args) {
//        int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int [][] matrix = {{1,1}};

        int target = 2 ;
        System.out.println(searchMatrix(matrix , target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int startrow = 0 , endRow=matrix.length-1;
        while (startrow <= endRow){
            int mid  = (startrow+endRow)/2;
            if (target >= matrix[mid][0] && target <= matrix[mid][matrix[0].length-1]) return Solution(matrix , mid , target) ;
            else if (target >= matrix[mid][matrix[0].length-1]) startrow = mid+1;
            else  endRow = mid-1 ;
        }
        return  false ;
    }

    public  static  boolean Solution(int [][] matrix ,int  thisRow , int target){
        int start = 0 , end = matrix[thisRow].length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if (matrix[thisRow][mid] ==  target) return  true ;
            else if (target > matrix[thisRow][mid] )  start = mid+1;
            else end = mid-1;
        }
        return  false ;
    }
}
