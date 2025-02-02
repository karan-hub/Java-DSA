package ArrayEasyMediumHard.Medium;

public class PascalsTriangle {
    public static void main(String[] args) {
        int r = 5; // row number
        int c = 3; // col number
        int element = pascalTriangle(r, c);
        System.out.println("The element at position (r,c) is: " + element);

        // printing the entire row n:
        int n = 5;
        pascalTriangle(n);

    }

    // nCr = n! / (r! * (n-r)!)
    public static Long nCr(int n, int r) {
        Long resut = 1L;

        for (int i = 0; i < r; i++) {
            resut = resut * (n - i);
            resut = resut / (i + 1);
        }
        return resut;
    }

    /*
     * given r = 7, c = 4.
     * Now, n = r-1 = 7-1 = 6 and r = c-1 = 4-1 = 3
     * 
     * r-1 n
     * C -----> C
     * c-1 r
     */

    public static int pascalTriangle(int r, int c) {
        int element = (int) (nCr(r - 1, c - 1)).longValue();
        return element;
    }

    // printing the entire row n:
    public static void pascalTriangle(int n) {
        for (int c = 1; c <= n; c++) {
            System.out.print(nCr(n - 1, c - 1) + " ");
        }
        System.out.println();
    }
}
