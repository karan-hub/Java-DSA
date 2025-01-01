package Linear_Search;

public class SearchIn2DArry {

    public static void main(String[] args) {
        int[][] arr = { { 12, 23, 54, 75, 76 }, { 24365, 98, 75, 424, 236576 }, { 23, 4, 5, 5, 68, 99, 0 } };
        boolean result = SearchIn2D(arr, 7005);
        if (result == true) {
            System.out.println("yes its present in array");
        } else {
            System.out.println("oho Sorry it not Present");
        }
    }

    static boolean SearchIn2D(int[][] arr, int i) {
        // int result =arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == i) {
                    return true;
                }

            }
        }

        return false;

    }
}