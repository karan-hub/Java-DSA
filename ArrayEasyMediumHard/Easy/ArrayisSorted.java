package ArrayEasyMediumHard.Easy;

public class ArrayisSorted {
    public static void main(String[] args) {
        int[] array = {0 ,0 ,0 ,1};
        int n = array.length;
        int result = isSorted(n, array);
        System.out.println("Is the array sorted? " + (result == 1 ? "Yes" : "No"));
        
    }

    public static int isSorted(int n, int []a) {
        // Write your code here.

        int result = Integer.MIN_VALUE;
        for (int i =1 ; i < n; i++) {
            if (a[i] > a[i-1]|| a[i] == a[i-1]) {
            result = 1;
            }else{
                return 0;
            }
        }

        return result;
    }

}
